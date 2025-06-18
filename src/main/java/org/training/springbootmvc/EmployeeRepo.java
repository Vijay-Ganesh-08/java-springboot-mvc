package org.training.springbootmvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.training.springbootmvc.model.Employee;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findByFirstnameOrderByEid(String firstName);

    @Query("from Employee where lastname = :lastName")
    List<Employee> find(@Param ("lastName") String lastName);

}