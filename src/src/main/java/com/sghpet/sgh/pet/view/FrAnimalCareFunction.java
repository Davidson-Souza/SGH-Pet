package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.TmAnimal;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrAnimalCareFunction extends javax.swing.JFrame {

    private final AnimalController animalController;
    private Animal currentAnimal;
    
    public FrAnimalCareFunction() {
        initComponents();        
        
        this.currentAnimal = null;
        this.animalController = AnimalController.getAnimalController();
        animalController.updateTable(JTableAnimal);
        this.enableFields(false);
        this.enableButtons(false);
        this.addMaskToFields();
    }
    
    private Object getSelectedObjectOnJTable() {
        int rowCliked = JTableAnimal.getSelectedRow();
        
        Object obj = null;
        if (rowCliked >= 0) {
            int SelectedObjectID = (int) JTableAnimal.getModel().getValueAt(rowCliked, 0);        
            obj = animalController.getAnimal(SelectedObjectID);
        }
        return obj;
    }
    
    private void enableFields(boolean enabled){
        fEdtLastBath.setEnabled(enabled);
    }
    private void enableButtons(boolean enabled){
        btnUpdateBath.setEnabled(enabled);
    }
    
    private void cleanFields() {
        fEdtLastBath.setText("");
    }
    
    private void addMaskToFields() {
        try {
            MaskFormatter maskOwner = new MaskFormatter("##:##");
            maskOwner.install(fEdtLastBath);   
        } catch (ParseException e) {
            Logger.getLogger(FrAnimalRegister.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
    private void showAnimal(Animal animal) {
        fEdtLastBath.setText(animal.getLastBathTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnUpdateBath = new javax.swing.JButton();
        lblListAnimal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAnimal = new javax.swing.JTable();
        lblLastBath = new javax.swing.JLabel();
        fEdtLastBath = new javax.swing.JFormattedTextField();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Veterinário");
        lblMenu.setToolTipText("");

        btnUpdateBath.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnUpdateBath.setText("Atualiar Banho");
        btnUpdateBath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBathActionPerformed(evt);
            }
        });

        lblListAnimal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListAnimal.setText("Lista de Animais");
        lblListAnimal.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        JTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Dono", "Tipo", "Porte", "Condição Médica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAnimal.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableAnimal);

        lblLastBath.setText("Horário Banho:");

        btnEdit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(lblListAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastBath)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fEdtLastBath, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateBath, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastBath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtLastBath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnUpdateBath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblListAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateBathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBathActionPerformed
        try {
            var lastBath = fEdtLastBath.getText();
            animalController.setLastBathTime(currentAnimal,lastBath);                   
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Could not update Animal");
            }
        cleanFields();
        enableFields(false);
        enableButtons(false);
        animalController.updateTable(JTableAnimal);
    }//GEN-LAST:event_btnUpdateBathActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Animal animalEdit = (Animal) getSelectedObjectOnJTable();
        
        if (animalEdit == null){
            JOptionPane.showMessageDialog(this,"Selecione um registro na tabela.");
        }
        else{
            this.cleanFields();
            this.enableFields(true);
            this.enableButtons(true);
            
            try {
                this.showAnimal(animalEdit);
                this.currentAnimal = animalEdit;
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Could not find Animal");
            }   
        }                     
    }//GEN-LAST:event_btnEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAnimal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdateBath;
    private javax.swing.JFormattedTextField fEdtLastBath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLastBath;
    private javax.swing.JLabel lblListAnimal;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
