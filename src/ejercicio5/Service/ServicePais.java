//5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto.
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
//se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
//ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
//se le informará al usuario.
package ejercicio5.Service;

import ejercicio5.entity.Pais;
import java.util.*;

public class ServicePais {

    private Set<Pais> paises;
    private Scanner read;

    public ServicePais() {
        this.paises = new TreeSet();
        this.read = new Scanner(System.in);
        
    }

    public Pais crearPais() {
        Pais pais = new Pais();
        return pais;
    }

    public void cargarPaises() {

        do {
            Pais pais = crearPais();
            System.out.println("ingrese el nombre del pais");
            pais.setNombre(read.nextLine());
            paises.add(pais);

            System.out.println("desea cargar mas paises? si/no");

        } while (!"no".equals(read.nextLine().toLowerCase()));

    }

    public void mostrarPaises() {
        
        
        if (paises.size()==0) {
            System.out.println("no tiene paises cargados");
            
        }else   {
           for (Pais aux : paises) {
            System.out.println(aux);
            
        } 
        }
        

    }

}
