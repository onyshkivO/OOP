package org.example.lab6;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        Triangle t2 = new Triangle(t);
        System.out.println(t.area());
        System.out.println(t.getAngleA());
        System.out.println(t.getAngleB());
        System.out.println(t.getAngleC());
    }
}
