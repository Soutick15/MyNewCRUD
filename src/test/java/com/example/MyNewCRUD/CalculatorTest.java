package com.example.MyNewCRUD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void add_Test(){
        Calculator calculator= new Calculator();
        int result= calculator.add(5,10);
        Assertions.assertEquals(15,result);

    }
    @Test
    public void division(){
        System.out.println("Hel Ub");
    }

    @Test
    public void division1(){
        System.out.println("Hel mac");

    }
}
