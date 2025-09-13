package com;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee e);
    List<Employee> findAll();
}
