package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.TmAnimal;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrAnimalRegister extends javax.swing.JFrame {

    private final AnimalController controller;
    private final CustomerController customers;

    public FrAnimalRegister() {
        this.controller = AnimalController.getAnimalController();
        this.customers = CustomerController.getCustomerController();
        initComponents();
        updateTable();
        addMaskToFields();
    }

    private void updateTable() {
        var animals = AnimalController.getAnimalController().listAnials();
        var tmCustomer = new TmAnimal(animals);
        JTableAnimal.setModel(tmCustomer);
    }

        
        addMaskToFields();
    }

    private void updateTable() {
        var animals = AnimalController.getAnimalController().listAnials();
        var tmCustomer = new TmAnimal(animals);
        JTableAnimal.setModel(tmCustomer);
    }

    
    private
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        bxType = new javax.swing.JComboBox<>();
        lblPostage = new javax.swing.JLabel();
        bxPostage = new javax.swing.JComboBox<>();
        lblOwner = new javax.swing.JLabel();
        lblMedicalCondition = new javax.swing.JLabel();
        ckbxMedicalCondition = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAnimal = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        fEdtOwner = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Cadastro de Animal");
        lblMenu.setToolTipText("");

        lblName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblName.setText("Nome:");

        edtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNameActionPerformed(evt);
            }
        });

        lblType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType.setText("Tipo:");

        bxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cachorro", "Gato", "Ave", "Peixe" }));
        bxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxTypeActionPerformed(evt);
            }
        });

        lblPostage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPostage.setText("Porte:");

        bxPostage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Médio", "Grande" }));
        bxPostage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxPostageActionPerformed(evt);
            }
        });

        lblOwner.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblOwner.setText("Dono:");

        lblMedicalCondition.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMedicalCondition.setText("Condição médica?");

        btnSave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        JTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Dono", "Tipo", "Porte", "Condição Médica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableAnimal);

        btnEdit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelet.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelet.setText("Excluir");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtName, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(fEdtOwner))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPostage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bxPostage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedicalCondition)
                                .addGap(18, 18, 18)
                                .addComponent(ckbxMedicalCondition))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType)
                    .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwner)
                    .addComponent(lblPostage)
                    .addComponent(bxPostage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalCondition)
                    .addComponent(ckbxMedicalCondition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNameActionPerformed
    }//GEN-LAST:event_edtNameActionPerformed

    private void bxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxTypeActionPerformed
    }//GEN-LAST:event_bxTypeActionPerformed

    private void bxPostageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxPostageActionPerformed
    }//GEN-LAST:event_bxPostageActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        var name = edtName.getText();
        var owner_cpf = fEdtOwner.getText();
        var type = bxType.getSelectedItem().toString();
        var postage = bxPostage.getSelectedItem().toString();
        var hasMedicalCondition = ckbxMedicalCondition.isSelected();
        Customer owner;
        try {
            owner = this.customers.findCustomerByCPF(owner_cpf);
        } catch (RuntimeException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,
                    "Não foi possível encontra o usuário",
                    "Erro.",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        this.controller.createAnimal(name, owner, type, postage, hasMedicalCondition);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAnimal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> bxPostage;
    private javax.swing.JComboBox<String> bxType;
    private javax.swing.JCheckBox ckbxMedicalCondition;
    private javax.swing.JTextField edtName;
    private javax.swing.JFormattedTextField fEdtOwner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicalCondition;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblPostage;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables

    private void addMaskToFields() {
        try {
            MaskFormatter maskOwner = new MaskFormatter("###.###.###-##");
            maskOwner.install(fEdtOwner);
            
        } catch (ParseException e) {
            Logger.getLogger(FrAnimalRegister.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
}
