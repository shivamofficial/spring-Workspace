package stereotypeComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("stereotypeComponentAnnotation/component.xml");
		
		Students students=context.getBean("students",Students.class);
		System.out.println(students);
		
		
	}

}
