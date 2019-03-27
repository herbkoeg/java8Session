package de.hk.examples.java8Session.functionalInterface;

import org.junit.Test;

import static de.hk.examples.java8Session.functionalInterface.MyCalcFunctionalInterface.ADD;
import static de.hk.examples.java8Session.functionalInterface.MyCalcFunctionalInterface.SUB;
import static org.junit.Assert.*;

public class MyCalcFunctionalInterfaceTest {
    @Test
    public void shouldAdd(){
        assertEquals(3, ADD.calc(1,2));
        assertEquals(-1, SUB.calc(1,2));
    }

}