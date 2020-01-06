package com.mindtree.colleges.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.mindtree.colleges.entity.BranchEntity;
import com.mindtree.colleges.entity.CollegeEntity;
import com.mindtree.colleges.service.CollegeService;

@Controller
public class CollegeController {

	int branchId1;
	@Autowired
	private CollegeService collegeService;

	@GetMapping("/menu")
	public String index() {
		return "MENU";
	}

	@GetMapping("/registerCollege")
	public String getCollegePage() {
		return "college";
	}

	@RequestMapping(value = "/collegeToDb", method = RequestMethod.GET)
	public String registerCollege(CollegeEntity college, Model model) {
		CollegeEntity colleges = collegeService.registerCollege(college);
		model.addAttribute("colleges", colleges);
		return "MENU";
	}

	@GetMapping("/registerBranch")
	public String loadBranch(Model model) {
		List<CollegeEntity> college = collegeService.getAllColleges();
		model.addAttribute("collegesList", college);
		return "branch";
	}

	@RequestMapping(value = "/branchToDb", method = RequestMethod.POST)
	public String registerBranch(BranchEntity branch, @RequestParam int collegeId, Model model) {
		branch = collegeService.registerBranch(branch, collegeId);
		model.addAttribute("branch", branch);
		return "MENU";
	}

	@GetMapping("/viewCollege")
	public String loadCollege(Model model) {
		List<CollegeEntity> collegesList = collegeService.getAllColleges();
		model.addAttribute("collegesList", collegesList);
		return "view";
	}

	@GetMapping("/getBranches")
	public String getBranches(int collegeId, Model model) {
		List<CollegeEntity> collegesList = collegeService.getAllColleges();
		model.addAttribute("collegesList", collegesList);
		List<CollegeEntity> college = collegeService.getAllColleges();
		model.addAttribute("colleges", college);
		List<BranchEntity> branches = collegeService.getBranches(collegeId);
		model.addAttribute("branches", branches);
		int totalCount = collegeService.calculateTotalCount(collegeId);
		model.addAttribute("total", totalCount);
		return "view";
	}

	@RequestMapping("/update")
	public String updateCount(int branchId) {
		branchId1 = branchId;
		return "updates";
	}

	@PostMapping("/updateCount")
	public String updateCountt(int totalStrength, Model model) {
		collegeService.updateStrength(totalStrength, branchId1);
		List<CollegeEntity> college = collegeService.getAllColleges();
		model.addAttribute("collegesList", college);
		return "view";
	}

}
