
package ejercicio5.entity;

public class Pais implements Comparable<Pais>{
    String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais: " + nombre ;
    }

    @Override
    public int compareTo(Pais t) {
     
        return this.nombre.compareTo(t.getNombre());
    }

    
    

}
