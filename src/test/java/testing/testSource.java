/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import com.mycompany.mavenproject3.Mavenproject3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ariel
 */
public class testSource {
    private final Mavenproject3 calculator = new Mavenproject3();
    
    @Test
    public void testAdd() {
        assertEquals(15.0, calculator.add(10, 5), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, calculator.subtract(10, 5), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(50.0, calculator.multiply(10, 5), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
