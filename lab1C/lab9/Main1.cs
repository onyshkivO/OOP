using lab1C.lab8;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab9
{
    class Main1
    {
        static void Main(string[] args)
        {
            demonstrateTask1();
            demonstrateTask2();

        }
        public static void demonstrateTask1()
        {
            Ball ball = new Ball(5);
            Figure<Ball> ballFigure = new Figure<Ball>(ball);
            Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
            Figure<Parallelepiped> parallelepipedFigure = new Figure<Parallelepiped>(parallelepiped);
            Console.WriteLine("parallelepiped area: " + parallelepipedFigure.findArea());
            Console.WriteLine("parallelepiped volume: " + parallelepipedFigure.findVolume());
            Console.WriteLine("ball area: " + ballFigure.findArea());
            Console.WriteLine("ball volume: " + ballFigure.findVolume());
        }
        public static void demonstrateTask2()
        {
            Ball ball = new Ball(5);
            Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
            ClassForInterface2 classForInterface2 = new ClassForInterface2();
            Console.WriteLine(classForInterface2.calculateAndGetType(ball, parallelepiped));
        }
    }
}
