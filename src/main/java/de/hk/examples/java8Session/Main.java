package de.hk.examples.java8Session;

import de.hk.examples.java8Session.functionalInterface.MyCalcFunctionalInterface;
import de.hk.examples.java8Session.functionalInterface.MyFirstFunctionalInterface;
import de.hk.examples.java8Session.model.Person;

import java.util.function.Function;

import static de.hk.examples.java8Session.functionalInterface.MyCalcFunctionalInterface.*;

public class Main {

    // Prefs -> Editor -> Live Templates
    // HotKey: psvm
    public static void main(String[] args) {

        MyFirstFunctionalInterface mfi = s -> s + " is a Test";
        System.out.println(mfi.doSomething("hallo"));


        System.out.println(ADD.calc(1,2));
        System.out.println(SUB.calc(1,2));
        System.out.println(MUL.calc(1,2));


        // Method Referencing

        final Function<Person,String> myNameGetter = Person::getName;
        final Function<Person,String> myVornameGetter = Person::getVorname;

        // -> alternative Schreibweise
        final Function<Person,String> myNameGetterAsLamda = p -> p.getName();

        Person myperson = new Person();
        myperson.setName("herbert");

        System.out.println(myNameGetter.apply(myperson));
        System.out.println(myNameGetterAsLamda.apply(myperson));


    }







}
