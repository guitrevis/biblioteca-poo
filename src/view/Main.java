package view;

import controller.BibliotecaController;
import model.Livro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BibliotecaController controller = new BibliotecaController();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch(opcao){
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    controller.cadastrarLivro(titulo, autor);
                    System.out.println("Livro cadastrado!");
                    break;

                case 2:
                    System.out.println("\nLista de livros:");
                    for(Livro l : controller.listarLivros()){
                        System.out.println("- " + l.getTitulo() + " (" + l.getAutor() + ") "
                                + "[" + (l.isDisponivel() ? "Disponível" : "Emprestado") + "]");
                    }
                    break;

                case 3:
                    System.out.print("Título do livro para emprestar: ");
                    String emprestar = sc.nextLine();
                    if(controller.emprestarLivro(emprestar)){
                        System.out.println("Livro emprestado com sucesso!");
                    } else{
                        System.out.println("Livro não disponível ou não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Título do livro para devolver: ");
                    String devolver = sc.nextLine();
                    if(controller.devolverLivro(devolver)){
                        System.out.println("Livro devolvido com sucesso!");
                    } else{
                        System.out.println("Livro não encontrado ou já disponível.");
                    }
                    break;
            }
        }while(opcao != 0);

        sc.close();
    }
}
