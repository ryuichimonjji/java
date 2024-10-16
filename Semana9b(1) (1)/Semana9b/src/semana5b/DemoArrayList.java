/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5b;

import java.util.ArrayList;  //para crear listas
import java.util.Collections; //ordenar una lista

/**
 *     ArrayList = Lista de python
 * 
 */
public class DemoArrayList {
    public static void main(String[] args) {
   
        ArrayList<String> nombres = new ArrayList();
        
        nombres.add("Susana");  //add para agregar es como el append
        nombres.add("Juan");
        nombres.add("Andrea");
        nombres.add("Sandra");
        
        System.out.println(nombres);
        
        nombres.remove("Juan");
        System.out.println(nombres);
       
        // size()  es igual al len de python
        System.out.println("me quedan "+nombres.size()+" nombres");
        
        
        nombres.set(0, "Sandra");
        nombres.set(2,"Carlos");
        System.out.println(nombres);
              
        
        Collections.sort(nombres);
        System.out.println(nombres);
            
        
        //for each para recorrer la colección
        System.out.println("\nUso de for-each");
        for(String obj : nombres){
            System.out.println(obj);
        }
        
        
    }
}
