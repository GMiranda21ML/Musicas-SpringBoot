package br.com.projeto.musicas.repository;

import br.com.projeto.musicas.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
