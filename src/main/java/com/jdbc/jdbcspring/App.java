package com.jdbc.jdbcspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/jdbc/jdbcspring/jdbcConfig.xml");  
        
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
        
        int status=dao.saveEmployee(new Employee(103,"Amit",15000));  
        System.out.println(status);  
              
        
        
   
        
        
        /* int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
        System.out.println(status); 
        
         int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
        System.out.println(status);  
        
        
        */  
              
        /*Employee e=new Employee(); 
        e.setId(102); 
        int status=dao.deleteEmployee(e); 
        System.out.println(status);*/  
    }
}
