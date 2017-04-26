/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

/**
 *
 * @author Cristian Jose
 */
public class Docente extends Persona{
    int idD;

    public Docente(int idD, int cedula, String nombre, String email) {
        super(cedula, nombre, email);
        this.idD = idD;
    }
    
}
