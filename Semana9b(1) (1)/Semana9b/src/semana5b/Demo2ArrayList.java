/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5b;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Laboratorio
 */
public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> personas=new ArrayList();
            
        Alumno   a=new Alumno("1-1","Susana",'f',"Contador");
        Profesor p=new Profesor("2-2","Daniel",'m',"duocUC");
        Director d=new Director("3-3","Juan",'m',"Sn.Bdo.");
        Alumno   a2=new Alumno("4-4","Andrea",'f',"Contador");
        Profesor p2=new Profesor("5-5","Carlos",'m',"duocUC");
        Director d2=new Director("6-6","Ximena",'f',"Sn.Bdo.");
        
        personas.add(a);
        personas.add(p);
        personas.add(d);
        personas.add(a2);
        personas.add(p2);
        personas.add(d2);
        
        
        System.out.println(personas);
        
        for(Persona obj : personas){
            obj.informacion();            
        }
        
        personas.remove(p);
        System.out.println("Después del remove...");
        for(Persona obj : personas){
            obj.informacion();            
        }
        
        //Collections.sort(personas);//ordenar por nombre
        personas.sort((pp1,pp2)->pp1.getNombre().compareTo(pp2.getNombre()));
        //System.out.println(personas);
        System.out.println("Después del sort:");
        for(Persona obj : personas){
            obj.informacion();
        }
        
        
        
    }
}
