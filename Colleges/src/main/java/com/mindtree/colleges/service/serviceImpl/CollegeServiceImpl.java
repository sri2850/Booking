package com.mindtree.colleges.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.colleges.entity.BranchEntity;
import com.mindtree.colleges.entity.CollegeEntity;
import com.mindtree.colleges.repository.BranchRepository;
import com.mindtree.colleges.repository.CollegeRepository;
import com.mindtree.colleges.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;

	@Autowired
	private BranchRepository branchRepository;

	@Override
	public CollegeEntity registerCollege(CollegeEntity college) {

		college = collegeRepository.save(college);
		return college;
	}

	@Override
	public List<CollegeEntity> getAllColleges() {

		return collegeRepository.findAll();
	}

	@Override
	public BranchEntity registerBranch(BranchEntity branch, int collegeId) {
		CollegeEntity clgs = collegeRepository.getOne(collegeId);
		branch.setCollege(clgs);
		branch = branchRepository.save(branch);
		return branch;
	}

	@Override
	public List<BranchEntity> getBranches(int collegeId) {
		List<BranchEntity> branches = branchRepository.findAll();
		List<BranchEntity> branchList = new ArrayList<BranchEntity>();
		for (BranchEntity branchEntity : branches) {
			if (branchEntity.getCollege().getCollegeId() == collegeId) {
				branchList.add(branchEntity);
			}
		}
		return branchList;
	}


	@Override
	public int calculateTotalCount(int collegeId) {
		int sum = 0;
		CollegeEntity college = collegeRepository.findById(collegeId).get();
		for (BranchEntity branches : college.getBranches()) {
			sum = sum + branches.getTotalStrength();

		}
		return sum;
	}

	@Override
	public void updateStrength(int totalStrength, int branchId) {
		BranchEntity branch = branchRepository.findById(branchId).get();
		branch.setTotalStrength(totalStrength);
		branchRepository.save(branch);
	}

}
