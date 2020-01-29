
package studentaccommodationsystem;

import Admin.AdminLogIn;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ghossain
 */
public class LogIn extends javax.swing.JFrame {

    DBConnect dbc = new DBConnect();
    
    public LogIn() {
        initComponents();
        jPanel1.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        login_email = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        login_password = new javax.swing.JPasswordField();
        show_pass_button = new javax.swing.JRadioButton();
        sButton = new javax.swing.JRadioButton();
        hButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        admin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Accommodation");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Sign In to Your Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 0, 24))); // NOI18N
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        login_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        login_email.setForeground(new java.awt.Color(204, 204, 204));
        login_email.setText("E-mail Address");
        login_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_emailFocusLost(evt);
            }
        });
        login_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_emailKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(51, 153, 0));
        loginButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LogIn");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("New User! Please Register");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        login_password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login_password.setForeground(new java.awt.Color(204, 204, 204));
        login_password.setText("Password");
        login_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_passwordFocusLost(evt);
            }
        });
        login_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_passwordKeyPressed(evt);
            }
        });

        show_pass_button.setBackground(new java.awt.Color(255, 255, 255));
        show_pass_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        show_pass_button.setText("Show Password");
        show_pass_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pass_buttonActionPerformed(evt);
            }
        });
        show_pass_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                show_pass_buttonKeyPressed(evt);
            }
        });

        sButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(sButton);
        sButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        sButton.setText("Student");
        sButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sButtonKeyPressed(evt);
            }
        });

        hButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(hButton);
        hButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        hButton.setText("House Owner");
        hButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton2))
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_pass_button)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sButton)
                        .addGap(18, 18, 18)
                        .addComponent(hButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(login_password)
                        .addComponent(login_email, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sButton)
                    .addComponent(hButton))
                .addGap(18, 18, 18)
                .addComponent(login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(show_pass_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(68, 25));

        jMenu1.setText("File");

        jMenuItem1.setText("Register");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jMenu1.add(admin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("Terms & Policy");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("About");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_emailFocusLost
        // TODO add your handling code here:

        if(login_email.getText().equals(""))
        {
            login_email.setText("E-mail Address");
            login_email.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_login_emailFocusLost

    private void login_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_emailFocusGained
        // TODO add your handling code here:

        if(login_email.getText().equals("E-mail Address"))
        {
            login_email.setText("");
            login_email.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_login_emailFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        SignUp sg = new SignUp();
        sg.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void login_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_passwordFocusGained
        // TODO add your handling code here:
        
        if(login_password.getText().trim().equals("Password"))
        {
            login_password.setText("");
            login_password.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_login_passwordFocusGained

    private void login_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_passwordFocusLost
        // TODO add your handling code here:
        
        if(login_password.getText().trim().equals(""))
        {
            login_password.setText("Password");
            login_password.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_login_passwordFocusLost

    private void show_pass_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pass_buttonActionPerformed
        // TODO add your handling code here:
        
        if(show_pass_button.isSelected())
        {
            login_password.setEchoChar((char)0);
        }
        else
        {
            login_password.setEchoChar('*');
        }
        
    }//GEN-LAST:event_show_pass_buttonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        
        String email = login_email.getText();
        String pass = login_password.getText();
        String dpass = null;
        String name = null;
        
        
        if(sButton.isSelected())
        {
            try{
                ResultSet rs = dbc.logInToSAcc(email);
                while(rs.next())
                {
                    dpass = rs.getString("password");
                    name = rs.getString("name");
                }
                
                if(pass.equals(dpass))
                {
                    JOptionPane.showMessageDialog(this, "LogIn Succesfully");
                    StudentMainPage smp = new StudentMainPage(email, name);
                    smp.setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Email or Password Incorrect");
                }
                
            }catch(HeadlessException | SQLException e){
                System.out.println("Error : " + e);
            }
        }
        
        else if(hButton.isSelected())
        {
            try{
                ResultSet rs = dbc.logInToHAcc(email);
                while(rs.next())
                {
                    dpass = rs.getString("password");
                    name = rs.getString("name");
                }
                if(pass.equals(dpass))
                {
                    JOptionPane.showMessageDialog(this, "LogIn Succesfully");
                    this.setVisible(false);
                    OwnerMainPage omp = new OwnerMainPage(email, name);
                    omp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Email or Password Incorrect");
                }
                
            }catch(HeadlessException | SQLException e){
                System.out.println("Error : " + e);
            }
        }
        else if(email == null || pass == null)
        {
            JOptionPane.showMessageDialog(null, "Email or Password is not Entered");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select Student or House Owner");
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        SignUp sg = new SignUp();
        sg.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void login_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_passwordKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
    }//GEN-LAST:event_login_passwordKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        
        AdminLogIn alg = new AdminLogIn();
        alg.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_adminActionPerformed

    private void login_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_emailKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
    }//GEN-LAST:event_login_emailKeyPressed

    private void show_pass_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_show_pass_buttonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
    }//GEN-LAST:event_show_pass_buttonKeyPressed

    private void hButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hButtonKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
    }//GEN-LAST:event_hButtonKeyPressed

    private void sButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sButtonKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginButton.doClick();
        }
    }//GEN-LAST:event_sButtonKeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton hButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField login_email;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JRadioButton sButton;
    private javax.swing.JRadioButton show_pass_button;
    // End of variables declaration//GEN-END:variables
}