package vista;

import javax.swing.JOptionPane;

public class ArriendoAD extends javax.swing.JFrame {

    public ArriendoAD() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblmantenimiento = new javax.swing.JLabel();
        txt_id_arriendo = new javax.swing.JTextField();
        txtidvehiculo = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txt_fecha_inicial = new javax.swing.JTextField();
        txtmantenimiento = new javax.swing.JTextField();
        lblfechafinal = new javax.swing.JLabel();
        txt_fecha_final = new javax.swing.JTextField();
        lblkilometrajeini = new javax.swing.JLabel();
        txtkilometrajeinicio = new javax.swing.JTextField();
        lblvalorarr = new javax.swing.JLabel();
        txtvalorarriendo = new javax.swing.JTextField();
        lblMulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblkilomefinal = new javax.swing.JLabel();
        lblIDarriendo = new javax.swing.JLabel();
        txtkilometrajefin = new javax.swing.JTextField();
        ID_vehiculo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ID_cliente = new javax.swing.JLabel();
        lblfechainicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arriendo de Vehiculos admin\n");

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lblmantenimiento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblmantenimiento.setText("Mantenimiento");

        txt_id_arriendo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txt_id_arriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_arriendoKeyTyped(evt);
            }
        });

        txtidvehiculo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtidvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidvehiculoActionPerformed(evt);
            }
        });
        txtidvehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidvehiculoKeyTyped(evt);
            }
        });

        txtidcliente.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtidcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidclienteKeyTyped(evt);
            }
        });

        txt_fecha_inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_inicialKeyTyped(evt);
            }
        });

        txtmantenimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmantenimientoKeyTyped(evt);
            }
        });

        lblfechafinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfechafinal.setText("Fecha Final");

        txt_fecha_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_finalActionPerformed(evt);
            }
        });
        txt_fecha_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fecha_finalKeyTyped(evt);
            }
        });

        lblkilometrajeini.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblkilometrajeini.setText("Kms Iniciales");

        txtkilometrajeinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkilometrajeinicioActionPerformed(evt);
            }
        });
        txtkilometrajeinicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkilometrajeinicioKeyTyped(evt);
            }
        });

        lblvalorarr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblvalorarr.setText("Valor arriendo");

        txtvalorarriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalorarriendoKeyTyped(evt);
            }
        });

        lblMulta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMulta.setText("Multa");

        txtMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultaActionPerformed(evt);
            }
        });
        txtMulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMultaKeyTyped(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Arriendo de vehiculos ");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblkilomefinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblkilomefinal.setText("Kms Finales");

        lblIDarriendo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIDarriendo.setText("Arriendo");

        txtkilometrajefin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkilometrajefinKeyTyped(evt);
            }
        });

        ID_vehiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ID_vehiculo.setText("Vehiculo");

        ID_cliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ID_cliente.setText("Cliente");

        lblfechainicio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfechainicio.setText("Fecha Inicial");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(ADMIN)");

        btn_consultar.setText("Consultar");

        btn_limpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultar)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminar)))
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ID_cliente)
                                .addComponent(lblIDarriendo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ID_vehiculo, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtidvehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(txt_id_arriendo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(txtidcliente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblfechainicio)
                                .addComponent(lblfechafinal))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addComponent(lblmantenimiento)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtmantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(lblkilometrajeini)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtkilometrajeinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblkilomefinal)
                                    .addGap(81, 81, 81)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblvalorarr)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtvalorarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(261, 261, 261))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMulta)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtkilometrajefin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(104, 104, 104)))
                    .addGap(14, 14, 14)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnmodificar)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btn_limpiar))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIDarriendo)
                                .addComponent(txt_id_arriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtidvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ID_vehiculo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ID_cliente))
                            .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(lblfechafinal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblfechainicio)
                                        .addGap(67, 67, 67)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblmantenimiento)
                        .addComponent(txtmantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblkilomefinal)
                        .addComponent(txtkilometrajefin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtkilometrajeinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblkilometrajeini))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMulta)
                        .addComponent(lblvalorarr)
                        .addComponent(txtvalorarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Menup m=new Menup();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txt_id_arriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_arriendoKeyTyped

    }//GEN-LAST:event_txt_id_arriendoKeyTyped

    private void txtidvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidvehiculoActionPerformed
       
    }//GEN-LAST:event_txtidvehiculoActionPerformed

    private void txtidvehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidvehiculoKeyTyped

    }//GEN-LAST:event_txtidvehiculoKeyTyped

    private void txtidclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidclienteKeyTyped

    }//GEN-LAST:event_txtidclienteKeyTyped

    private void txt_fecha_inicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_inicialKeyTyped

    }//GEN-LAST:event_txt_fecha_inicialKeyTyped

    private void txtmantenimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmantenimientoKeyTyped

    }//GEN-LAST:event_txtmantenimientoKeyTyped

    private void txt_fecha_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_finalActionPerformed
        
    }//GEN-LAST:event_txt_fecha_finalActionPerformed

    private void txt_fecha_finalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_finalKeyTyped

    }//GEN-LAST:event_txt_fecha_finalKeyTyped

    private void txtkilometrajeinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkilometrajeinicioActionPerformed
    
    }//GEN-LAST:event_txtkilometrajeinicioActionPerformed

    private void txtkilometrajeinicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkilometrajeinicioKeyTyped

    }//GEN-LAST:event_txtkilometrajeinicioKeyTyped

    private void txtvalorarriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorarriendoKeyTyped

    }//GEN-LAST:event_txtvalorarriendoKeyTyped

    private void txtMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultaActionPerformed
        
    }//GEN-LAST:event_txtMultaActionPerformed

    private void txtMultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMultaKeyTyped

    }//GEN-LAST:event_txtMultaKeyTyped

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtkilometrajefinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkilometrajefinKeyTyped

    }//GEN-LAST:event_txtkilometrajefinKeyTyped

    
                 
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArriendoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArriendoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArriendoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArriendoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArriendoAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_cliente;
    private javax.swing.JLabel ID_vehiculo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIDarriendo;
    private javax.swing.JLabel lblMulta;
    private javax.swing.JLabel lblfechafinal;
    private javax.swing.JLabel lblfechainicio;
    private javax.swing.JLabel lblkilomefinal;
    private javax.swing.JLabel lblkilometrajeini;
    private javax.swing.JLabel lblmantenimiento;
    private javax.swing.JLabel lblvalorarr;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txt_fecha_final;
    private javax.swing.JTextField txt_fecha_inicial;
    private javax.swing.JTextField txt_id_arriendo;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidvehiculo;
    private javax.swing.JTextField txtkilometrajefin;
    private javax.swing.JTextField txtkilometrajeinicio;
    private javax.swing.JTextField txtmantenimiento;
    private javax.swing.JTextField txtvalorarriendo;
    // End of variables declaration//GEN-END:variables
}
