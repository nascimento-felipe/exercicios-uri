package URI;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ex1024 {
    
    public static void MainMethod(){
        Scanner s = new Scanner(System.in);
        
        int quantidadeEntrada = s.nextInt();
        String[] entrada = new String[quantidadeEntrada + 1];
        
        for(int i = 0; i <= quantidadeEntrada; i++){
            entrada[i] = s.nextLine();
        }
        
        String[] novaEntrada = new String[quantidadeEntrada];
        for(int i = 0; i < quantidadeEntrada; i++){
            novaEntrada[i] = entrada[i+1];
        }
        
        
        for(String palavra : novaEntrada){
            char[] novaPalavra = palavra.toCharArray();
            for(int i = 0; i < palavra.length(); i++){
                if((novaPalavra[i] >= 65 && novaPalavra[i] <= 90) || (novaPalavra[i] >= 97 && novaPalavra[i] <= 122)){
                    novaPalavra[i] += 3;   
                }
            }
            
            for(int i = 0; i < palavra.length(); i++){
                if(i < (palavra.length() / 2)){
                    char j = ' ';
                    j = novaPalavra[i];
                    novaPalavra[i] = novaPalavra[(palavra.length() - 1) - i];
                    novaPalavra[(palavra.length() - 1) - i] = j;   
                }
            }
            
            for(int i = (int) Math.floor(palavra.length() / 2); i < palavra.length(); i++){                
                novaPalavra[i] -= 1;
            }
            
            System.out.println(new String(novaPalavra));
        }
    }
    
}
