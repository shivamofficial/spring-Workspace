package singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("singleton/singletonConfig.xml");
		
		Teacher t1 = (Teacher) context.getBean("teacherBean");
		Teacher t2 = (Teacher) context.getBean("teacherBean");
		
		t1.setName("Shivam");
		t2.setName("Kumar");
		
		t1.setDepartment("science");
		t2.setDepartment("math");
		
		System.out.println(t1.getDepartment()); // object1 
		System.out.println(t2.getDepartment()); // object2
		System.out.println(t1.getName()); // object1
		System.out.println(t2.getName()); // object1
		
		System.out.println(t1==t2); // true 
		
		  System.out.println(
		            "Address of object t1: "
		            + t1);
		        System.out.println(
		            "Address of object t2: "
		            + t2);
		
		
		
	}

}
