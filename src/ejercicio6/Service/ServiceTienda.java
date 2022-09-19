//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package ejercicio6.Service;

import ejercicio6.entity.Tienda;
import java.util.*;

public class ServiceTienda {
    
    private Scanner read;
    private HashMap<String,Double> productos=new HashMap();

    public ServiceTienda() {
        this.read=new Scanner(System.in);
        //this.productos=new HashMap();
    }
    
    public Tienda crearProducto(){
        Tienda tienda = new Tienda();
        return tienda;
    }
    
    
    public void  cargarProducto(){
        
        do {
            Tienda tienda=crearProducto();
            System.out.println("ingrese un producto");
            tienda.setProducto(read.nextLine());
            System.out.println("ingrese el precio del producto");
            tienda.setPrecio(read.nextDouble());
            productos.put(tienda.getProducto(), tienda.getPrecio());
            read.nextLine();
            System.out.println("desea seguir cargando productos?  si/no...");
        } while ("si".equals(read.nextLine().toLowerCase()));
        
        }
    
    
        public void mostrarProductos(){
            Iterator <String> it = productos.keySet().iterator();
                
            
            while(it.hasNext()){
                String key=it.next();
                double value = productos.get(key);
                 System.out.println("Producto: " + key + ", $" + value);
            }
        }
        
//        public void mostrarProductos(){
//        
//        productos.entrySet().forEach((aux) -> {                
//            String key = aux.getKey();
//            double value = aux.getValue();
//            
//            System.out.println("Nombre: " + key + "| Precio: $" + value);
//        });
//        }
    
        public void modificarPrecioProducto(){
            System.out.println("ingrese el producto a modificar");
            String productoMod=read.nextLine();
            
            if (productos.containsKey(productoMod)) {
                System.out.println("ingrese el precio nuevo");
                productos.put(productoMod, read.nextDouble());
                
            }else { 
                System.out.println("no se encontro el producto.");
            }
        }
        

}
