package br.com.projeto.musicas;

import br.com.projeto.musicas.main.Main;
import br.com.projeto.musicas.repository.ArtistaRepository;
import br.com.projeto.musicas.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicasApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository artistaRepository;
	@Autowired
	private MusicaRepository musicaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MusicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(artistaRepository, musicaRepository);
		main.start();
	}
}
