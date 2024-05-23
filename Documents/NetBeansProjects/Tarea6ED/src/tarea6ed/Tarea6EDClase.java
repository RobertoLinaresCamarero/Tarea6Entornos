/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author USER
 */

   /**
 * Esta clase representa una aplicación simple para aplicar descuentos a productos.
 * Se puede utilizar para calcular el total a pagar después de aplicar un descuento 
 * dependiendo de la cantidad de productos comprados.
 */
public class Tarea6EDClase {

    /**
     * Calcula el total a pagar por un producto, aplicando un descuento si la cantidad
     * de productos comprados es mayor que 3.
     * @param precioProducto El precio unitario del producto.
     * @param numeritoProductos La cantidad de productos comprados.
     */
    public void aplicarDescuento(double precioProducto, int numeritoProductos) {
        double total;
        if (numeritoProductos > 3) {
            precioProducto -= 5;
        }
        if (numeritoProductos != 0) {
            total = precioProducto * nombre;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * 0.95;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
            System.out.println("megaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapenmeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        }
    }

    /**
     * El descuento aplicado cuando se compran más de 3 productos.
     */
    public static final double nombre = 0.8;
}
