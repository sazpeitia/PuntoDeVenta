
package puntoventa.frames;

import java.awt.event.WindowEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import puntodeventa.PuntoVentaConfiguracion;

public class JFrameVentanaPrincipal extends javax.swing.JFrame {

    private final EntityManager em;
    private final EntityManagerFactory emf;
    private PuntoVentaConfiguracion configuracion;
    
    public JFrameVentanaPrincipal() {
        initComponents();
        
        //Localizar la ventana en el centro
        this.setLocationRelativeTo(null);
        
        emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
        em = emf.createEntityManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventasJbutton = new javax.swing.JButton();
        categoriasJbutton = new javax.swing.JButton();
        productosJbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resumenVentasJButton = new javax.swing.JButton();
        salirJButton = new javax.swing.JButton();
        resumenCorteCajaJButton = new javax.swing.JButton();
        configuracionJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PUNTO DE VENTA");
        setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        setLocationByPlatform(true);

        ventasJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ventasJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/venta.png"))); // NOI18N
        ventasJbutton.setText("VENTAS");
        ventasJbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ventasJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasJbuttonActionPerformed(evt);
            }
        });

        categoriasJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        categoriasJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/inventario.png"))); // NOI18N
        categoriasJbutton.setText("CATEGORIAS");
        categoriasJbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoriasJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasJbuttonActionPerformed(evt);
            }
        });

        productosJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productosJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/carrito.png"))); // NOI18N
        productosJbutton.setText("PRODUCTOS");
        productosJbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productosJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosJbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ventas, productos e inventario");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reportes");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resumenVentasJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resumenVentasJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/reporte.png"))); // NOI18N
        resumenVentasJButton.setText("RESUMEN VENTAS");
        resumenVentasJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resumenVentasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenVentasJButtonActionPerformed(evt);
            }
        });

        salirJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salirJButton.setText("SALIR");
        salirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJButtonActionPerformed(evt);
            }
        });

        resumenCorteCajaJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resumenCorteCajaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/reporte.png"))); // NOI18N
        resumenCorteCajaJButton.setText("RESUMEN CORTE DE CAJA");
        resumenCorteCajaJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resumenCorteCajaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenCorteCajaJButtonActionPerformed(evt);
            }
        });

        configuracionJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        configuracionJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/config.png"))); // NOI18N
        configuracionJButton.setText("CONFIGURACION");
        configuracionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Punto de Venta");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriasJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productosJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ventasJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(resumenCorteCajaJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(resumenVentasJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(configuracionJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumenVentasJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(configuracionJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ventasJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumenCorteCajaJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productosJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriasJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventasJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasJbuttonActionPerformed
        
        JFrameVenta frameVenta = new JFrameVenta();
        frameVenta.setLocationRelativeTo(this);
        frameVenta.setVisible(true);
        frameVenta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_ventasJbuttonActionPerformed

    private void categoriasJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasJbuttonActionPerformed
        
        JFrameCategoria controlCategoria = new JFrameCategoria();
        controlCategoria.setLocationRelativeTo(this);
        controlCategoria.setVisible(true);
        controlCategoria.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_categoriasJbuttonActionPerformed

    private void productosJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosJbuttonActionPerformed
        
        JFrameProducto controlProductos = new JFrameProducto();
        controlProductos.setLocationRelativeTo(this);
        controlProductos.setVisible(true);
        controlProductos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_productosJbuttonActionPerformed

    private void salirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJButtonActionPerformed
       
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_salirJButtonActionPerformed

    private void resumenVentasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenVentasJButtonActionPerformed
        
        JDialogReporteVentas reporteVentasJDialog = new JDialogReporteVentas(this, true);
        reporteVentasJDialog.setLocationRelativeTo(this);
        reporteVentasJDialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        reporteVentasJDialog.setEm(em);
        reporteVentasJDialog.setEmf(emf);
        
        reporteVentasJDialog.customInit();
        reporteVentasJDialog.setVisible(true);
    }//GEN-LAST:event_resumenVentasJButtonActionPerformed

    private void resumenCorteCajaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenCorteCajaJButtonActionPerformed
        
        JDialogReporteCorteCaja reporteCorteCajaJDialog = new JDialogReporteCorteCaja(this, true);
        reporteCorteCajaJDialog.setLocationRelativeTo(this);
        reporteCorteCajaJDialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        reporteCorteCajaJDialog.setEm(em);
        reporteCorteCajaJDialog.setEmf(emf);
        
        reporteCorteCajaJDialog.customInit();
        reporteCorteCajaJDialog.setVisible(true);
    }//GEN-LAST:event_resumenCorteCajaJButtonActionPerformed

    private void configuracionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionJButtonActionPerformed
        
        
    }//GEN-LAST:event_configuracionJButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoriasJbutton;
    private javax.swing.JButton configuracionJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton productosJbutton;
    private javax.swing.JButton resumenCorteCajaJButton;
    private javax.swing.JButton resumenVentasJButton;
    private javax.swing.JButton salirJButton;
    private javax.swing.JButton ventasJbutton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the configuracion
     */
    public PuntoVentaConfiguracion getConfiguracion() {
        return configuracion;
    }

    /**
     * @param configuracion the configuracion to set
     */
    public void setConfiguracion(PuntoVentaConfiguracion configuracion) {
        this.configuracion = configuracion;
    }
}
