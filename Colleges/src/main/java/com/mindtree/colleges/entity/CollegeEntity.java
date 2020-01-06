package com.mindtree.colleges.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CollegeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collegeId;
	private String collegeName;
	private String collegeLocation;
	private int noOfBranches;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "college")
	private List<BranchEntity> branches;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public List<BranchEntity> getBranches() {
		return branches;
	}

	public void setBranches(List<BranchEntity> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "CollegeEntity [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeLocation="
				+ collegeLocation + ", noOfBranches=" + noOfBranches + ", branches=" + branches + "]";
	}

	public CollegeEntity(int collegeId, String collegeName, String collegeLocation, int noOfBranches,
			List<BranchEntity> branches) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.noOfBranches = noOfBranches;
		this.branches = branches;
	}

	public CollegeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
