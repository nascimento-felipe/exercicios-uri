package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1037 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        double entrada = s.nextDouble();
        String saida = "";

        if (entrada >= 0 && entrada <= 25) {
            saida = "Intervalo [0,25]";
        } else if (entrada > 25 && entrada <= 50) {
            saida = "Intervalo (25,50]";
        } else if (entrada > 75 && entrada <= 100) {
            saida = "Intervalo (75,100]";
        } else {
            saida = "Fora de intervalo";
        }

        System.out.println(saida);
    }

}
