package URI;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ex1035 {
    
    public static void MainMethod() {
        
        Scanner s = new Scanner(System.in);
        
        String[] entrada = (s.nextLine()).split(" ");
        
        int a = Integer.parseInt(entrada[0]),
            b = Integer.parseInt(entrada[1]),
            c = Integer.parseInt(entrada[2]),
            d = Integer.parseInt(entrada[3]);
        
        if((a % 2 == 0) && (b > c && d > a) && ((c+d) > (a+b)) && (c >=0 && d >= 0)){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");   
        }
    }
    
}
