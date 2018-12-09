
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejashree
 */
public class AfterBooking extends javax.swing.JFrame {

    /**
     * Creates new form AfterBooking
     */
    public AfterBooking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookAnotherCabButton = new javax.swing.JButton();
        cancelCabButton = new javax.swing.JButton();
        sliderLabel = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 200, 400));
        setPreferredSize(new java.awt.Dimension(650, 318));
        getContentPane().setLayout(null);

        bookAnotherCabButton.setText("BOOK ANOTHER CAB");
        bookAnotherCabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAnotherCabButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bookAnotherCabButton);
        bookAnotherCabButton.setBounds(260, 130, 159, 30);

        cancelCabButton.setText("CANCEL CAB");
        cancelCabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCabButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelCabButton);
        cancelCabButton.setBounds(260, 80, 160, 30);

        sliderLabel.setText("Rate us");
        getContentPane().add(sliderLabel);
        sliderLabel.setBounds(110, 220, 100, 18);

        jSlider1.setMaximum(5);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1);
        jSlider1.setBounds(220, 190, 206, 54);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/step0002.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 310);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 30, 72, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelCabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCabButtonActionPerformed

        int action=JOptionPane.showConfirmDialog(rootPane,"Are you sure?", "Select an option",JOptionPane.YES_NO_CANCEL_OPTION);
       if(action==JOptionPane.YES_OPTION)
       {
            try {
                Main.st=Main.con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
            }
                       String query="delete from Booking2 where username='"+Login.userName+"' and source='"+AfterLogin.source+"' and destination='"+AfterLogin.destination+"' and path="+Display.fare+"";
                       System.out.println(query);
           int i=0;
            try {
                i= Main.st.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(AfterBooking.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Cab cancelled !");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Cab not cancelled !");
            }
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_cancelCabButtonActionPerformed

    private void bookAnotherCabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAnotherCabButtonActionPerformed

        this.setVisible(false);
        AfterLogin l=new AfterLogin();
        l.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_bookAnotherCabButtonActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

            
        sliderLabel.setText("Rate us  "+jSlider1.getValue());
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(AfterBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfterBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfterBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfterBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfterBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAnotherCabButton;
    private javax.swing.JButton cancelCabButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel sliderLabel;
    // End of variables declaration//GEN-END:variables
}
