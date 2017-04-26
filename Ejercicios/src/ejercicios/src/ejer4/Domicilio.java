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
public class Domicilio {
    String Nombre="";
    String Calles="";
    String Ciudad="";
    String Estado="";

    public Domicilio(String Nombre, String Calles, String Ciudad, String Estado) {
        this.Nombre = Nombre;
        this.Calles = Calles;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }
    public String toString() {
        String Datos = Nombre+" "+Calles+" "+Ciudad+" "+Estado;
        return Datos;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalles() {
        return Calles;
    }

    public void setCalles(String Calles) {
        this.Calles = Calles;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
