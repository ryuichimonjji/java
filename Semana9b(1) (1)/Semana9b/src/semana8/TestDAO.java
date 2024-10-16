/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;


/**
 *
 * @author Laboratorio
 */
public class TestDAO {
    public static void main(String[] args) {
        
        Perro p =new Perro(100,"cachupin","12-12-2020",'m',true, true);
        Gato g = new Gato(101,"nube","25-10-2022",'f',false, true);
        Loro l = new Loro(102,"lorin","07-02-2023",'m',true, 15.0f);
        
        
        
        
        
         if( MascotaDAO.agregar(p) == true){
            System.out.println("Bien, datos agregados");
        } else{
            System.out.println("Error, datos no agregados");
        }
        
        MascotaDAO.agregar(g);
        MascotaDAO.agregar(l);
               
        
        for(Mascota obj : MascotaDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
        
        System.out.println("-----------------------------------------------");
        
        Mascota mascota = MascotaDAO.buscar(100);
        
        if( mascota != null){
            System.out.println("Bien, idChip encontrado");
            mascota.informacion();
        }else{
            System.out.println("Error, idChip no existe");
        }
        
        System.out.println("-----------------------------------------------");
       
        if(MascotaDAO.eliminar(101)== true){
            System.out.println("Bien, datos eliminados");
        }else{
             System.out.println("Error, idChip no existe.");
        }
        System.out.println("-----------------------------------------------");
        
          Loro lm = new Loro(102,"lorin","07-02-2023",'f',true, 15.0f);
        
        if( MascotaDAO.modificar(lm) == true){
            System.out.println("Bien, datos modificados");
        }else{
            System.out.println("Error, idChip no existe");
        }
        
        for(Mascota obj : MascotaDAO.obtenerDatos()){
            System.out.println(obj.toString());
        }
    }
}
