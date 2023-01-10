package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.model.Customer;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrCustomerRegister extends javax.swing.JFrame {

    private final CustomerController controller;
    private final JFrame menuScreen;
    private Customer curentCustomer;

    public FrCustomerRegister(JFrame menu) {
        initComponents();

        this.controller = CustomerController.getCustomerController();
        this.menuScreen = menu;
        this.curentCustomer = null;

        controller.updateTable(this.JTableCustomer);
        addMaskToFields();
        this.enableFields(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblAddres = new javax.swing.JLabel();
        edtAddres = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCustomer = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        fEdtCpf = new javax.swing.JFormattedTextField();
        fEdtPhone = new javax.swing.JFormattedTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Gerenciador de Cliente");
        lblMenu.setToolTipText("");

        lblName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblName.setText("Nome:");

        edtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNameActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblAddres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAddres.setText("Endereço:");

        edtAddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAddresActionPerformed(evt);
            }
        });

        lblPhone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPhone.setText("Celular:");

        btnBack.setText("Voltar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        JTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Número", "Endreço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableCustomer.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableCustomer);
        JTableCustomer.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (JTableCustomer.getColumnModel().getColumnCount() > 0) {
            JTableCustomer.getColumnModel().getColumn(1).setResizable(false);
        }

        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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

        btnCancel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, 0)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddres, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fEdtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(edtName))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fEdtPhone))
                                    .addComponent(edtAddres))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone)
                    .addComponent(fEdtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(fEdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddres)
                    .addComponent(edtAddres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNameActionPerformed

    private void edtAddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAddresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAddresActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.curentCustomer = null;
        cleanFields();
        enableFields(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateFields()){
            JOptionPane.showMessageDialog(this,"Error! Preencha os campos vazios.");
            return;
        }
        
        var name = edtName.getText();
        var cpf = fEdtCpf.getText();
        var phone = fEdtPhone.getText();
        var address = edtAddres.getText();

        if (this.curentCustomer != null) {
            var newCustomer = new Customer(cpf, name, address, phone);
            newCustomer.setId(curentCustomer.getId());
            this.controller.updateCustomer(newCustomer);
            
        }
        else{
            this.controller.createUser(name, cpf, address, phone);    
        }
        controller.updateTable(this.JTableCustomer);     
        cleanFields();
        enableFields(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Customer customerEdit = (Customer) getSelectedObjectOnJTable();
        
        if (customerEdit == null){
            JOptionPane.showMessageDialog(this,"Selecione um registro na tabela.");
        }
        else{
            this.cleanFields();
            this.enableFields(true);
            
            try {
                this.showUser(customerEdit);
                this.curentCustomer = customerEdit;
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Could not find user");
            }   
        }     
    }//GEN-LAST:event_btnEditActionPerformed

    private void showUser(Customer user) {
        edtName.setText(user.getName());
        fEdtCpf.setText(user.getCpf());
        fEdtPhone.setText(user.getPhoneNumber());
        edtAddres.setText(user.getAddress());       
    }

    private void enableFields(boolean enabled) {
        edtAddres.setEnabled(enabled);
        fEdtCpf.setEnabled(enabled);
        edtName.setEnabled(enabled);
        fEdtPhone.setEnabled(enabled);
    }

    private void cleanFields() {
        edtAddres.setText("");
        fEdtCpf.setText("");
        edtName.setText("");
        fEdtPhone.setText("");
    }
    
    private Object getSelectedObjectOnJTable() {
        int rowCliked = JTableCustomer.getSelectedRow();
        
        Object obj = null;
        if (rowCliked >= 0) {
            int SelectedObjectID = (int) JTableCustomer.getModel().getValueAt(rowCliked, 0);        
            obj = this.controller.getCustumer(SelectedObjectID);
        }
        return obj;
    }
    
    // If there is any null field, it returns true
    private boolean validateFields(){
        boolean verificated = false;
        
        if(edtName.getText().equals("")) verificated = true;
        if(fEdtCpf.getText().equals("")) verificated = true;     
        if(fEdtPhone.getText().equals("")) verificated = true;        
        if(edtAddres.getText().equals("")) verificated = true;
        
        return verificated;
    }


    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        Customer SelectedCustomer = (Customer) getSelectedObjectOnJTable();
        
        if (SelectedCustomer == null){
            JOptionPane.showMessageDialog(this,"Selecione um registro na tabela.");
        }
        else{
            this.controller.deleteUser(SelectedCustomer);
            this.controller.updateTable(JTableCustomer);
        }
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        this.menuScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cleanFields();
        enableFields(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField edtAddres;
    private javax.swing.JTextField edtName;
    private javax.swing.JFormattedTextField fEdtCpf;
    private javax.swing.JFormattedTextField fEdtPhone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddres;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    // End of variables declaration//GEN-END:variables

    private void addMaskToFields() {
        try {
            MaskFormatter maskPhone = new MaskFormatter("(##)#####-####");
            maskPhone.install(fEdtPhone);

            MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
            maskCpf.install(fEdtCpf);

        } catch (ParseException e) {
            Logger.getLogger(FrAnimalRegister.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
}
