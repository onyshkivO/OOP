using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab8
{
    class Program
    {
        static void Main(string[] args)
        {
            Ball ball = new Ball(5);
            Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
            Console.WriteLine("parallelepiped area: " + parallelepiped.FindArea());
            Console.WriteLine("parallelepiped volume(Interface): " + parallelepiped.FindVolumeInterface());
            Console.WriteLine("ball area(Inteface): " + ball.FindAreaInteface());
            Console.WriteLine("ball volume: " + ball.FindVolume());

        }
    }
}
