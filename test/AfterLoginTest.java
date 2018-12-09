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
public class AfterLoginTest {
    
    public AfterLoginTest() {
    }

    /**
     * Test of estimateFare method, of class AfterLogin.
     */
    @Test
    public void testEstimateFare() 
    {
        try 
        {
            Main m=new Main();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(AfterLoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //source not selected
        testLogin();
        AfterLogin a=new AfterLogin();
        AfterLogin.source="..............From.............";
        AfterLogin.destination="Bavdhan";
        a.estimateFare();
        String expected="Please specify source";
        String actual=a.alertText;
        assertEquals(expected,actual);
        
        //destination not selected
        testLogin();
        a=new AfterLogin();
        AfterLogin.source="Bavdhan";
        AfterLogin.destination="..............To.............";
        a.estimateFare();
        expected="Please specify destination";
        actual=a.alertText;
        assertEquals(expected,actual);

        //source and destination selected
        testLogin();
        a=new AfterLogin();
        AfterLogin.source="Bavdhan";
        AfterLogin.destination="Deccan";
        a.estimateFare();
        int expectedFare=78;
        int actualFare=a.fare;
        assertEquals(expectedFare,actualFare);
        
        
    }

   


    public static void testLogin()
    {
        Login l=new Login();
        Login.userName="abc";
        Login.passWord="ABC@mit123";
        l.logIn();
        
    }
}
