/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import semana5b.Persona;
import static semana5b.TestHerencia.imprimirConPolimorfismo;

/**
 *
 * @author Laboratorio
 */
public class TestMascotas {
    public static void main(String[] args) {
        
        Perro p =new Perro(100,"cachupin","12-12-2020",'m',true, true);
        Gato g = new Gato(101,"nube","25-10-2022",'f',false, true);
        Loro l = new Loro(102,"lorin","07-02-2023",'m',true, 15.0f);
        
         //Arreglo [] (lista) de 3 objetos Persona
        Mascota mascotas[]=new Mascota[3]; //crear 3 casilleros 
        mascotas[0]=p;
        mascotas[1]=g;
        mascotas[2]=l;           
        imprimirConPolimorfismo(mascotas);   
        
    }
    
    public static void imprimirConPolimorfismo(Mascota[] mascotas){  //
        /*
           Un objecto (persona) puede comportarse de diferentes maneras
        */                
        //for clásico   for(int i=1,i<=10, i++)
        //for-each, se ocupa para recorres colecciones (listas)  
        //  tipo    var     lista
        for(Mascota obj    : mascotas){
            obj.informacion();   //Polimorfismo            
        }    
    }
}
