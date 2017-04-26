/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

/**
 *
 * @author wolf2
 */
public class LineaItems {

    int cantidad;
    Producto miProducto;

    public LineaItems(int cantidad, Producto miProducto) {
        this.cantidad = cantidad;
        this.miProducto = miProducto;
    }

    public double PrecioTotal() {
        double Total;
        Total = miProducto.precio * cantidad;
        System.out.println("El precio total es: " + Total);
        return 0;
    }
    
    public String toString() {
        return String.format("%d", cantidad);
    }
}
