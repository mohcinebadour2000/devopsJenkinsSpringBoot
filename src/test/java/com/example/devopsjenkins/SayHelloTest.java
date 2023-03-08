package com.example.devopsjenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloTest {

    @Test
    void hello() {
        SayHello sayHello = new SayHello();
        String result = sayHello.hello("Mohcine");
        assertEquals("Bonjour monsieur Mohcine", result);
    }
}