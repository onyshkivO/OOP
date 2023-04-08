package org.example.lab6;

public class Triad {
    private double a;
    private double b;
    private double c;

    public Triad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triad(Triad t) {
        this.a=t.a;
        this.b=t.b;
        this.c=t.c;
    }

    public double sum(){
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triad{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
