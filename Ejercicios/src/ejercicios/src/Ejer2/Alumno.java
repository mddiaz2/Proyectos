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
public class Alumno extends Persona{
    int idA;

    public Alumno(int idA, int id, String nombre, String email) {
        super(id, nombre, email);
        this.idA = idA;
    }
    
}
