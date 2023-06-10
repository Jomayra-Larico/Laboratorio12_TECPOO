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
 * @author Estudiante
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String valorNumerico = "16ñ";
            int numero = Utilitario.convertir(valorNumerico);
            System.out.println("El nùmero es: " + numero);
        } catch (MiExcepcionNumerica e) {
            System.err.println(e.getMessage());//En java se rportan lo erroes en .err
        } catch (MiExcepcionGenerica e){
            System.err.println(e.getMessage());
        }

    }

}
