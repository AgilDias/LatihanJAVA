package com.agildias;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;

public class LatihanTest {

    @Test
    public void cekPenjumlahan(){

        int a = 15;
        int b = 20;
        int c = a + b;

        System.out.println("nilai c = " + c);

        Assert.assertEquals(35, c);
    }

    @Test
    public void generateData() {
        Faker faker = new Faker();

        int number = faker.number().numberBetween(1, 999999);
        String fullname = faker.name().fullName();

        System.out.println("number : "+ number);
        System.out.println("fullname : " + fullname);
    }
}
