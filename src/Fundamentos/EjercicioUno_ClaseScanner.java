/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class EjercicioUno_ClaseScanner {

    public static void main(String[] args) {
        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        String titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = consola.nextLine();
        System.out.println("**********************************************");
        System.out.println(titulo+" fue escrito por: "+autor);
        System.out.println("**********************************************");

    }

}
