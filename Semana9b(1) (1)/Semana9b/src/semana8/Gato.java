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
public class Gato extends Mascota {
    private boolean independiente;

    public Gato(int idChip, String nombre, String fechaNac, char sexo, boolean vacunado, boolean independiente) {
        super(idChip, nombre, fechaNac, sexo, vacunado);
        this.independiente = independiente;
    }

    

    public boolean isIndependiente() {
        return independiente;
    }

    public void setIndependiente(boolean independiente) {
        this.independiente = independiente;
    }

    @Override
    public String toString() {
        return  super.toString()+", "+ independiente + '}';
    }

    @Override
    public void informacion() {
        System.out.println(getIdChip()+", "+getNombre()+", "+getFechaNac()+sexo+
                ", "+isVacunado()+", "+independiente);
    }
    
    
    
    
    
}
