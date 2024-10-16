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
public class TestVehiculos {
    public static void main(String[] args) {
        
        Auto auto1 = new Auto("aa11","Subaru","negro",500,(byte)5);
        Moto moto1 = new Moto("bb22","Kawasaki","rojo",800,true);
        Bicicleta bici1 = new Bicicleta("cc22","Bianchi","blanco",40,true);
        
        Vehiculo vehiculos[] =new Vehiculo[3];
        
        vehiculos[0]=auto1;
        vehiculos[1]=moto1;
        vehiculos[2]=bici1;
        
        imprimirConPolimorfismo(vehiculos);                
    }
    
    public static void imprimirConPolimorfismo(Vehiculo vehiculos[]){
    
        for(Vehiculo obj : vehiculos){
           obj.informacion();
        }
    }
    
    
}
