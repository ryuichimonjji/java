/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8b;

/**
 *
 * @author Laboratorio
 */
public class TestDAO {
    public static void main(String[] args) {
          
        Auto auto1 = new Auto("aa11","Subaru","negro",500,(byte)5);
        Auto auto2 = new Auto("aa22","Chery","celeste",300,(byte)3);
        Moto moto1 = new Moto("bb22","Kawasaki","rojo",800,true);
        Moto moto2 = new Moto("bb33","Yamaha","negro",900,true);
        Bicicleta bici1 = new Bicicleta("cc22","Bianchi","blanco",40,true);
        
        //Agregar
        
        if( VehiculoDAO.agregar(auto1) == true){
            System.out.println("Bien, datos agregados");            
        }else{
            System.out.println("Error, datos no agregados");
        }
        
        VehiculoDAO.agregar(auto2);
        VehiculoDAO.agregar(moto1);
        VehiculoDAO.agregar(moto2);
        VehiculoDAO.agregar(bici1);
        
        //Listar
        
        for(Vehiculo obj : VehiculoDAO.obtenerDatos()){
            obj.informacion();
        }
        
        
        //buscar por patente
        
        Vehiculo vehiculo= VehiculoDAO.buscar("bb22");
        
        if( vehiculo != null){
            System.out.println("Encontrado!");
            System.out.println(vehiculo.toString());            
        }else{
            System.out.println("Error, patente no existe");
        }
        
        //Eliminar
        if( VehiculoDAO.eliminar("bb22") == true){
            System.out.println("Bien, datos eliminados");
        }else{
            System.out.println("Error, patente no existe");
        }
        
        
        //Modificar
        Bicicleta bm = new Bicicleta("cc22","Bianchi","blanco",40,false);
        
        if( VehiculoDAO.modificar(bm) == true){
            System.out.println("bien, datos modificados");
        }else{
            System.out.println("Error, patente no existe");
        }
        
        
         //Listar
        
        for(Vehiculo obj : VehiculoDAO.obtenerDatos()){
            obj.informacion();
        }
        
        
        //Listar solo Autos
        //System.out.println("\nListado de Autos");
        //for(Vehiculo obj : VehiculoDAO.obtenerObjetos("bici")){
        //    obj.informacion();
        //}
        
        //Listar solo Autos
        System.out.println("\nListado de Autos");
        for(Vehiculo obj : VehiculoDAO.obtenerAutos()){
            obj.informacion();
        }
        
            
        //Listar solo Motos
        System.out.println("\nListado de Motos");
        for(Vehiculo obj : VehiculoDAO.obtenerMotos()){
            obj.informacion();
        }
        
        //Listar solo Bicis
        System.out.println("\nListado de Bicis");
        for(Vehiculo obj : VehiculoDAO.obtenerBicis()){
            obj.informacion();
        }
       
    }
}
