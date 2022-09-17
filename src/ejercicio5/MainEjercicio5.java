
package ejercicio5;

import ejercicio5.Service.ServicePais;


public class MainEjercicio5 {

   
    public static void main(String[] args) {
        ServicePais service = new ServicePais();
        
        service.cargarPaises();
        service.mostrarPaises();
    }

}
