package com.questk2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "student_branch")
public class StudentBranch {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Integer branchId;
 
    @ManyToOne
    @JoinColumn(name = "roll_no", nullable = false)
    @JsonBackReference
    private Student student;
    @Column(name = "branch_name", nullable = false)
    private String branchName;
 
    // Constructors
    public StudentBranch() {
    }
 
    public StudentBranch(Student student, String branchName) {
        this.student = student;
        this.branchName = branchName;
    }

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "StudentBranch [branchId=" + branchId + ", student=" + student + ", branchName=" + branchName + "]";
	}
}