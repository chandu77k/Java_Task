package com.questk2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questk2.entity.Student;
import com.questk2.entity.StudentBranch;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	void save(StudentBranch studentBranch);

}
