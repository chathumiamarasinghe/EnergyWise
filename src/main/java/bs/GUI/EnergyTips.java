/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.bs.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class EnergyTips extends javax.swing.JFrame {

    /**
     * Creates new form EnergyTips
     */
    public EnergyTips() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        energyTipLabel = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Unit Of Usage");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("kWh");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setText("TIPS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        energyTipLabel.setBorder(null);
        jScrollPane1.setViewportView(energyTipLabel);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
energyTipLabel.setEditable(false);
        try {
            // Assuming jTextField1 is for entering the number of unit usage
            int unitUsage = Integer.parseInt(jTextField1.getText());

            // Check which category the entered unit usage falls into
            String energyTip;
            energyTipLabel.setEditable(false);

            if (unitUsage < 500) {
    energyTip = "Energy Tip for Low Usage: Turn off lights and appliances when not in use.\n"
            + "Solar Panels: Consider installing solar panels to harness renewable energy and offset a portion of your electricity consumption, reducing monthly bills.\n"
            + "Insulation Upgrade: Enhance insulation in the attic, walls, and basement to maintain comfortable indoor temperatures and reduce heating and cooling costs.\n"
            + "Energy-Efficient Windows: Upgrade to double-pane or energy-efficient windows to minimize heat transfer and improve overall energy efficiency.\n"
            + "Smart Power Management: Invest in smart power strips or outlets that automatically power off electronics when not in use or on a schedule.\n"
            + "Water Heater Timer: Install a timer on your water heater to schedule heating cycles during off-peak hours, saving energy and reducing utility costs.\n"
            + "Landscaping: Plant shade trees around your home to reduce solar heat gain during the summer, lowering the demand for air conditioning.\n"
            + "Energy Monitoring: Use energy monitoring devices to track electricity usage in real-time and identify opportunities for conservation.";
} else if (unitUsage >= 500 && unitUsage < 1000) {
    energyTip = "Energy Tip for Medium Usage: Turn off lights and appliances when not in use.\n"
            + "Solar Panels: Consider installing solar panels to harness renewable energy and offset a portion of your electricity consumption, reducing monthly bills.\n"
            + "Insulation Upgrade: Enhance insulation in the attic, walls, and basement to maintain comfortable indoor temperatures and reduce heating and cooling costs.\n"
            + "Energy-Efficient Windows: Upgrade to double-pane or energy-efficient windows to minimize heat transfer and improve overall energy efficiency.\n"
            + "Smart Power Management: Invest in smart power strips or outlets that automatically power off electronics when not in use or on a schedule.\n"
            + "Water Heater Timer: Install a timer on your water heater to schedule heating cycles during off-peak hours, saving energy and reducing utility costs.\n"
            + "Landscaping: Plant shade trees around your home to reduce solar heat gain during the summer, lowering the demand for air conditioning.\n"
            + "Energy Monitoring: Use energy monitoring devices to track electricity usage in real-time and identify opportunities for conservation.";
} else {
    energyTip = "Energy Tip for High Usage: Turn off lights and appliances when not in use.\n"
            + "Solar Panels: Consider installing solar panels to harness renewable energy and offset a portion of your electricity consumption, reducing monthly bills.\n"
            + "Insulation Upgrade: Enhance insulation in the attic, walls, and basement to maintain comfortable indoor temperatures and reduce heating and cooling costs.\n"
            + "Energy-Efficient Windows: Upgrade to double-pane or energy-efficient windows to minimize heat transfer and improve overall energy efficiency.\n"
            + "Smart Power Management: Invest in smart power strips or outlets that automatically power off electronics when not in use or on a schedule.\n"
            + "Water Heater Timer: Install a timer on your water heater to schedule heating cycles during off-peak hours, saving energy and reducing utility costs.\n"
            + "Landscaping: Plant shade trees around your home to reduce solar heat gain during the summer, lowering the demand for air conditioning.\n"
            + "Energy Monitoring: Use energy monitoring devices to track electricity usage in real-time and identify opportunities for conservation.";
}

            // Set the text of the energyTipLabel to display the energy tip
            energyTipLabel.setText(energyTip);

        } catch (NumberFormatException e) {
            // Handle the case where the user enters a non-numeric value
            energyTipLabel.setText("Please enter a valid number for unit usage.");
        } catch (Exception e) {
            // Handle other exceptions
            energyTipLabel.setText("An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        AfterLogin AfterLoginFrame=new AfterLogin();
        AfterLoginFrame.setVisible(true);
        AfterLoginFrame.pack();
        AfterLoginFrame.setLocationRelativeTo(null);
        this.dispose();
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
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnergyTips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane energyTipLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
