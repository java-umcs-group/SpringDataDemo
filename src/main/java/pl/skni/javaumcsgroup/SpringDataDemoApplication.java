package pl.skni.javaumcsgroup;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Log4j
@EntityScan
@SpringBootApplication
@EnableJpaRepositories(basePackages = "pl.skni.javaumcsgroup")
public class SpringDataDemoApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return run -> {
			Employee employee = new Employee("Jan","Kowalski", 2000);
			Employee saved = employeeRepository.save(employee);

			System.out.println(employee);

			Employee jan = employeeRepository.findByFirstNameOrLastName("Jan", null);

			System.out.println(jan);
		};
	}
}
