package de.hk.examples.java8Session;

public interface InterfaceMitDefault {


    // seit Java8 kann eine default Implementierung angegeben werden
    default boolean doSomething(int a) {
        return a==5;
    }

}
