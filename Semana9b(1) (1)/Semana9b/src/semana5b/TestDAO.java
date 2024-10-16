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
public class TestDAO {
    public static void main(String[] args) {
        
        Alumno   a=new Alumno("1-1","Susana",'f',"Contador");
        Profesor p=new Profesor("2-2","Daniel",'m',"duocUC");
        Director d=new Director("3-3","Juan",'m',"Sn.Bdo.");
        Alumno   a2=new Alumno("4-4","Andrea",'f',"Contador");
        Profesor p2=new Profesor("5-5","Carlos",'m',"duocUC");
        Director d2=new Director("6-6","Ximena",'f',"Sn.Bdo.");
        
        if( PersonaDAO.agregar(a) == true){
            System.out.println("Bien, datos agregados");
        } else{
            System.out.println("Error, datos no agregados");
        }
        
        PersonaDAO.agregar(p);
        PersonaDAO.agregar(d);
               
        
        for(Persona obj : PersonaDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        
        System.out.println("-----------------------------------------------");
        
        Persona persona = PersonaDAO.buscar("2-2");
        
        if( persona != null){
            System.out.println("Bien, rut encontrado");
            persona.informacion();
        }else{
            System.out.println("Error, rut no existe");
        }
        
        System.out.println("-----------------------------------------------");
       
        if(PersonaDAO.eliminar("3-3")== true){
            System.out.println("Bien, datos eliminados");
        }else{
             System.out.println("Error, rut no existe.");
        }
        System.out.println("-----------------------------------------------");
        
        Profesor pm=new Profesor("2-2","Daniel",'m',"Inacap");
        
        if( PersonaDAO.modificar(pm) == true){
            System.out.println("Bien, datos modificados");
        }else{
            System.out.println("Error, rut no existe");
        }
        
        for(Persona obj : PersonaDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        
        
        
    }
}




































/*



 
        //-----------------------------------------------
        Persona persona = PersonaDAO.buscar("22-2");
        
        if( persona != null){
            System.out.println("Bien, rut encontrado");
            persona.informacion();
        }else{
            System.out.println("Error, rut no existe");
        }
        
        //-------------------------------------------------
        
        if(PersonaDAO.eliminar("3-3")== true){
            System.out.println("Bien, datos eliminados");
        }else{
             System.out.println("Error, rut no existe.");
        }







*/