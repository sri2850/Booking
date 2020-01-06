package com.mindtree.colleges.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.colleges.entity.BranchEntity;
import com.mindtree.colleges.entity.CollegeEntity;

@Service
public interface CollegeService {

	CollegeEntity registerCollege(CollegeEntity college);


	List<CollegeEntity> getAllColleges();

	BranchEntity registerBranch(BranchEntity branch, int collegeId);


	List<BranchEntity> getBranches(int collegeId);




	int calculateTotalCount(int collegeId);


	void updateStrength(int totalStrength, int branchId1);



}
