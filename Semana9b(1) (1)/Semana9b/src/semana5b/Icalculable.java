/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5b;

/**
 *   En las Intefaces solo se declaran variables finales y 
 *   métodos abstractos.  NO SE PROGRAMA. NO HAY ATRIBUTOS
 *   
 *   variables final=  Se escriben con MAYUSCULAS, cuando estàn compuestas
 *                     por dos o mas palabras se separan con un guiòn bajo.
 * 
 *   final= significa que no puede cambiar su valor
 */
public interface Icalculable {
    public final float PONDERACION_NOTA_PRESENTACION=0.6f;
    public final float PONDERACION_NOTA_EXAMEN=0.4f;
    
    public abstract float calcularNotaPresentacion(float n1, float n2, float n3);
       
    public abstract float calcularNotaFinal(float notaPresentacion, float notaExamen);
}
