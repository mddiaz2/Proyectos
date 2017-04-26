/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3CSV;

import Ejer2CSV.*;
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
                    BD = new Scanner(new File("Reporte1.csv"));
                    break;
                case 2:
                    BD = new Scanner(new File("Reporte2.csv"));
                    break;
                case 3:
                    BD = new Scanner(new File("Reporte3.csv"));
                    break;

            }
            while (BD.hasNextLine()) {
                linea += BD.nextLine() + "\n";
            }
            BD.close();
            Formatter outFile = null;
            switch (opc) {
                case 1:
                    outFile = new Formatter("Reporte1.csv");
                    break;
                case 2:
                    outFile = new Formatter("Reporte2.csv");
                    break;
                case 3:
                    outFile = new Formatter("Reporte3.csv");
                    break;

            }
            outFile.format("%s", linea);
            outFile.format("%s;", texto);
            outFile.format("\n");
            outFile.close();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
    public static String consulta(int opc, int cedula) {
        try {
            String linea;
            Scanner BD = null;
            switch (opc) {
                case 1:
                    BD = new Scanner(new File("Reporte1.csv"));
                    linea = BD.nextLine();
                    break;
                case 2:
                    BD = new Scanner(new File("Reporte2.csv"));
                    linea = BD.nextLine();

                    break;
                case 3:
                    BD = new Scanner(new File("Reporte3.csv"));
                    linea = BD.nextLine();
                    break;
            }
            String resultado = null;
            int aux = 0;
            int aux2 = 0;
            while (BD.hasNextLine()) {
                linea = BD.nextLine();
                String[] tokens = linea.split(";");
                if (tokens[0].equals("" + cedula)) {
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
}
