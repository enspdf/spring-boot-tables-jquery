package me.shackox.repository;

import me.shackox.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SHACKOX on 20/12/16.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
