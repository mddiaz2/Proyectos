/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.ArrayList;

/**
 *
 * @author Cristian Jose
 */
public class Programadores {
    int id;
    String nombre;
    double salario;
    ArrayList<Lenguajes> lenguajesP;

    public Programadores(int id, String nombre, double salario, ArrayList<Lenguajes> lenguajesP) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.lenguajesP = lenguajesP;
    }
}
