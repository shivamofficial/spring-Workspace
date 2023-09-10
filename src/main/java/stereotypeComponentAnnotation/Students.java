package stereotypeComponentAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
@Value("shivam")
	private String name;
@Value("11")
	private int roll;
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
	return "Student [name=" + name + ", roll=" + roll + "]";
}


	
}
