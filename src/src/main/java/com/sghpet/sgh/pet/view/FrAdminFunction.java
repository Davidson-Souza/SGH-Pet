package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AdminController;
import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.model.Employee;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrAdminFunction extends javax.swing.JFrame {

    private final JFrame prev;
    private Employee selected;

    public FrAdminFunction(boolean firstLogin, JFrame prev) {
        initComponents();
        this.prev = prev;
        if (firstLogin) {
            JOptionPane.showMessageDialog(this, ""
                    + "Seja bem-vindo(a) ao SGH-Pet, o seu sistema de gerenciamento para hotél pet. \n"
                    + "Parece que esta instalação é nova, estamos felizes por você ter nos escolhido!\n"
                    + "Para caomeçar a usar o sistem, por favor utilize este menu para cadastrar os seus funcionários.\n"
                    + "Dica: Não se esqueça de cadastrar um perfil de Administrador!"
            );
        }
        cmbFunction.removeAllItems();
        cmbFunction.addItem("Administador");
        cmbFunction.addItem("Atendente");
        cmbFunction.addItem("Zelador");
        cmbFunction.addItem("Gerente");
        cmbFunction.addItem("Faxineira");
        AdminController.updateTable(JTableEmployees);
        setEnable(false);
    }

    private Object getSelectedObjectOnJTable() {
        int rowCliked = JTableEmployees.getSelectedRow();

        Object obj = null;
        if (rowCliked >= 0) {
            int SelectedObjectID = (int) JTableEmployees.getModel().getValueAt(rowCliked, 3);
            obj = EmployeeController.getEmployeeController().get(SelectedObjectID);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbFunction = new javax.swing.JComboBox<>();
        lblMenu1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmployees = new javax.swing.JTable();
        lblMenu2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        psfPassword = new javax.swing.JPasswordField();
        btnLogout = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Realizar Pagamento");
        lblMenu.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        edtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        edtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfActionPerformed(evt);
            }
        });

        jLabel3.setText("Função");

        cmbFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMenu1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu1.setText("Gerenciamento de Funcionários");
        lblMenu1.setToolTipText("");

        JTableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Padrão", "29/12/2022", "03/01/2023",  new Float(150.5)}
            },
            new String [] {
                "ID", "Tipo Reserva", "Data Inicial", "Data Final", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
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
        JTableEmployees.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableEmployees);

        lblMenu2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu2.setText("Funcionários Cadastrados");
        lblMenu2.setToolTipText("");

        jLabel4.setText("Senha");

        btnLogout.setText("Sair");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Deletar");

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnNew.setText("Novo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addGap(154, 154, 154))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(psfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFunction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(48, 48, 48)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(psfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(15, 15, 15)
                .addComponent(lblMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNameActionPerformed

    private void edtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.prev.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        var name = edtName.getText();
        var cpf = edtCpf.getText();
        var job = cmbFunction.getSelectedIndex();
        var password = psfPassword.getText();
        if (this.selected == null) {
            try {
                AdminController.createEmployee(cpf, name, job, password);

            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            cleanFields();
            setEnable(false);
            return;
        }

        AdminController.updateEmployee(selected, cpf, name, job, password);
        this.selected = null;
        cleanFields();
        setEnable(false);
        AdminController.updateTable(JTableEmployees);
        AdminController.updateTable(JTableEmployees);    }//GEN-LAST:event_btnSaveActionPerformed

    private void cleanFields() {
        edtName.setText("");
        edtCpf.setText("");
        psfPassword.setText("");
    }

    private void setEnable(boolean enabled) {
        edtCpf.setEditable(enabled);
        edtName.setEditable(enabled);
        psfPassword.setEditable(enabled);
        cmbFunction.setEditable(enabled);
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        var selected = getSelectedObjectOnJTable();

        if (selected == null) {
            JOptionPane.showMessageDialog(this, "Selecione um empregado na tabela para editar");
            return;
        }
        var employee = (Employee) selected;
        this.selected = employee;
        edtName.setText(employee.getName());
        edtCpf.setText(employee.getCpf());
        switch (employee.getJob()) {
            case Admin -> {
                cmbFunction.setSelectedIndex(0);
                break;
            }
            case Clerk -> {
                cmbFunction.setSelectedIndex(1);
                break;
            }
            case Groundkeeper -> {
                cmbFunction.setSelectedIndex(2);
                break;
            }
            case Manager -> {
                cmbFunction.setSelectedIndex(3);
                break;
            }
            case Servicer -> {
                cmbFunction.setSelectedIndex(4);
                break;
            }
        }
        psfPassword.setText(employee.getPassword());
        setEnable(true);
        psfPassword.setText(employee.getPassword());    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cleanFields();
        setEnable(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cleanFields();
        setEnable(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEmployees;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbFunction;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblMenu2;
    private javax.swing.JPasswordField psfPassword;
    // End of variables declaration//GEN-END:variables
}
