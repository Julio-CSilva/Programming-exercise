import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    public static void calculoImposto(float renda){
        float imposto = 0;
        
        if(renda <= 2000){
            System.out.println("Isento");
        } else if(renda <= 3000){
            imposto = (renda-2000)*0.08f;
            System.out.printf("R$ %.2f\n", imposto);
        } else if(renda <= 4500){
            imposto = 1000*0.08f;
            imposto += (renda-3000)*0.18f;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            imposto = 1000*0.08f;
            imposto += 1500*0.18f;
            imposto += (renda-4500)*0.28f;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        float renda = teclado.nextFloat();
 
        calculoImposto(renda);
 
        teclado.close();
        
    }
 
}