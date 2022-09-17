
package ejercicio1extra;

import ejercicio1extra.service.ServiceNumero;

public class MainEjercicio1Extra {

   
    public static void main(String[] args) {
        
        ServiceNumero service = new ServiceNumero();
        
        service.cargarNumeros();
        service.mostrarNumeros();
    }

}
