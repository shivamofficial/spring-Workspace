package springExpressionLanguageSpel;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class LearnSpel {

	private Integer userAge;  
	private String userCountry;
	private Integer myNum; 
	private Boolean userActive; 
	private List<String> userSkills; 
	private Map<Integer, String> teamMates; 
	@Value("#{(10 < 15)}")
	private Boolean myVal1; // true 
	@Value("#{(30 > 15)}")
	private Boolean myVal2; // true 
	@Value("#{!(12 <= 18)}") // false
	private Boolean myVal3; 
	@Value("#{address.country == 'India'}")
	private Boolean myVal4; 
	@Value("#{10 > 6 && 15 < 20}") 
	private Boolean isUserActive; // true 
	@Value("#{10 > 15 || 15 < 20}")
	private Boolean isUserActive1; // true 
	@Value("#{!(10 > 15)}")
	private Boolean isUserActive2; //false 
	@Value("#{15 + 10}")
	private Integer myVal7; // 25 
	@Value("#{150 - 100}")
	private Integer myVal5; // 50 
	@Value("#{45 / 9}")
	private Integer myVal6; // 5 

	
	
	
	
}
