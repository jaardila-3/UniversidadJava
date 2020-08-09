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
public class EjercicioCuatro_OperadorTernario {

    public static void main(String[] args) {
        Scanner textByConsole = new Scanner(System.in);

        System.out.println("Proporciona el numero 1: ");
        int numberOne = Integer.parseInt(textByConsole.nextLine());
        System.out.println("Proporciona el numero 2: ");
        int numberTwo = Integer.parseInt(textByConsole.nextLine());

        var result = (numberOne > numberTwo) ? numberOne : numberTwo;
        System.out.println("el numero mayor es: = " + result);

        //System.out.println("El numero mayor es:");
        //System.out.println(numberOne > numberTwo ? numberOne : numberTwo);
    }
}
