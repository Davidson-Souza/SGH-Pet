package com.sghpet.sgh.pet.view;

public class FrClerkFunction extends javax.swing.JFrame {

    public FrClerkFunction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableService = new javax.swing.JTable();
        lblListServices = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAnimalRegister = new javax.swing.JButton();
        btnReservationRegister = new javax.swing.JButton();
        btnClientRegister = new javax.swing.JButton();
        btnMakePayment = new javax.swing.JButton();
        lblListAccommodation = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAccommodation = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Atendente");
        lblMenu.setToolTipText("");

        JTableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Spa",  new Float(50.0), "Banheira aquecida, massagem, etc.", null},
                {"Banho",  new Float(30.0), "Banhos diários", "2x por dia"},
                {"Tosa",  new Float(20.0), "Reduzir pelagem", "1x por estadia"},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Preço", "Descrição", "Infos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableService.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableService);
        JTableService.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lblListServices.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListServices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListServices.setText("Lista de Serviços");
        lblListServices.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAnimalRegister.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAnimalRegister.setText("Gerenciar Animais");
        btnAnimalRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalRegisterActionPerformed(evt);
            }
        });

        btnReservationRegister.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnReservationRegister.setText("Gerenciar Reservas");
        btnReservationRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationRegisterActionPerformed(evt);
            }
        });

        btnClientRegister.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnClientRegister.setText("Gerenciar Clientes");
        btnClientRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientRegisterActionPerformed(evt);
            }
        });

        btnMakePayment.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnMakePayment.setText("Verificar Pagamento");
        btnMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymentActionPerformed(evt);
            }
        });

        lblListAccommodation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListAccommodation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListAccommodation.setText("Acomodações");
        lblListAccommodation.setToolTipText("");

        JTableAccommodation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Integer(3),  new Integer(3)},
                { new Integer(2),  new Integer(4),  new Integer(1)}
            },
            new String [] {
                "Número", "Capacidade", "Vagas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAccommodation.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(JTableAccommodation);
        JTableAccommodation.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListServices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblListAccommodation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnimalRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReservationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClientRegister)
                        .addGap(32, 32, 32)
                        .addComponent(btnMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnAnimalRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMakePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblListServices, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblListAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAnimalRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalRegisterActionPerformed
        FrAnimalRegister animalRegister = new FrAnimalRegister();
        animalRegister.show();
    }//GEN-LAST:event_btnAnimalRegisterActionPerformed

    private void btnReservationRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationRegisterActionPerformed
        FrReservationRegister reservationRegister = new FrReservationRegister(this);
        reservationRegister.show();
    }//GEN-LAST:event_btnReservationRegisterActionPerformed

    private void btnClientRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientRegisterActionPerformed
        FrCustomerRegister customerRegister = new FrCustomerRegister(this);
        customerRegister.show();
    }//GEN-LAST:event_btnClientRegisterActionPerformed

    private void btnMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakePaymentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAccommodation;
    private javax.swing.JTable JTableService;
    private javax.swing.JButton btnAnimalRegister;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClientRegister;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JButton btnReservationRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListAccommodation;
    private javax.swing.JLabel lblListServices;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
