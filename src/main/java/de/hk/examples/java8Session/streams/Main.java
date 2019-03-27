package de.hk.examples.java8Session.streams;

import de.hk.examples.java8Session.model.Person;

import java.util.List;
import java.util.Optional;

import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        final Optional<String> stringOptional = Optional.of("Alex");
        final Optional<Long> longOptional = Optional.of(2L);
        System.out.println(longOptional.get());

        final String herbi = Optional.<String>ofNullable(null).orElse("herbi"+ currentTimeMillis());
        final String herbi2 = Optional.<String>ofNullable(null).orElseGet(() -> "herbi" + currentTimeMillis());

        System.out.println(herbi);
        System.out.println(herbi2);

        System.out.println("======");
        String newName = "herbinew";
        final List<Person> persons = asList(
                null,
                new Person("alex"),
                new Person("herbi"));
        for (Person person : persons) {
            if (person == null){
                person = new Person(newName);
            }else {
                person.setName(newName);
            }
            System.out.println(person.getName());
        }


        persons.forEach(person -> {
            Person herbiPerson = Optional.ofNullable(person) //
                    .filter(p -> p.getName().startsWith("h"))
                    .filter(p -> p.getName().startsWith("x"))
                    // wird nicht für alex aufgerufen
                    .map(p -> p.withName(newName)) //
                    .orElseGet(() -> new Person(newName));
            Optional<Person> personOptional = Optional.ofNullable(person) //
                    .map(p -> p.withName(newName));
            System.out.println(herbiPerson.getName());
            if (personOptional.isPresent()) {
                System.out.println(personOptional.get().getName());
            }
            personOptional.ifPresent(person1 -> System.out.println(person1.getName()));
        });


    }

}
