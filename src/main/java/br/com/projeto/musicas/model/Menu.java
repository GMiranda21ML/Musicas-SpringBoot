package br.com.projeto.musicas.model;

public class Menu {
    public static void titulo() {
        System.out.println("\n" +
                "██████╗░██████╗░░█████╗░░░░░░██╗███████╗████████╗░█████╗░  ███╗░░░███╗██╗░░░██╗░██████╗██╗░█████╗░░█████╗░░██████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗░░░░░██║██╔════╝╚══██╔══╝██╔══██╗  ████╗░████║██║░░░██║██╔════╝██║██╔══██╗██╔══██╗██╔════╝\n" +
                "██████╔╝██████╔╝██║░░██║░░░░░██║█████╗░░░░░██║░░░██║░░██║  ██╔████╔██║██║░░░██║╚█████╗░██║██║░░╚═╝███████║╚█████╗░\n" +
                "██╔═══╝░██╔══██╗██║░░██║██╗░░██║██╔══╝░░░░░██║░░░██║░░██║  ██║╚██╔╝██║██║░░░██║░╚═══██╗██║██║░░██╗██╔══██║░╚═══██╗\n" +
                "██║░░░░░██║░░██║╚█████╔╝╚█████╔╝███████╗░░░██║░░░╚█████╔╝  ██║░╚═╝░██║╚██████╔╝██████╔╝██║╚█████╔╝██║░░██║██████╔╝\n" +
                "╚═╝░░░░░╚═╝░░╚═╝░╚════╝░░╚════╝░╚══════╝░░░╚═╝░░░░╚════╝░  ╚═╝░░░░░╚═╝░╚═════╝░╚═════╝░╚═╝░╚════╝░╚═╝░░╚═╝╚═════╝░\n");
    }

    public static void opcoes() {
        System.out.println("""
                1 - Cadastrar artistas
                2 - Cadastrar músicas
                3 - Listar Artistas
                4 - Listar músicas
                5 - Buscar músicas por artista
                
                0 - Sair
                """);
    }
}
