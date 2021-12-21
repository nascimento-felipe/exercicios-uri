package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1011 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);
        final double PI = 3.14159;

        double entrada = s.nextDouble();

        double volume = (4.0 / 3) * PI * Math.pow(entrada, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));

    }
}
