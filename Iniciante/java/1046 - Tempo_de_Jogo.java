import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    static void horaTotal(int horaX, int horaY){
        int hTotal;
        
        if(horaX > horaY){
            hTotal = Math.abs(horaX - 24) + horaY;
            System.out.println("O JOGO DUROU "+hTotal+" HORA(S)");
        } else if (horaX == horaY){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            hTotal = horaY - horaX;
            System.out.println("O JOGO DUROU "+hTotal+" HORA(S)");
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();
        
        horaTotal(horaInicial, horaFinal);
    }
 
}