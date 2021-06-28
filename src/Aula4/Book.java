package Aula4;
/*
Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser: public String toString ().
Este método deve retornar uma string que representa o objeto. Por exemplo: se a classe tiver os atributos: título,
isbn e autor, uma string representando um livro poderia ser: "Harry Potter, 9780545582889, Rowling, J. K.".
A classe conterá um construtor padrão, um construtor com parâmetros e os métodos de acesso.

Adicione a linha @Override logo acima do cabeçalho do método toString. Em seguida, renomeie o método para: tostring (tudo em letras minúsculas). O que acontece?
 */
public class Book {
    private String nome;
    private long isbn;
    private String autor;
    private char disponibilidade;

    public Book(String nome, long isbn, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Book(){

    }

    public Book emprestimo(Book book){
        book.setDisponibilidade('S');
        return book;
    }

    public String getNome() {
        return nome;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setDisponibilidade(char disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nome='" + nome + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }
}
