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
}
