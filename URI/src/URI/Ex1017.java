package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1017 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);

        final int economiaCarro = 12;
        int horas = s.nextInt();
        int velocidadeMedia = s.nextInt();

        System.out.println(String.format("%.3f", (double) (horas * velocidadeMedia) / economiaCarro));
    }

}
