package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("collections/collectionConfig.xml");

    	Customer cust = (Customer)context.getBean("collection");
    	System.out.println(cust.getAddress());
    	System.out.println(cust.getCourse());
    	System.out.println(cust.getPhones());
    	System.out.println(cust.getPros());
	}

}
