public class inicio {

    public static String saludo = "Hola mundo desde java";

    public static void main(String[] args) {
        int numero = 25;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);//se puede reasignar
        var num2 = 5;
        System.out.println(num2);//uso de var
        System.out.println("'hello'");//comillas simples dentro de cadena
        System.out.println("\"hola\"");//comillas dobles dentro de cadena
        System.out.println("mi 1nombre: \n" + "jorge");//salto de linea
        System.out.println("mi 2nombre: \t" + "Alexander");//tabulador
    }
}