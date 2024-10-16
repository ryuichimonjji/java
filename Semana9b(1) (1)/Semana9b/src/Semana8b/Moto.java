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
public class Moto extends Vehiculo{
    private boolean antenaCortaHilos;

    public Moto(String patente, String marca, 
            String color, int precio,boolean antenaCortaHilos) {
        super(patente, marca, color, precio);
        this.antenaCortaHilos = antenaCortaHilos;
    }

    public boolean isAntenaCortaHilos() {
        return antenaCortaHilos;
    }

    public void setAntenaCortaHilos(boolean antenaCortaHilos) {
        this.antenaCortaHilos = antenaCortaHilos;
    }
    
     @Override
    public String toString() {
        return super.toString()+", " + antenaCortaHilos;
    }
    
    @Override
    public void informacion(){
        System.out.println(getPatente()+", "+getMarca()+ ",  "+ getColor()+ ", "+
                precio+", "+antenaCortaHilos);
    } 
    
    
}
