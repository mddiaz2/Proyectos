/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2CSV;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Cristian Jose
 */
public class opc {

    public static void insertar(int opc, String texto) {
        try {
            String[] tokens = texto.split(";");
            String linea = "";
            Scanner BD = null;
            switch (opc) {
                case 1:
                    BD = new Scanner(new File("Estudiantes.csv"));
                    //linea=BD.nextLine();
                    break;
                case 2:
                    BD = new Scanner(new File("Docentes.csv"));
                    //linea=BD.nextLine();
                    break;
                case 3:
                    BD = new Scanner(new File("Componentes.csv"));
                    //linea=BD.nextLine();
                    break;
                case 4:
                    BD = new Scanner(new File("RegistroE.csv"));
                    //linea=BD.nextLine();
                    break;
                case 5:
                    BD = new Scanner(new File("RegistroD.csv"));
                    //linea=BD.nextLine();
                    break;
            }
            int cont = 0;
            while (BD.hasNextLine()) {
                linea += BD.nextLine() + "\n";
                cont++;
            }
            BD.close();
            Formatter outFile = null;
            switch (opc) {
                case 1:
                    outFile = new Formatter("Estudiantes.csv");
                    break;
                case 2:
                    outFile = new Formatter("Docentes.csv");
                    break;
                case 3:
                    outFile = new Formatter("Componentes.csv");
                    break;
                case 4:
                    outFile = new Formatter("RegistroE.csv");
                    break;
                case 5:
                    outFile = new Formatter("RegistroD.csv");
                    break;
            }
            outFile.format("%s", linea);
            outFile.format("%d;%s", cont, texto);
            outFile.format("\n");
            outFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String consulta(int opc, int cedula) {
        try {
            String linea;
            Scanner BD = null;
            switch (opc) {
                case 1:
                    BD = new Scanner(new File("Estudiantes.csv"));
                    linea = BD.nextLine();
                    break;
                case 2:
                    BD = new Scanner(new File("Docentes.csv"));
                    linea = BD.nextLine();

                    break;
                case 3:
                    BD = new Scanner(new File("Componentes.csv"));
                    linea = BD.nextLine();
                    break;
            }
            String resultado = null;
            int aux = 0;
            int aux2 = 0;
            while (BD.hasNextLine()) {
                linea = BD.nextLine();
                String[] tokens = linea.split(";");
                if (tokens[1].equals("" + cedula)) {
                    resultado = linea;
                    aux2 = aux;
                }
                aux++;
            }
            BD.close();
            if (resultado == null) {
                return null;
            } else {
                return resultado + aux2 + ";" + aux + ";";
            }
        } catch (Exception e) {
            System.out.println("Excepcion atrapada  " + e);
        }
        return null;
    }

    public int size(int opc) {
        try {
            Scanner BD = null;
            switch (opc) {
                case 1:
                    BD = new Scanner(new File("Estudiantes.csv"));
                    //linea=BD.nextLine();
                    break;
                case 2:
                    BD = new Scanner(new File("Docentes.csv"));
                    //linea=BD.nextLine();
                    break;
                case 3:
                    BD = new Scanner(new File("Componentes.csv"));
                    //linea=BD.nextLine();
                    break;
            }
            int cont = 0;
            String linea = BD.nextLine();
            while (BD.hasNextLine()) {
                linea = BD.nextLine();
                cont++;
            }
            return cont;

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
