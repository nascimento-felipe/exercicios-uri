package URI;

import java.util.Scanner;

/**
 *
 * @author lama
 */
public class Ex1012 {

    public static void MainMethod() {

        Scanner s = new Scanner(System.in);

        String entrada = s.nextLine();
        String[] entradaSeparada = entrada.split(" ");

        double a = Double.parseDouble(entradaSeparada[0]),
                b = Double.parseDouble(entradaSeparada[1]),
                c = Double.parseDouble(entradaSeparada[2]);

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = Math.pow(c, 2) * 3.14159;
        double areaTrapezio = ((a + b) / 2) * c;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        
        String saida = String.format(
                "TRIANGULO: %.3f\n"
                + "CIRCULO: %.3f\n"
                + "TRAPEZIO: %.3f\n"
                + "QUADRADO: %.3f\n"
                + "RETANGULO: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        System.out.println(saida);

    }

}
