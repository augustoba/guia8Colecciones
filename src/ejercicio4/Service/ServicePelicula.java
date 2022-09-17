//4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//cuenta lo que se pide a continuación:
//19
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
package ejercicio4.Service;

import ejercicio4.entity.Pelicula;
import java.util.*;

public class ServicePelicula {

    private List<Pelicula> peliculas;
    private Scanner read;

    public ServicePelicula() {
        this.peliculas = new ArrayList();
        this.read = new Scanner(System.in);
    }

    private Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        return pelicula;
    }

    private void cargarPelicula() {

        do {

            Pelicula pelicula = crearPelicula();

            System.out.println("ingrese el titulo de la pelicula");
            pelicula.setTitulo(read.nextLine());
            System.out.println("ingrese el director de la pelicula");
            pelicula.setDirector(read.nextLine());
            System.out.println("ingrese la duracion de la pelicula");
            pelicula.setDuracion(read.nextInt());
            peliculas.add(pelicula);
            read.nextLine();
            System.out.println("quiere cargar otra pelicula? si/no");

        } while (read.nextLine().equalsIgnoreCase("si"));

    }

    private void mostrarPeliculas() {
        if (peliculas.size() == 0) {
            System.out.println("no tiene peliculas cargadas");

        } else {for (Pelicula aux : peliculas) {
                System.out.println(aux);
            }
            

        }

    }

    private void peliculaMayorHora() {
        boolean esMayor = false;

        if (peliculas.size() == 0) {
            System.out.println("no hay peliculas cargadas");

        } else {
            for (Pelicula aux : peliculas) {
                if (aux.getDuracion() > 1) {
                    System.out.println("la pelicula " + aux.getTitulo() + " tiene una duracion mayor a una hora " + aux.getDuracion() + " horas");
                    esMayor = true;
                }
            }
            if (!esMayor) {
            System.out.println("no se encontraron peliculas con duracion mayor a 1 hora");

        }

        }

        
    }

    private void duracionMenoraMayor() {

        if (peliculas.size() == 0) {
            System.out.println("no hay peliculas cargadas");

            //se pasa por parametro el array la clase comparator y el metodo a usar
        } else {
            Collections.sort(peliculas, ComparatorPelicula.compararDuracionAscendente);
            System.out.println("las peliculas ordenadas por duracion ascendente son: ");
            //luego se recorre con un foreach para mostrarlo segun el orden que elegimos
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula);
            }

        }
    }

    private void duracionMayoraMenor() {
        if (peliculas.size() == 0) {
            System.out.println("no hay peliculas cargadas");
        } else {
            Collections.sort(peliculas, ComparatorPelicula.compararDuracionDescendente);
            System.out.println("las peliculas ordenadas por duracion descendente son: ");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula);

            }

        }
    }

    private void ordenAlfabeticoTitulo() {
        if (peliculas.size() == 0) {
            System.out.println("no hay peliculas cargadas");
        } else {
            Collections.sort(peliculas, ComparatorPelicula.compararTitulo);
            System.out.println("las peliculas ordenadas por titulo ascendente son: ");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula);

            }
        }
    }

    private void ordenAlfabeticoDirector() {
        if (peliculas.size() == 0) {
            System.out.println("no hay peliculas cargadas");
        } else {
            Collections.sort(peliculas, ComparatorPelicula.compararDirector);
            System.out.println("las peliculas ordenadas por director ascendente son: ");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula);

            }

        }
    }

    public void menu() {
        int opc;
        do {
            System.out.println("***********MENU**********");
            System.out.println("1 - cargar peliculas");
            System.out.println("2 - mostrar peliculas");
            System.out.println("3 - mostrar peliculas mayor a 1 hora");
            System.out.println("4 - mostrar peliculas duracion menor a mayor");
            System.out.println("5 - mostrar peliculas duracion mayor a menor");
            System.out.println("6 - mostrar peliculas por titulo alfabeticamente");
            System.out.println("7 - mostrar peliculas por director alfabeticamente");
            System.out.println("8 - salir");
            System.out.println("ingrese una opcion.....");
            opc = read.nextInt();
            read.nextLine();
            switch (opc) {
                case 1:
                    cargarPelicula();
                    break;
                case 2:
                    mostrarPeliculas();
                    break;
                case 3:
                    peliculaMayorHora();
                    break;
                case 4:
                    duracionMenoraMayor();
                    break;
                case 5:
                    duracionMayoraMenor();
                    break;
                case 6:
                    ordenAlfabeticoTitulo();
                    break;
                case 7:
                    ordenAlfabeticoDirector();
                    break;
                case 8:
                    System.out.println("cerrando programa...");
                    break;
                default:
                    System.out.println("ingrese una opcion valida...");
            }

        } while (true);
    }

}
