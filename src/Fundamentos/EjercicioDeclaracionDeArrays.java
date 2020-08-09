
package ejercicios;


public class EjercicioDeclaracionDeArrays {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int [] copy = nums.clone();
        int len = nums.length -1;
        System.out.println(copy[len]);
        
        System.out.println("");
        //otras formas de declarar arrays
        char array[] = {'a','b','c','d','e'};
        int arraynum [][] = { {1,2,3,4}, {5,6,7,8}};
        //para verlos debe ser por un forloop
    }
    
    
}
