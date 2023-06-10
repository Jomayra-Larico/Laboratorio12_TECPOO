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
public class MiExcepcionGenerica extends Exception{
    private final static String message = 
            "Esta es una excepción gereal y no sabemos la causa";
    public MiExcepcionGenerica() {
        super(message);
    }
    
}
