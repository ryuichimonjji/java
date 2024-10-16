/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5b;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio
 */
//DAO  data access object  (métodos de un CRUD)
public class PersonaDAO {
    private static ArrayList<Persona> personas=new ArrayList();


    public static boolean agregar(Persona persona){
        boolean estado=false; //no agregado
        
        if( persona != null){
            personas.add(persona);
            estado=true; //agregado        
        }
        return estado;   
    }    
    
    public static Persona buscar(String rut){
        Persona persona=null; //no existe el rut
        
        for(Persona obj : personas){
           if(obj.getRut().equals(rut)){
              persona=obj; //encontrado
              break;
           }        
        }
        
        return persona;
    }
    
    
    public static boolean eliminar(String rut){
        boolean estado=false; //no eliminado, no existe        
        for(Persona obj : personas){
           if(obj.getRut().equals(rut)){
              personas.remove(obj);
              estado=true; //eliminado
              break;
           }        
        }
        return estado;   
    }   
    
    public static boolean modificar(Persona persona){
        boolean estado=false;  //no modificado
        int pos=0;
        for(Persona obj : personas){
           if(obj.getRut().equals(persona.getRut() )){
              personas.set(pos,persona);
              estado=true; //actualizado
              break;
           }      
           pos++; // pos=pos+1   contador
        }
        return estado;   
    }
    
    public static ArrayList<Persona> obtenerDatos(){
        return personas;
    } 
    
    
    
    
    
}







































/*

 public static Persona buscar(String rut){
        Persona persona=null; //no existe el rut
        
        for(Persona obj : personas){
           if(obj.getRut().equals(rut)){
              persona=obj;
              break;
           }        
        }
        
        return persona;
    }
    
    
    public static boolean eliminar(String rut){
        boolean estado=false; //no eliminado, no existe
        
        for(Persona obj : personas){
           if(obj.getRut().equals(rut)){
              personas.remove(obj);
              estado=true; //eliminado
              break;
           }        
        }
        return estado;   
    }
    




*/