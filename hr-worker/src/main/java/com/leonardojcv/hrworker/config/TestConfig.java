package com.leonardojcv.hrworker.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardojcv.hrworker.entities.Worker;
import com.leonardojcv.hrworker.repositories.WorkerRepository;

//Anotação @configuration indica ao Spring que trata-se de uma classe de configuração
//Anotação @Profile indica ao spring que trata-se de uma classe de configuração especifica para o perfil de teste
//Classe para database seeding (popular o banco de dados)

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public void run(String... args) throws Exception {
		Worker w1 = new Worker(null, "Leonardo", 2000);
		Worker w2 = new Worker(null, "Jhenyfer", 3500);
		
		workerRepository.saveAll(Arrays.asList(w1, w2));
	}
	
}