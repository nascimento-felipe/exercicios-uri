package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1020 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        int diasTotais = s.nextInt();
        int[] idade = new int[3];
        int[] tempo = {365, 30};

        for (int i = 0; i < 2; i++) {
            idade[i] = diasTotais / tempo[i];
            diasTotais %= tempo[i];
        }

        idade[2] = diasTotais;

        System.out.println(String.format("%d ano(s)\n%d mes(es)\n%d dia(s)", idade[0], idade[1], idade[2]));
    }

}
