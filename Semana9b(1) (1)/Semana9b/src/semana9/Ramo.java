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
public class Ramo {
    private String id;
    private String nombreRamo;
    private ArrayList<Float> notas; //float Float

      
    //Constructor sin parámetros
    public Ramo(){
        notas=new ArrayList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
  

    public String getNombreRamo() {
        return nombreRamo;
    }

    public void setNombreRamo(String nombreRamo) {
        this.nombreRamo = nombreRamo;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return id+", "+nombreRamo + ", notas=" + notas ;
    }
    
    
    
    
    
    
}
