package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1016 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        int distancia = s.nextInt();

        System.out.println(String.format("%d minutos", distancia * 2));
    }

}
