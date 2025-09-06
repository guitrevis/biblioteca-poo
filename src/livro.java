public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro ( String titulo, String autor ){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    } 
    public String getTitulo(){
        return titulo ;
    
    }
    public String getAutor(){
        return autor;

    }

    public boolean IsDisponivel(){
        return disponivel; 
    }
    public void emprestar(){
        if (disponivel) {
            disponivel = false;
        System.out.println("Livro emprestado." + titulo);
        }else { 
            System.out.println("Livro já está emprestado");
        }
    }
    public void devolver(){
        disponivel = true;
        System.out.println("Livro devolvido" + titulo);
    
    }

}



