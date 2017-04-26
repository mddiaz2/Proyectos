/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

/**
 *
 * @author Cristian Jose
 */
public class Factura {

    LineaItems line;

    public static void main(String[] args) {
        Domicilio dom = new Domicilio("Cristian", "Gonzanama-Eduardo Kingman", "Loja", "Ecuador");
        Producto pro1 = new Producto("Carro", 2.5);
        Producto pro2 = new Producto("Avion", 1.5);
        Producto pro3 = new Producto("Tren", 3.5);
        LineaItems lin = new LineaItems(2, pro1);
        System.out.println("Datos Domicilio : " + dom.toString());
        System.out.println("Datos del producto : " + pro1.toString());
        System.out.println("La cantidad es: " + lin.toString());
        lin.PrecioTotal();
    }

}
