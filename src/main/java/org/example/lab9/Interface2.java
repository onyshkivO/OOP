package org.example.lab9;

import org.example.lab8.Body;

public interface Interface2 {
    <T1 extends Body, T2 extends Body> String calculateAndGetType(T1 t1, T2 t2);
}
