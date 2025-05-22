[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DaO0-MBc)
# Engenharia de Telecomunicações - Programação Orientada a Objetos
## Bernardo Souza Muniz - Lista de exercícios 3

### Como usar o repositório
Para clonar o repositório para a sua máquina local utilizando Git, basta executar o seguinte comando no seu terminal:

`git clone https://github.com/sergio-prolo-class/lista-3-BernardoMuniz39`

### Sobre
Este repositório tem o objetivo de apresentar a resolução da lista 3 da disciplina de Programação orientada a objetos. Durante a realização do projeto, foi utilizada as estruturas de dados presentes biblioteca da **API Collections**.

Para utilizar o projeto, certifique-se de estar dentro da pasta do exercício que deseja visualizar e com o gradle instalado no seu computador. Digite o seguinte comando no terminal da sua máquina local:

`gradle run` ou `./gradlew run`

Fique a vontade para usar os métodos de cada objeto conforme sua curiosidade!

## Login

```mermaid
%%{init: {'flowchart': {'nodeSpacing': 100, 'rankSpacing': 100}}}%%
  classDiagram
        direction LR
        class App{
           
        }
        class Register {
          +users: Set~User~
          +addUSer(usuario: User)void
          +removeUser(login: String)void
          +autenticationUser(login: String, senha: String)void
          +getUsers()void
        }
        class User {
          -login: String
          -senha: String
          +User(login: String, senha: String)
        }
          App ..> Register : usa métodos estáticos
         Register "1" --> "*"User
```


## Atendimento

```mermaid
%%{init: {'flowchart': {'nodeSpacing': 100, 'rankSpacing': 100}}}%%
  classDiagram
        direction LR
        class App{

        }
        class Manager {
          +fila: Queue~Client~
          +atendidos: List~Client~
          +registrados: List~Client~
          +addClient(client: Client)void
          +getPhonesRegistred()void
          +getNexClient()void
          +toMeetNextClient()void
          +getNameClientsServed()void
          +getPhonesWait()void
          +getReport()
        }
        class Client {
          -name: String
          -phone: String
          +Client(name: String, phone: String, solicitacao:Solicitacao)
          +newSolicitation(solicitacao: Solicitacao)void
          +getSolicitation(): List<Solicitacao>
        }
        class Solicitacao{
            -description: String
            -category: String
        }
          App ..> Manager : usa métodos estáticos
         Client "1" --> "*"Solicitacao
         Manager "1" --* "*" Client
```
## Biblioteca
```mermaid
%%{init: {'flowchart': {'nodeSpacing': 100, 'rankSpacing': 100}}}%%
classDiagram
        direction LR
        class App{
          
        }
        class Biblioteca {
          +autores: List~Autor~
          +leitores: List~Leitor~
          +livros: List~Livro~

          +addAutor(autor: Autor)void
          +addLeitor(Leitor: Leitor)void
          +addLivro(livro: Livro)void
          +getAutorOrdenado()void
          +getLeitorOrdenado()void
          +getLivroOrdenado()void
        }
        class Autor {
          -nome: String
          -idioma: String
          -livros: List~Livro~
         +adicionarLivro(Livro livro)void

        }
        class Leitor{
            -nome, endereco, telefone: String
            -id: int
            -livros: List~Livro~
            +getLivros()List~Livro~
            +setId(id: int)void
            +getId()void
        }
        class Livro{
          -titulo, codigo: String
          -autores: List~Autor~
          +getAutores()List~Autor~
          +adicionarAutor(autor: Autor)void
        }
        class Emprestimo{
          +datasPorLeitor: Map~Leitor, List<String>~
          +registraEmprestimos(livro: Livro,leitor: Leitor, data: String)void
          +listaEmprestimos(leitor: Leitor)void
        }
              App ..> Biblioteca : usa métodos
    App ..> Emprestimo : usa métodos

    Biblioteca "1" o-- "*" Autor
    Biblioteca "1" o-- "*" Livro
    Biblioteca "1" o-- "*" Leitor

    Livro "*" o-- "*" Autor
    Autor "*" o-- "*" Livro
    Emprestimo "1" --> "*" Leitor : contém datas
    Emprestimo "1" --> "*" Livro : contém empréstimos
```