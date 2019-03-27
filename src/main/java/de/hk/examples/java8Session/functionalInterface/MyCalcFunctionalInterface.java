package de.hk.examples.java8Session.functionalInterface;

@FunctionalInterface
public interface MyCalcFunctionalInterface {

    MyCalcFunctionalInterface ADD = (a , b) -> a + b ;
    MyCalcFunctionalInterface SUB = (a , b) -> a - b ;
    MyCalcFunctionalInterface MUL = (a , b) -> a * b ;


    int calc(int a, int b);

}
