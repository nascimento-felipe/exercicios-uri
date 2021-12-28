package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1042 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] inputFormatada = input.split(" ");
        int[] entrada = new int[3];
        int[] entradaSort = new int[3];

        for (int i = 0; i < 3; i++) {
            entrada[i] = Integer.parseInt(inputFormatada[i]);
            entradaSort[i] = entrada[i];
        }

        int t;

        if (entradaSort[1] < entradaSort[0]) {
            t = entradaSort[1];
            entradaSort[1] = entradaSort[0];
            entradaSort[0] = t;
        }

        if (entradaSort[2] < entradaSort[1]) {
            t = entradaSort[2];
            entradaSort[2] = entradaSort[1];
            entradaSort[1] = t;
        }

        if (entradaSort[1] < entradaSort[0]) {
            t = entradaSort[1];
            entradaSort[1] = entradaSort[0];
            entradaSort[0] = t;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(entradaSort[i]);
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.println(entrada[i]);
        }

    }

}
