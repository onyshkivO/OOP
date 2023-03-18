using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace lab1C.lab3
{
    class SolutionString
    {
        //static void Main(string[] args)
        //{
        //    Console.Write("Input first string: ");
        //    String s1 = Console.ReadLine();
        //    Console.Write("Input first string: ");
        //    String s2 = Console.ReadLine();

        //    Console.WriteLine("Concatenation " + s1 + s2);

        //    Console.WriteLine("s1 == s2 : " + (s1 == s2));
        //    Console.WriteLine("s1.Equals(s2) : " + s1.Equals(s2));
        //    Console.WriteLine("s1.CompareTo(s2) : " + s1.CompareTo(s2));
        //    Console.WriteLine(countAndReplace(s1));
        //    Console.ReadLine();

        //}
        public static String countAndReplace(String s) {
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
            return s;
        }
    }
}
