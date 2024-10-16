/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio
 */
public class MascotaDAO {
    private static ArrayList<Mascota> mascotas=new ArrayList(); //
    //
    public static boolean agregar(Mascota mascota){
        boolean estado=false; //no agregado
        
        if( mascota != null){  //
            mascotas.add(mascota);
            estado=true; //agregado        
        }
        return estado;   
    }      
    public static Mascota buscar(int idChip){
        Mascota mascota=null; //no existe el idChip        
        for(Mascota obj : mascotas){
           if(obj.getIdChip() == idChip){
              mascota=obj; //encontrado
              break;
           }        
        }        
        return mascota;
    }    
    
    public static boolean eliminar(int idChip){
        boolean estado=false; //no eliminado, no existe        
        for(Mascota obj : mascotas){
           if(obj.getIdChip() == idChip ){
              mascotas.remove(obj);
              estado=true; //eliminado
              break;
           }        
        }
        return estado;   
    }       
    public static boolean modificar(Mascota mascota){
        boolean estado=false;  //no modificado
        int pos=0;
        for(Mascota obj : mascotas){
           if(obj.getIdChip() == mascota.getIdChip() ){
              mascotas.set(pos,mascota);
              estado=true; //actualizado
              break;
           }      
           pos++; // pos=pos+1   contador
        }
        return estado;   
    }
    
    public static ArrayList<Mascota> obtenerDatos(){
        return mascotas;
    } 
    
    
    
}
