package com.javafeatures.java17.switchcaseinhancement.sealed;/*
 * @author -Suraj Tiwari
 */

sealed public interface Sample permits Driver, Driver1 {
    void drive();
}
