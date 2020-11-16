/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wejhati_280;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class PlanDetails extends javax.swing.JFrame {

    /**
     * Creates new form PlanDetails
     * @throws java.io.FileNotFoundException
     */
    public PlanDetails() throws FileNotFoundException, IOException {
    initComponents();
    setLocationRelativeTo(null);
  BufferedReader r=new BufferedReader(new FileReader("Plan.txt"));
 BufferedReader r2=new BufferedReader(new FileReader("Activity.txt"));
 String[] s=r.readLine().split(",");
jLabel1.setText("The destination:  "+s[0]); 
jLabel6.setText("The budget:     "); 
jLabel7.setText("The date of traveling:  "+s[2]);
jLabel8.setText("The planned activities:  "); 
String a;
while((a=r2.readLine())!=null){  
    jTextArea1.append(a);
     jTextArea1.append("\n");
}
 jTextArea1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(369, 655));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel5.setText("Wejhati");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(93, 24, 182, 58);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 80, 380, 12);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wejhati_280/bar_icon.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 30, 85, 40);

        jLabel4.setFont(new java.awt.Font("SF Movie Poster", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Plan details");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 120, 150, 30);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SF Movie Poster", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Exit");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel12)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(6, 509, 159, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SF Movie Poster", 1, 18)); // NOI18N
        jLabel11.setText("Start New Plan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(183, 507, 171, 52);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 170, 310, 16);

        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 310, 16);

        jLabel7.setText("jLabel6");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 210, 300, 16);

        jLabel8.setText("jLabel7");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 230, 320, 16);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 330, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wejhati_280/gradient.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -145, 370, 940);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        menu1 sn =new menu1();
        sn.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

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
            java.util.logging.Logger.getLogger(PlanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PlanDetails().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PlanDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}