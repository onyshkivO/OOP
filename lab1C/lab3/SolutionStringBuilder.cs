using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab3
{
    class SolutionStringBuilder
    {
        static void Main(string[] args)
        {
            Console.Write("Input first string: ");
            StringBuilder s1 = new StringBuilder(Console.ReadLine());
            Console.Write("Input first string: ");
            StringBuilder s2 = new StringBuilder(Console.ReadLine());
            Console.WriteLine("Concatenation " + s1 + s2);
            Console.WriteLine("s1 == s2 : " + (s1 == s2));
            Console.WriteLine("s1.Equals(s2) : " + s1.Equals(s2));
            //Console.WriteLine("s1.CompareTo(s2) : " + s1.CompareTo(s2));
            countAndReplace(s1);
            Console.WriteLine(s1);
            Console.ReadLine();

        }
        public static void countAndReplace(StringBuilder s)
        {
            int counter = 0;
            int i = 0;
            while (i < s.Length - 1)
            {
                if (s[i] == ' ' && s[i + 1] == 'o')
                {
                    counter++;

                    i++;
                }
                i++;
            }
            s = s.Replace(" o", "*");
            Console.WriteLine(counter);
        }
    }
}
