package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
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
        this.prevFrame = prevFrame;
        this.reservationController = ReservationController.getReservationController();
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
        bxAnimalName = new javax.swing.JComboBox<>();
        lblAnimalType = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        fEdtOwnerCpf = new javax.swing.JFormattedTextField();
        fEdtStartDate = new javax.swing.JFormattedTextField();
        fEdtEndDate = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Criar Reserva");
        lblMenu.setToolTipText("");
        getContentPane().add(lblMenu);

        lblReservationType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblReservationType.setText("Tipo da reserva:");
        getContentPane().add(lblReservationType);

        bxReservationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Econômico", "Luxo", "Super luxo" }));
        bxReservationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxReservationTypeActionPerformed(evt);
            }
        });
        getContentPane().add(bxReservationType);

        lblStartDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStartDate.setText("Data inicial:");
        getContentPane().add(lblStartDate);

        lblEndDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEndDate.setText("Data Final:");
        getContentPane().add(lblEndDate);

        lblServices.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblServices.setText("Serviços:");
        getContentPane().add(lblServices);

        chckService1.setText("Tosa");
        getContentPane().add(chckService1);

        chckService2.setText("Banho");
        getContentPane().add(chckService2);

        chckService3.setText("Spa");
        chckService3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckService3ActionPerformed(evt);
            }
        });
        getContentPane().add(chckService3);

        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);

        btnSave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);

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

        getContentPane().add(jScrollPane1);

        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew);

        btnDelet.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelet.setText("Excluir");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelet);

        btnEdit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);

        getContentPane().add(bxAnimalName);

        lblAnimalType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAnimalType.setText("Animal:");
        getContentPane().add(lblAnimalType);

        lblType2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType2.setText("CPF do dono:");
        getContentPane().add(lblType2);
        getContentPane().add(fEdtOwnerCpf);
        getContentPane().add(fEdtStartDate);
        getContentPane().add(fEdtEndDate);

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
        var curentAnimalIndex = bxAnimalName.getSelectedIndex();
        this.reservationController.createReservation(typeOfStay, startDate, endDate, 0, currentAnimal.get(curentAnimalIndex), curentCustomer);

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
        bxAnimalName.setEditable(enabled);
        bxReservationType.setEditable(enabled);
        fEdtStartDate.setEditable(enabled);
        fEdtEndDate.setEditable(enabled);
    }

    private void cleanFields() {
        fEdtEndDate.setText("");
        fEdtOwnerCpf.setText("");
        fEdtStartDate.setText("");
        bxAnimalName.removeAllItems();
        bxReservationType.removeAllItems();
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

    private void bxAnimalTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
                bxAnimalName.addItem(animal.getName());
            }
        } catch (RuntimeException e) {
            System.out.println(fEdtOwnerCpf.getText());
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
    private javax.swing.JComboBox<String> bxAnimalName;
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
