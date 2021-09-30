package com.example.devops_demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


public class CalcTest {


    @Test
    public void testAdd(){
        Calc calc =new Calc();
        long result = calc.add(10, 20);

        assertThat(result).isEqualTo(30);
    }



}
