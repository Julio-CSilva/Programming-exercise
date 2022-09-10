import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
        static void ordena(float[] pontos){
            float aux;
            for(int k=0; k<pontos.length; k++){
                for(int i=0; i<pontos.length-1; i++){
                    if(pontos[i] < pontos[i+1]){
                        aux = pontos[i];
                        pontos[i] = pontos[i+1];
                        pontos[i+1] = aux;
                    }
                }
            }
        }
        
        static void tipoTriangulo(float[] pontos){
            
            if(pontos[0] >= (pontos[1]+pontos[2])){
                System.out.println("NAO FORMA TRIANGULO");
            } else if(Math.pow(pontos[0], 2) == (Math.pow(pontos[1], 2) + Math.pow(pontos[2], 2))){
                System.out.println("TRIANGULO RETANGULO");
            } else if(Math.pow(pontos[0], 2) > (Math.pow(pontos[1], 2) + Math.pow(pontos[2], 2))){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if(Math.pow(pontos[0], 2) < (Math.pow(pontos[1], 2) + Math.pow(pontos[2], 2))){
                System.out.println("TRIANGULO ACUTANGULO");
            } 
            
            if(pontos[0] == pontos[1] && pontos[0] == pontos[2]){
                System.out.println("TRIANGULO EQUILATERO");
            } else if(pontos[0] == pontos[1] ^ pontos[0] == pontos[2] ^ pontos[1] == pontos[2]){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        float pontos[] = new float[3];
        
        for(int i=0; i<3; i++){
            pontos[i] = teclado.nextFloat();
        }
        
        ordena(pontos);
        tipoTriangulo(pontos);
 
    }
 
}