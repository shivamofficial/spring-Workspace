package constructorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("constructorArg/constructorArgConfig.xml");
        Student s = (Student)ctx.getBean("studentBean");
        System.out.println(s);
	}

}
