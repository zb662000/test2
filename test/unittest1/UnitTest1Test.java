/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zahra
 */
public class UnitTest1Test {
    
    public UnitTest1Test() {
    }
    
   
    @Test
   public void testcheckLogin(){
        Login l = new Login();
        boolean Actual = l.UserName("Ree?ce");
        boolean Expected = true;
        
        assertEquals(Expected, Actual);

    /**
     * Test of testcheckLogin method, of class UnitTest1.
     */
   }
   
    @Test
   public void testLogin(){
        Login l = new Login();
        String Actual = l.Login(90);
        String Expected = "Welcome to the application";
        
        assertEquals(Expected, Actual);

    /**
     * Test of testcheckLogin method, of class UnitTest1.
     */
   }
    
}
