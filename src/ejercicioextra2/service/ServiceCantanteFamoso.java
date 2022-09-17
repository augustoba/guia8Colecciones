//2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
//objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
//cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios. 
package ejercicioextra2.service;

import ejercicioextra2.entity.CantanteFamoso;
import java.util.*;

public class ServiceCantanteFamoso {

    private List<CantanteFamoso> cantantes;
    private Scanner read;

    public ServiceCantanteFamoso() {
        this.cantantes=new ArrayList();
        this.read = new Scanner(System.in);
    }

   

    private CantanteFamoso crearCantante() {
        CantanteFamoso cantante = new CantanteFamoso();
        return cantante;
    }

    private void cargar5Cantantes() {
            
        for (int i = 0; i < 5; i++) {

            CantanteFamoso cantante = crearCantante();
            System.out.println("ingrese el nombre del cantante " + (i + 1));
            cantante.setNombre(read.nextLine());
            System.out.println("ingrese el nombre del disco del cantante " + (i + 1));
            cantante.setDiscoConMasVentas(read.nextLine());
            cantantes.add(cantante);
        }

    }

    private void cargarCantante() {

        CantanteFamoso cant = new CantanteFamoso();
        System.out.println("ingrese el nombre del cantante ");

        cant.setNombre(read.nextLine());
        System.out.println("ingrese el nombre del disco del cantante ");
        cant.setDiscoConMasVentas(read.nextLine());
        cantantes.add(cant);
    }

    private void mostrarCantantes() {
        for (CantanteFamoso aux : cantantes) {
            System.out.println(aux);

        }
        
       
    }

    private void eliminarCantante() {

        Iterator<CantanteFamoso> it = cantantes.iterator();
        System.out.println("ingrese un cantante a eliminar");
        String cantante =read.nextLine();
        boolean eliminado=false;
        while (it.hasNext()){
            
            if (it.next().getNombre().equalsIgnoreCase(cantante)) {
                it.remove();
                 eliminado=true;
            }
            if (eliminado) {
                System.out.println("el cantante fue eliminado");
                
            }else {
                System.out.println("no se encontro el cantante en la lista");
            }
        }

    }
    
    public  void  menu (){
        Integer opc=0;
        
        do {
        System.out.println("ingrese una opcion");
        System.out.println("1- cargar 5 cantantes");
        System.out.println("2- mostrar cantantes");
        System.out.println("3- cargar 1 cantante");
        System.out.println("4- eliminar cantante");
        System.out.println("5- salir");
        opc=read.nextInt();
        read.nextLine();
        switch (opc) {
            case 1:
                cargar5Cantantes();
                break;
                case 2:
                mostrarCantantes();
                break;
                case 3:
                cargarCantante();
                break;
                case 4:
                eliminarCantante();
                break;
                case 5:
                    System.out.println("cerrando programa....");
                break;
            default:
                System.out.println("ingrese una opcion correcta");
        }
                } while (opc!=5);

        
    }

}
