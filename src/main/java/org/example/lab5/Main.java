package org.example.lab5;

public class Main {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(1, 2);
        Vector2D b = new Vector2D(4, 2);
        Vector2D c = new Vector2D(b);
        Vector2D sum = Vector2D.plus(a, b);
        System.out.println(sum);
        Vector2D min = Vector2D.minus(a, b);
        System.out.println(min);
        System.out.println(Vector2D.product(a, b));
        System.out.println(a.less(c));
        System.out.println(a);
        System.out.println(a.decrementPost());
        System.out.println(a);


    }
}
