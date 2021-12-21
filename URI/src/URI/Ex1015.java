package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1015 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        double[] p1 = {0, 0};
        double[] p2 = {0, 0};

        String entrada = s.nextLine();
        String[] entradaFormatada = entrada.split(" ");

        p1[0] = Double.parseDouble(entradaFormatada[0]);
        p1[1] = Double.parseDouble(entradaFormatada[1]);

        entrada = s.nextLine();
        entradaFormatada = entrada.split(" ");

        p2[0] = Double.parseDouble(entradaFormatada[0]);
        p2[1] = Double.parseDouble(entradaFormatada[1]);

        double distancia = Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]));

        System.out.println(String.format("%.4f", distancia));
    }

}
