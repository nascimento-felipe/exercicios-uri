using System;
using System.Text;

namespace _1238
{
    class Program
    {
        static void Main(string[] args)
        {
            int quantidadeEntradas = Int32.Parse(Console.ReadLine());

            string[] entradas = new string[quantidadeEntradas];
            string[] saidas = new string[quantidadeEntradas];

            string[] holder;

            for (int j = 0; j < quantidadeEntradas; j++)
            {
                entradas[j] = Console.ReadLine();
            }

            for (int j = 0; j < quantidadeEntradas; j++)
            {
                int parteMaior = 0;

                holder = entradas[j].Split(' ');

                Console.WriteLine(MisturaFrases(holder[0], holder[1]));
            }

        }

        private static StringBuilder MisturaFrases(string frase1, string frase2)
        {
            StringBuilder fraseMisturada = new StringBuilder();
            int parteMaior = 0;

            if (frase1.Length >= frase2.Length)
            {
                parteMaior = 1;
            }
            else
            {
                parteMaior = 2;
            }

            if (parteMaior == 1)
            {
                for (int j = 0; j < frase1.Length; j++)
                {
                    if (j >= frase2.Length)
                    {
                        fraseMisturada.Append(frase1[j]);
                    }
                    else
                    {
                        fraseMisturada.Append(frase1[j]);
                        fraseMisturada.Append(frase2[j]);
                    }

                }

                return fraseMisturada;
            } else
            {
                for (int j = 0; j < frase2.Length; j++)
                {
                    if (j >= frase1.Length)
                    {
                        fraseMisturada.Append(frase2[j]);
                    }
                    else
                    {
                        fraseMisturada.Append(frase1[j]);
                        fraseMisturada.Append(frase2[j]);
                    }

                }

                return fraseMisturada;
            }

        }
    }
}
