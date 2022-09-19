package ejercicio3.entity.Service;

import ejercicio3extra.entity.Libro;
import ejercicio4.Service.ComparatorPelicula;
import java.util.*;

public class ServiceLibro {

    private Set<Libro> libros;
    private Scanner read;

    public ServiceLibro() {
        this.libros = new HashSet();
        this.read = new Scanner(System.in);

    }

    public Libro crearLibro() {
        Libro libro = new Libro();
        return libro;
    }

    public void cargarLibro() {

        do {
            Libro libro = crearLibro();
            System.out.println("ingrese el titulo del libro");
            libro.setTitulo(read.nextLine());
            System.out.println("ingrese el autor");
            libro.setAutor(read.nextLine());
            System.out.println("ingrese la cantidad de ejemplares totales");
            libro.setNumerodeEjemplares(read.nextInt());
            System.out.println("ingrese la cantidad de ejemplares prestados");
            libro.setNumerodeEjemplaresPrestados(read.nextInt());
            read.nextLine();
            libros.add(libro);

            System.out.println("quiere seguir cargando libros? si/no");

        } while (read.nextLine().equalsIgnoreCase("si"));

    }

    public boolean pretamo() {
        System.out.println("ingrese el libro a prestar");
        String prestamo = read.nextLine();
        boolean encontrado = false;
        boolean prestado = false;
        for (Libro aux : libros) {
            if ((prestamo.equalsIgnoreCase(aux.getTitulo()))) {
                encontrado = true;
                if (aux.getNumerodeEjemplares() > aux.getNumerodeEjemplaresPrestados()) {
                    aux.setNumerodeEjemplares(aux.getNumerodeEjemplares() - 1);
                    aux.setNumerodeEjemplaresPrestados(aux.getNumerodeEjemplaresPrestados() + 1);
                    prestado = true;
                    System.out.println("prestado");
                } else {
                    System.out.println("no hay stock de este libro");
                }

            }

        }
        if (!encontrado) {
            System.out.println("no se encontraron libros con ese titulo...");

        }
        return prestado;
    }

    public boolean devolucion() {

        System.out.println("ingrese el titulo que quiere devolver");
        String devolucion = read.nextLine();
        boolean encontrado = false;
        for (Libro aux : libros) {
            if (devolucion.equalsIgnoreCase(aux.getTitulo())) {
                encontrado = true;
                aux.setNumerodeEjemplares(aux.getNumerodeEjemplares() + 1);
                aux.setNumerodeEjemplaresPrestados(aux.getNumerodeEjemplaresPrestados() - 1);

            }

        }

        if (encontrado) {
            System.out.println("se devolvio el libro correctamente");

        } else {
            System.out.println("no se encontro el libro a devolver.");
        }

        return encontrado;
    }

    public void mostrarLibros() {
        for (Libro aux : libros) {
            System.out.println(aux);
        }
    }

    public void menu() {
        int opc;

        do {

            System.out.println("************Menu Libreria********************");
            System.out.println("         ingrese una opcion");
            System.out.println("1- cargar libros");
            System.out.println("2- prestar libro");
            System.out.println("3- devolcion");
            System.out.println("4- mostrar libros");
            System.out.println("5- salir");
            opc = read.nextInt();
            read.nextLine();
            switch (opc) {
                case 1:
                    cargarLibro();

                    break;
                case 2:
                    pretamo();
                    break;
                case 3:
                    devolucion();
                    break;
                case 4:
                    mostrarLibros();
                    break;
                case 5:
                    System.out.println("cerrando programa....");
                    break;

                default:
                    System.out.println("ingrese una opcion correcta");
            }
        } while (opc != 5);
    }

}
