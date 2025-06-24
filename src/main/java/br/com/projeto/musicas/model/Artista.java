package br.com.projeto.musicas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private List<Musica> musicas = new ArrayList<>();

    public Artista(String nome, String tipoArtista) {
        this.nome = nome;
        this.tipoArtista = TipoArtista.pegaTipo(tipoArtista);
    }

    public Artista() {}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        musicas.forEach(m -> m.setArtista(this));
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return String.format("%d - %s (%s)", this.id, this.nome, this.tipoArtista);
    }
}
