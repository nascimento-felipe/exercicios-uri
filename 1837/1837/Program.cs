using System;

namespace _1837
{
    class Program
    {
        static void Main(string[] args)
        {
            String entrada = Console.ReadLine();
            String[] entradaFormatada = entrada.Split(' ');

            int a = Int32.Parse(entradaFormatada[0]);
            int b = Int32.Parse(entradaFormatada[1]);
            int resto;
            int quociente;

            resto = a % b;

            if(resto < 0)
            {
                resto += Math.Abs(b);
            }

            quociente = (a - resto) / b;

            Console.WriteLine(quociente + " " + resto);
        }
    }
}
