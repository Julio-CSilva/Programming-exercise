import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    static int[] sort(int[] lista){
        int aux;
        for(int k=0; k<lista.length; k++){
            for(int i=0; i<lista.length-1; i++){
                if(lista[i] > lista[i+1]){
                    aux = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = aux;
                }
            }
        }

        return lista;
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        int Seq[] = new int[3];
        int SeqCop[] = new int[3];
        
        for(int i=0; i<3; i++){
            Seq[i] = teclado.nextInt();
            SeqCop[i] = Seq[i];
        }
        
        for(int valor:sort(SeqCop)){
            System.out.println(valor);
        }
        System.out.println("");

        for(int n:Seq){
            System.out.println(n);
        }
    }
}