package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1036 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        double[] entrada = new double[3];
        String[] inputInicial = s.nextLine().split(" ");

        for (int i = 0; i < 3; i++) {
            entrada[i] = Double.parseDouble(inputInicial[i]);
        }

        double delta = (entrada[1] * entrada[1]) - (4 * entrada[0] * entrada[2]);

        if (delta <= 0 || entrada[0] == 0) {
            System.out.println("Impossivel calcular");
        } else {

            double r1;
            double r2;

            r1 = ((-1 * entrada[1]) + Math.sqrt(delta)) / (2 * entrada[0]);
            r2 = ((-1 * entrada[1]) - Math.sqrt(delta)) / (2 * entrada[0]);

            System.out.println(String.format("R1 = %.5f\nR2 = %.5f", r1, r2));
        }
    }

}
