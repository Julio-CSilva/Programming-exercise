import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    static void verifCal(float a, float b, float c){
        float valor;
        
        if(((a+b)>c) && ((a+c)>b) && ((b+c)>a)){
            valor = a+b+c;
            System.out.printf("Perimetro = %.1f\n", valor);
        } else {
            valor = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n", valor);
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        float a = teclado.nextFloat();
        float b = teclado.nextFloat();
        float c = teclado.nextFloat();
        
        verifCal(a,b,c);
    }
 
}