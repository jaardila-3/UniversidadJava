package ejercicios;

import java.util.Date;

public class Persona_Herencia {

    protected String nombre; // solo se hereda lo publico o protected
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona_Herencia() {
    }

    public Persona_Herencia(String nombre) {
        this.nombre = nombre;
    }

    public Persona_Herencia(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona_Herencia{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
}

//seguimos en el mismo paquete: 
//package ejercicios;

class Empleado extends Persona_Herencia{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        //llamaremos "nombre" de la clase padre para ello utilizamos la palabra
        //"super" que nos permite llamar el constructor de la clase padre
        super(nombre);//llamamos el constructor que tiene el argumento "nombre"
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;// contadorEmpleado es static        
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();// objeto de clase StringBuilder
        //para no concatenar '+' se utiliza 'append' y optimiza memoria
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre=").append(super.nombre);//tambien this.nombre
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }    
    
}



class Cliente extends Persona_Herencia{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, 
            char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);//super() primero: jerarquia
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", nombre=").append(super.nombre);
        sb.append(", genero=").append(super.genero);
        sb.append(", edad=").append(super.edad);
        sb.append(", direccion=").append(super.direccion);
        sb.append('}');
        return sb.toString();
    }
    
    
}

//package test;
//import domain.Empleado;
class TestHerencia{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Natalia", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        System.out.println("");
        
        Cliente cliente1 = new Cliente(new java.util.Date(), true, 
                "Alexander", 'M', 32, "Cl 20D"); // char 'M' no "M"
        System.out.println("cliente1 = " + cliente1);
        
        System.out.println("");
        
    }
}
