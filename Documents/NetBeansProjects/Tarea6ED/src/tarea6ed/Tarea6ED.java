/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author USER
 */
/**
 * Esta clase contiene el método principal para probar la funcionalidad
 * de la clase Tarea6EDClase.
 */
public class Tarea6ED {

    /**
     * Método principal que instancia un objeto de la clase Tarea6EDClase y llama
     * al método aplicarDescuento para calcular el total a pagar.
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        instanciacionObjeto();
    }

    /**
     * Crea una instancia de la clase Tarea6EDClase y llama al método aplicarDescuento
     * con un ejemplo de precio y cantidad de productos.
     */
    public static void instanciacionObjeto() {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        miCarrito.aplicarDescuento(100, 5);
    }
}
