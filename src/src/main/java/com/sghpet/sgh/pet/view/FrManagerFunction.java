package com.sghpet.sgh.pet.view;

public class FrManagerFunction extends javax.swing.JFrame {

    public FrManagerFunction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePayment = new javax.swing.JTable();
        btnGenerate = new javax.swing.JButton();
        lblListPayment = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        bxAccommodationType = new javax.swing.JComboBox<>();
        lblStartDate = new javax.swing.JLabel();
        fEdtStartDate = new javax.swing.JFormattedTextField();
        lblEndDate = new javax.swing.JLabel();
        fEdtEndDate = new javax.swing.JFormattedTextField();
        lblAccommodationType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Gerente");
        lblMenu.setToolTipText("");

        JTablePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Integer(1),  new Float(99.9), "PIX",  new Integer(1)},
                { new Integer(2),  new Integer(2),  new Float(67.5), "Credito", null}
            },
            new String [] {
                "ID", "Reserva(ID)", "Preço", "Método", "Parcelado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTablePayment.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTablePayment);
        JTablePayment.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnGenerate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerate.setText("Gerar Relatório");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        lblListPayment.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListPayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListPayment.setText("Lista de Pagamentos");
        lblListPayment.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        bxAccommodationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Econômico", "Luxo", "Super luxo" }));
        bxAccommodationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxAccommodationTypeActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblStartDate.setText("Data Início:");

        lblEndDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblEndDate.setText("Data Fim:");

        lblAccommodationType.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblAccommodationType.setText("Tipo de Acomodação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAccommodationType, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bxAccommodationType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fEdtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fEdtStartDate)))
                            .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(fEdtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDate)
                    .addComponent(fEdtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccommodationType)
                    .addComponent(bxAccommodationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void bxAccommodationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxAccommodationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxAccommodationTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablePayment;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JComboBox<String> bxAccommodationType;
    private javax.swing.JFormattedTextField fEdtEndDate;
    private javax.swing.JFormattedTextField fEdtStartDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccommodationType;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblListPayment;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblStartDate;
    // End of variables declaration//GEN-END:variables
}
