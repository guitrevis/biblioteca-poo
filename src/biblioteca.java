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

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("O Hobbit", "J.R.R. Tolkien");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        biblioteca.listarLivros();

        l1.emprestar();
        biblioteca.listarLivros();

        l1.devolver();
        biblioteca.listarLivros();
    }
}
