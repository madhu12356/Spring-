package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		 ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loded");
		
		// Student st= new Student();
       
		Student student = container.getBean("st", Student.class);
		System.out.println(student);
		Student student2 = container.getBean("st", Student.class);
		System.out.println(student==student2);
		Student student3 = container.getBean("st", Student.class);
		System.out.println(student2==student3);
		
		System.out.println(student2);
		System.out.println(student3);
		
		
		
		
		Student student1 =container.getBean("st", Student.class);
		System.out.println(student1);
		System.out.println(student1.getAddr());
		}
	
	}


