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
//hereda de mascota
public class Loro extends Mascota{
    private float largoAlas;

    public Loro( int idChip, String nombre, String fechaNac, char sexo,
            boolean vacunado, float largoAlas) {
        super(idChip, nombre, fechaNac, sexo, vacunado);
        this.largoAlas = largoAlas;
    }

    public float getLargoAlas() {
        return largoAlas;
    }

    public void setLargoAlas(float largoAlas) {
        this.largoAlas = largoAlas;
    }
    
    
    @Override
    public String toString() {
        return  super.toString()+", "+ largoAlas ;
    }

    @Override
    public void informacion() {
        System.out.println(getIdChip()+", "+getNombre()+", "+getFechaNac()+sexo+
                ", "+isVacunado()+", "+largoAlas);
    }
}
