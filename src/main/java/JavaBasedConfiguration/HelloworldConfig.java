package JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldConfig {

	
		@Bean
		public HelloWorld helloWorld()
		{
			return new HelloWorld();
		}
	
	

}
