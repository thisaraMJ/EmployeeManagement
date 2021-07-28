package com.crudapp.empmanagement.repo;

import com.crudapp.empmanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    Optional<Employee> findEmployeeById(Long id); //long kiyala dala tyenne Employee id eke data type eka, optional kiyala damme employee hoya ganna bari unot nisa

    void deleteEmployeeById(Long id);
}
