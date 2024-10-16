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
public class Director extends Persona {
    private String lugarDeTrabajo;
    
     public Director(String rut, String nombre, char genero, String lugarDeTrabajo){
         super(rut, nombre, genero);
         this.lugarDeTrabajo=lugarDeTrabajo;    
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }
     
    @Override
    public String toString(){
        return  super.toString()+", "+lugarDeTrabajo;
    }
    
    public void informacion(){
        System.out.println(getRut()+", "+getNombre()+", "+genero+", "+lugarDeTrabajo);
    }
    
    public float calcularNotaPresentacion(float n1, float n2, float n3){
        float np=0;
        
        np= n1*0.4f + n2*0.3f +n3*0.3f;
        
        return np;    
    } 
    
    
    
    
    
     public float calcularNotaFinal(float notaPresentacion, float notaExamen){
        float nf=0;
        
        nf=notaPresentacion * PONDERACION_NOTA_PRESENTACION + notaExamen * PONDERACION_NOTA_EXAMEN;
        return nf;
    }
}