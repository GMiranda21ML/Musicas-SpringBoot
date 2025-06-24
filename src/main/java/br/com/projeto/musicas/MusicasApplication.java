package br.com.projeto.musicas;

import br.com.projeto.musicas.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MusicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.start();
	}
}
