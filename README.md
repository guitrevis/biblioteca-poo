# biblioteca-poo

Biblioteca-POO é um sistema em Java que simula o gerenciamento de uma biblioteca usando Programação Orientada a Objetos (POO). O software permite cadastrar livros e usuários, realizar empréstimos e devoluções, e consultar o acervo disponível.

Funcionalidades

Cadastro de livros e usuários.

Empréstimo e devolução de livros.

Listagem de livros disponíveis na biblioteca.

Estrutura do Projeto

src/ → contém todos os arquivos de código Java:

Main.java → executa o programa e demonstra suas funcionalidades.

Biblioteca.java → gerencia livros e usuários.

Livro.java → representa cada livro, com métodos de empréstimo e devolução.

Usuario.java → representa os usuários e controla os livros emprestados.

README.md → documentação do projeto.

Como Executar

Abra o terminal na pasta raiz do projeto (biblioteca-poo).

Compile todos os arquivos dentro da pasta src:

javac src/*.java


Execute o programa:

java -cp src Main


-cp src indica que o Java deve procurar os arquivos .class dentro da pasta src.

Observações

O código segue boas práticas de POO: modularidade, encapsulamento e clareza.

Pode ser expandido futuramente para incluir funcionalidades como histórico de empréstimos ou pesquisa de livros.