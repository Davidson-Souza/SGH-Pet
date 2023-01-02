package com.sghpet.sgh.pet.view;

public class FrServicerFunction extends javax.swing.JFrame {

    public FrServicerFunction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAccommodation = new javax.swing.JTable();
        btnClearAccommodation = new javax.swing.JButton();
        btnSetEnable = new javax.swing.JButton();
        lblListAccommodation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Faxineira");
        lblMenu.setToolTipText("");

        JTableAccommodation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Float(180.5),  new Integer(3),  new Integer(3)},
                { new Integer(2),  new Float(200.0),  new Integer(4),  new Integer(1)},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Tamanho(m^2)", "Capacidade", "Vagas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableAccommodation);

        btnClearAccommodation.setText("Limpar Local");
        btnClearAccommodation.setEnabled(false);
        btnClearAccommodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAccommodationActionPerformed(evt);
            }
        });

        btnSetEnable.setText("Definir Disponível");
        btnSetEnable.setEnabled(false);
        btnSetEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetEnableActionPerformed(evt);
            }
        });

        lblListAccommodation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListAccommodation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListAccommodation.setText("Lista de Acomodação");
        lblListAccommodation.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addComponent(lblListAccommodation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearAccommodation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSetEnable)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(btnClearAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetEnable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblListAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearAccommodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAccommodationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearAccommodationActionPerformed

    private void btnSetEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetEnableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetEnableActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAccommodation;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAccommodation;
    private javax.swing.JButton btnSetEnable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListAccommodation;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
