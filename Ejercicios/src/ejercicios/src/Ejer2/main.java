/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian Jose
 */
public class main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<dAuxiliar> auxiliares = new ArrayList<>();
        ArrayList<dTitular> titulares = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<ComponenteEducativo> componentes = new ArrayList<>();

        Alumno a1 = new Alumno(0, 1111, "Cristian", "cristian@");
        Alumno a2 = new Alumno(1, 1112, "Cristiann", "cristian@");
        Alumno a3 = new Alumno(2, 1113, "Cristiannn", "cristian@");

        dAuxiliar d1 = new dAuxiliar(8, 0, 1101, "Danilo", "danilo@");
        dAuxiliar d2 = new dAuxiliar(6, 1, 1102, "Danilos", "danilo@");
        dAuxiliar d3 = new dAuxiliar(5, 2, 1103, "Daniloss", "danilo@");

        dTitular t1 = new dTitular(4, 3, 1104, "cesar", "cesar@");
        dTitular t2 = new dTitular(6, 4, 1105, "cesars", "cesar@");
        dTitular t3 = new dTitular(8, 5, 1106, "cesarss", "cesar@");

        ComponenteEducativo c1 = new ComponenteEducativo(0, "programacion", 4);
        ComponenteEducativo c2 = new ComponenteEducativo(2, "programacion2", 4);
        ComponenteEducativo c3 = new ComponenteEducativo(3, "programacion3", 4);

        personas.add(a1);
        personas.add(a2);
        personas.add(a3);
        personas.add(d1);
        personas.add(d2);
        personas.add(d3);
        personas.add(t1);
        personas.add(t2);
        personas.add(t3);

        componentes.add(c1);
        componentes.add(c2);
        componentes.add(c3);

        //INICIO
        Scanner s = new Scanner(System.in);
        ArrayList<registroAcademico> registro = new ArrayList<>();
        System.out.println("Cuantos registros desea realizar");
        int numero = s.nextInt();
        for (int i = 0; i < numero; i++) {
            Random r = new Random();

            int persona = r.nextInt(personas.size());
            int componente = r.nextInt(componentes.size());
            registroAcademico rAux = new registroAcademico(componentes.get(componente), personas.get(persona));
            registro.add(rAux);
        }

        System.out.println("REGISTROS DADOS");
        for (int i = 0; i < registro.size(); i++) {
            System.out.println("Nombre: " + registro.get(i).persona.nombre + "  componente: " + registro.get(i).componente.nombre);
        }
    }
}
