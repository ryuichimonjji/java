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
public class Alumno extends Persona {
    private String carrera;
    
    //constructor en contexto de herencia
    public Alumno(String rut, String nombre, char genero,String carrera){
        super(rut, nombre,genero); //esto envia los datos al constructor de la clase padre     
        this.carrera=carrera;    
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }    
    @Override
    public String toString(){
        return super.toString()+", "+carrera;
    }
    
    public void informacion(){
        System.out.println(getRut()+", "+getNombre()+", "+genero+", "+carrera  );
    }
    
     
    
    public float calcularNotaPresentacion(float n1, float n2, float n3){
        float np=0;
        
        np= n1*0.4f + n2*0.3f +n3*0.3f;
        
        return np;    
    }
    
   
    
    
    public float calcularNotaFinal(float notaPresentacion, float notaExamen){
        float nf=0;
        
        nf=notaPresentacion * PONDERACION_NOTA_PRESENTACION + 
                 notaExamen * PONDERACION_NOTA_EXAMEN;
        return nf;   
        
    }
}
