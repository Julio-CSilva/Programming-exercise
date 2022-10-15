import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        float salario, reajuste, novoSalario;
        int percentual;
        
        salario = teclado.nextFloat();
        
        if(salario >= 0 && salario <= 400){
            percentual = 15;
            reajuste = salario*0.15f;
            novoSalario = reajuste + salario;
        } else if (salario > 400 && salario <= 800){
            percentual = 12;
            reajuste = salario*0.12f;
            novoSalario = reajuste + salario;
        } else if (salario > 800 && salario <= 1200){
            percentual = 10;
            reajuste = salario*0.10f;
            novoSalario = reajuste + salario;
        } else if (salario > 1200 && salario <= 2000){
            percentual = 7;
            reajuste = salario*0.07f;
            novoSalario = reajuste + salario;
        } else {
            percentual = 4;
            reajuste = salario*0.04f;
            novoSalario = reajuste + salario;
        }
        
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+percentual+" %");
    }
 
}