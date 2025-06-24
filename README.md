# 🎵 Projeto Músicas - Spring Boot

Este projeto é uma aplicação Java com Spring Boot para cadastro e gerenciamento de músicas e artistas. Foi desenvolvido como projeto final de um curso de Spring Boot, com foco em persistência de dados, repositórios e navegação via terminal.

## 🧩 Funcionalidades

- ✅ Cadastro de artistas (solo, dupla ou banda)
- ✅ Cadastro de músicas vinculadas a artistas
- ✅ Listagem de todos os artistas cadastrados
- ✅ Listagem de todas as músicas cadastradas
- ✅ Busca de músicas por nome do artista

## 📦 Tecnologias utilizadas

- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Maven

## ▶️ Como executar o projeto

### Pré-requisitos

- Java 21 instalado
- Maven instalado

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/GMiranda21ML/Musicas-SpringBoot.git
```

2. Acesse o diretório do projeto:

```bash
cd Musicas-SpringBoot/musicas
```
3. Compile e execute o projeto:
```bash
mvn spring-boot:run
```

4. O sistema roda no terminal, onde será possível navegar por um menu interativo com opções de cadastro e consulta.

## 🗂️ Estrutura do projeto
```css
musicas/
├── src/
│   ├── main/
│   │   └── java/br/com/projeto/musicas/
│   │       ├── main/          → Classe Main com menu interativo
│   │       ├── model/         → Classes de domínio (Artista, Musica, TipoArtista)
│   │       └── repository/    → Interfaces com métodos de persistência
│   └── test/                  → Testes unitários (padrão)
├── pom.xml                    → Dependências Maven

```

## 💡 Exemplo de uso
No terminal:
```txt
1 - Cadastrar artista
2 - Cadastrar música
3 - Listar artistas
4 - Listar músicas
5 - Buscar músicas por artista
0 - Sair
```


