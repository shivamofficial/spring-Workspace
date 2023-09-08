package collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private List<String> phones;
	private Set<String> address ;
	private Map<String,String>course;
	private Properties pros;
	@Override
	public String toString() {
		return "Customer [phones=" + phones + ", address=" + address + ", course=" + course + ", pros=" + pros + "]";
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public Customer(List<String> phones, Set<String> address, Map<String, String> course, Properties pros) {
		super();
		this.phones = phones;
		this.address = address;
		this.course = course;
		this.pros = pros;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
