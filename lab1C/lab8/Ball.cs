using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab8
{
    class Ball : Body, BodyInterface
    {

        private double r;

        public Ball(double r = 0)
        {
            this.r = r;
        }

        public Ball(Ball ball)
        {
            this.r = ball.r;
        }

        public double FindAreaInteface()
        {
            return Math.Round(4 * Math.PI * Math.Pow(r, 2), 2);
        }

        public double FindVolumeInterface()
        {
            return Math.Round(4 / 3 * Math.PI * Math.Pow(r, 3), 2);
        }


        public override double FindArea()
        {
            return Math.Round(4 * Math.PI * Math.Pow(r, 2), 2);
        }

        public override double FindVolume()
        {
            return Math.Round(4 / 3 * Math.PI * Math.Pow(r, 3), 2);
        }
        public override string ToString()
        {
            return "Ball{" +
                "r=" + r +
                '}';
        }


    }
}
