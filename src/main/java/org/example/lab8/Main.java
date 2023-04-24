package org.example.lab8;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6);
        System.out.println("parallelepiped area: " + parallelepiped.FindArea());
        System.out.println("parallelepiped volume(Interface): " + parallelepiped.FindVolumeInterface());
        System.out.println("ball area(Inteface): " + ball.FindAreaInteface());
        System.out.println("ball volume: " + ball.FindVolume());
    }
}
