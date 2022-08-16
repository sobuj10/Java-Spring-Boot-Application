package net.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.employees.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
