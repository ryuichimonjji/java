/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5b;

/**
 *
 * @author Laboratorio
 */
public abstract class Persona implements Icalculable {
    private String rut;
    private String nombre;
    protected char genero;

    public Persona(String rut, String nombre, char genero) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return rut + ", " + nombre + ", " + genero;
    }
    
    public abstract void informacion();
   
    
}
