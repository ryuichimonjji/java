/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8b;

/**
 *
 * @author Laboratorio
 */
public abstract class Vehiculo  implements ICalculable{
    private String patente;
    private String marca;
    private String color;
    protected int precio;

    public Vehiculo(String patente, String marca, String color, int precio) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return patente + ", " + marca + ", " + color + ", " + precio;
    }
           
            
}
