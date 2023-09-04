package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	
public class Test {
	
	 public static void main( String[] args )
	    {
	        
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/NewFile.xml");
		 LifecycleLearn obj1= (LifecycleLearn) context.getBean("L1");
		 System.out.println(obj1);
		// context.registerShutdownHook();
		 //context.close();
		 ((AbstractApplicationContext) context).registerShutdownHook();
	    }
}
