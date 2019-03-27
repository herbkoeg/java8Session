package de.hk.examples.java8Session.functionalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {

    default String doSomething2(String herbert) {
        return herbert + " is the champ";
    }

    String doSomething(String s);

}
