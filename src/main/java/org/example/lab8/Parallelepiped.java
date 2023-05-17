package org.example.lab8;

public class Parallelepiped extends Body implements BodyInterface {
    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Parallelepiped(Parallelepiped parallelepiped) {
        this.a = parallelepiped.a;
        this.b = parallelepiped.b;
        this.c = parallelepiped.c;
    }

    @Override
    public double FindArea() {
        return Double.parseDouble(String.format("%.2f", 2 * (a * b + b * c + a * c)));
    }

    @Override
    public double FindVolume() {
        return Double.parseDouble(String.format("%.2f", a * b * c));

    }

    public double FindAreaInteface() {
        return Double.parseDouble(String.format("%.2f", 2 * (a * b + b * c + a * c)));
    }

    public double FindVolumeInterface() {
        return Double.parseDouble(String.format("%.2f", a * b * c));
    }
}
