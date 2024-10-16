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
//implementar la inferface ICalculable
public abstract class Mascota implements ICalculable{
    private int idChip;
    private String nombre;
    private String fechaNac;
    protected char sexo;
    private boolean vacunado;   

    public Mascota(int idChip, String nombre, String fechaNac,
                 char sexo, boolean vacunado) {
        this.idChip = idChip;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.vacunado = vacunado;
    }

    public int getIdChip() {
        return idChip;
    }

    public void setIdChip(int idChip) {
        this.idChip = idChip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return idChip + ", " + nombre + ", " + fechaNac + ", " + sexo + 
                       ", " + vacunado;
    }
    
    
}
