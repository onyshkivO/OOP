using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab8
{
    class Parallelepiped : Body, BodyInterface
    {
        private double a;
        private double b;
        private double c;

        public Parallelepiped(double a = 0, double b = 0, double c = 0)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Parallelepiped(Parallelepiped parallelepiped)
        {
            this.a = parallelepiped.a;
            this.b = parallelepiped.b;
            this.c = parallelepiped.c;
        }


        public override double FindArea()
        {
            return Math.Round(2 * (a * b + b * c + a * c), 2);
        }

        public override double FindVolume()
        {
            return Math.Round(a * b * c, 2);
        }

        public double FindAreaInteface()
        {
            return Math.Round(2 * (a * b + b * c + a * c), 2);
        }

        public double FindVolumeInterface()
        {
            return Math.Round(a * b * c, 2);
        }
        public override string ToString()
        {
            return "Parallelepiped{" +
                 "a=" + a +
                 ", b=" + b +
                 ", c=" + c +
                 '}';
        }
    }
}
