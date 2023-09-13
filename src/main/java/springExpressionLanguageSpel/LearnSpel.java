package springExpressionLanguageSpel;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel") // create bean
public class LearnSpel {
     @Value("#{22}")
	private Integer userAge;  
     
	@Value("#{'India'}")
	private String userCountry;
	@Value("#{22+55}")
	private Integer myNum; 
	@Value("#{22>55}")
	private Boolean userActive; 
	
	@Value("#{l}")
	private List<String> userSkills; 
	
	@Value("#{{101:'Mahesh',102:'Surya'}}")
	private Map<Integer, String> teamMates; 
	
	@Value("#{(10 < 15)}")
	private Boolean myVal1; // true 
	@Value("#{(30 > 15)}")
	private Boolean myVal2; // true 
	@Value("#{!(12 <= 18)}") 
	private Boolean myVal3; 
	
	@Value("#{10 > 6 && 15 < 20}") 
	private Boolean isUserActive; 
	@Value("#{10 > 15 || 15 < 20}")
	private Boolean isUserActive1; 
	@Value("#{!(10 > 15)}")
	private Boolean isUserActive2;
	@Value("#{15 + 10}")
	private Integer myVal7;
	@Value("#{150 - 100}")
	private Integer myVal5; 
	@Value("#{45 / 9}")
	private Integer myVal6; 
	
	@Value("#{ T(java.lang.Math).random() * 100}") // The T operator is used to specify an instance of java.lang.Class.
	private Integer randomNumber;

	@Override
	public String toString() {
		return "LearnSpel [userAge=" + userAge + ", userCountry=" + userCountry + ", myNum=" + myNum + ", userActive="
				+ userActive + ", userSkills=" + userSkills + ", teamMates=" + teamMates + ", myVal1=" + myVal1
				+ ", myVal2=" + myVal2 + ", myVal3=" + myVal3 + ", isUserActive=" + isUserActive + ", isUserActive1="
				+ isUserActive1 + ", isUserActive2=" + isUserActive2 + ", myVal7=" + myVal7 + ", myVal5=" + myVal5
				+ ", myVal6=" + myVal6 + ", randomNumber=" + randomNumber + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	} 
	
	

	
	
}
