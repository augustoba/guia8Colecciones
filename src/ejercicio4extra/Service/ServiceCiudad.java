//4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//numero.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//• Muestra por pantalla los datos
package ejercicio4extra.Service;

import ejercicio4extra.entity.Ciudad;
import java.util.*;

public class ServiceCiudad {

    private Scanner read = new Scanner(System.in);
    private Map<Integer, String> ciudades = new HashMap();

//    public Ciudad crearCiudad(){
//        
//        Ciudad ciudad=new Ciudad();
//        return ciudad;
//    }
    public void cargarCiudades() {

        for (int i = 0; i < 3; i++) {

            Ciudad ciudad = new Ciudad();

            System.out.println("ingrese el cp de la ciudad n°" + (i + 1));
            ciudad.setCp(read.nextInt());
            read.nextLine();
            System.out.println("ingrese el nombre de la ciudad n°" + (i + 1));
            ciudad.setNombre(read.nextLine());
            ciudades.put(ciudad.getCp(), ciudad.getNombre());

        }

    }

    public void mostrarCiudades() {

        Iterator<Integer> it = ciudades.keySet().iterator();

        while (it.hasNext()) {
            Integer key = it.next();
            String value = ciudades.get(key);
            System.out.println("codigo postal: " + key + ", ciudad: " + value);
        }
    }

    public void buscarCiudad() {

        Iterator<Integer> it = ciudades.keySet().iterator();

        System.out.println("ingrese un codigo postal");
        Integer cp = read.nextInt();
        boolean encontrado = false;
        while (it.hasNext()) {

            if (it.next().equals(cp)) {

                System.out.println("El codigo postal es : " + cp + ", la ciudad es: " + ciudades.get(cp));
                encontrado = true;
            }

        }
        if (!encontrado) {
            System.out.println("no se encontro el codigo postal");

        }

    }

    public void agregarUnaCiudad() {

        Ciudad ciudad = new Ciudad();
        System.out.println("ingrese el codigo postal de la ciudad");
        ciudad.setCp(read.nextInt());
        read.nextLine();
        System.out.println("ingrese el nombre de la ciudad");
        ciudad.setNombre(read.nextLine());
        ciudades.put(ciudad.getCp(), ciudad.getNombre());
    }

    public void eliminarCiudades() {

        
            System.out.println("ingrese el codigo postal de la ciudad a eliminar.");
            Integer codigo = read.nextInt();
            read.nextLine();

            boolean encontrado = false;

            Iterator<Integer> it = ciudades.keySet().iterator();
            while (it.hasNext()) {

                if (it.next().equals(codigo)) {
                    ciudades.remove(codigo);

                    encontrado = true;
                }

            }
            if (!encontrado) {
                System.out.println("no se encontro el codigo postal");

            }
        }
    

    public void menu() {
        int opc;
        do {

            System.out.println("menu ciudades...");
            System.out.println("1- para cargar 10 ciudades");
            System.out.println("2- para cargar 1 ciudad");
            System.out.println("3- para mostrar ciudades");
            System.out.println("4- para eliminar 3 ciudades");
            System.out.println("5- para buscar ciudad");
            System.out.println("6- salir");

            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cargarCiudades();
                    break;
                case 2:
                    agregarUnaCiudad();
                    break;
                case 3:
                    mostrarCiudades();
                    break;
                case 4:
                    eliminarCiudades();
                    break;
                case 5:
                    buscarCiudad();
                    break;
                default:
                    System.out.println("ingrese una opcion valida");

            }
        } while (opc != 6);
    }

}
