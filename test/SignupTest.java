/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ask
 */
public class SignupTest {
    
    public SignupTest() {
    }

    /**
     * Test of entryExists method, of class Signup.
     */
    @Test
    public void testEntryExists() {
    }

    /**
     * Test of main method, of class Signup.
     */
    @Test
    public void testMain() 
    {
        try 
        {
            Main m=new Main();
        } catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(SignupTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Signup s=new Signup();
        //test 1 username already exists
        s.userName="abc";
        s.signUp();
        String expected="Username already exists";
        String actual=s.alertText;
        assertEquals(expected, actual);
        
        //test 2 password and retype password did not match
        s.userName="jarvis";
        s.emailId="jarvis@gmail.com";
        s.password="jarvis123";
        s.confirmPass="jarvis1234";
        s.signUp();
        expected="Password mismatched";
        actual=s.alertText;
        assertEquals(expected, actual);
        
        //successful signup
        s.userName="jarvis";
        s.emailId="jarvis@gmail.com";
        s.password="jarvis123";
        s.confirmPass="jarvis123";
        s.signUp();
        expected="Password mismatched";
        actual=s.alertText;
        assertEquals(expected, actual);
    }
    
}
