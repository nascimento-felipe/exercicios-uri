package URI;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ex1013 {
    
    public void MainMethod(){
        Scanner s = new Scanner(System.in);
        
        String entrada = s.nextLine();
        String[] nums = entrada.split(" ");
        
        int maior = 0;
        int a = Integer.parseInt(nums[0]), 
            b = Integer.parseInt(nums[1]), 
            c = Integer.parseInt(nums[2]);
        
        maior = RetornaMaior(a, b);
        maior = RetornaMaior(maior, c);
        
        System.out.println(String.format("%d eh o maior", maior));
        
    }
    
    public static int RetornaMaior(int x, int y){
        
        int maior = (x + y + Math.abs(x-y)) / 2;
        
        return maior;
    }
}
