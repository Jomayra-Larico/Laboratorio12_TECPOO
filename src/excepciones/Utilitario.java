/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionNumerica;
import excepcionesPersonalizadas.MiExcepcionGenerica;

/**
 * 
 * @author Jomayra Larico
 */
public class Utilitario {
    /**
     * Esta función permite convertir un texto en número
     * y controlar los errores que se pueden presentar a
     * partir de ello.
     * @param numeroEnTexto El número a convertir
     * @return  Devuelve un valor de tipo entero int
     */
    public static int convertir(String numeroEnTexto) 
            throws MiExcepcionNumerica, MiExcepcionGenerica{
        try{
            return Integer.parseInt(numeroEnTexto);
        }catch(NumberFormatException s){
            throw new MiExcepcionNumerica();
        }catch (Exception x){
            throw new MiExcepcionGenerica();
        }
    }
    
    
    
}
