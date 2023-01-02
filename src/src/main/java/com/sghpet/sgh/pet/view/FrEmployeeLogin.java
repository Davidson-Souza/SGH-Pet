package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.model.Employee;
import javax.swing.JOptionPane;

public class FrEmployeeLogin extends javax.swing.JFrame {

    protected EmployeeController contr;

    public FrEmployeeLogin() {
        this.contr = EmployeeController.getEmployeeController();
        this.initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EdtCpf = new javax.swing.JTextField();
        EdtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EdtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdtCpfActionPerformed(evt);
            }
        });

        jLabel1.setText("cpf");

        jLabel2.setText("Senha");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EdtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(EdtPassword))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EdtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdtCpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var cpf = EdtCpf.getText();
        var password = EdtPassword.getText();
        Employee user;
        try {
            user = this.contr.signIn(cpf, password);
            if (!user.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(null,
                        "Erro.",
                        "Login ou senha incorretos",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.setVisible(false);
            var job = user.getJob();
            switch (job) {
                case Clerk: {
                    var mainMenu = new FrClerkFunction();
                    mainMenu.show();
                    break;
                }
                case Manager: {
                    var mainMenu = new FrManagerFunction();
                    mainMenu.show();
                    break;
                }
                case Admin: {
                    break;
                }
                case Groundkeeper: {
                    var mainMenu = new FrGroundskeeper();
                    mainMenu.show();
                    break;
                }
                case Servicer: {
                    var mainMenu = new FrServicerFunction();
                    mainMenu.show();
                    break;
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,
                    "Usuário não encontrado" + e.getMessage(),
                    "Erro..",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EdtCpf;
    private javax.swing.JTextField EdtPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
