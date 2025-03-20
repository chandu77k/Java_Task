package com.questk2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.questk2.entity.StudentBranch;
import java.util.List;
public interface StudentBranchRepository extends JpaRepository<StudentBranch, Integer>{
	List<StudentBranch> findByBranchId(Integer branchId);
}
