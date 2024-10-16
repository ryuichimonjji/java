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
public class TestHerencia {
    public static void main(String[] args) {
        //Regla 1: La clase padre no puede ser instanciada
        
        //Persona p = new Persona("1-1","Susana",(byte) 22);
       // System.out.println(p.toString());
        
        Alumno a =new Alumno("1-1","Susana",'f',"Analista");
        //System.out.println(a.toString());
        //a.informacion();
        
        //crear una instancia para Profesor
        Profesor p =new Profesor("1-1","Susana",'f',"San Bdo");
        //System.out.println(p.toString());
        //p.informacion();
        
        //Crear una instancia para Director
        Director d =new Director("1-1","Susana",'f',"DuocUC");
        //System.out.println(d.toString());
        //d.informacion();
        
        //System.out.println("Promedio="+a.calcularNotaPresentacion(5.6f, 5.8f,6.2f));
        
        
        //System.out.println("Nota final="+a.calcularNotaFinal(4.3f,3.8f));
       
       
        
       
      
        //Arreglo [] (lista) de 3 objetos Persona
        Persona personas[]=new Persona[3]; //crear 3 casilleros 
        personas[0]=a;
        personas[1]=p;
        personas[2]=d;           
        imprimirConPolimorfismo(personas);        
  
    }//fin del main
    
    public static void imprimirConPolimorfismo(Persona[] personas){
        /*
           Un objecto (persona) puede comportarse de diferentes maneras
        */                
        //for clásico   for(int i=1,i<=10, i++)
        //for-each, se ocupa para recorres colecciones (listas)  
        //  tipo    var     lista
        for(Persona obj    : personas){
         
            obj.informacion();   //Polimorfismo            
        } 
        
    }
    
    
    
}//fin de la clase
