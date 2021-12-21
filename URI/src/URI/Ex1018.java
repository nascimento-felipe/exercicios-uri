package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1018 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);

        int recebidos = s.nextInt();
        int novosRecebidos = recebidos;
        int[] notas = new int[7];
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < 7; i++) {
            notas[i] = novosRecebidos / valoresNotas[i];
            novosRecebidos %= valoresNotas[i];
        }

        System.out.println(recebidos);

        for (int i = 0; i < 7; i++) {
            System.out.println(String.format("%d nota(s) de R$ %d,00", notas[i], valoresNotas[i]));
        }
    }

}
