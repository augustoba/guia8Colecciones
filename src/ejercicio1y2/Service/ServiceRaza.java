//1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.
//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
package ejercicio1y2.Service;

import ejercicio1y2.entity.Raza;
import java.util.*;


public class ServiceRaza {

    private List<Raza> perros ;
    private Scanner read ;

    public ServiceRaza() {
        this.perros= new ArrayList();
        this.read= new Scanner(System.in);
    }
    
    

    private Raza crearRazas() {

        Raza raza = new Raza();
        return raza;

    }

    private void cargarRaza() {
        String aux;
        
        do {
                        
            Raza raza = crearRazas();

            System.out.println("ingre una raza de perro");
            raza.setRaza(read.nextLine());
            perros.add(raza);

            System.out.println("quiere seguir cargando razas?; s/n");
            aux = read.nextLine();

        } while (!"n".equals(aux));
    }

    private void mostrarRazas() {
        for (Raza aux : perros) {
            System.out.println(aux);
        }
    }

    private void eliminarRaza() {
        Iterator<Raza> it = perros.iterator();
        System.out.println("ingrese la raza a eliminar");
        String opcion = read.nextLine();
        boolean encontrado = false;

        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(opcion)) {
                it.remove();
                encontrado = true;
                System.out.println("raza eliminada....");

            }

        }

        if (!encontrado) {
            System.out.println("no se encontro la raza en el arreglo");

        }

    }

    public void menu() {
        int opc;
        do {
            System.out.println("ingrese una opcion.");
            System.out.println("1- para cargar razas.");
            System.out.println("2- para mostrar razas.");
            System.out.println("3- eliminar razas.");
            System.out.println("4- salir.");
            opc = read.nextInt();
            read.nextLine();

            switch (opc) {
                case 1:
                    cargarRaza();
                    break;
                case 2:
                    mostrarRazas();
                    break;
                case 3:
                    eliminarRaza();
                    break;
                case 4:
                    System.out.println("cerrando sistema....");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
        } while (opc != 4);
    }
}
