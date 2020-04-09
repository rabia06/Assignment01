/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minahilbse173075
 */
public class volume_test {
    
    public volume_test() {
    }
    
    @Test
    public void vol_1test() {
        
        double radius=6;
        double height=4;
        
        assertNotNull(radius);
        assertNotNull(height);
        
        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=452.5714;
        assertEquals(execpted_result,result);
    }
    
    @Test
    public void vol_2test() {
        
        double radius=2;
        double height=4;
        
        assertNotNull(radius);
        assertNotNull(height);
        
        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=50.285714;
        assertNotEquals(execpted_result,result);
    }
    
    @Test
    public void vol_3test() {
        
        double radius=5;
        double height=5;
        
        assertSame(radius,height);
        
        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=392.8571;
        assertEquals(execpted_result,result);
    }
    
    @Test
    public void vol_4test() {
        
        double radius=10;
        double height=7;
        
        assertNotSame(radius,height);

        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=2200.0;
        assertEquals(execpted_result,result);
    }
    
    @Test
    public void vol_5test() {
        
        double radius=10;
        double height=7;
        
        assertNotSame(radius,height);

        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=2200.0;
        assertEquals(execpted_result,result);
    }
    
    @Test
    public void vol_6test() {
        
        double radius=8;
        double height=30;
        
        assertNotNull(radius);
        assertNotNull(height);
        assertNotSame(radius,height);
        
        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=6034.2857;
        assertEquals(execpted_result,result);
    }
    
    @Test
    public void vol_7test() {
        
        double radius=8;
        double height=30;
        
        assertNotNull(radius);
        assertNotNull(height);
        assertNotSame(radius,height);
        
        double result=Volume_cylinder.volume_c(radius,height);
        double execpted_result=6034.2857;
        assertNotEquals(execpted_result,result);
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("function is about to start");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Volume of cylinder is calculated");
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
