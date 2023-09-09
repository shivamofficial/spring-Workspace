package constructorArg;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Student {

	 
	   private int roll;
	    private String name;
	    private LinkedHashSet phnNo;
	    private List<String> degree;
	    private Map<String,Integer> courses;
		
		public Student(int roll, String name, LinkedHashSet phnNo, List<String> degree, Map<String, Integer> courses) {
			super();
			this.roll = roll;
			this.name = name;
			this.phnNo = phnNo;
			this.degree = degree;
			this.courses = courses;
		}
		  @Override
		    public String toString() {
		        return "Student{" +
		                "\n roll=" + roll +
		                "\n name=" + name +
		                "\n phnNo=" + phnNo +
		                "\n degree=" + degree +
		                "\n courses=" + courses +
		                '}';
		    }
	    
	    
}
