using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab6
{

        class Main1
        {
            static void Main()
            {
            Triangle t = new Triangle(3, 4, 5);
            Triangle t2 = new Triangle(t);
            Console.WriteLine(t.area());
            Console.WriteLine(t.getAngleA());
            Console.WriteLine(t.getAngleB());
            Console.WriteLine(t.getAngleC());
        }
        }
    
}
