import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    static double calTotal(int codigo, int quantidade){
        double valor;
        
        switch (codigo) {
            case 1:
                valor = 4.0 * quantidade;
                break;
            case 2:
                valor = 4.5 * quantidade;
                break;
            case 3:
                valor = 5.0 * quantidade;
                break;
            case 4:
                valor = 2.0 * quantidade;
                break;
            default:
                valor = 1.5 * quantidade;
        }
        
        return valor;
    }
 
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        int codigo = teclado.nextInt();
        int quantidade = teclado.nextInt();
        
        System.out.printf("Total: R$ %.2f\n", calTotal(codigo, quantidade));
 
    }
 
}