/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mavenproject3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ariel
 */
public class Mavenproject3Test {
    @Test
    public void testAdd() {
        Mavenproject3 calculator = new Mavenproject3();
        double result = calculator.add(5.0, 3.0);
        assertEquals(8.0, result, 0.001); // Assert expected result with a tolerance
    }

    @Test
    public void testSubtract() {
        Mavenproject3 calculator = new Mavenproject3();
        double result = calculator.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testMultiply() {
        Mavenproject3 calculator = new Mavenproject3();
        double result = calculator.multiply(2.0, 5.0);
        assertEquals(10.0, result, 0.001);
    }

    @Test
    public void testDivide_Valid() {
        Mavenproject3 calculator = new Mavenproject3();
        double result = calculator.divide(12.0, 3.0);
        assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testDivide_ByZero() {
        Mavenproject3 calculator = new Mavenproject3();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0, 0.0));
    }
}
