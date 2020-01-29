package com.smoothstack.jan2020.createshapehierarchy;

public interface Greeting {

    default void display() {
        System.out.printf("I am a %s.\n", this.getClass().getSimpleName());
    }
}
