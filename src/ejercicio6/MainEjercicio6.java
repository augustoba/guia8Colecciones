
package ejercicio6;

import ejercicio6.Service.ServiceTienda;

public class MainEjercicio6 {

   
    public static void main(String[] args) {
        ServiceTienda service= new ServiceTienda();
        
        service.cargarProducto();
        service.mostrarProductos();
        service.modificarPrecioProducto();
        
    }

}
