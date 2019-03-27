package de.hk.examples.java8Session.model;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Optional;

public class Person {


    String name;
    String vorname;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    public String getVorname() {
        return vorname;
    }

    //@Ignore
    public Optional<String> getVornameOptional() {
        return Optional.ofNullable(vorname);
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
