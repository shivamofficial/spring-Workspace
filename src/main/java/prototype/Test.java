package prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context = new ClassPathXmlApplicationContext("prototype/prototypeConfig.xml");
		
		Teachers t1 = (Teachers) context.getBean("teacherBean");
		Teachers t2 = (Teachers) context.getBean("teacherBean");
		
		t1.setName("Shivam");
		t2.setName("Kumar");
		
		t1.setDepartment("science");
		t2.setDepartment("math");
		
		System.out.println(t1.getDepartment()); // object1 
		System.out.println(t2.getDepartment()); // object2
		System.out.println(t1.getName()); // object1
		System.out.println(t2.getName()); // object1
		
		System.out.println(t1==t2); // false
		
		  System.out.println(
		            "Address of object t1: "
		            + t1);
		        System.out.println(
		            "Address of object t2: "
		            + t2);
	}

}
