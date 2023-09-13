package springExpressionLanguageSpel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springExpressionLanguageSpel/spelConfig.xml");
		
		LearnSpel obj1= (LearnSpel)context.getBean("spel");
		
		System.out.println(obj1);

	}

}
