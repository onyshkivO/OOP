package org.example.lab5;

public class Vector2D implements Cloneable, Comparable<Vector2D> {
    private double x;
    private double y;

    public Vector2D() {
    }


    public double incrementPref(){
        x++;
        return x;
    }
    public double decrementPost(){
        double t =x;
        x--;
        return t;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public static Vector2D plus(Vector2D a, Vector2D b) {
        return new Vector2D(a.x + b.x, a.y + b.y);
    }

    public static Vector2D minus(Vector2D a, Vector2D b) {
        return new Vector2D(a.x - b.x, a.y - b.y);
    }

    public static Double product(Vector2D a, Vector2D b) {
        return a.x * b.x + a.y * b.y;
    }
    public  boolean bigger(Vector2D vector) {
        return compareTo(vector)>0;
    }

    public  boolean less(Vector2D vector) {
        return compareTo(vector)<0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector2D vector2D = (Vector2D) o;

        if (Double.compare(vector2D.x, x) != 0) return false;
        return Double.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }



    public Vector2D(Vector2D vector) {
        this.x = vector.x;
        this.y = vector.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Vector2D o) {
        return this.x == o.x ? (int) (this.y - o.y) : (int) (this.x - o.x);
    }
}
