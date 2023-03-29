package com.acenturef5.Katas.fizzbuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode

public class FizzBuzz {
    public String execute(int i) {
        //if (i % 3 == 0 && i % 5 == 0){ return "FizzBuzz";}Multiplos de 3 y 5
        if (i % 15 == 0) { return "FizzBuzz";}
        if (i % 3 == 0) { return "Fizz";}
        if (i % 5 == 0) { return "Buzz";}


        return String.valueOf(i);
    }
}








