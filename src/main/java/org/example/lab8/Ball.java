package org.example.lab8;


public class Ball extends Body implements BodyInterface{
    private double r;

    public Ball(double r)
    {
        this.r = r;
    }
    public Ball(Ball ball)
    {
        this.r = ball.r;
    }

    public double FindAreaInteface()
    {
        return Double.parseDouble(String.format("%.2f", 4 * Math.PI * Math.pow(r, 2)));
    }

    public double FindVolumeInterface()
    {
        return Double.parseDouble(String.format("%.2f", 4 / 3 * Math.PI * Math.pow(r, 3)));
    }

    @Override
    public double FindArea()
    {
        return Double.parseDouble(String.format("%.2f", 4 * Math.PI * Math.pow(r, 2)));
    }
    @Override
    public double FindVolume()
    {
        return Double.parseDouble(String.format("%.2f", 4 / 3 * Math.PI * Math.pow(r, 3)));
    }

    @Override
    public String toString() {
        return "Ball{" +
                "r=" + r +
                '}';
    }
}
