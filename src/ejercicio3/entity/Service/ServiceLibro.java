
package ejercicio3.entity.Service;

import ejercicio3extra.entity.Libro;
import java.util.*;

public class ServiceLibro {

    private Set<Libro>libros;
    private Scanner read;

    public ServiceLibro() {
        this.libros=new HashSet();
        this.read= new Scanner(System.in);
        
    }
    
    public Libro crearLibro(){
        Libro libro = new Libro();
        return libro;
    }
    
    public void cargarLibro(){
        
        do {
            Libro libro=crearLibro();
            System.out.println("ingrese el titulo del libro");
            libro.setTitulo(read.nextLine());
            System.out.println("ingrese el autor");
            libro.setAutor(read.nextLine());
            System.out.println("ingrese");
            
            
        } while (read.nextLine().equalsIgnoreCase("si"));
        
        
    }
}
