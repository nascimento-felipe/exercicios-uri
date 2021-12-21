package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1010 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        String entrada1;
        String entrada2;

        // código da peça, número de peças e valor de cada peça
        String[] informacoes1;
        String[] informacoes2;

        entrada1 = s.nextLine();
        entrada2 = s.nextLine();

        informacoes1 = entrada1.split("\\ ");
        informacoes2 = entrada2.split("\\ ");

        double total = Double.parseDouble(informacoes1[1]) * Double.parseDouble(informacoes1[2]) + Double.parseDouble(informacoes2[1]) * Double.parseDouble(informacoes2[2]);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

    }
}
