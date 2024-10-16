/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8b;

import java.util.ArrayList;


/**
 *
 * @author Laboratorio
 */
public class VehiculoDAO {
       private static ArrayList<Vehiculo> vehiculos=new ArrayList();

    public static boolean agregar(Vehiculo vehiculo){
        boolean estado=false; //no agregado
        
        if( vehiculo != null){
            vehiculos.add(vehiculo);
            estado=true; //agregado        
        }
        return estado;   
    }   
    public static Vehiculo buscar(String patente){
        Vehiculo vehiculo=null; //no existe el patente
        
        for(Vehiculo obj : vehiculos){
           if(obj.getPatente().equals(patente)){
              vehiculo=obj; //encontrado
              break;
           }        
        }        
        return vehiculo;
    }
    
    
    public static boolean eliminar(String patente){
        boolean estado=false; //no eliminado, no existe        
        for(Vehiculo obj : vehiculos){
           if(obj.getPatente().equals(patente)){
              vehiculos.remove(obj);
              estado=true; //eliminado
              break;
           }        
        }
        return estado;   
    }       
    public static boolean modificar(Vehiculo vehiculo){
        boolean estado=false;  //no modificado
        int pos=0;
        for(Vehiculo obj : vehiculos){
           if(obj.getPatente().equals(vehiculo.getPatente() )){
              vehiculos.set(pos,vehiculo);
              estado=true; //actualizado
              break;
           }      
           pos++; // pos=pos+1   contador
        }
        return estado;   
    }
    
    public static ArrayList<Vehiculo> obtenerDatos(){
        return vehiculos;
    } 
    
    
    public static ArrayList<Vehiculo> obtenerAutos(){
        ArrayList<Vehiculo> reportes =new ArrayList();
        
        for(Vehiculo obj : vehiculos){
           if( obj instanceof Auto ){
              reportes.add(obj);
           }            
        }        
        return reportes;
    }
       
    
    
     public static ArrayList<Vehiculo> obtenerMotos(){
        ArrayList<Vehiculo> reportes =new ArrayList();
        
        for(Vehiculo obj : vehiculos){
           if( obj instanceof Moto ){
              reportes.add(obj);
           }            
        }        
        return reportes;
    }
    
    public static ArrayList<Vehiculo> obtenerBicis(){
        ArrayList<Vehiculo> reportes =new ArrayList();
        
        for(Vehiculo obj : vehiculos){
           if( obj instanceof Bicicleta ){
              reportes.add(obj);
           }            
        }        
        return reportes;
    }
    
    //Crear UN SOLO METODO PARA LOS 3 OBJETOS 
    public static ArrayList<Vehiculo> obtenerObjetos(String vehiculo){
        ArrayList<Vehiculo> reportes =new ArrayList();
        
        for(Vehiculo obj : vehiculos){
           if(vehiculo.equals("auto") && obj instanceof Auto ){
              reportes.add(obj);
           } 
           if(vehiculo.equals("moto") && obj instanceof Moto ){
              reportes.add(obj);
           } 
           if(vehiculo.equals("bici") && obj instanceof Bicicleta ){
              reportes.add(obj);
           } 
        }        
        return reportes;
    }
    
    
    /*
    public static ArrayList<Vehiculo> obtenerObj(Vehiculo vehiculo){
        ArrayList<Vehiculo> reportes =new ArrayList();
        
        for(Vehiculo obj : vehiculos){
           if( obj instanceof vehiculo ){
              reportes.add(obj);
           }            
        }        
        return reportes;
    }
    */
    
}
