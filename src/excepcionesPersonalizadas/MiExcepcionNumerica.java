/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Jomayra Larico
 */
public class MiExcepcionNumerica extends Exception{
    
    private final static String mensaje = 
            "Error de conversión numérica, "
            + "ingresa un texto que contenga un número";
    
    public MiExcepcionNumerica() {
        super(mensaje);
    }
    
}
