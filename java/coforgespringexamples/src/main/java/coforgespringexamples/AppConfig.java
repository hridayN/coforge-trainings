package coforgespringexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("addr1")
	public static Address createAddress() {
		return new Address(100, "South Ex", "Delhi");
	}
	
	@Bean("prsn1")
	public Person getPerson() {
		return new Person("", createAddress());
	}
}
