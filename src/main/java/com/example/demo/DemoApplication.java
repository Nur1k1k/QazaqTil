package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.repositories.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner initData(CourseRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new Course("Бастауыш курс", "Бұл курс қазақ тілінің әліпбиімен және қарапайым сөздермен таныстырады."));
				repository.save(new Course("Грамматика", "Қазақ тіліндегі негізгі грамматикалық ережелерді үйреніңіз."));
				repository.save(new Course("Сөйлеу практикасы", "Күнделікті өмірде қажетті сөздер мен сөйлемдер."));
				repository.save(new Course("Кәсіби қазақ тілі", "Жұмыс ортасына арналған қазақ тілі."));
				repository.save(new Course("Қазақ әдебиеті", "Қазақ классикалық әдебиетімен таныстыру."));
				repository.save(new Course("Дәстүрлер мен салт-дәстүрлер", "Қазақ халқының дәстүрлері мен салт-дәстүрлері."));
			}
		};
	}

}

