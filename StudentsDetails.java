
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham karmokar
 */
public class StudentsDetails extends javax.swing.JFrame {
    ArrayList arr=new ArrayList();
    ArrayList arr1=new ArrayList();
    /**
     * Creates new form StudentsRegistration
     */
    public StudentsDetails() {
        initComponents();
            
        arr.add("");
        arr.add("CS");
          arr.add("IT");
          arr.add("EXTC");
         arr.add("ETRX");   
           arr.add("MECH");
           for(Object ob:arr){
               cmbbranch.addItem(ob);
           }
           
           arr1.add("");
        arr1.add("sem1");
          arr1.add("sem2");
          arr1.add("sem3");
         arr1.add("sem4");   
           arr1.add("sem5");
           arr1.add("sem6");
           arr1.add("sem7");
           arr1.add("sem8");
           
           for(Object ob:arr1){
               cmbsem.addItem(ob);
           }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsurname = new javax.swing.JTextField();
        txtrollno = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        cmbbranch = new javax.swing.JComboBox();
        cmbsem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtmidname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Student's Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Branch:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sem:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Roll No:");

        txtsurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtrollno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnsubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsubmit.setText("submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        cmbbranch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbbranch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbranchItemStateChanged(evt);
            }
        });
        cmbbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbranchActionPerformed(evt);
            }
        });

        cmbsem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbsemItemStateChanged(evt);
            }
        });
        cmbsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsemActionPerformed(evt);
            }
        });

        jLabel3.setText("Surname");

        jLabel7.setText("Name");

        jLabel8.setText("Middle name");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Contacts:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5))
                                        .addGap(3, 3, 3)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbsem, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(txtmidname, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnback)
                                .addGap(131, 131, 131)
                                .addComponent(btnsubmit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel8)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtmidname))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(txtrollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnsubmit))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String name=txtsurname.getText()+" "+txtname.getText()+" "+txtmidname.getText();
        String fname=txtrollno.getText();
        String contact=txtcontact.getText();
        String branch=String.valueOf(cmbbranch.getSelectedItem());
        String sem=String.valueOf(cmbsem.getSelectedItem());
        int rollno=Integer.parseInt(txtrollno.getText());
        System.out.println(branch);
        System.out.println(sem);
         try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/placement","root","Mysql@123");
           
          
            
            PreparedStatement ps=conn.prepareStatement("insert into academicdetails values(?,?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,txtrollno.getText());
            ps.setString(3,branch);
            ps.setString(4,sem);
            ps.setString(5,contact);
            
            int num=ps.executeUpdate();
            if(num>0){
                JOptionPane.showMessageDialog(rootPane, "Registered successfully");
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "not registered");
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        MainMenu mn=new MainMenu();
        mn.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void cmbbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbranchActionPerformed

    private void cmbbranchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbranchItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbranchItemStateChanged

    private void cmbsemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbsemItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsemItemStateChanged

    private void cmbsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsemActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox cmbbranch;
    private javax.swing.JComboBox cmbsem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtmidname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrollno;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration//GEN-END:variables
}
