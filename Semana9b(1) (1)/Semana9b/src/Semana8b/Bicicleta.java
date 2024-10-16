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
public class Bicicleta  extends Vehiculo{
    private boolean timbre;
    public Bicicleta(String patente, String marca,
            String color, int precio,boolean timbre) {
        super(patente, marca, color, precio);
        this.timbre = timbre;
    }
    public boolean isTimbre() {
        return timbre;
    }
    public void setTimbre(boolean timbre) {
        this.timbre = timbre;
    }    
    @Override
    public String toString() {
        return super.toString()+", " + timbre;
    }    
    
    @Override
    public void informacion(){
        System.out.println(getPatente()+", "+getMarca()+ ",  "+ getColor()+ ", "+
                precio+", "+timbre);
    } 
    
}
