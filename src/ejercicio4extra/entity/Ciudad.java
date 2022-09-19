
package ejercicio4extra.entity;

public class Ciudad {

    private String nombre;
    private Integer cp;

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer cp) {
        this.nombre = nombre;
        this.cp = cp;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", cp=" + cp + '}';
    }
    
}
