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
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() 
    {
        try 
        {
            Main m=new Main();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login l=new Login();
        //test 1 correct username and password
        Login.userName="abc";
        Login.passWord="ABC@mit123";
        l.logIn();
        String expected="Login  successfully";
        String actual=l.alertText;
        assertEquals(expected, actual);
        
        //test 2 wrong username and correct password
        Login.userName="abc1";
        Login.passWord="ABC@mit123";
        l.logIn();
        expected="Login failed!";
        actual=l.alertText;
        assertEquals(expected, actual);
        
        //test 3 blank username and blank password
        Login.userName="";
        Login.passWord="";
        l.logIn();
        expected="Please enter username and password";
        actual=l.alertText;
        assertEquals(expected, actual);
    }
    
}
