
package ejercicio4.Service;

import ejercicio4.entity.Pelicula;
import java.util.Comparator;


public class ComparatorPelicula {
    
    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararTitulo=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
        return  t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirector= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
