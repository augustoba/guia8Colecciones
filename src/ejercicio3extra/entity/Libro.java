
package ejercicio3extra.entity;

public class Libro {
    
    private String titulo;
    private String autor;
    private static Integer numerodeEjemplares=0;
    private Integer numerodeEjemplaresPrestados;

    public Libro() {
        numerodeEjemplares++;
    }

    public Libro(String titulo, String autor, Integer numerodeEjemplares, Integer numerodeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodeEjemplares = numerodeEjemplares;
        this.numerodeEjemplaresPrestados = numerodeEjemplaresPrestados;
    }

    public Integer getNumerodeEjemplaresPrestados() {
        return numerodeEjemplaresPrestados;
    }

    public void setNumerodeEjemplaresPrestados(Integer numerodeEjemplaresPrestados) {
        this.numerodeEjemplaresPrestados = numerodeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumerodeEjemplares() {
        return numerodeEjemplares;
    }

    public void setNumerodeEjemplares(Integer numerodeEjemplares) {
        this.numerodeEjemplares = numerodeEjemplares;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numerodeEjemplares=" + numerodeEjemplares + ", numerodeEjemplaresPrestados=" + numerodeEjemplaresPrestados + '}';
    }
    

}
