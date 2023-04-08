package org.example.lab6;

import java.text.DecimalFormat;

import static java.lang.Math.sqrt;

public class Triangle {
    private Triad vertices;

    public Triangle(Triad vertices) {
        this.vertices = vertices;
    }

    public Triangle(double a, double b, double c) {
        vertices = new Triad(a,b,c);
    }

    public Triangle(Triangle t) {
        this.vertices=t.vertices;
    }

    public double area(){
        double p = vertices.sum()/2;
        return Math.round(sqrt(p*(p-vertices.getA())*(p-vertices.getB())*(p-vertices.getC())) * 100.0) / 100.0;
    }
    public double getAngleA() {

        return Math.round(Math.toDegrees(Math.acos((vertices.getB() * vertices.getB() + vertices.getC() * vertices.getC() - vertices.getA() * vertices.getA())
                / (2 * vertices.getB() * vertices.getC()))) * 100.0) / 100.0;
    }

    public double getAngleB() {
        return Math.round(Math.toDegrees(Math.acos((vertices.getA() * vertices.getA() + vertices.getC() * vertices.getC() - vertices.getB() * vertices.getB())
                / (2 * vertices.getA() * vertices.getC()))) * 100.0) / 100.0;
    }

    public double getAngleC() {
        return Math.round(Math.toDegrees(Math.acos((vertices.getA() * vertices.getA() + vertices.getB() * vertices.getB() - vertices.getC() * vertices.getC())
                / (2 * vertices.getA() * vertices.getB()))) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices=" + vertices +
                '}';
    }
}
