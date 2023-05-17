package org.example.lab9;

import org.example.lab8.Body;

public class Figure<T extends Body> implements Interface<T>  {
    private T figure;
    public Figure(T figure){
        this.figure=figure;
    }

    @Override
    public double findArea() {
        return figure.FindArea();
    }

    @Override
    public double findVolume() {
        return figure.FindVolume();
    }
}
