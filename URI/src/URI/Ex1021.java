package URI;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ex1021 {
    
    public void MainMethod(){
        Scanner input = new Scanner(System.in);
        double[] ValoresNotas = {100, 50, 20, 10, 5, 2};
        double[] ValoresMoedas = {1, .5, .25, .1, .05, .01};
        int[] notas = {0, 0, 0, 0, 0, 0};
        int[] moedas = {0, 0, 0, 0, 0, 0};
        
        String num;
        num = input.nextLine();
        String[] entrada = num.split("\\.");
        
        int valorInteiro = Integer.parseInt(entrada[0]);
        int valorDecimal = (int) (Integer.parseInt(entrada[1]));
        
        for(int i = 0; i < ValoresNotas.length; i++){
            notas[i] = (int) (valorInteiro / ValoresNotas[i]);
            valorInteiro %= ValoresNotas[i];
        }
        
        for(int i = 0; i < ValoresMoedas.length; i++){
            moedas[i] = (int) (valorDecimal / (ValoresMoedas[i] * 100));
            valorDecimal %= (ValoresMoedas[i] * 100);
        }
        
        
        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++){
            System.out.println(String.format("%d nota(s) de R$ %.2f", notas[i], ValoresNotas[i]));
        }
        
        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){
            System.out.println(String.format("%d moeda(s) de R$ %.2f", moedas[i], ValoresMoedas[i]));
        }
    }
}
