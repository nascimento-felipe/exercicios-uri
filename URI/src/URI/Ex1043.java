package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1043 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.0");

        String input = s.nextLine();
        String[] inputFormatado = input.split(" ");
        double[] entrada = new double[3];

        for (int i = 0; i < 3; i++) {
            entrada[i] = Double.parseDouble(inputFormatado[i]);
        }

        if ((entrada[0] + entrada[1] > entrada[2])
                && (entrada[1] + entrada[2] > entrada[0])
                && (entrada[0] + entrada[2] > entrada[1])) 
        {

            double perimetro = entrada[0] + entrada[1] + entrada[2];
            System.out.println("Perimetro = " + formatter.format(perimetro));
        } else {
            double area = ((entrada[0] + entrada[1]) * entrada[2]) / 2;
            System.out.println("Area = " + formatter.format(area));
        }

    }

}
