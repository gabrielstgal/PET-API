# CREPET API

API RESTful para gerenciamento de Pets, desenvolvida em Java com Spring Boot 3.x, seguindo o padrão CRUD (Create, Read, Update, Delete).

## 🚀 Tecnologias

O projeto foi construído utilizando as seguintes tecnologias e frameworks:

* **Java 17**
* **Spring Boot 3.5.5** (Starter Parent)
* **Spring Data JPA** (Persistência de Dados)
* **Spring Web** (Construção da API REST)
* **Jakarta Validation** (Validação de DTOs de entrada)
* **Lombok** (Geração automática de Getters/Setters)
* **PostgreSQL** (Banco de dados relacional)

## ⚙️ Pré-requisitos

Para rodar a aplicação localmente, você precisa ter instalado:

1.  **Java Development Kit (JDK) 17** ou superior.
2.  Um servidor **PostgreSQL** ativo e acessível.

## 💾 Configuração do Banco de Dados

As configurações de conexão com o banco de dados estão no arquivo `crepet/src/main/resources/application.yaml`.

1.  Garanta que você possui um banco de dados PostgreSQL chamado **`crepet`** em execução.
2.  **Atualize as credenciais** `username` e `password` no arquivo `application.yaml` para corresponderem ao seu ambiente local.

```yaml
  datasource:
    url: jdbc:postgresql://localhost:5432/crepet
    username: postgres 
    password: 1234
  # ...
  jpa:
    hibernate:
      ddl-auto: update # Usado para criar/atualizar a estrutura do banco automaticamente

🖥️ Como ExecutarO projeto utiliza o Maven Wrapper (mvnw), permitindo que você compile e execute o projeto sem a necessidade de ter o Maven instalado globalmente.1. Compilar e Instalar DependênciasExecute no diretório raiz do projeto:Bash# Para sistemas baseados em Unix/Linux/macOS
./mvnw clean install

# Para Windows
.\mvnw.cmd clean install
2. Iniciar a AplicaçãoInicie o servidor Spring Boot:Bash# Para sistemas baseados em Unix/Linux/macOS
./mvnw spring-boot:run

# Para Windows
.\mvnw.cmd spring-boot:run
A API estará em execução em http://localhost:8080 (por padrão, pois não há configuração de porta diferente).📌 Endpoints da APIO path base de todos os endpoints é /pets.MétodoEndpointDescriçãoService CorrespondentePOST/petsCadastra um novo Pet.IncluirPetServiceGET/petsLista todos os Pets.ListarPetServiceGET/pets/{id}Busca os detalhes de um Pet pelo ID.DetalharPetServicePUT/pets/{id}Altera os dados de um Pet existente.AlterarPetServiceDELETE/pets/{id}Remove um Pet pelo ID.RemoverPetServiceDetalhes de Requisição (POST /pets)CampoTipoDescriçãoRestriçãonomeStringNome do Pet.Obrigatório (@NotBlank)responsavelStringNome do responsável.Obrigatório (@NotBlank)tamanhoEnumPorte do Pet.Obrigatório (@NotNull), Valores: PEQUENO, MEDIO, GRANDEpremiumbooleanFlag indicando se é um Pet premium.Obrigatório (@NotNull)Exemplo de Corpo da Requisição (application/json):JSON{
  "nome": "Luna",
  "responsavel": "Mariana Souza",
  "tamanho": "PEQUENO",
  "premium": false
}
Exemplo de Resposta (200 OK):JSON{
  "nome": "Luna",
  "responsavel": "Mariana Souza"
}
