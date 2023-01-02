package com.sghpet.sgh.pet.view;

public class FrAnimalCareFunction extends javax.swing.JFrame {

    public FrAnimalCareFunction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAnimal = new javax.swing.JTable();
        btnTreatAnimal = new javax.swing.JButton();
        btnBath = new javax.swing.JButton();
        lblListAnimal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCheckAnimalHealth = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Veterinário");
        lblMenu.setToolTipText("");

        JTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Luna", "Cachorro", "Grande", null,  new Integer(1), "13:00"},
                {"Bolt", "Peixe", "Pequeno", null,  new Integer(3), "12:00"},
                {"Samanta", "Gato", "Médio",  new Boolean(true),  new Integer(1), "9:00"},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Tipo", "Porte", "Condição Méd.", "Local", "Últ. Banho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableAnimal);

        btnTreatAnimal.setText("Cuidar do Animal");
        btnTreatAnimal.setEnabled(false);
        btnTreatAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatAnimalActionPerformed(evt);
            }
        });

        btnBath.setText("Dar Banho");
        btnBath.setEnabled(false);
        btnBath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBathActionPerformed(evt);
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

        btnCheckAnimalHealth.setText("Verificar Saúde");
        btnCheckAnimalHealth.setEnabled(false);
        btnCheckAnimalHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAnimalHealthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCheckAnimalHealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTreatAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBath, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblListAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCheckAnimalHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTreatAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblListAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTreatAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTreatAnimalActionPerformed

    private void btnBathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBathActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckAnimalHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAnimalHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckAnimalHealthActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAnimal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBath;
    private javax.swing.JButton btnCheckAnimalHealth;
    private javax.swing.JButton btnTreatAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListAnimal;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
