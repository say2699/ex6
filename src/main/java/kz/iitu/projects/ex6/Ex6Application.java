package kz.iitu.projects.ex6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import repository.EmplRepository;

@SpringBootApplication
public class Ex6Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex6Application.class, args);
	}
	@Bean
	public CommandLineRunner bootstrap(EmplRepository emplRepository){
		return (args) -> {
				emplRepository.save(new Employees("Mark", 20000, Salaried));

			System.out.println("Employees:");
			System.out.println("-------------------");
			for (Employees employees : emplRepository.findAll()){
				System.out.println(employees.getName());
			}

			Employees employees = emplRepository.findByID(1).get();
			System.out.println("Employee:");
			System.out.println("-------------------");
			System.out.println(employees.getName());


		}




	}
}
