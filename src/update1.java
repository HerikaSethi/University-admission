
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
 * @author Herika
 */
public class update1 extends javax.swing.JFrame {

    /**
     * Creates new form update1
     */
    public update1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        textArea2 = new java.awt.TextArea();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Mother's name");

        jLabel3.setText("Father's name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact number");

        jLabel6.setText("E mail ");

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter ID");

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(44, 44, 44)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        Class.forName("java.sql.DriverManager");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","12345");
        
        String sql = "update application set name =?, mothername =?, fathername =?, address =?, contact =?, email =? where id =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, jTextField2.getText());
            pstmt.setString(2, jTextField3.getText());
            pstmt.setString(3, jTextField4.getText());
            pstmt.setString(4, textArea2.getText());
            pstmt.setString(5, jTextField5.getText());
            pstmt.setString(6, jTextField6.getText());
            pstmt.setString(7,jTextField1.getText());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "record updated successfully");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Record not found");
        }
        
        
        
        
         /*Statement stmt =(Statement)con.createStatement();
         //String course=jComboBox1.getSelectedItem().toString();
         String query="Select * from application where id=?";
         
     
         stmt.executeUpdate(query);
         
           
         //jTextField7.setText("");    
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         textArea1.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         /*jTextArea1.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         
         jComboBox1.setSelectedItem("");*/
    // stmt.setString(6,course);
     // jComboBox1.setSelectedItem("null");*/
      
        
        
        
        

/*// int n = Integer.parseInt(jTextField7.getText());
     try{
     Class.forName("java.sql.DriverManager");
     Connection con = (Connection)
     
     DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","12345");
     Statement stmt = (Statement)con.createStatement();
     //String query = "UPDATE application SET name=?,mothername=?,fathername=?,address=?,contact=?,email=? WHERE id=?";
//("UPDATE application set name ='"+jTextField1.getText()+"',mothername ='"+jTextField2.getText()+"',fathername ='"+jTextField3.getText()+"',address ='"+jTextField4.getText()+"',contact ='"+jTextField5.getText()+"',email ='"+jTextField6.getText()+"where id ="+jTextField7.getText());  
//"UPDATE application " +
                   //"SET name = '?' WHERE id="+n+";
String query="UPDATE application SET name='',mothername='',fathername='',address='',contact='',email='' where id='' ";
     jTextField7.setText("");    
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
     stmt.executeUpdate(query);
         JOptionPane.showMessageDialog(this, "Record Updated");
     //jTextField1.setText("");
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
        }
     
*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
    /* String id;
        id = (String) jTextField1.getSelectedText();
        
        String query = "SELECT name,mothername,fathername,address,contact,email FROM application WHERE id = " + (id) + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","12345");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if(rs.next()) {

                String name = rs.getString("name");
                String mothername = rs.getString("mothername");
                String fathername = rs.getString("fathername");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                String email = rs.getString("email");

                //jTextField1.setText(id);
                jTextField2.setText(name);
                jTextField3.setText(mothername);
                jTextField4.setText(fathername);
                textArea2.setText(address);
                jTextField5.setText(contact);
                jTextField6.setText(email);
               
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());*/
     
       // }
       
        // TODO add your handling code here:
        try{
        Class.forName("java.sql.DriverManager");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","12345");
        
        String sql = "Select name,mothername,fathername,address,contact,email from application where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(jTextField1.getText()));
        
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
        jTextField2.setText(rs.getString("name"));
        jTextField3.setText(rs.getString("mothername"));
        jTextField4.setText(rs.getString("fathername"));
        textArea2.setText(rs.getString("address"));
        jTextField5.setText(rs.getString("contact"));
        jTextField6.setText(rs.getString("email"));
        
        }
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Record not found");
        }
        //conn.close();
         


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(update1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
