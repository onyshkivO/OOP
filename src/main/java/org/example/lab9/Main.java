package org.example.lab9;

import org.example.lab8.Ball;
import org.example.lab8.Parallelepiped;

public class Main {
    public static void main(String[] args) {
        demonstrateTask2();
    }

    public static void demonstrateTask1(){
        Ball ball = new Ball(5);
        Figure<Ball> ballFigure = new Figure<>(ball);
        Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
        Figure<Parallelepiped> parallelepipedFigure = new Figure<>(parallelepiped);
        System.out.println("parallelepiped area: " + parallelepipedFigure.findArea());
        System.out.println("parallelepiped volume: " + parallelepipedFigure.findVolume());
        System.out.println("ball area: " + ballFigure.findArea());
        System.out.println("ball volume: " + ballFigure.findVolume());
    }
    public static void demonstrateTask2(){
        Ball ball = new Ball(5);
        Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
        ClassForInterface2 classForInterface2 = new ClassForInterface2();
        System.out.println(classForInterface2.calculateAndGetType(ball,parallelepiped));
    }


}
