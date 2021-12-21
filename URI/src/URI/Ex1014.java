package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1014 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        int km = 0;
        double combustivelUsado = 0;

        km = s.nextInt();
        combustivelUsado = s.nextDouble();

        System.out.println(String.format("%.3f km/l", km / combustivelUsado));

    }

}
