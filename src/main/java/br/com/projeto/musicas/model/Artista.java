package br.com.projeto.musicas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;

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

    @Override
    public String toString() {
        return String.format("%d - %s (%s)", this.id, this.nome, this.tipoArtista);
    }
}
