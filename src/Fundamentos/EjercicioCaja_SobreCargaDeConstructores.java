/*
 * calcular el volumen de una caja = ancho*alto*profundo
 */
package ejercicios;

/**
 *
 * @author alexander
 */
public class EjercicioCaja_SobreCargaDeConstructores {

    int ancho, alto, profundo;

    //constructor vacio
    public EjercicioCaja_SobreCargaDeConstructores() {
        System.out.println("Constructor vacio");
    }

    //constructor con argumentos
    public EjercicioCaja_SobreCargaDeConstructores(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("constructor con argumentos");
    }

    public int calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        return volumen;
    }
}

class Prueba {

    static public void main(String[] args) {
        EjercicioCaja_SobreCargaDeConstructores instancia = new EjercicioCaja_SobreCargaDeConstructores(3, 2, 6);
        System.out.println("El volumen de la caja es: " + instancia.calcularVolumen());
    }
}
