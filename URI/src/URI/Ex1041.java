package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1041 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] inputFormatada = input.split(" ");
        double[] coordenadas = new double[2];

        for (int i = 0; i < 2; i++) {
            coordenadas[i] = Double.parseDouble(inputFormatada[i]);
        }

        if (coordenadas[0] == 0 && coordenadas[1] == 0) {
            System.out.println("Origem");
        } else if (coordenadas[0] == 0) {
            System.out.println("Eixo Y");
        } else if (coordenadas[1] == 0) {
            System.out.println("Eixo X");
        } else {
            if (coordenadas[0] >= 0) {
                if (coordenadas[1] >= 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else {
                if (coordenadas[1] >= 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }
        }

    }

}
