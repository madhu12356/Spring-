package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");

        // Insert
        dao.save(new Employee("Madhu", 50000));
        dao.save(new Employee("Vijaya", 60000));

        // Fetch
        List<Employee> list = dao.findAll();
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
