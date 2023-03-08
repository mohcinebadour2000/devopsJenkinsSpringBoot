package com.example.devopsjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatriceTest {

    @Test
    void addition() {
        Calculatrice calculator = new Calculatrice();
        int result = calculator.addition(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    void soustraction() {
        Calculatrice calculator = new Calculatrice();
        int result = calculator.soustraction(6, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    void multiplication() {
        Calculatrice calculator = new Calculatrice();
        int result = calculator.multiplication(3, 3);
        Assertions.assertEquals(9, result);
    }

    @Test
    void division() {
        Calculatrice calculator = new Calculatrice();
        int result = calculator.division(6, 3);
        Assertions.assertEquals(2, result);
    }
}