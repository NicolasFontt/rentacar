package vista;

import javax.swing.JOptionPane;

public class Arriendo extends javax.swing.JFrame {

    public Arriendo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        lblIDarriendo = new javax.swing.JLabel();
        lblIDvehiculo = new javax.swing.JLabel();
        lblIDcliente = new javax.swing.JLabel();
        lblfechainicio = new javax.swing.JLabel();
        lblmantenimiento = new javax.swing.JLabel();
        txtidarriendo = new javax.swing.JTextField();
        txtidvehiculo = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtfechainicio = new javax.swing.JTextField();
        txtmantenimiento = new javax.swing.JTextField();
        lblfechafinal = new javax.swing.JLabel();
        txtfechafin = new javax.swing.JTextField();
        lblkilometrajeini = new javax.swing.JLabel();
        txtkilometrajeinicio = new javax.swing.JTextField();
        lblvalorarr = new javax.swing.JLabel();
        txtvalorarriendo = new javax.swing.JTextField();
        lblMulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblkilomefinal = new javax.swing.JLabel();
        txtkilometrajefin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arriendo de Vehiculos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Arriendo de vehiculos ");

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lblIDarriendo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIDarriendo.setText("Arriendo");

        lblIDvehiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIDvehiculo.setText("Vehiculo");

        lblIDcliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIDcliente.setText("Cliente");

        lblfechainicio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfechainicio.setText("Fecha Inicial");

        lblmantenimiento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblmantenimiento.setText("Mantenimiento");

        txtidarriendo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtidarriendo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidarriendoKeyTyped(evt);
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

        txtfechainicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechainicioKeyTyped(evt);
            }
        });

        txtmantenimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmantenimientoKeyTyped(evt);
            }
        });

        lblfechafinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfechafinal.setText("Fecha Final");

        txtfechafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechafinActionPerformed(evt);
            }
        });
        txtfechafin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechafinKeyTyped(evt);
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

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblkilomefinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblkilomefinal.setText("Kms Finales");

        txtkilometrajefin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkilometrajefinKeyTyped(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDcliente)
                    .addComponent(lblIDarriendo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDvehiculo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidvehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(txtidarriendo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(txtidcliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechainicio)
                    .addComponent(lblfechafinal))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblmantenimiento)
                        .addGap(18, 18, 18)
                        .addComponent(txtmantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblkilometrajeini)
                                            .addComponent(lblvalorarr))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtvalorarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMulta)
                                        .addGap(35, 35, 35)))
                                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmodificar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtkilometrajeinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblkilomefinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkilometrajefin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDarriendo)
                            .addComponent(txtidarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDvehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDcliente))
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
                                .addComponent(txtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        MUsuario mu=new MUsuario();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtidvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidvehiculoActionPerformed
    
    }//GEN-LAST:event_txtidvehiculoActionPerformed

    private void txtMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultaActionPerformed
       
    }//GEN-LAST:event_txtMultaActionPerformed

    private void txtfechafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechafinActionPerformed
        
    }//GEN-LAST:event_txtfechafinActionPerformed

    private void txtidarriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidarriendoKeyTyped
       
                        
    }//GEN-LAST:event_txtidarriendoKeyTyped

    private void txtkilometrajeinicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkilometrajeinicioKeyTyped
      
    }//GEN-LAST:event_txtkilometrajeinicioKeyTyped

    private void txtkilometrajeinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkilometrajeinicioActionPerformed
       
    }//GEN-LAST:event_txtkilometrajeinicioActionPerformed

    private void txtidclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidclienteKeyTyped
    
                
    }//GEN-LAST:event_txtidclienteKeyTyped

    private void txtfechainicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechainicioKeyTyped
 
    }//GEN-LAST:event_txtfechainicioKeyTyped

    private void txtfechafinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechafinKeyTyped
       
                
    }//GEN-LAST:event_txtfechafinKeyTyped

    private void txtkilometrajefinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkilometrajefinKeyTyped
      
                
    }//GEN-LAST:event_txtkilometrajefinKeyTyped

    private void txtvalorarriendoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorarriendoKeyTyped
        
                
    }//GEN-LAST:event_txtvalorarriendoKeyTyped

    private void txtMultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMultaKeyTyped
      
                
    }//GEN-LAST:event_txtMultaKeyTyped

    private void txtidvehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidvehiculoKeyTyped
      
                
    }//GEN-LAST:event_txtidvehiculoKeyTyped

    private void txtmantenimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmantenimientoKeyTyped
      
       
    }//GEN-LAST:event_txtmantenimientoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarActionPerformed
     
   
    

                             

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
            java.util.logging.Logger.getLogger(Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arriendo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblIDarriendo;
    private javax.swing.JLabel lblIDcliente;
    private javax.swing.JLabel lblIDvehiculo;
    private javax.swing.JLabel lblMulta;
    private javax.swing.JLabel lblfechafinal;
    private javax.swing.JLabel lblfechainicio;
    private javax.swing.JLabel lblkilomefinal;
    private javax.swing.JLabel lblkilometrajeini;
    private javax.swing.JLabel lblmantenimiento;
    private javax.swing.JLabel lblvalorarr;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtfechafin;
    private javax.swing.JTextField txtfechainicio;
    private javax.swing.JTextField txtidarriendo;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidvehiculo;
    private javax.swing.JTextField txtkilometrajefin;
    private javax.swing.JTextField txtkilometrajeinicio;
    private javax.swing.JTextField txtmantenimiento;
    private javax.swing.JTextField txtvalorarriendo;
    // End of variables declaration//GEN-END:variables
}
