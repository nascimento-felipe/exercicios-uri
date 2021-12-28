package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1040 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.0");

        String input = s.nextLine();
        String[] inputArray = input.split(" ");
        double[] entrada = new double[4];
        double notaExame, media = 0;

        for (int i = 0; i < 4; i++) {
            entrada[i] = Double.parseDouble(inputArray[i]);
        }

        media = (entrada[0] * 2 + entrada[1] * 3 + entrada[2] * 4 + entrada[3]) / 10;

        System.out.println("Media: " + formatter.format(media));

        if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno em exame.");
            notaExame = s.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", notaExame));
            media = (media + notaExame) / 2;

            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println(String.format("Media final: %.1f", media));
        }

    }

}
