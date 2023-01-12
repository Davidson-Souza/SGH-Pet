package com.sghpet.sgh.pet.view;

import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrGroundskeeperFunction extends javax.swing.JFrame {

    private final JFrame loginScreen;
    
    public FrGroundskeeperFunction(JFrame menu) {
        this.loginScreen = menu;
        initComponents();
        enableFields(false);
        addMaskToFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableItem = new javax.swing.JTable();
        btnEditStock = new javax.swing.JButton();
        lblListMaterial = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnReestock = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        fEdtQuantity = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Zelador");
        lblMenu.setToolTipText("");

        JTableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(5), "Ração Cachorro",  new Float(1.6)},
                { new Integer(6), "Ração Gato",  new Float(2.6)},
                { new Integer(1), "Ração Peixe",  new Float(1.5)},
                {null, "Alim. Aves",  new Float(0.6)}
            },
            new String [] {
                "ID", "Nome", "Quantidade (Kg)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTableItem.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableItem);
        JTableItem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnEditStock.setText("Editar Estoque");
        btnEditStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStockActionPerformed(evt);
            }
        });

        lblListMaterial.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListMaterial.setText("Lista de Materiais");
        lblListMaterial.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReestock.setText("Atualizar Estoque");
        btnReestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestockActionPerformed(evt);
            }
        });

        lblQuantity.setText("Quantidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addComponent(lblListMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fEdtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnEditStock, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnReestock)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditStock, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReestock, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblListMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enableFields(boolean enabled){
        fEdtQuantity.setEnabled(enabled);
    }
    private void cleanFields() {
        fEdtQuantity.setText("");
    }
    
    private void addMaskToFields() {
        try {
            MaskFormatter maskQuantity = new MaskFormatter("####");
            maskQuantity.install(fEdtQuantity);   
        } catch (ParseException e) {
            Logger.getLogger(FrGroundskeeperFunction.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
     private int getSelectedObjectOnJTable() {
        int rowCliked = JTableItem.getSelectedRow();
        
        if (rowCliked >= 0) {
            int SelectedItem = (int) JTableItem.getModel().getValueAt(rowCliked, 0);
            System.out.println("ID: "+SelectedItem);
            return SelectedItem;
        }else{
            return -1;
        }
     }
    
    private void btnEditStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStockActionPerformed
        int row = getSelectedObjectOnJTable();
        
        if (row == -1){
            JOptionPane.showMessageDialog(this,"Selecione um registro na tabela.");
        }
        else{
            this.cleanFields();
            this.enableFields(true);
            try {
                var value = this.fEdtQuantity.getText();
                JTableItem.getModel().setValueAt(value, row, 2);
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Could not find Item");
            }   
        }         
    }//GEN-LAST:event_btnEditStockActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.loginScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReestockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditStock;
    private javax.swing.JButton btnReestock;
    private javax.swing.JFormattedTextField fEdtQuantity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListMaterial;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblQuantity;
    // End of variables declaration//GEN-END:variables
}
