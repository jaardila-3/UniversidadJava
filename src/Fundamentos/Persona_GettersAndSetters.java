package ejercicios;

public class Persona_GettersAndSetters {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona_GettersAndSetters(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){//imprime el estado de cada uno de los valores de la clase
        return "Persona [ nombre: " + this.nombre + ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + " ]";
    }

    //codigo generado por el IDE para el metodo toString:
//    @Override
//    public String toString() {
//        return "Persona_GettersAndSetters{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
//    }
    
}


//pakcage test;
//import domain.Persona;
//public class PersonaPrueba{}

class PersonaPrueba{ // esta clase debe ir en otro paquete
    public static void main(String[] args) {
        Persona_GettersAndSetters persona1 = new Persona_GettersAndSetters("Jorge", 500.0, false);
        System.out.println("nombre dado por argumento: " + persona1.getNombre());
        persona1.setNombre("Jeronimo");
        System.out.println("nombre modificado con set: " + persona1.getNombre());
        System.out.println("sueldo: " + persona1.getSueldo());
        System.out.println("esta eliminado? " + persona1.isEliminado());
        System.out.println("\nClase: " + persona1.toString());
        //con print o println podemos omitir el metodo .toString()
        System.out.println("\nClase: " + persona1);
    }
}
