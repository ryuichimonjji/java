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
public class Test {
    public static void main(String[] args) {      
        
        ArrayList<Float> notas = new ArrayList();
        notas.add(5.5f);
        notas.add(3.7f);
        
        ArrayList<Float> notas2 = new ArrayList();
        notas2.add(6.5f);
        notas2.add(4.8f);
        
        Ramo r1 = new Ramo();
        r1.setId("pro100");
        r1.setNombreRamo("Programación");
        r1.setNotas(notas);
        
        Ramo r2 = new Ramo();
        r2.setId("mat100");
        r2.setNombreRamo("Matemáticas");
        r2.setNotas(notas2);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        //float dato primitivo (c), Float es una clase
        
        ArrayList<Ramo> ramos = new ArrayList();
        ramos.add(r1);
        ramos.add(r2);
        
        System.out.println(ramos);
        
        //---------------------------------------
        
        Alumno alumno = new Alumno();
        
        alumno.setRut("1-1");
        alumno.setNombre("Susana");
        alumno.setRamos(ramos);
        
        System.out.println("\n"+alumno.toString());
        
       
    //---------------------------------------------------------

        ArrayList<Float> notas3 = new ArrayList();
        notas3.add(4.5f);
        notas3.add(3.8f);
        
        Ramo r3 = new Ramo();
        r3.setId("bdd100");
        r3.setNombreRamo("Base de datos");
        r3.setNotas(notas3);
        
        
        alumno.agregarRamo(r3);
        
        System.out.println("\n"+alumno.toString());
        
        
    //--------------------------------------------------

        if( alumno.eliminarRamo("mat100") == true){
            System.out.println("Bien, ramo eliminado");            
        }else{
            System.out.println("Error, id no existe");
        }
    //---------------------------------------------------    
        
        alumno.eliminarNota("bdd100", 2);
        
        System.out.println(alumno.getRamos());
    
    //-----------------------------------------------
    
        alumno.agregarNota("bdd100", 6.7f);
        
    //-------------------------------------------

    System.out.println(alumno.getRamos());

    //-----------------------------------------------

    
    
    
    
     alumno.modificarNota("bdd100", 2, 7.0f);
      System.out.println(alumno.getRamos());
     
             

    
        /*
          1   eliminar un ramo
          2   crear un método en Alumno para eliminar una nota del ramo,
               por la posición (1,2,3,...)
          3   crear un métod en Alumno para agregar una nueva nota al ramo.
          4   integrantes para la prueba 3 (pares, grupos de a dos) y tema
              pensar en 3 temas.
          5   crear un método para modificar una nota de un ramo.
        
        */
    }
}
