package JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConfig.class); 

HelloWorld helloWorld = (HelloWorld)context.getBean(HelloWorld.class);
helloWorld.setMessage("Hello Hyy Bye");
helloWorld.setAge(20);
helloWorld.setName("shiva");
System.out.println(helloWorld);

	}
	
	
}
