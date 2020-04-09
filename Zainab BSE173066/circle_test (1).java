/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zainab Jaffar
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Calculation to find area of circle is about to being");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Calculation to find area of circle has been performed");
    }

    /**
     * Test of main method, of class Circle.
     */
    @Test
    public void test1() {
        double pie=3.14;
        double radius=3.14;
        assertSame(radius,pie);
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=30.95914;
        double result=Cricle.area(radius,pie);
        assertEquals(execpted_result,result);
        
    }
     @Test
    public void test2() {
        double pie=3.14;
        double radius=6;
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=113.0399;
        double result=Cricle.area(radius,pie);
        assertEquals(execpted_result,result);
    }
     @Test
    public void test3() {
        double pie=3.14;
        double radius=2;
        assertNotSame(radius,pie);
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=12.56;
        double result=Cricle.area(radius,pie);
        assertEquals(execpted_result,result);
    }
    @Test
    public void test4() {
        double pie=3.14;
        double radius=2;
        assertNotSame(radius,pie);
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=12.56;
        assertNotNull(execpted_result);
        double result=Cricle.area(radius,pie);
        assertEquals(execpted_result,result);
    }
    @Test
    public void test5() {
        double pie=3.14;
        double radius=5;
        assertNotSame(radius,pie);
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=78.5;
        assertNotNull(execpted_result);
        double result=Cricle.area(radius,pie);
        assertNotEquals(execpted_result,result);
    }
    @Test
    public void test6() {
        double pie=3.14;
        double radius=16;
        assertNotNull(radius);
        assertNotNull(pie);
        double execpted_result=803.84;
        assertNotNull(execpted_result);
        double result=Cricle.area(radius,pie);
        assertNotEquals(execpted_result,result);
    }
}

    