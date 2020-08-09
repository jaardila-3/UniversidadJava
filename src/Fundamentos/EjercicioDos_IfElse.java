/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author alexander
 */
public class EjercicioDos_IfElse {

    public static void main(String[] args) {
        var edad = 30;
        var esAdulto = edad >= 18; // true o false
        
        if (esAdulto) {//si es true
            System.out.println("es mayor de edad");
            
        } else {//si es false

            System.out.println("es menor de edad");
        }
    }
}
