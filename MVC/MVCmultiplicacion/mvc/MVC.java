/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author JORGE.ARDILAR
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo model = new Modelo();
        Vista view = new Vista();
        Controlador control = new Controlador(view, model);
        control.iniciar();
        view.setVisible(true);
    }
    
}
