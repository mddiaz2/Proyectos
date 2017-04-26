/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3CSV;

import Ejer2CSV.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Jose
 */
public class escenario1 {

    public static void main(String[] args) {
        String informacion;
        String informacion1;
        String informacion2;
        String aux2 = "";
        System.out.println("Bienvenidos al sistema de registro");
        System.out.println("Desea : 1)Ingresar Programador \n"
                + "2)Añadir especializacion al programador \n"
                + "3)Añadir Lider de Proyecto \n");
        Scanner s = new Scanner(System.in);
        int caso = s.nextInt();
        switch (caso) {
            case 1:
                opc c = new opc();
                Scanner dni = new Scanner(System.in);
                System.out.println("Ingrese su Identificacion");
                int ced = dni.nextInt();
                String verifico = c.consulta(1, ced);
                if (verifico == null) {
                    Scanner nom = new Scanner(System.in);
                    Scanner em = new Scanner(System.in);
                    Scanner leg = new Scanner(System.in);
                    System.out.println("Ingrese el Nombre");
                    String nomb = nom.next();
                    System.out.println("Ingrese su salario");
                    double ema = em.nextDouble();
                    System.out.println("Ingrese su lenguaje de programacion");
                    String len = leg.nextLine();
                    String txt = ced + ";" + nomb + ";" + ema + ";" + len + ";";
                    c.insertar(1, txt);
                    JOptionPane.showMessageDialog(null, "Programador registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cedula ya ha sido registrado");
                }
                break;
            case 2:
                opc doc = new opc();
                Scanner dn = new Scanner(System.in);
                Scanner jav = new Scanner(System.in);
                System.out.println("Ingrese su Identificacion");
                int ce = dn.nextInt();
                informacion = doc.consulta(1, ce);
                String verifi = doc.consulta(2, ce);
                //----------------------
                if (verifi == null) {
                    if (informacion != null) {
                        double bono = 0;
                        String je = "";
                        String jas = "";
                        String[] tokens = informacion.split(";");
                        String id = (tokens[0]);
                        String nom = (tokens[1]);
                        String sal = (tokens[2]);
                        String leng = (tokens[3]);
                        String txt = id + ";" + nom + ";" + sal + ";" + leng + ";";
                        JOptionPane.showMessageDialog(null, txt);
                        System.out.println("Desea agregar especializacion en java : S/N");
                        jas = jav.next();
                        //System.out.println("nira" + jas);
                        if ("S".equals(jas)) {
                            je = "java";
                            bono = (Double.parseDouble(tokens[2]) * 0.20);
                            JOptionPane.showMessageDialog(null, "Se asignado con exito la especializacion");

                        } else {
                            JOptionPane.showMessageDialog(null, "No se a realizado ningun cambio");
                        }
                        double SueldoT = Double.parseDouble(tokens[2]) + bono;
                        txt += je + ";" + bono + ";" + SueldoT;
                        doc.insertar(2, txt);
                        //System.out.println(txt);
                    } else {
                        JOptionPane.showMessageDialog(null, "No Encontrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cedula ya ha sido registrado");
                }
                //----------------------
                break;
            case 3:
                opc co = new opc();
                int n = 0;
                Scanner lid = new Scanner(System.in);
                Scanner javas = new Scanner(System.in);
                System.out.println("Ingrese su Identificacion");
                int cedu = lid.nextInt();
                informacion1 = co.consulta(1, cedu);
                informacion2 = co.consulta(2, cedu);
                String verif = co.consulta(3, cedu);
                //----------------------
                if (verif == null) {
                    if (informacion2 != null) {
                        double bono = 0;
                        String je = "";
                        String jas = "";
                        String[] tokens = informacion2.split(";");
                        String id = (tokens[0]);
                        String nom = (tokens[1]);
                        String sal = (tokens[2]);
                        String leng = (tokens[3]);
                        String esp = (tokens[4]);
                        String bon = (tokens[5]);
                        String salf = (tokens[6]);
                        String txt = id + ";" + nom + ";" + sal + ";" + leng + ";" + esp + ";" + bon + ";" + salf + ";";
                        JOptionPane.showMessageDialog(null, txt);
                        System.out.println("Desea asignarle lider de proyecto : S/N");
                        jas = javas.next();
                        //System.out.println("nira" + jas);
                        if ("S".equals(jas)) {
                            je = "Lider de proyecto";
                            Scanner mie = new Scanner(System.in);
                            System.out.println("Cuantos miembros desea agregar");
                            n = mie.nextInt();
                            String aux = "";
                            String txts = "";
                            for (int i = 0; i < n; i++) {
                                String token = tokens[i];
                                System.out.println("vermij: " + token);
                                opc vali = new opc();
                                System.out.println("Ingrese el id del miembro a agregar");
                                Scanner aid = new Scanner(System.in);
                                Scanner pro = new Scanner(System.in);
                                int cedl = aid.nextInt();
                                informacion = vali.consulta(1, cedl);
                                String verifik = vali.consulta(2, cedl);
                                //----------------------
                                if (verifik == null) {
                                    if (informacion != null) {
                                        //double bono = 0;
                                        String jes = "";
                                        String jass = "";
                                        String[] tokenss = informacion.split(";");
                                        String ids = (tokenss[0]);
                                        String noms = (tokenss[1]);
                                        String sals = (tokenss[2]);
                                        String lengs = (tokenss[3]);
                                        txts = ids + ";" + noms + ";" + lengs;
                                        JOptionPane.showMessageDialog(null, txts);
                                    }
                                }
                            }
                            aux += "<>" + txts;
                            aux2 = aux;
                            System.out.println("ss " + aux2);
                            JOptionPane.showMessageDialog(null, "Se a ingresado con exito los miembros");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se a realizado ningun cambio");
                        }
                        double SueldoTm = Double.parseDouble(tokens[6]) * 0.10;
                        double Sueldot = SueldoTm * n;
                        double sueldoff = Sueldot + Double.parseDouble(tokens[6]);
                        txt += je + ";" + sueldoff + ";" + aux2;
                        co.insertar(3, txt);
                        //System.out.println(txt);
                    } else if (informacion1 != null) {
                        // copiar y pegar jeje sueño
                        double bono = 0;
                        String je = "";
                        String jas = "";
                        String[] tokens = informacion1.split(";");
                        String id = (tokens[0]);
                        String nom = (tokens[1]);
                        String sal = (tokens[2]);
                        String leng = (tokens[3]);
                        String txt = id + ";" + nom + ";" + sal + ";" + leng + ";";
                        JOptionPane.showMessageDialog(null, txt);
                        System.out.println("Desea asignarle lider de proyecto : S/N");
                        jas = javas.next();
                        //System.out.println("nira" + jas);
                        if ("S".equals(jas)) {
                            je = "Lider de proyecto";
                            Scanner mie = new Scanner(System.in);
                            System.out.println("Cuantos miembros desea agregar");
                            n = mie.nextInt();
                            String aux = "";
                            String txts = "";
                            for (int i = 0; i < n; i++) {
                                String token = tokens[i];
                                System.out.println("vermij: " + token);
                                opc vali = new opc();
                                System.out.println("Ingrese el id del miembro a agregar");
                                Scanner aid = new Scanner(System.in);
                                Scanner pro = new Scanner(System.in);
                                int cedl = aid.nextInt();
                                informacion = vali.consulta(1, cedl);
                                String verifik = vali.consulta(2, cedl);
                                //----------------------
                                if (verifik == null) {
                                    if (informacion != null) {
                                        //double bono = 0;
                                        String jes = "";
                                        String jass = "";
                                        String[] tokenss = informacion.split(";");
                                        String ids = (tokenss[0]);
                                        String noms = (tokenss[1]);
                                        String sals = (tokenss[2]);
                                        String lengs = (tokenss[3]);
                                        txts = ids + ";" + noms + ";" + lengs;
                                        JOptionPane.showMessageDialog(null, txts);
                                    }
                                }
                            }
                            aux += "<>" + txts;
                            aux2 = aux;
                            System.out.println("ss " + aux2);
                            JOptionPane.showMessageDialog(null, "Se a ingresado con exito los miembros");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se a realizado ningun cambio");
                        }
                        double SueldoTm = Double.parseDouble(tokens[2]) * 0.10;
                        double Sueldot = SueldoTm * n;
                        double sueldoff = Sueldot + Double.parseDouble(tokens[2]);
                        txt += je + ";" + sueldoff + ";" + aux2;
                        co.insertar(3, txt);
                        break;
                    }
                }
        }
    }
}
