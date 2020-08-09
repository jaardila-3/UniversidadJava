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
public class EjercicioCinco_Switch {

    public static void main(String[] args) {
        Scanner textByConsole = new Scanner(System.in);

        System.out.println("Proporciona tu nota: ");
        int note = Integer.parseInt(textByConsole.nextLine());

        switch (note) {
            case 0: case 1: case 2:
                System.out.println("No Aprobo");
                break;
            case 3: case 4:
                System.out.println("Aprobo");
                break;
            case 5:
                System.out.println("Excelente Trabajo");
                break;
            default:
                System.out.println("Nota Invalida");
        }
    }
}
