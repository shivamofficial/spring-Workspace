package stereotypeComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("stereotypeComponentAnnotation/component.xml");
		
		Students students=context.getBean("students",Students.class);
		System.out.println(students);
		
		System.out.println(students.hashCode()); // 1351478315
		
		Students students1=context.getBean("students",Students.class);
		
		System.out.println(students1.hashCode()); // 1351478315
	}

}
 // every time it give a same object so it is singletone scope
