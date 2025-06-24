package br.com.projeto.musicas.main;

import br.com.projeto.musicas.model.Artista;
import br.com.projeto.musicas.model.Menu;
import br.com.projeto.musicas.model.Musica;
import br.com.projeto.musicas.repository.ArtistaRepository;
import br.com.projeto.musicas.repository.MusicaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final ArtistaRepository artistaRepository;
    private final MusicaRepository musicaRepository;

    public Main(ArtistaRepository artistaRepository, MusicaRepository musicaRepository) {
        this.artistaRepository = artistaRepository;
        this.musicaRepository = musicaRepository;
    }

    public void start() {
        int op = -1;
        while (op != 0) {
            Menu.titulo();
            Menu.opcoes();
            System.out.print("Digite a sua opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    cadastraArtistas();
                    break;
                case 2:
                    cadastraMusica();
                    break;
                case 3:
                    listarArtistas();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }

    private void cadastraArtistas() {
        List<Artista> artistas = new ArrayList<>();
        String op = "";
        while (!op.equalsIgnoreCase("n")) {
            System.out.print("Digite o nome do artista: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o tipo desse artista (solo, dupla, banda): ");
            String tipo = scanner.nextLine();
            artistas.add(new Artista(nome, tipo));
            System.out.print("Cadastrar outro artista (S/N)? ");
            op = scanner.nextLine();
        }
        artistaRepository.saveAll(artistas);
    }

    private void cadastraMusica() {
        String op = "";
        List<Musica> listaDeMusicas = new ArrayList<>();
        while (!op.equalsIgnoreCase("n")) {
            listarArtistas();
            System.out.print("Digite um artista disponível para cadastrar uma música: ");
            String nomeArtista = scanner.nextLine();

            Optional<Artista> artistaEncontrado = artistaRepository.findByNomeContainingIgnoreCase(nomeArtista);

            if (artistaEncontrado.isPresent()) {
                System.out.print("Digite o nome da música: ");
                String nomeMusica = scanner.nextLine();
                System.out.print("Digite o nome do albúm: ");
                String nomeAlbum = scanner.nextLine();
                listaDeMusicas.add(new Musica(nomeMusica, nomeAlbum, artistaEncontrado.get()));
            } else {
                System.out.println("Artista não encontrado!");
            }

            System.out.print("Cadastrar outra música (S/N)? ");
            op = scanner.nextLine();

        }

        if (!listaDeMusicas.isEmpty()) {
            musicaRepository.saveAll(listaDeMusicas);
        } else {
            System.out.println("Nenhuma música cadastrada!");
        }

    }

    private void listarArtistas() {
        List<Artista> listaDeArtistas = artistaRepository.findAll();
        listaDeArtistas.forEach(System.out::println);
    }
}
