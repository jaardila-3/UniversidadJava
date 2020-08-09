//Oracle Certified Associate Java: versión disponible de JavaSE 8.
package ejercicios;

//“import java.lang;” libreria por default pero es innecesario importarla.
public class ConceptosCertificacionJava_SE8 {

    /**
     * El metodo ppal. Los modificadores de acceso deben ser publico y estatico.
     * El método no debe retornar ningún valor, es decir, void El nombre del
     * método debe ser main y Debe aceptar un parametro de tipo array de String
     * que puede contener 0 o N parametros y El nombre del parámetro puede ser
     * cualquier identificador permitido según las reglas.
     *
     * @param args
     */
    static public void main(String[] args) { // public static = static public

        // datos de tipo primitivo:
        //Para números enteros el tipo por defecto es int.
        //Para números decimales el tipo por defecto es double. 
        //Por defecto la base utilizada es decimal
        int numeroBinario = 0b101; //=5
        System.out.println("numeroBinario = " + numeroBinario);
        int numeroHexadecimal = 0xE; //=14
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        double numeroDosHexadecimal = 0xE; //=14.0
        System.out.println("numeroDosHexadecimal = " + numeroDosHexadecimal);

        //desde java 7 se pueden utilizar "_", reglas:
        //No pueden estar al principio de un literal
        //No pueden estar al final de un literal
        //No pueden estar justo antes del “.” punto decimal
        //No pueden estar justo después del “.” punto decimal
        int i1 = 1_234;//=1234
        System.out.println("i1 = " + i1);
        double d4 = 1_234.0;//=1234.0
        System.out.println("d4 = " + d4);

        System.out.println("");
        //utilizamos la clase dos
        ClaseDos instanciaDeClaseDos = new ClaseDos();
        instanciaDeClaseDos.comparacionConBoolean(); // = true

        //otra forma de resumir las lineas anteriores:
        //new ClaseDos().comparacionConBoolean();
        new ClaseTres().metodoRetornaInstancia();
        System.out.println("");
    }
}

// Es posible tener mas clases en el mismo archivo aunque solo una de ellas
// puede tener modificador de acceso public y el nombre del archivo debe 
// coincidir con la clase declarada public. es decir, las otras clases 
// no debe tener modificador de acceso y debe tener otro nombre, así:
class ClaseDos {

    public void comparacionConBoolean() {
        int numeroUno = 10;
        int numeroDos = 5;
        int suma = numeroUno + numeroDos;
        boolean comparacion = suma >= 15;// tambien lo puede hacer con parentesis
        System.out.println("comparacion = " + comparacion + "\n");
    }
}

class ClaseTres {

    //El constructor se agrega automaticamente si no se codifica y asi seria:
    public ClaseTres() {
        super(); //apunta al constructor de la clase object (padre de todas las clases)
    }            // el cual reserva espacio en memoria para crear instancias (objetos)

    public void metodoRetornaVacio() {
        System.out.println("metodo que no retorna valor");
        return; // instruccion automatica que es in-necesaria.
    }

    public ClaseCuatro metodoRetornaObjeto() {
        ClaseCuatro instancia = new ClaseCuatro();
        return instancia; // se retorna cualquier valor, incluso un objeto
    }

    //se puede usar este objeto creado en el metodo anterior en una variable
    // o llamando simplemente el objeto.metodo
    public void metodoRetornaInstancia() {
        int variable = metodoRetornaObjeto().metodoRetornaEntero();
        System.out.println("variable = " + variable);
    }

}

class ClaseCuatro {

    public int metodoRetornaEntero() {
        int num1 = 5, num2 = 7;
        int result = num1 + num2;
        return result;
    }
}

/**
 * NOTA: la palabra this siempre apunta al objeto de la clase y se le agrega
 * punto para acceder a sus metodos ej: this apunta a la ClaseTres mientras que
 * this.variable apunta a la variable o metodo de la clase
 */
//Dato extra: tenemos una clase:
// 
//public class MiPrimeraClase{ public static void main(String[] args){
//System.out.println(args[1]); } }
//
//Con estos comandos en terminal compilará e imprimirá "hello"
//
//javac MiPrimeraClase.java 
//java MiPrimeraClase hola hello
//
//El archivo anterior es un bytecode (instrucciones que la JVM sabe ejecutar)
//MiPrimeraClase.class solo que no es necesaria la extension para ejecutarla
