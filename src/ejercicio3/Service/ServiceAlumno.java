//3. Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
//tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bluce tendremos el siguiente método en la clase Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
//nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
//Dentro del método se usará la lista notas para calcular el promedio final de alumno.
//Siendo este promedio final, devuelto por el método y mostrado en el main.
//Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo
package ejercicio3.Service;

import ejercicio3.entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceAlumno {

    Scanner read;//se guarda el espacio en memoria(sin instanciar)
    ArrayList<Alumno> alum; 

    public ServiceAlumno() {
        this.alum = new ArrayList();//se instancia el array de alumnos para poder cargar a 
    //a cada alumno nuevo en la lista
        
        this.read = new Scanner(System.in);
    }

    private Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        return alumno;
    }

    private void cargarAlumnos() {

        do {
            Alumno al = new Alumno();//se instancia el nuevo alumno en cada vuelta del do while

            System.out.println("Ingrese un alumno: ");
            al.setNombre(read.next());

            System.out.println("Nota 1: ");
            al.getNotas().add(read.nextInt());//se carga cada atributo con set
            System.out.println("Nota 2: ");
            al.getNotas().add(read.nextInt());
            System.out.println("Nota 3: ");
            al.getNotas().add(read.nextInt());

            alum.add(al);// una vez cargado todos los datos se los envia al array.

            System.out.println("quiere cargar otro alumno si/no");

        } while (read.next().equalsIgnoreCase("si"));
    }

    private void mostrarAlumnos() {
        for (Alumno aux : alum) {  //se muestra la lista de alumnos que hay en el array
            System.out.println(aux);
        }
    }

    private void notaFinal() {

        double notaF = 0;
        System.out.println("ingresar alumno");
        String al = read.next();
        for (Alumno aux : alum) { // recorremos el array
            if (aux.getNombre().equalsIgnoreCase(al)) {// si el auxiliar coincide con un nombre del alumno del array
                for (double nota : aux.getNotas()) { //Recorremos las notas
                    notaF = nota + notaF;//y las vamos cargando en la variable para sacar los valores
                }
                notaF = notaF / 3;//dividimos en 3 para sacar el prmedio

            } else {
                System.out.println("no se encontro el alumno");
            }

        }
        System.out.println("la nota final es: " + notaF);
    }

    public void menu() {
        int opc;
        do {

            System.out.println("ingrese una opcion");
            System.out.println("1 - ingresar alumnos");
            System.out.println("2 - mostrar alumnos");
            System.out.println("3 - mostrar nota final");
            System.out.println("4 - salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cargarAlumnos();
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:
                    notaFinal();
                    break;
                case 4:
                    System.out.println("cerrando programa");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }
        } while (opc != 4);
    }
}
