package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1045 {

    public static void MainMethod() {
        Scanner s = new Scanner(System.in);

        StringBuilder saida = new StringBuilder();
        String input = s.nextLine();
        String[] inputFormatada = input.split(" ");
        double[] entradas = new double[3];

        for (int i = 0; i < 3; i++) {
            entradas[i] = Double.parseDouble(inputFormatada[i]);
        }

        entradas = SortInvertido(entradas[0], entradas[1], entradas[2]);

        double a = entradas[0];
        double b = entradas[1];
        double c = entradas[2];

        if ((a * a) == (b * b + c * c)) {
            saida.append("TRIANGULO RETANGULO\n");
        }

        if ((a * a) > (b * b + c * c)) {
            saida.append("TRIANGULO OBTUSANGULO\n");
        }

        if ((a * a) < (b * b + c * c)) {
            saida.append("TRIANGULO ACUTANGULO\n");
        }

        if (a == b && a == c) {
            saida.append("TRIANGULO EQUILATERO\n");
        } else if (a == b || a == c || b == c) {
            saida.append("TRIANGULO ISOSCELES\n");
        }
        
        if (a >= (b + c)) {
            saida.delete(0, saida.length());
            saida.append("NAO FORMA TRIANGULO\n");
        }

        System.out.print(saida);
    }

    public static double[] SortInvertido(double a, double b, double c) {
        double t;

        if (b > a) {
            t = b;
            b = a;
            a = t;
        }

        if (c > b) {
            t = c;
            c = b;
            b = t;
        }

        if (b > a) {
            t = b;
            b = a;
            a = t;
        }

        double[] array = {a, b, c};

        return array;
    }

}
