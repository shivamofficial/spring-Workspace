package com.springcore.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@SpringBootApplication
public class AutowiringdemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	SpringApplication.run(AutowiringdemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/applicationContext.xml");
		Employee emp = (Employee)context.getBean("department");
		emp.setEid(101);
		emp.setEname("Spring Framework Guru");
		emp.showEployeeDetails();
	}

}
