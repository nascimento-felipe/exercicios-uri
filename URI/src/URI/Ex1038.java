package URI;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ex1038 {

    public static void MainMethod(){
        Scanner s = new Scanner(System.in);
        
        String[] entrada = s.nextLine().split(" ");
        
        double total = 0, 
              quantidade = Float.parseFloat(entrada[1]);
        
        int codigo = Integer.parseInt(entrada[0]);
        
        switch(codigo){
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4:
                total = quantidade * 2;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                break;
        }
        
        System.out.println(String.format("Total: R$ %.2f", total));
        
    }
    
}
