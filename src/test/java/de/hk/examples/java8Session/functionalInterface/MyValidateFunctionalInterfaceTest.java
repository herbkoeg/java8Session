package de.hk.examples.java8Session.functionalInterface;

import org.junit.Assert;
import org.junit.Test;

import static de.hk.examples.java8Session.functionalInterface.MyValidateFunctionalInterface.IS_NOT_EMPTY_VALIDATOR;
import static de.hk.examples.java8Session.functionalInterface.MyValidateFunctionalInterface.IS_NOT_NULL_VALIDATOR;
import static org.junit.Assert.*;

public class MyValidateFunctionalInterfaceTest {

    @Test
    public void myTest() {
        assertTrue(IS_NOT_NULL_VALIDATOR.and(IS_NOT_EMPTY_VALIDATOR).validate("herbert"));
        assertFalse(IS_NOT_NULL_VALIDATOR.and(IS_NOT_EMPTY_VALIDATOR).validate(""));
        assertFalse(IS_NOT_NULL_VALIDATOR.and(IS_NOT_EMPTY_VALIDATOR).validate(null));
    }

}