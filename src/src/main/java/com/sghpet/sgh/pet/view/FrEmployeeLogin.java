package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.model.Employee;
import static com.sghpet.sgh.pet.model.EmployeeType.Admin;
import static com.sghpet.sgh.pet.model.EmployeeType.Clerk;
import static com.sghpet.sgh.pet.model.EmployeeType.Groundkeeper;
import static com.sghpet.sgh.pet.model.EmployeeType.Manager;
import static com.sghpet.sgh.pet.model.EmployeeType.Servicer;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.jboss.logging.Logger;

public class FrEmployeeLogin extends javax.swing.JFrame {

    protected EmployeeController contr;

    public FrEmployeeLogin() {
        this.contr = EmployeeController.getEmployeeController();
        this.initComponents();

        addMaskToFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        lblMain = new javax.swing.JLabel();
        fEdtLogin = new javax.swing.JFormattedTextField();
        edtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCpf.setText("CPF:");

        lblPassword.setText("Senha:");

        btnEnter.setText("ENTRAR");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        lblMain.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fEdtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(edtPassword))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMain)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(fEdtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        var cpf = fEdtLogin.getText();
        var password = edtPassword.getText();
        Employee user;
        try {
            System.out.println(cpf);
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
            this.setVisible(false);
            edtPassword.setText("");
            fEdtLogin.setText("");
            switch (job) {
                case Clerk -> {
                    var mainMenu = new FrClerkFunction(this);
                    mainMenu.show();
                }
                case Manager -> {
                    var mainMenu = new FrManagerFunction(this);
                    mainMenu.show();
                }
                case Admin -> {
                    var mainMenu = new FrAdminFunction(false, this);
                    mainMenu.show();
                }
                case Groundkeeper -> {
                    var mainMenu = new FrGroundskeeperFunction(this);
                    mainMenu.show();
                }
                case Servicer -> {
                    var mainMenu = new FrServicerFunction(this);
                    mainMenu.show();
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,
                    "Usuário não encontrado" + e.getMessage(),
                    "Erro..",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JFormattedTextField fEdtLogin;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblPassword;
    // End of variables declaration//GEN-END:variables

    private void addMaskToFields() {
        try {
            MaskFormatter maskLogin = new MaskFormatter("###.###.###-##");
            maskLogin.install(fEdtLogin);

        } catch (ParseException e) {
            Logger.getLogger(FrAnimalRegister.class.getName()).log(Logger.Level.ERROR, null, e);
        }
    }
}
