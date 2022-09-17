package ejercicio1extra.service;

import ejercicio1extra.entity.Numero;
import java.util.*;

public class ServiceNumero {

    private List<Numero> numeros;
    private Scanner read;

    public ServiceNumero() {
        this.read = new Scanner(System.in);
        this.numeros = new ArrayList();

    }

    public Numero crearNumero() {

        Numero numero = new Numero();
        return numero;
    }

    public void cargarNumeros() {
        Integer num;
        do {
            System.out.println("ingrese un numero");
            num = read.nextInt();
            if (num != -99) {
                Numero numero = crearNumero();
                numero.setNum(num);
                numeros.add(numero);

            }

        } while (num != -99);

    }
    
    public void mostrarNumeros(){
        for (Numero aux : numeros) {
            System.out.println(aux);
            
        }
    }

}
