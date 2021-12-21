package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1019 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);

        int entradaSegundos = s.nextInt();
        int[] tempo = new int[3];
        int[] valorHorarios = {3600, 60};

        for (int i = 0; i < 2; i++) {
            tempo[i] = entradaSegundos / valorHorarios[i];
            entradaSegundos %= valorHorarios[i];
        }

        tempo[2] = entradaSegundos;

        System.out.println(String.format("%d:%d:%d", tempo[0], tempo[1], tempo[2]));

    }

}
