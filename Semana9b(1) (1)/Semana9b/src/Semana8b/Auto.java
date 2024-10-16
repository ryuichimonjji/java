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
public class Auto extends Vehiculo{
    private byte cantidadDePuertas;

    public Auto(String patente, String marca, 
            String color, int precio, byte cantidadDePuertas) {
        super(patente, marca, color, precio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public byte getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(byte cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return super.toString()+", " + cantidadDePuertas;
    }   
    
    @Override
    public void informacion(){
        System.out.println(getPatente()+", "+getMarca()+ ",  "+ getColor()+ ", "+
                precio+", "+cantidadDePuertas);
    } 
    
    
    
}
