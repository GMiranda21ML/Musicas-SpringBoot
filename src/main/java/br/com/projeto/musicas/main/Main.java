package br.com.projeto.musicas.main;

import br.com.projeto.musicas.model.Menu;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int op = -1;
        while (op != 0) {
            Menu.titulo();
            Menu.opcoes();
            System.out.print("Digite a sua opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    cadastraArtistas();
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

    }
}
