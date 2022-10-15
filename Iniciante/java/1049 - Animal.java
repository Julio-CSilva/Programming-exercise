import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    public static void tipoAnimal(String forma, String tipo, String alimentacao){
        
        if(forma.equals("vertebrado")){
            if(tipo.equals("ave")){
                if(alimentacao.equals("carnivoro")){
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if(alimentacao.equals("onivoro")){
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if(tipo.equals("inseto")){
                if(alimentacao.equals("hematofago")){
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if(alimentacao.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        String forma = teclado.nextLine();
        String tipo = teclado.nextLine();
        String alimentacao = teclado.nextLine();
        
        tipoAnimal(forma, tipo, alimentacao);
        
        teclado.close();
    }
 
}