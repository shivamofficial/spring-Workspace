package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/applicationContext.xml");  
        
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
        int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
        System.out.println(status);  
    }
}
