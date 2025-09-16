import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + 
                               (livro.isDisponivel() ? "Disponível" : "Emprestado"));
        }
    }

   
}
