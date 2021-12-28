package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1044 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] inputFormatada = input.split(" ");

        int a = Integer.parseInt(inputFormatada[0]);
        int b = Integer.parseInt(inputFormatada[1]);

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }

}
