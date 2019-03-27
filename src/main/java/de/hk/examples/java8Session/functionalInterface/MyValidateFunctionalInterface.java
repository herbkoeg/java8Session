package de.hk.examples.java8Session.functionalInterface;


@FunctionalInterface
public interface MyValidateFunctionalInterface {

    MyValidateFunctionalInterface IS_NOT_NULL_VALIDATOR = s -> s != null;
    MyValidateFunctionalInterface IS_NOT_EMPTY_VALIDATOR = s -> !s.isEmpty();


    boolean validate(String someString);


    default MyValidateFunctionalInterface and(MyValidateFunctionalInterface myValidateFunctionalInterface) {
        return someString -> validate(someString) && myValidateFunctionalInterface.validate(someString);
    }


}
