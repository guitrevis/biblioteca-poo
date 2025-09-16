public class Main {
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
