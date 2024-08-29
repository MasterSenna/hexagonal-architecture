
# Hexagonal Architecture

Este projeto implementa a Arquitetura Hexagonal em uma aplicação Java. A Arquitetura Hexagonal, também conhecida como Arquitetura de Portas e Adaptadores, permite criar aplicações altamente desacopladas e independentes de frameworks externos.

## Estrutura do Projeto

- **src/**: Contém o código fonte da aplicação.
- **build.gradle**: Arquivo de configuração do Gradle.
- **gradlew** e **gradlew.bat**: Scripts para executar o Gradle de forma independente da instalação local.
- **docker-local/**: Arquivos para configuração de contêineres Docker.
- **settings.gradle**: Configurações do projeto Gradle.

## Pré-requisitos

- **Java 11+**: Certifique-se de que o JDK 11 ou superior esteja instalado.
- **Gradle**: O projeto usa o Gradle Wrapper, então não é necessário instalar o Gradle manualmente.
- **Docker** (opcional): Para rodar a aplicação em contêineres, você precisará do Docker instalado.

## Como Executar o Projeto

### 1. Clone o Repositório

```bash
git clone https://github.com/MasterSenna/hexagonal-architecture.git
cd hexagonal-architecture
```

### 2. Compile e Execute os Testes

Use o Gradle para compilar o projeto e executar os testes:

```bash
./gradlew build
```

### 3. Executando a Aplicação

Para executar a aplicação localmente:

```bash
./gradlew bootRun
```

A aplicação estará disponível em `http://localhost:8080`.

### 4. Usando Docker

Se preferir rodar a aplicação em um contêiner Docker:

```bash
docker-compose up --build
```

Isso irá construir a imagem Docker e iniciar a aplicação.

## Estrutura de Pastas

- **src/main**: Contém o código principal da aplicação.
  - **java/**: Código fonte em Java.
  - **resources/**: Arquivos de configuração, como `application.properties`.
- **src/test**: Contém os testes unitários.

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

### Como Contribuir

1. Fork o projeto.
2. Crie uma branch para sua feature (`git checkout -b minha-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona minha feature'`).
4. Push para a branch (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob os termos da [MIT License](LICENSE).
