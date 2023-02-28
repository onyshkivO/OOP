using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Math;


namespace lab1C
{
    class Solution
    {
        public void lab3_1()
        {
            double x;
            double y;
            double A;
            double B;

            Console.Write("x= ");
            x = Convert.ToInt32(Console.ReadLine());


            A = 1 / Math.Abs(x + 2) + 1;

            if (x < 1)
            {
                B = 7 * x * x + x - 8;
            }
            else
                if (x > 4)
            {
                B = Math.Sqrt(1 + Math.Abs(Math.Pow(Math.Cos(x), 3)));
            }
            else
            {
                B = Math.Cos((x + 4) / Math.Sqrt(11)) / Math.Sin((x + 4) / Math.Sqrt(11)) + 3;
            }

            y = A - B;
            Console.WriteLine("y = " + y);
        }
        public void lab4_1()
        {
            int i;
            double P;

            i = 1;
            P = 1;

            while (i <= 15)
            {
                P *= (Sin(i) * Sin(i) + Cos(1 / i) * Cos(1 / i)) / (i * i);
                i++;
            }
            Console.WriteLine("p1= " + P);

            i = 1;
            P = 1;

            do
            {
                P *= (Sin(i) * Sin(i) + Cos(1 / i) * Cos(1 / i)) / (i * i);
                i++;
            } while (i <= 15);

            Console.WriteLine("p2= " + P);

            P = 1;
            i = 1;
            for (; i <= 15; i++)
            {
                P *= (Sin(i) * Sin(i) + Cos(1 / i) * Cos(1 / i)) / (i * i);
            }

            Console.WriteLine("p3= " + P);

            P = 1;
            i = 15;
            for (; i >= 1; i--)
            {
                P *= (Sin(i) * Sin(i) + Cos(1 / i) * Cos(1 / i)) / (i * i);
            }

            Console.WriteLine("p4= " + P);

        }
        public void lab4_2() {

            double x, xp, xk, dx, A, B, y;

            Console.Write("xp= ");
            xp = Convert.ToDouble(Console.ReadLine());


            Console.Write("xk= ");
            xk = Convert.ToDouble(Console.ReadLine());

            Console.Write("dx= ");
            dx = Convert.ToDouble(Console.ReadLine());


            Console.WriteLine("---------------------------");
            Console.WriteLine("|        x |         y |");
            Console.WriteLine("---------------------------");

            x = xp;

            while (x <= xk)
            {
                A = 1 / Abs(x + 2) + 1;

                if (x < 1)
                {
                    B = 7 * x * x + x - 8;
                }
                else
                if (x > 4)
                {
                    B = Sqrt(1 + Abs(Pow(Cos(x), 3)));
                }
                else
                {
                    B = Cos((x + 4) / Sqrt(11)) / Sin((x + 4) / Sqrt(11)) + 3;
                }

                y = A - B;
                Console.WriteLine("| {0,8:f2} |  {1, 8:f2} |  \n", x, y);

                x += dx;
            }

            Console.WriteLine("---------------------------");
        }


    }
}
