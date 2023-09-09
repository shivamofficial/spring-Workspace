package StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("StandaloneCollections/standaloneCollections.xml");

Student s1=context.getBean("shiv",Student.class);
System.out.println(s1);
	}

}
