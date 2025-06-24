package br.com.projeto.musicas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String album;
    @ManyToOne
    private Artista artista;

    public Musica(String nome, String album, Artista artista) {
        this.nome = nome;
        this.album = album;
        this.artista = artista;
    }

    public Musica() {}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAlbum() {
        return album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("Música: %s, álbum: %s, artista: %s", this.nome, this.album, this.artista.getNome());
    }
}
