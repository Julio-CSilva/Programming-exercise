import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
  
    static float calMedia(float[] array){
        float media = ((array[0]*2)+(array[1]*3)+(array[2]*4)+(array[3]*1))/10;
        
        System.out.printf("Media: %.1f\n", media);
        return media;
    }
    
    static void processModulo(float mediaTotal){
        if(mediaTotal >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (mediaTotal < 5.0){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        float notas[] = new float[4];
        float nota, exame, novaMedia;
        for(int i=0; i<notas.length; i++){
            notas[i] = teclado.nextFloat();
        }
        
        nota = calMedia(notas);
        processModulo(nota);
        
        if(nota >= 5 && nota <= 6.9){
            exame = teclado.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", exame);
            novaMedia = (nota+exame)/2;
                
            if(novaMedia > 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f\n", novaMedia);
        }
    }
}