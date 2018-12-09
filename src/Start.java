/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.thehowtotutorial.splashscreen.JSplash;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author amoghk
 */
public class Start extends JFrame
{
    /*Starting point of CAT*/
    public static void main(String args[]) throws ClassNotFoundException, SQLException, UnsupportedLookAndFeelException
    {
        
         try {
            // Set cross-platform Java L&F (also called "Metal")
      UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
       // handle exception
    }
        // handle exception
        // handle exception
        // handle exception
        Start s=new Start();  
        s.setVisible(true);
        s.splashScreen();
        new Main().setVisible(true);
        
        
        
    }
     public void splashScreen()
    {
        try
        {
      
        JSplash splash=new JSplash(Main.class.getResource("Main_bg.jpg"),true,true,false,"ver 2.1",null,Color.BLACK,new Color(38,39,61));
        splash.splashOn();
        //splash.setProgress(20,"init");
        
        Thread.sleep(1000);
         splash.setProgress(20,"Loading....");
        Thread.sleep(1000);
         splash.setProgress(40,"Loading...");
        Thread.sleep(1000);
         splash.setProgress(60,"Loading....");
        Thread.sleep(1000);
         splash.setProgress(90,"Loading...");
        Thread.sleep(1000);
        splash.setProgress(100,"All done!");
        Thread.sleep(1000);
        splash.splashOff();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
}