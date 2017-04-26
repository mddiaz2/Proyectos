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
public class main3 {

    public static void main(String[] args) {
        Lenguajes l1 = new Lenguajes(0, "Java");
        Lenguajes l2 = new Lenguajes(0, "c++");
        Lenguajes l3 = new Lenguajes(0, "c");

        ArrayList<Lenguajes> lenguajesP = new ArrayList<Lenguajes>();
        lenguajesP.add(l1);
        lenguajesP.add(l2);
        Programadores p1 = new Programadores(0, "Cristian", 350, lenguajesP);
        boolean jefe = true;
        int personal = 5;
        double porce =0;
        boolean verifico = false;
        System.out.println("DATOS");
        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Lenguajes Dominados");
        for (int i = 0; i < p1.lenguajesP.size(); i++) {
            System.out.println("* " + p1.lenguajesP.get(i).nombre);
        }
        if (jefe) {
            porce = (personal*0.10);
            p1.salario+=p1.salario*porce;
            verifico = true;
        }
        if (verifico) {
            System.out.println("Salario+ "+porce+"% = "+p1.salario);
        } else {
            System.out.println("Salario: " + p1.salario);
        }
    }
}
