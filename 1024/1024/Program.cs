using System;
using System.Text;

namespace _1024
{
    class Program
    {
        static void Main(string[] args)
        {
            int quantidadeDeLinhas = int.Parse(Console.ReadLine());
            int j = 0;
            String[] entradas = new String[quantidadeDeLinhas];
            String[] entradasCriptografadas = new String[quantidadeDeLinhas];

            for (j = 0; j < quantidadeDeLinhas; j++)
            {
                entradas[j] = Console.ReadLine();
                entradasCriptografadas[j] = entradas[j];
            }

            for (j = 0; j < entradas.Length; j++)
            {
                Criptografar(entradas[j], ref entradasCriptografadas[j]);
                Console.WriteLine(entradasCriptografadas[j]);
            }
        }

        static void Criptografar(String frase, ref String fraseCriptografada)
        {
            Byte[] bytes = Encoding.ASCII.GetBytes(frase);

            for (int l = 0; l < bytes.Length; l++)
            {
                if ((bytes[l] <= 122 && bytes[l] >= 97) || (bytes[l] <= 90 && bytes[l] >= 65))
                {
                    bytes[l] += 3;
                }
            }

            Array.Reverse(bytes);

            for (int l = (bytes.Length / 2); l < bytes.Length; l++)
            {
                bytes[l] -= 1;
            }

            fraseCriptografada = Encoding.ASCII.GetString(bytes);

        }
    }
}
