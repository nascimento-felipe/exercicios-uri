using System;

namespace _1028
{
    class Program
    {
        static void Main(string[] args)
        {
            int quantidadeEntradas = Int32.Parse(Console.ReadLine());

            int[] casosDeTesteA = new int[quantidadeEntradas];
            int[] casosDeTesteB = new int[quantidadeEntradas];

            for (int j = 0; j < quantidadeEntradas; j++)
            {
                String[] array = Console.ReadLine().Split(' ');
                casosDeTesteA[j] = Int32.Parse(array[0]);
                casosDeTesteB[j] = Int32.Parse(array[1]);
            }

            for (int j = 0; j < quantidadeEntradas; j++)
            {
                Console.WriteLine(AlgoritmoEuclides(casosDeTesteA[j], casosDeTesteB[j]));
            }

        }
        private static int AlgoritmoEuclides(int a, int b)
        {
            while (b != 0)
            {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    }
}
