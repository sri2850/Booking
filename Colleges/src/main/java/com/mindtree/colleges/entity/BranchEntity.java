package com.mindtree.colleges.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BranchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private int totalStrength;
	private String hodName;
	@ManyToOne(cascade = CascadeType.ALL)
	private CollegeEntity college;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getTotalStrength() {
		return totalStrength;
	}

	public void setTotalStrength(int totalStrength) {
		this.totalStrength = totalStrength;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public CollegeEntity getCollege() {
		return college;
	}

	public void setCollege(CollegeEntity college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "BranchEntity [branchId=" + branchId + ", branchName=" + branchName + ", totalStrength=" + totalStrength
				+ ", hodName=" + hodName + ", college=" + college + "]";
	}

	public BranchEntity(int branchId, String branchName, int totalStrength, String hodName, CollegeEntity college) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.totalStrength = totalStrength;
		this.hodName = hodName;
		this.college = college;
	}

	public BranchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
