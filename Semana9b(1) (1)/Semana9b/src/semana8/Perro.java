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

//hereda de Mascota
public class Perro extends Mascota{
    private boolean entrenable;

    public Perro(int idChip, String nombre, String fechaNac, char sexo,
            boolean vacunado,boolean entrenable ) {
        super(idChip, nombre, fechaNac, sexo, vacunado);
        this.entrenable = entrenable;
    }

    public boolean isEntrenable() {
        return entrenable;
    }

    public void setEntrenable(boolean entrenable) {
        this.entrenable = entrenable;
    }
    
    
    @Override
    public String toString() {
        return  super.toString()+", "+ entrenable + '}';
    }

    @Override
    public void informacion() {
        System.out.println(getIdChip()+", "+getNombre()+", "+getFechaNac()+sexo+
                ", "+isVacunado()+", "+entrenable);
    }
    
    
}
