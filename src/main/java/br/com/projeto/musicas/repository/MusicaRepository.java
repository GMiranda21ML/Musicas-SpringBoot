package br.com.projeto.musicas.repository;

import br.com.projeto.musicas.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
