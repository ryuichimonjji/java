/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio
 */
public class Alumno {
    private String rut;
    private String nombre;
    private ArrayList<Ramo> ramos;

     
    //Constructor sin parámetros
    public Alumno(){
       ramos = new ArrayList();    
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

    public ArrayList<Ramo> getRamos() {
        return ramos;
    }

    public void setRamos(ArrayList<Ramo> ramos) {
        this.ramos = ramos;
    }
    
    public void agregarRamo( Ramo ramo){
        ramos.add(ramo);
    }
        
    public boolean eliminarRamo(String id){
        boolean estado=false;
        for(Ramo obj : ramos){
          if( obj.getId().equals(id) ){
             ramos.remove(obj);
             estado=true;
             break;
          }       
        } 
       return estado;    
    }
    
    
    //eliminar una nota del ramo, por la posición (1,2,3,...)
    //agregar una nueva nota al ramo.

    @Override
    public String toString() {
        return rut + ", " + nombre + ", " + ramos;
    }
    
    public boolean eliminarNota(String idRamo, int posNota){
        boolean estado=false;
        for(Ramo obj : ramos){
          if( obj.getId().equals(idRamo) ){
            obj.getNotas().remove(posNota-1); //validar la posición 
            estado=true;
            break;
          }       
        }        
        return estado;
    }
    
    
    public boolean agregarNota(String idRamo, Float nuevaNota){
        boolean estado=false;
        for(Ramo obj : ramos){
          if( obj.getId().equals(idRamo) ){
            obj.getNotas().add(nuevaNota); 
            estado=true;
            break;
          }       
        }        
        return estado;
    }
    
    
    
    public boolean modificarNota(String idRamo,int posNota,Float nuevaNota){
        boolean estado=false;
        for(Ramo obj : ramos){
          if( obj.getId().equals(idRamo) ){
            obj.getNotas().set(posNota-1,nuevaNota); 
            estado=true;
            break;
          }       
        }        
        return estado;
    }
    
    
}
