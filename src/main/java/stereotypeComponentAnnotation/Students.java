package stereotypeComponentAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
@Value("shivam")
	private String name;
@Value("11")
	private int roll;
@Value("#{deg}")
private List<String>degree;


public List<String> getDegree() {
	return degree;
}
public void setDegree(List<String> degree) {
	this.degree = degree;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
@Override
public String toString() {
	return "Students [name=" + name + ", roll=" + roll + ", degree=" + degree + "]";
}


	
}
