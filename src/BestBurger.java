/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BestBurger extends javax.swing.JFrame {

    /**
     * Creates new form BestBurger
     */
    public BestBurger() {
        initComponents();
        setTitle("Best Burger");
        setLocationRelativeTo(this);
        cbxBurger.setVisible(false);
        chkcheese.setVisible(false);
        cbxDrinksoption.setVisible(false);
        cbxD.setVisible(false);
        cbxDesert.setVisible(false);
        chkdrink.setVisible(false);
        chkDesert.setVisible(false);
        btnNeworder.setVisible(false);
        BtnCalculate.setVisible(false);
        lblPrice.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnloption = new javax.swing.JPanel();
        chkBurger = new javax.swing.JCheckBox();
        chkfrenchfries = new javax.swing.JCheckBox();
        chkdrink = new javax.swing.JCheckBox();
        chkDesert = new javax.swing.JCheckBox();
        cbxBurger = new javax.swing.JComboBox();
        chkcheese = new javax.swing.JCheckBox();
        cbxD = new javax.swing.JComboBox();
        cbxDrinksoption = new javax.swing.JComboBox();
        cbxDesert = new javax.swing.JComboBox();
        pnlAction = new javax.swing.JPanel();
        btnNeworder = new javax.swing.JButton();
        BtnCalculate = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnloption.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        pnloption.setToolTipText("");

        chkBurger.setText("Burger");
        chkBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBurgerActionPerformed(evt);
            }
        });

        chkfrenchfries.setText("French Fries");
        chkfrenchfries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkfrenchfriesActionPerformed(evt);
            }
        });

        chkdrink.setText("Drink");
        chkdrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkdrinkActionPerformed(evt);
            }
        });

        chkDesert.setText("Desert");
        chkDesert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesertActionPerformed(evt);
            }
        });

        cbxBurger.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ham", "Chicken", "Fish" }));
        cbxBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBurgerActionPerformed(evt);
            }
        });

        chkcheese.setText("Cheese");

        cbxD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pepsi", "7-up" }));
        cbxD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDActionPerformed(evt);
            }
        });

        cbxDrinksoption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Beverage", "IceTea" }));
        cbxDrinksoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDrinksoptionActionPerformed(evt);
            }
        });

        cbxDesert.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Donnuts", "IceCream" }));

        javax.swing.GroupLayout pnloptionLayout = new javax.swing.GroupLayout(pnloption);
        pnloption.setLayout(pnloptionLayout);
        pnloptionLayout.setHorizontalGroup(
            pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnloptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBurger)
                    .addComponent(chkfrenchfries)
                    .addComponent(chkDesert)
                    .addComponent(chkdrink))
                .addGap(41, 41, 41)
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxDrinksoption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxBurger, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxDesert, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnloptionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkcheese)
                        .addGap(38, 38, 38))
                    .addGroup(pnloptionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cbxD, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        pnloptionLayout.setVerticalGroup(
            pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnloptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBurger)
                    .addComponent(cbxBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkcheese))
                .addGap(18, 18, 18)
                .addComponent(chkfrenchfries)
                .addGap(18, 18, 18)
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkdrink)
                    .addComponent(cbxD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDrinksoption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnloptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDesert)
                    .addComponent(cbxDesert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAction.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        btnNeworder.setText("New Order");
        btnNeworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeworderActionPerformed(evt);
            }
        });

        BtnCalculate.setText("Calculate");
        BtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalculateActionPerformed(evt);
            }
        });

        lblPrice.setText("Price:");

        javax.swing.GroupLayout pnlActionLayout = new javax.swing.GroupLayout(pnlAction);
        pnlAction.setLayout(pnlActionLayout);
        pnlActionLayout.setHorizontalGroup(
            pnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNeworder)
                .addGap(43, 43, 43)
                .addComponent(BtnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlActionLayout.setVerticalGroup(
            pnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionLayout.createSequentialGroup()
                .addGroup(pnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNeworder)
                    .addComponent(BtnCalculate)
                    .addComponent(lblPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnloption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnloption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkdrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkdrinkActionPerformed
       if(chkdrink.isSelected()){
           cbxDrinksoption.setVisible(true);
           cbxD.setVisible(true);
       }else{
             cbxDrinksoption.setVisible(false);
           cbxD.setVisible(false);
             cbxDrinksoption.setSelectedIndex(0);
           cbxD.setSelectedIndex(0);
       }
    }//GEN-LAST:event_chkdrinkActionPerformed

    private void chkBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBurgerActionPerformed
        // TODO add your handling code here:
        if(chkBurger.isSelected()){
            cbxBurger.setVisible(true);
            chkcheese.setVisible(true);
             chkdrink.setVisible(true);
             chkDesert.setVisible(true);
                 btnNeworder.setVisible(true);
        BtnCalculate.setVisible(true);
            
        } else{
            cbxBurger.setVisible(false);
            chkcheese.setVisible(false);
              chkdrink.setVisible(false);
             chkDesert.setVisible(false);
             cbxDrinksoption.setVisible(false);
           cbxD.setVisible(false);
             cbxDesert.setVisible(false);
           cbxDesert.setSelectedIndex(0);
             cbxBurger.setSelectedIndex(0);
            
        }
    }//GEN-LAST:event_chkBurgerActionPerformed

    private void cbxBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBurgerActionPerformed
     chkcheese.setVisible(false);
     if(cbxBurger.getSelectedItem().equals("Fish")){
         chkcheese.setVisible(false);
     }else{
          chkcheese.setVisible(true);
 
         
     }
    }//GEN-LAST:event_cbxBurgerActionPerformed

    private void cbxDrinksoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDrinksoptionActionPerformed
    cbxD.removeAllItems();
    if(cbxDrinksoption.getSelectedItem().equals("Beverage")){
        cbxD.addItem("pepsi");
        cbxD.addItem("7-up");
    }else{ if(cbxDrinksoption.getSelectedItem().equals("Icetea")){
        cbxD.addItem("lemon");
        cbxD.addItem("peach");
    }//GEN-LAST:event_cbxDrinksoptionActionPerformed
    }}
    private void cbxDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDActionPerformed

    private void chkDesertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesertActionPerformed
     if(chkDesert.isSelected())
         cbxDesert.setVisible(true);
     else
          cbxDesert.setVisible(false);
           cbxDesert.setSelectedIndex(0);
    }//GEN-LAST:event_chkDesertActionPerformed

    private void BtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalculateActionPerformed
        int price=0;
        if(chkBurger.isSelected()){
            switch(cbxBurger.getSelectedItem().toString()){
                case "Ham":
                    price +=9000;
                    break;
                 case "Fish":
                    price +=7000;
                    break;
                  case "Chiken":
                    price +=8000;
                    break;   
            }
            if(chkcheese.isSelected()){
                price +=1000;
            }
            if(chkdrink.isSelected()){
                switch(cbxDrinksoption.getSelectedItem().toString()){
                    case "Beverage":
                        price+=1000;
                        break;
                    case "IceTea":
                        price+=2000;
                        break;
                            
                }
                if(chkDesert.isSelected()){
                    switch(cbxDesert.getSelectedItem().toString()){
                        case"IceCream":
                            price+=2500;
                            break;
                            case"Donnuts":
                                price+=2000;
                                break;
                            
                }
            }
        }
        if(chkfrenchfries.isSelected()){
            price+=2500;
        }
   
           chkBurger.setEnabled(false);
           chkfrenchfries.setEnabled(false);
           cbxBurger.setEnabled(false);
        chkcheese.setEnabled(false);
        cbxDrinksoption.setEnabled(false);
        cbxD.setEnabled(false);
        cbxDesert.sejgiggiigigigigigigigigigigigigigigit8k[igififirfitEnabled(false);
        chkdrink.setEnabled(false);
        chkDesert.setEnabled(false);
       
    lblPrice.setText("price"+price+ "LL");
        lblPrice.setVisible(true);
    }//GEN-LAST:event_BtnCalculateActionPerformed

    private void chkfrenchfriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkfrenchfriesActionPerformed
        btnNeworder.setVisible(true);
        BtnCalculate.setVisible(true);
    }//GEN-LAST:event_chkfrenchfriesActionPerformed

    private void btnNeworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeworderActionPerformed
     lblPrice.setVisible(true);
           chkBurger.setEnabled(true);
              chkBurger.setSelected(true);
           chkfrenchfries.setEnabled(true);
            chkfrenchfries.setSelected(false);
        chkcheese.setEnabled(true);
         chkcheese.setSelected(true);
        cbxDrinksoption.setEnabled(false);
        cbxD.setEnabled(false);
        cbxDesert.setEnabled(false);
        chkdrink.setSelected(false);
        cbxDrinksoption.setSelectedIndex(0);
        chkDesert.setEnabled(false);
        btnNeworder.setEnabled(false);
        BtnCalculate.setEnabled(false);
        lblPrice.setEnabled(false);
    }//GEN-LAST:event_btnNeworderActionPerformed

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
            java.util.logging.Logger.getLogger(BestBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BestBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BestBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BestBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BestBurger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalculate;
    private javax.swing.JButton btnNeworder;
    private javax.swing.JComboBox cbxBurger;
    private javax.swing.JComboBox cbxD;
    private javax.swing.JComboBox cbxDesert;
    private javax.swing.JComboBox cbxDrinksoption;
    private javax.swing.JCheckBox chkBurger;
    private javax.swing.JCheckBox chkDesert;
    private javax.swing.JCheckBox chkcheese;
    private javax.swing.JCheckBox chkdrink;
    private javax.swing.JCheckBox chkfrenchfries;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel pnlAction;
    private javax.swing.JPanel pnloption;
    // End of variables declaration//GEN-END:variables
}
