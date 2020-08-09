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
public class EjercicioTres_Parseo {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String name = consola.nextLine();
        System.out.println("Proporciona el ID: ");
        int ID = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        double price =Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito (true or false): ");
        boolean shipping =Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("**********************************************");
        System.out.println(name + " #" + ID + "\nPrecio: " + price +
                "\nEnvio gratuito: " + shipping);
        System.out.println("**********************************************");

    }
}
