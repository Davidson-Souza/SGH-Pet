package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.controller.ServicesController;
import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrReservationRegister extends javax.swing.JFrame {

    private final ReservationController reservationController;
    private final JFrame menuScreen;
    private Customer currentCustomer;
    private Reservation currentReservation;
    private List<Animal> currentAnimal;

    public FrReservationRegister(JFrame menu) {
        initComponents();

        this.menuScreen = menu;
        this.reservationController = ReservationController.getReservationController();
        reservationController.updateTable(this.JTableRegister);

        cleanFields();
        enableFields(false);
        enableChckFields(false);
        addMaskToFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblReservationType = new javax.swing.JLabel();
        bxReservationType = new javax.swing.JComboBox<>();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
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
        bxAnimalName = new javax.swing.JComboBox<>();
        lblAnimalType = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        fEdtOwnerCpf = new javax.swing.JFormattedTextField();
        fEdtStartDate = new javax.swing.JFormattedTextField();
        fEdtEndDate = new javax.swing.JFormattedTextField();
        btnCancel = new javax.swing.JButton();
        chckService4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Gerenciador de Reserva");
        lblMenu.setToolTipText("");

        lblReservationType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblReservationType.setText("Tipo da reserva:");

        bxReservationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Econômico", "Luxo", "Super luxo" }));
        bxReservationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxReservationTypeActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStartDate.setText("Data inicial:");

        lblEndDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEndDate.setText("Data Final:");

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
                "ID", "Dono", "Tipo Reserva", "Animal", "Data Inicial", "Data Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        JTableRegister.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableRegister);
        JTableRegister.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        lblAnimalType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAnimalType.setText("Animal:");

        lblType2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType2.setText("CPF do dono:");

        fEdtOwnerCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fEdtOwnerCpfFocusLost(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        chckService4.setText("Translado");
        chckService4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckService4ActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fEdtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblReservationType, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bxReservationType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblType2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fEdtOwnerCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAnimalType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fEdtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bxAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServices, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chckService1)
                                .addGap(40, 40, 40)
                                .addComponent(chckService2)
                                .addGap(40, 40, 40)
                                .addComponent(chckService3)
                                .addGap(29, 29, 29)
                                .addComponent(chckService4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)
                                .addGap(40, 40, 40)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAnimalType)
                        .addComponent(bxAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblType2)
                        .addComponent(fEdtOwnerCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationType)
                    .addComponent(bxReservationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(lblEndDate)
                    .addComponent(fEdtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServices)
                    .addComponent(chckService1)
                    .addComponent(chckService2)
                    .addComponent(chckService3)
                    .addComponent(chckService4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxReservationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxReservationTypeActionPerformed
    }//GEN-LAST:event_bxReservationTypeActionPerformed

    private void chckService3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckService3ActionPerformed
    }//GEN-LAST:event_chckService3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (validateFields()) {
            JOptionPane.showMessageDialog(this, "Error! Preencha os campos vazios.");
            return;
        }

        if (this.currentAnimal == null) {
            return;
        }
        var curentAnimalIndex = bxAnimalName.getSelectedIndex();
        var typeOfStay = bxReservationType.getSelectedIndex();
        var startDate = fEdtStartDate.getText();
        var endDate = fEdtEndDate.getText();
        var animal = currentAnimal.get(curentAnimalIndex);
        var customer = currentCustomer;
        try {
            this.reservationController.createReservation(
                    currentReservation,
                    currentCustomer,
                    currentAnimal,
                    typeOfStay,
                    startDate,
                    endDate,
                    animal,
                    customer,
                    chckService1.isSelected(),
                    chckService2.isSelected(),
                    chckService3.isSelected(),
                    chckService4.isSelected());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e);
        }

        this.currentAnimal = null;
        this.currentCustomer = null;
        reservationController.updateTable(this.JTableRegister);

        this.cleanFields();
        this.enableFields(false);
        this.enableChckFields(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        enableFields(true);
        enableChckFields(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void enableFields(boolean enabled) {
        fEdtOwnerCpf.setEnabled(enabled);
        bxAnimalName.setEnabled(enabled);
        bxReservationType.setEnabled(enabled);
        fEdtStartDate.setEnabled(enabled);
        fEdtEndDate.setEnabled(enabled);
    }
    private void enableChckFields(boolean enabled) {
        chckService1.setEnabled(enabled);
        chckService2.setEnabled(enabled);
        chckService3.setEnabled(enabled);
        chckService4.setEnabled(enabled);
    }

    private void cleanFields() {
        fEdtEndDate.setText("");
        fEdtOwnerCpf.setText("");
        fEdtStartDate.setText("");
        bxAnimalName.removeAllItems();
        bxReservationType.setSelectedIndex(0);
        chckService1.setSelected(false);
        chckService2.setSelected(false);
        chckService3.setSelected(false);
        chckService4.setSelected(false);
    }

    private boolean validateFields() {
        boolean verificated = false;

        if (fEdtOwnerCpf.getText().equals("")) {
            verificated = true;
        }
        if (fEdtStartDate.getText().equals("")) {
            verificated = true;
        }
        if (fEdtEndDate.getText().equals("")) {
            verificated = true;
        }

        return verificated;
    }

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        Reservation selectedReservation = (Reservation) getSelectedObjectOnJTable();

        if (selectedReservation == null) {
            JOptionPane.showMessageDialog(this, "Selecione um registro na tabela.");
        } else {
            this.reservationController.deleteReservation(selectedReservation);
            this.reservationController.updateTable(JTableRegister);
        }
        enableFields(false);
        enableChckFields(false);
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Reservation reservationEdit = (Reservation) getSelectedObjectOnJTable();

        if (reservationEdit == null) {
            JOptionPane.showMessageDialog(this, "Selecione um registro na tabela.");
        } else {
            this.cleanFields();
            this.enableFields(true);
            this.enableChckFields(false);

            try {
                this.showReservation(reservationEdit);
                this.currentReservation = reservationEdit;
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Could not find reservation");
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void showReservation(Reservation reservation) {
        fEdtOwnerCpf.setText(reservation.getCustomer().getCpf());
        fEdtStartDate.setText(reservation.getStartDate());
        fEdtEndDate.setText(reservation.getEndDate());
        bxReservationType.setSelectedIndex(reservation.getType());

        var animals = AnimalController.getAnimalController().listAnimalByCustomer(reservation.getCustomer().getId());
        this.currentAnimal = animals;
        this.currentCustomer = reservation.getCustomer();

        int index = -1, i = 0;
        for (var animal : animals) {
            if (animal.getId() == reservation.getAnimal().getId()) {
                index = i;
            }
            bxAnimalName.addItem(animal.getName());
            i++;
        }
        getServices(reservation);
        bxAnimalName.setSelectedIndex(index);
    }

    private void getServices(Reservation res) {
        var services = ServicesController.getServicesController().list(res.getId());
        for (var service : services) {
            switch (service.getServiceType()) {
                case Bath: {
                    chckService2.setEnabled(true);
                }
                case Shave: {
                    chckService1.setEnabled(true);
                }
                case Spa: {
                    chckService3.setEnabled(true);
                }
                case Translado: {
                    chckService4.setEnabled(true);
                }
            }
        }
    }

    private Object getSelectedObjectOnJTable() {
        int rowCliked = JTableRegister.getSelectedRow();

        Object obj = null;
        if (rowCliked >= 0) {
            int SelectedObjectID = (int) JTableRegister.getModel().getValueAt(rowCliked, 0);
            obj = this.reservationController.getReservation(SelectedObjectID);
        }
        return obj;
    }

    private void bxAnimalTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void edtEndDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEndDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEndDate1ActionPerformed

    private void edtOwnerCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtOwnerCpfFocusLost
        try {
            var user = CustomerController.getCustomerController().findCustomerByCPF(fEdtOwnerCpf.getText());
            this.currentCustomer = user;
            var animals = AnimalController.getAnimalController().listAnimalByCustomer(user.getId());
            this.currentAnimal = animals;
            for (var animal : animals) {
                bxAnimalName.addItem(animal.getName());
            }
        } catch (RuntimeException e) {
            System.out.println(fEdtOwnerCpf.getText());
        }

    }//GEN-LAST:event_edtOwnerCpfFocusLost

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.menuScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void fEdtOwnerCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fEdtOwnerCpfFocusLost
        var customerCpf = fEdtOwnerCpf.getText();
        var customer = CustomerController.getCustomerController().findCustomerByCPF(customerCpf);
        var list = AnimalController.getAnimalController().listAnimalByCustomer(customer.getId());
        for (Animal animal : list) {
            bxAnimalName.addItem(animal.getName());
        }
        this.currentCustomer = customer;
        this.currentAnimal = list;
    }//GEN-LAST:event_fEdtOwnerCpfFocusLost

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cleanFields();
        enableFields(false);
        enableChckFields(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void chckService4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckService4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chckService4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableRegister;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> bxAnimalName;
    private javax.swing.JComboBox<String> bxReservationType;
    private javax.swing.JCheckBox chckService1;
    private javax.swing.JCheckBox chckService2;
    private javax.swing.JCheckBox chckService3;
    private javax.swing.JCheckBox chckService4;
    private javax.swing.JFormattedTextField fEdtEndDate;
    private javax.swing.JFormattedTextField fEdtOwnerCpf;
    private javax.swing.JFormattedTextField fEdtStartDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnimalType;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblReservationType;
    private javax.swing.JLabel lblServices;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblType2;
    // End of variables declaration//GEN-END:variables

    private void addMaskToFields() {
        try {
            MaskFormatter maskOwnerCpf = new MaskFormatter("###.###.###-##");
            maskOwnerCpf.install(fEdtOwnerCpf);

            MaskFormatter maskStartDate = new MaskFormatter("##/##/####");
            maskStartDate.install(fEdtStartDate);

            MaskFormatter maskEndDate = new MaskFormatter("##/##/####");
            maskEndDate.install(fEdtEndDate);

        } catch (ParseException e) {
            Logger.getLogger(FrAnimalRegister.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
}
