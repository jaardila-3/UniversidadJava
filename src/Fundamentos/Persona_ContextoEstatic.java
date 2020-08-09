package ejercicios; // package domain;

public class Persona_ContextoEstatic {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas; //static se asocia con la clase

    public Persona_ContextoEstatic(String nombre) {
        this.nombre = nombre;
        //incrementar contador por cada objeto nuevo
        Persona_ContextoEstatic.contadorPersonas++; //esta es buena practica
        // se puede usar tambien:
        //this.contadorPersonas++; // dinamico puede acceder a estatico y no viceversa.
        //contadorPersonas++;
        
        //asigna el nuevo valor a idPersona para que se incremente automaticamente
        this.idPersona = Persona_ContextoEstatic.contadorPersonas;
        //las dos lineas anteriores las podemos resumir en una sola
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona_ContextoEstatic{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}


//pakcage test;
//import domain.Persona;
//public class PersonaPrueba{}
class TestPerson{
    public static void main(String[] args) {
        Persona_ContextoEstatic persona1 = new Persona_ContextoEstatic("Jorge");
        System.out.println("persona1 = " + persona1);
        
        Persona_ContextoEstatic persona2 = new Persona_ContextoEstatic("Jeronimo");
        System.out.println("persona2 = " + persona2);
    }
}