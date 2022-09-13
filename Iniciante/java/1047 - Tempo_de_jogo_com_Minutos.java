import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    
    static void horaTotal(int[] horarios){
        int horaResultado, minutoResultado;
        int hori, horf, hora;
        hori = (horarios[0]*60)+horarios[1];
        horf = (horarios[2]*60)+horarios[3];
        
        if(hori > horf){
            
            hora = (1440 - hori) + horf;
            if(hora < 60){
                horaResultado = 0;
            } else {
                horaResultado = (hora-(hora%60))/60;
            }
            
            minutoResultado = hora - (horaResultado*60);
            
        } else if (hori < horf){
            hora = horf - hori;
            
            if(hora < 60){
                horaResultado = 0;
            } else {
                horaResultado = (hora-(hora%60))/60;
            }
            minutoResultado = hora - (horaResultado*60);
            
        } else {
            horaResultado = 24;
            minutoResultado = 0;

        }
        
        
        System.out.println("O JOGO DUROU "+horaResultado+" HORA(S) E "+minutoResultado+" MINUTO(S)");
    }

 
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        int horarios[] = new int[4];
        for(int i=0; i<4; i++){
            horarios[i] = teclado.nextInt();
        }
        
        horaTotal(horarios);
 
    }
 
}