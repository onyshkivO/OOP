using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Math;
namespace lab1C.lab6
{
    class Triangle
    {
        private Triad vertices;

        public Triangle(Triad vertices)
        {
            this.vertices = vertices;
        }

        public Triangle(double a, double b, double c)
        {
            vertices = new Triad(a, b, c);
        }

        public Triangle(Triangle t)
        {
            this.vertices = t.vertices;
        }

        public double area()
        {
            double p = vertices.sum() / 2;
            return Math.Round(Sqrt(p * (p - vertices.getA()) * (p - vertices.getB()) * (p - vertices.getC())) * 180 / Math.PI, 2);
        }
        public double getAngleA()
        {
            return Math.Round(Math.Acos((vertices.getB() * vertices.getB() + vertices.getC() * vertices.getC() - vertices.getA() * vertices.getA())
                    / (2 * vertices.getB() * vertices.getC())) * (180.0 / Math.PI), 2); 
        }

        public double getAngleB()
        {
            return Math.Round(Math.Acos((vertices.getA() * vertices.getA() + vertices.getC() * vertices.getC() - vertices.getB() * vertices.getB())
                    / (2 * vertices.getA() * vertices.getC())) * (180.0 / Math.PI), 2); 
        }

        public double getAngleC()
        {
            return Math.Round(Math.Acos((vertices.getA() * vertices.getA() + vertices.getB() * vertices.getB() - vertices.getC() * vertices.getC())
                    / (2 * vertices.getA() * vertices.getB())) * (180.0 / Math.PI), 2); 
        }

        public String toString()
        {
            return "Triangle{" +
                    "vertices=" + vertices.toString() +
                    '}';
        }
    }
}
