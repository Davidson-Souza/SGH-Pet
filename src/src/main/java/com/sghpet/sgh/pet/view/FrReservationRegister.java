package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import java.util.List;
import javax.swing.JFrame;

public class FrReservationRegister extends javax.swing.JFrame {

    private final ReservationController reservationController;
    private final JFrame prevFrame;
    private Customer curentCustomer;
    private List<Animal> curentAnimal;

    public FrReservationRegister(JFrame prevFrame) {
        this.prevFrame = prevFrame;
        this.reservationController = ReservationController.getReservationController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        bxType = new javax.swing.JComboBox<>();
        lblStartDate = new javax.swing.JLabel();
        edtStartDate = new javax.swing.JTextField();
        lblEndDate = new javax.swing.JLabel();
        edtOwnerCpf = new javax.swing.JTextField();
        lblServices = new javax.swing.JLabel();
        chckService1 = new javax.swing.JCheckBox();
        chckService2 = new javax.swing.JCheckBox();
        chckService3 = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRegister = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        bxName = new javax.swing.JComboBox<>();
        edtEndDate1 = new javax.swing.JTextField();
        lblType1 = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Criar Reserva");
        lblMenu.setToolTipText("");

        lblType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType.setText("Tipo da reserva:");

        bxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Econômico", "Luxo", "Super luxo" }));
        bxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxTypeActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStartDate.setText("Data inicial:");

        edtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtStartDateActionPerformed(evt);
            }
        });

        lblEndDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEndDate.setText("Data Final:");

        edtOwnerCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtOwnerCpfFocusLost(evt);
            }
        });
        edtOwnerCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtOwnerCpfActionPerformed(evt);
            }
        });

        lblServices.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblServices.setText("Serviços:");

        chckService1.setText("Tosa");

        chckService2.setText("Banho");

        chckService3.setText("Spa");
        chckService3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckService3ActionPerformed(evt);
            }
        });

        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        JTableRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo Reserva", "Data Inicial", "Data Final", "Tosa?", "Banho?", "Spa?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableRegister);

        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelet.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelet.setText("Excluir");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        bxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxNameActionPerformed(evt);
            }
        });

        edtEndDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEndDate1ActionPerformed(evt);
            }
        });

        lblType1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType1.setText("Animal");

        lblType2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType2.setText("CPF do dono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblServices, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(chckService1)
                                        .addGap(40, 40, 40)
                                        .addComponent(chckService2)
                                        .addGap(40, 40, 40)
                                        .addComponent(chckService3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(edtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblType2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtOwnerCpf)
                                        .addGap(38, 38, 38)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblType1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEndDate)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(414, 414, 414)
                    .addComponent(edtEndDate1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType2)
                            .addComponent(edtOwnerCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType1)
                            .addComponent(bxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(edtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServices)
                    .addComponent(chckService1)
                    .addComponent(chckService2)
                    .addComponent(chckService3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(221, 221, 221)
                    .addComponent(edtEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(262, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxTypeActionPerformed
    }//GEN-LAST:event_bxTypeActionPerformed

    private void edtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtStartDateActionPerformed
    }//GEN-LAST:event_edtStartDateActionPerformed

    private void edtOwnerCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtOwnerCpfActionPerformed
    }//GEN-LAST:event_edtOwnerCpfActionPerformed

    private void chckService3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckService3ActionPerformed
    }//GEN-LAST:event_chckService3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (this.curentAnimal == null) {
            return;
        }

        var typeOfStay = bxType.getSelectedIndex();
        var startDate = edtStartDate.getText();
        var endDate = edtOwnerCpf.getText();
        var curentAnimalIndex = bxName.getSelectedIndex();
        this.reservationController.createReservation(typeOfStay, startDate, endDate, 0, curentAnimal.get(curentAnimalIndex), curentCustomer);

        this.curentAnimal = null;
        this.curentCustomer = null;
        cleanFields();
        enableFields(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        enableFields(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void enableFields(boolean enabled) {
        edtEndDate1.setEditable(enabled);
        edtOwnerCpf.setEditable(enabled);
        edtStartDate.setEditable(enabled);
        edtStartDate.setEditable(enabled);
        bxType.setEditable(enabled);
    }

    private void cleanFields() {
        edtEndDate1.setText("");
        edtOwnerCpf.setText("");
        edtStartDate.setText("");
        bxType.removeAllItems();
        chckService1.setSelected(false);
        chckService2.setSelected(false);
        chckService3.setSelected(false);

    }
    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void bxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxNameActionPerformed

    private void edtEndDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEndDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEndDate1ActionPerformed

    private void edtOwnerCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtOwnerCpfFocusLost
        try {
            var user = CustomerController.getCustomerController().findCustomerByCPF(edtOwnerCpf.getText());
            this.curentCustomer = user;
            var animals = AnimalController.getAnimalController().listAnimalByCustomer(user.getId());
            this.curentAnimal = animals;
            for (var animal : animals) {
                bxName.addItem(animal.getName());
            }
        } catch (RuntimeException e) {
            System.out.println(edtOwnerCpf.getText());
        }

    }//GEN-LAST:event_edtOwnerCpfFocusLost

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.prevFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableRegister;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> bxName;
    private javax.swing.JComboBox<String> bxType;
    private javax.swing.JCheckBox chckService1;
    private javax.swing.JCheckBox chckService2;
    private javax.swing.JCheckBox chckService3;
    private javax.swing.JTextField edtEndDate1;
    private javax.swing.JTextField edtOwnerCpf;
    private javax.swing.JTextField edtStartDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblServices;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    // End of variables declaration//GEN-END:variables
}
