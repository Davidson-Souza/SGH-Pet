package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.controller.ServicesController;
import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.model.Services;
import com.sghpet.sgh.pet.model.ServicesList;
import com.sghpet.sgh.pet.model.TmReservation;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrReservationRegister extends javax.swing.JFrame {

    private final ReservationController reservationController;
    private final JFrame prevFrame;
    private Customer curentCustomer;
    private List<Animal> currentAnimal;

    public FrReservationRegister(JFrame prevFrame) {
        initComponents();

        this.prevFrame = prevFrame;
        this.reservationController = ReservationController.getReservationController();
        updateTable();
        addMaskToFields();
    }

    private void updateTable() {
        var reservations = this.reservationController.listReservations();
        var model = new TmReservation(reservations);
        JTableRegister.setModel(model);
        initComponents();
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
        bxAnimalType = new javax.swing.JComboBox<>();
        lblAnimalType = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        fEdtOwnerCpf = new javax.swing.JFormattedTextField();
        fEdtStartDate = new javax.swing.JFormattedTextField();
        fEdtEndDate = new javax.swing.JFormattedTextField();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Regenciar Reserva");
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
                {"Super luxo", "01/01/2023", "05/01/2023", null, null, null}
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

        lblAnimalType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAnimalType.setText("Animal:");

        lblType2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType2.setText("CPF do dono:");

        btnCheckIn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCheckIn.setText("Check-in");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCheckOut.setText("Check-out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
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
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServices, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(lblAnimalType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bxAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fEdtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(bxAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblType2)
                        .addComponent(fEdtOwnerCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationType)
                    .addComponent(bxReservationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(chckService3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxReservationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxReservationTypeActionPerformed
    }//GEN-LAST:event_bxReservationTypeActionPerformed

    private void chckService3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckService3ActionPerformed
    }//GEN-LAST:event_chckService3ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (this.currentAnimal == null) {
            return;
        }

        var typeOfStay = bxReservationType.getSelectedIndex();
        var startDate = fEdtStartDate.getText();
        var endDate = fEdtOwnerCpf.getText();
        var curentAnimalIndex = bxAnimalType.getSelectedIndex();
        var reservation = this.reservationController.createReservation(typeOfStay, startDate, endDate, 0, currentAnimal.get(curentAnimalIndex), curentCustomer);
        if (chckService1.isSelected()) {
            ServicesController.getServicesController().createService(ServicesList.Shave, 20, reservation, "");
        }
        if (chckService2.isSelected()) {
            ServicesController.getServicesController().createService(ServicesList.Bath, 30, reservation, "");
        }
        if (chckService3.isSelected()) {
            ServicesController.getServicesController().createService(ServicesList.Spa, 50, reservation, "");
        }
        JOptionPane.showMessageDialog(this, "Número da reserva: " + reservation.getId());
        this.currentAnimal = null;
        this.curentCustomer = null;
        updateTable();
        
        this.currentAnimal = null;
        this.curentCustomer = null;
        cleanFields();
        enableFields(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        enableFields(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void enableFields(boolean enabled) {
        fEdtOwnerCpf.setEditable(enabled);
        bxAnimalType.setEditable(enabled);
        bxAnimalType.setEditable(enabled);
        bxReservationType.setEditable(enabled);
        fEdtStartDate.setEditable(enabled);
        fEdtEndDate.setEditable(enabled);
    }

    private void cleanFields() {
        fEdtEndDate.setText("");
        fEdtOwnerCpf.setText("");
        fEdtStartDate.setText("");
        bxAnimalType.removeAllItems();
        bxAnimalType.removeAllItems();
        bxReservationType.removeAllItems();
        chckService1.setSelected(false);
        chckService2.setSelected(false);
        chckService3.setSelected(false);

    }
    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        var reservationId = JOptionPane.showInputDialog("Número da reserva");
        try {
            reservationController.deleteReservation(Integer.parseInt(reservationId));
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Id inválido");
        }
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        cleanFields();
        try {
            var reservationId = JOptionPane.showInputDialog("Número da reserva");
            var reservation = this.reservationController.getReservation(Integer.parseInt(reservationId));
            fEdtEndDate.setText(reservation.getEndDate());
            fEdtStartDate.setText(reservation.getStartDate());
            fEdtOwnerCpf.setText(reservation.getCustomer().getCpf());

            var animals = AnimalController.getAnimalController().listAnimalByCustomer(reservation.getCustomer().getId());
            this.currentAnimal = animals;
            this.curentCustomer = reservation.getCustomer();

            int index = -1, i = 0;
            for (var animal : animals) {
                if (animal.getId() == reservation.getAnimal().getId()) {
                    index = i;
                }
                bxAnimalType.addItem(animal.getName());
                i++;
            }
            getServices(reservation);
            bxAnimalType.setSelectedIndex(index);
            //bxReservationType.setSelectedIndex(0);
        } catch (RuntimeException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao processar a solicitação");
            return;
        }
        enableFields(true);

    }//GEN-LAST:event_btnEditActionPerformed

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
            }
        }
    }

    private void edtEndDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEndDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEndDate1ActionPerformed

    private void edtOwnerCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtOwnerCpfFocusLost
        try {
            var user = CustomerController.getCustomerController().findCustomerByCPF(fEdtOwnerCpf.getText());
            this.curentCustomer = user;
            var animals = AnimalController.getAnimalController().listAnimalByCustomer(user.getId());
            this.currentAnimal = animals;
            for (var animal : animals) {
                bxAnimalType.addItem(animal.getName());
            }
        } catch (RuntimeException e) {
            System.out.println(fEdtOwnerCpf.getText());
        }

    }//GEN-LAST:event_edtOwnerCpfFocusLost
    private void bxAnimalTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxAnimalTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxAnimalTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.prevFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableRegister;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> bxAnimalType;
    private javax.swing.JComboBox<String> bxReservationType;
    private javax.swing.JCheckBox chckService1;
    private javax.swing.JCheckBox chckService2;
    private javax.swing.JCheckBox chckService3;
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
