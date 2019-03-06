package com.adrianosouza.coursemc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adrianosouza.coursemc.domain.Categoria;
import com.adrianosouza.coursemc.repositories.CategoriaRepository;

@SpringBootApplication
public class CoursemcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CoursemcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repository.saveAll(Arrays.asList(cat1,cat2));
	}

}
