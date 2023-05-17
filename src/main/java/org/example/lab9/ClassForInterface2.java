package org.example.lab9;

import org.example.lab8.Body;

public class ClassForInterface2 implements Interface2{
    @Override
    public <T1 extends Body, T2 extends Body> String calculateAndGetType(T1 t1, T2 t2) {
        return "t1: " + t1.toString() + ", Type t1: " + t1.getClass().getSimpleName() + "\n" +
                "t2: " + t2.toString() + ", Type t2: " + t2.getClass().getSimpleName() +"\n" +
                "t1 area = " + t1.FindArea() + "\n" +
                "t1 volume = " + t1.FindVolume() + "\n" +
                "t2 area = " + t2.FindArea() + "\n" +
                "t2 volume = " + t2.FindVolume() + "\n";
    }
}
