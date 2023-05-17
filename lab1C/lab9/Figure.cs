using lab1C.lab8;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab9
{
   class Figure<T> : Interface<T> where T : Body
    {
        private T figure;

        public Figure(T figure)
        {
            this.figure = figure;
        }

        public double findArea()
        {
            return figure.FindArea();
        }

        public double findVolume()
        {
            return figure.FindVolume();
        }
    }
}
