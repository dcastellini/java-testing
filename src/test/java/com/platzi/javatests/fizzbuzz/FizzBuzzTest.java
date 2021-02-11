package com.platzi.javatests.fizzbuzz;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    /*
        Si el número es divisible por 3, retorna “Fizz”
        Si el número es divisible por 5, retorna “Buzz”
        Si el número es divisible por 3 y por 5, retorna “FizzBuzz”

     */

    @Test
    public void number_is_divisible_by_3(){
        assertThat(FizzBuzz.fizzBuzz(9), CoreMatchers.is("Fizz"));
    }

    @Test
    public void number_is_divisible_by_5(){
        assertThat(FizzBuzz.fizzBuzz(20), CoreMatchers.is("Buzz"));
    }

    @Test
    public void number_is_divisible_by_5_and_3(){
        assertThat(FizzBuzz.fizzBuzz(15), CoreMatchers.is("FizzBuzz"));
    }

    @Test
    public void number_is_not_divisible_by_5_and_3(){
        assertThat(FizzBuzz.fizzBuzz(17), CoreMatchers.is("Not divisible"));
    }


}