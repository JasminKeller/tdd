package ch.hftm.qm.fizzbuzz.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzServiceTest {
    

    @Test
    public void pruefeNormaleZahl(){
        String result;
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        result = fizzBuzzService.getResultOfNumber(2);
        Assertions.assertEquals("2", result, "Normale Zahl als Resultat erwartet.");
    }
}
