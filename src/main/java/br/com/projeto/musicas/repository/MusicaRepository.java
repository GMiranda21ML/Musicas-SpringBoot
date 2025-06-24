package br.com.projeto.musicas.repository;

import br.com.projeto.musicas.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

    @Query("SELECT m FROM Musica m JOIN m.artista a ORDER BY a.nome")
    List<Musica> listarMusicas();

    @Query("SELECT m FROM Musica m JOIN m.artista a WHERE a.nome ILIKE %:nome%")
    List<Musica> listarMusicasPorArtista(String nome);
}
