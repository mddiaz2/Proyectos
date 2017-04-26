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
public class dAuxiliar extends Docente{
    int horaTutoria;

    public dAuxiliar(int horaTutoria, int idD, int cedula, String nombre, String email) {
        super(idD, cedula, nombre, email);
        this.horaTutoria = horaTutoria;
    }
    
    
}
