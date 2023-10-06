package rowmapper;

import java.util.List;  

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("rowmapper/applicationContext.xml");  
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    System.out.println("Test");
    List<Employee> list=dao.getAllEmployeesRowMapper();  
          
    for(Employee e:list)  
        System.out.println(e);  
}  
}  