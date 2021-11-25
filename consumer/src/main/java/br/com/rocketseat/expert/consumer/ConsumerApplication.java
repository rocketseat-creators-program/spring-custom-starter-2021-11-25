package br.com.rocketseat.expert.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rocketseat.expert.starter.salute.Salute;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ConsumerApplication implements CommandLineRunner {

	@Autowired
	private Salute salute;

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String message = salute.greet();
		System.out.println("\n\n");
		System.out.println(message);
		System.out.println("\n\n");
	}

}
