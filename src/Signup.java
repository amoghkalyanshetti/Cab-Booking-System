
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, cohoose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apr
 */
public class Signup extends javax.swing.JFrame 
{
    
        public String emailId,userName,password,confirmPass,city;
        String m="";
        String alertText;

    /**
     * Creates new form Signup
     */
    public Signup() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo1.png")).getScaledInstance(600,600, WIDTH));
        initComponents();
        nameField.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        emailIdField = new javax.swing.JTextField();
        confirmField = new javax.swing.JPasswordField();
        passwordField1 = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        passNotifyLabel = new javax.swing.JLabel();
        emailNotifyLabel = new javax.swing.JLabel();
        emailMessageLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setBounds(new java.awt.Rectangle(500, 200, 700, 800));
        setPreferredSize(new java.awt.Dimension(650, 300));
        getContentPane().setLayout(null);

        jLabel1.setText("User Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 90, 19);
        getContentPane().add(nameField);
        nameField.setBounds(230, 30, 200, 30);

        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 90, 19);

        jLabel3.setText("Confirm Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 150, 140, 19);

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton);
        submitButton.setBounds(210, 210, 90, 29);

        jLabel5.setText("Email Id :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 70, 90, 20);

        emailIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailIdFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailIdFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailIdFieldKeyTyped(evt);
            }
        });
        getContentPane().add(emailIdField);
        emailIdField.setBounds(230, 70, 200, 30);

        confirmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmFieldActionPerformed(evt);
            }
        });
        getContentPane().add(confirmField);
        confirmField.setBounds(230, 150, 200, 30);

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });
        passwordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordField1KeyTyped(evt);
            }
        });
        getContentPane().add(passwordField1);
        passwordField1.setBounds(230, 110, 200, 30);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(350, 210, 66, 29);
        getContentPane().add(passNotifyLabel);
        passNotifyLabel.setBounds(440, 110, 200, 28);
        getContentPane().add(emailNotifyLabel);
        emailNotifyLabel.setBounds(450, 70, 240, 30);

        emailMessageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg.jpg"))); // NOI18N
        emailMessageLabel.setAutoscrolls(true);
        emailMessageLabel.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(emailMessageLabel);
        emailMessageLabel.setBounds(0, -30, 710, 300);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 70, 230, 20);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 120, 180, 30);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 144, 150, 80);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(530, 200, 49, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean entryExists() 
    {
        String  query="Select * from Customers where username='"+userName+"'";
        System.out.println(query);
            try {
                 Main.st=Main.con.createStatement();
                Main.rs=Main.st.executeQuery(query);
                System.out.println("rs="+Main.rs);
                if(!Main.rs.next())
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            catch(SQLException e)
            {
               
            }
        return true;    
        
    }
    private void insertToTable()
    {
         try 
        {
//            Class.forName("com.mysql.jdbc.Driver");//
//            Main.con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CabSystem","root","password");
     
            Main.st=Main.con.createStatement();
           String query="insert into Customers values('"+userName+"','"+emailId+"','"+password+"','"+city+"')";
           System.out.println(query);

           int i=Main.st.executeUpdate(query);
            System.out.println(i);
            
           
            if(i!=0)
            {
                JOptionPane.showMessageDialog(rootPane,"Signup successfully");
            }
           
            //Main.con.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

//        username=userName
//        emailIdField
userName=nameField.getText();

        signUp();
//        
//            try {
//                userName=nameField.getText();
//                 if(entryExists())
//                    {
//                        JOptionPane.showMessageDialog(rootPane, "Username already exists");
//                        return;
//                    }
//                try {
//                   
//                } catch (Exception ex) {
//                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                emailId=emailIdField.getText();
//                if(confirmField.getText().equals(passwordField1.getText()))
//                {
//                    password=confirmField.getText();
//                    
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(rootPane,"Password mismatched");
//                    return;
//                }
//               // city=cityField.getText();
//                insertToTable();
//                this.setVisible(false);
//                new Main().setVisible(true);
//                // TODO add your handling code here:
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
//            }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        Main m = null;
            try {
                m = new Main();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        m.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void emailIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIdFieldKeyTyped
  
        
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdFieldKeyTyped

    private void passwordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordField1KeyTyped



//    if(isValid(passwordField1.getText()))
//    {
//        passNotifyLabel.setText("Valid password");
//    }// TODO add your handling code here:
//    else
//    {
//         passNotifyLabel.setText("Invalid password");
//    }
    }//GEN-LAST:event_passwordField1KeyTyped

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void emailIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIdFieldKeyPressed
      
    }//GEN-LAST:event_emailIdFieldKeyPressed

    private void emailIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIdFieldKeyReleased
emailNotifyLabel.setText(verifyEmail(emailIdField.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdFieldKeyReleased

    private void passwordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordField1KeyReleased
passNotifyLabel.setText(verifyPassword(passwordField1.getText()));        // TODO add your handling code here:;;
    }//GEN-LAST:event_passwordField1KeyReleased

    private void confirmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmFieldActionPerformed
        userName=nameField.getText();
        emailId=emailIdField.getText();
        password=passwordField1.getText();
        confirmPass=confirmField.getText();
        
        signUp();
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmFieldActionPerformed
    void signUp()
    {
        
            try {
                
                 if(entryExists())
                    {
                        alertText="Username already exists";
                        JOptionPane.showMessageDialog(rootPane,alertText);
                        return;
                    }
                try {
                   
                } catch (Exception ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(password.equals(confirmPass))
                {
                    password=confirmField.getText();
                    
                }
                else
                {
                    
                    alertText="Password mismatched";
                    JOptionPane.showMessageDialog(rootPane,alertText);
                    return;
                }
               // city=cityField.getText();
                insertToTable();
                this.setVisible(false);
                new Main().setVisible(true);
                // TODO add your handling code here:
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private String verifyPassword(String pass)
    {
        boolean flag1=false,flag2=false,flag3=false;
        //condition1 password should contain at length>8
        if(pass.length()<8)
        {
            return "8 or more characters required";
        }
        else
        {
            flag1=true;
        }
        int count=0;
        //condition 2 password should contain at least one upper case letter
        for(int i=0;i<pass.length();i++)
        {
            if(Character.isUpperCase(pass.charAt(i)))
              {
                  flag2=true;
                  break;
              }
              if(i==pass.length()-1)
            {
                return "Uppercase character required";
            }
        }
         //condition 3 password should contain at least one number   
             for(int i=0;i<pass.length();i++)
        {
            if(Character.isDigit(pass.charAt(i)))
              {
                  flag3=true;
                  break;
              }
            if(i==pass.length()-1)
            {
                return "one number required";
            }
        }
             if(flag1&&flag2&&flag3)
             {
                 return "valid password";
             }
             else
             {
                 return "Invalid password";
             }
     }
    String verifyEmail(String mail)
{
     
 
    boolean flag;//if flag is false then mail is faulty else correct
	//1 length of mail should be at least 3 characters
	int len=mail.length();
	
		if(len<3)
		{
			flag=false;
			return "Length should be at least 3";
		}
			
		else
			flag=true; 	
	
	//2 check whether @ character is present
       //3 check whether only one @ character is present
       int count=0;
      
           
       		for(int i=0;i<mail.length();i++)
       		{
                    char ch=mail.charAt(i);
       			if(ch=='@')
       				count++;
       			i++;
       		}
                System.out.println("count="+count);
       		if(count==1)//only one @ is present
       		{
       			flag=true;	
                       
       		}
                else if(!m.equals("@ should be present"))
       		{
       			flag=false;
       			//throw(count);
                        if(count==0)
                        {
                            m="@ should be present";
                            return m;
                        }
                            
                        else
                            return "only one @ character should be present";
       		}
       		
       
       //4 first character should not be .
       	if(mail.charAt(0)=='.')
       	{
       		flag=false;
       		return " first character should not be .";
       		
       	}
       	else
       	{
       		flag=true;
       	}
      
    
        //5 email should not contain .. character
      
       		for(int i=0;i<mail.length()-1;i++)
       		{
       			if(mail.charAt(i)=='.' && mail.charAt(i+1)=='.')
       			{
       				flag=false;
                                return "email should not contain .. character";
                        }
       		
       		}
       		flag=true;
       
      
        //7 email should contain domain name
        System.out.println(mail);
        	if(mail.endsWith(".com"))
        	{
                    System.out.println("yes");
        		flag=true;
        	}	
        	else
        	{
        		flag=false;
                        System.out.println("no");
        		return "domain name not present";
        	}
        	
       	
       	
     
       //6 email should not contain character like \ " , ( ) < > \  / : ; '
       
       		String special="()<>:;,/&?$%*{}[]";//array of special characters
       		
       		char element;
       		for(int i=0;i<mail.length();i++)
       		{
       			element=mail.charAt(i);
       			//cout<<"Element is"<<element<<endl;
       			
       			for(int j=0;j<special.length();j++)
       			{
       				//cout<<"mail[j] is "<<mail[j]<<endl;
       				if(special.charAt(j)==element)//special condition found
       				{
       					flag=false;
       					j++;
       					//throw(element);
                                        return "Special characters are not allowed";
       				}
       				else
       				{
       					j++;
       				}
       			}
       			i++;
       		}
		flag=true;    
                if(flag==true)
                {
                       return "Valid Email id";
                }
                  return "Invalid Email Id";
}
       
       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JTextField emailIdField;
    private javax.swing.JLabel emailMessageLabel;
    private javax.swing.JLabel emailNotifyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel passNotifyLabel;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
