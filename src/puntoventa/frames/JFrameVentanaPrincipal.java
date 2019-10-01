
package puntoventa.frames;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import puntodeventa.PuntoVentaConfiguracion;
import puntodeventa.PuntoVentaPrinter;
import puntodeventa.sql.PuntoventaEmpresa;
import puntodeventa.sql.PuntoventaUsuario;

public class JFrameVentanaPrincipal extends javax.swing.JFrame {

    private EntityManager em;
    private EntityManagerFactory emf;
    private PuntoVentaConfiguracion configuracion;
    
    public JFrameVentanaPrincipal() {
        
        initComponents();
        
        //Localizar la ventana en el centro
        customInit();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productosJbutton = new javax.swing.JButton();
        categoriasJbutton = new javax.swing.JButton();
        gruposMenuJbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        resumenVentasJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ventasJbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        resumenVentasJButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        salirJButton = new javax.swing.JButton();
        configuracionJButton = new javax.swing.JButton();
        jButtonCambiarEmpresa = new javax.swing.JButton();
        JButtonLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PUNTO DE VENTA AZPTEC");
        setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        productosJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productosJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/PRODUCTO03_35.png"))); // NOI18N
        productosJbutton.setText("PRODUCTOS");
        productosJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosJbuttonActionPerformed(evt);
            }
        });

        categoriasJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        categoriasJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/CATEGORIAS03_35.png"))); // NOI18N
        categoriasJbutton.setText("CATEGORIAS");
        categoriasJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasJbuttonActionPerformed(evt);
            }
        });

        gruposMenuJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gruposMenuJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/carpetas.png"))); // NOI18N
        gruposMenuJbutton.setText("GRUPOS");
        gruposMenuJbutton.setEnabled(false);
        gruposMenuJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposMenuJbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRACION");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriasJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(productosJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gruposMenuJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriasJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gruposMenuJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        resumenVentasJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resumenVentasJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/CAJA01_35.png"))); // NOI18N
        resumenVentasJButton.setText("CORTE DE CAJA");
        resumenVentasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenVentasJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OPERACION");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ventasJbutton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ventasJbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/venta.png"))); // NOI18N
        ventasJbutton.setText("REALIZAR VENTAS");
        ventasJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumenVentasJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventasJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventasJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumenVentasJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REPORTES");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resumenVentasJButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resumenVentasJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntoventa/frames/REPORTE01_35.png"))); // NOI18N
        resumenVentasJButton1.setText("INGRESOS");
        resumenVentasJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenVentasJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(resumenVentasJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumenVentasJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        salirJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salirJButton.setText("CERRAR PUNTO DE VENTA");
        salirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJButtonActionPerformed(evt);
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

        jButtonCambiarEmpresa.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButtonCambiarEmpresa.setText("CAMBIAR EMPRESA");
        jButtonCambiarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarEmpresaActionPerformed(evt);
            }
        });

        JButtonLogout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JButtonLogout.setText("CERRAR SESIÓN");
        JButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(jButtonCambiarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configuracionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(configuracionJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButtonCambiarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(salirJButton)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonLogout)))
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PUNTO VENTA AZPTEC");
        jLabel4.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("USUARIO:");
        jLabelUsuario.setOpaque(true);

        jLabelEmpresa.setBackground(new java.awt.Color(51, 51, 51));
        jLabelEmpresa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpresa.setText("EMPRESA:");
        jLabelEmpresa.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventasJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasJbuttonActionPerformed
        
        JFrameVenta frameVenta = new JFrameVenta();
        frameVenta.setEm(em);
        frameVenta.setEmpresa(getEmpresaVenta());
        frameVenta.setUsuario(getUsuarioVenta());
        frameVenta.setLocationRelativeTo(this);
        frameVenta.setVisible(true);
        frameVenta.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        frameVenta.setTitle("VENTAS - " + getEmpresaVenta().getNombreEmpresa());
    }//GEN-LAST:event_ventasJbuttonActionPerformed

    private void categoriasJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasJbuttonActionPerformed
        
        JFrameCategoria controlCategoria = new JFrameCategoria();
        controlCategoria.setLocationRelativeTo(this);
        controlCategoria.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        controlCategoria.setEmpresa(getEmpresaVenta());
        controlCategoria.setEm(em);
        controlCategoria.inicializar();
        controlCategoria.setVisible(true);
        
        controlCategoria.setTitle("CATEGORIAS - " + getEmpresaVenta().getNombreEmpresa());
    }//GEN-LAST:event_categoriasJbuttonActionPerformed

    private void productosJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosJbuttonActionPerformed
        
        JFrameProducto controlProductos = new JFrameProducto();
        controlProductos.setLocationRelativeTo(this);
        controlProductos.setEmpresa(getEmpresaVenta());
        controlProductos.setEm(em);
        controlProductos.inicializar();
        controlProductos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        controlProductos.setVisible(true);
        
        controlProductos.setTitle("PRODUCTOS - " + getEmpresaVenta().getNombreEmpresa());
    }//GEN-LAST:event_productosJbuttonActionPerformed

    private void salirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJButtonActionPerformed
       
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_salirJButtonActionPerformed

    private void resumenVentasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenVentasJButtonActionPerformed
        
        JDialogReporteVentas reporteVentasJDialog = new JDialogReporteVentas(this, true);
        reporteVentasJDialog.setEm(em);
        reporteVentasJDialog.setEmpresa(getEmpresaVenta());
        reporteVentasJDialog.setUsuario(getUsuarioVenta());
        reporteVentasJDialog.inicializar();
        reporteVentasJDialog.setLocationRelativeTo(this);
        reporteVentasJDialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        reporteVentasJDialog.setVisible(true);
        
        reporteVentasJDialog.setTitle("REPORTE VENTAS - " + getEmpresaVenta().getNombreEmpresa());
    }//GEN-LAST:event_resumenVentasJButtonActionPerformed

    private void configuracionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionJButtonActionPerformed
        
        JDialogConfiguracion dialogoConfiguracion = new JDialogConfiguracion(this, true);
        dialogoConfiguracion.setLocationRelativeTo(this);
        dialogoConfiguracion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        dialogoConfiguracion.setConfiguracion(configuracion);
        dialogoConfiguracion.customInit();
        
        dialogoConfiguracion.setVisible(true);
    }//GEN-LAST:event_configuracionJButtonActionPerformed

    private void gruposMenuJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposMenuJbuttonActionPerformed
        
        JFrameGrupo menuGrupos = new JFrameGrupo();
        menuGrupos.setLocationRelativeTo(this);
        menuGrupos.setVisible(true);
        menuGrupos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_gruposMenuJbuttonActionPerformed

    private void resumenVentasJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenVentasJButton1ActionPerformed
        
        JDialogReporteGanancias dialogReporteGanancias = new JDialogReporteGanancias(this, true);
        dialogReporteGanancias.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialogReporteGanancias.setLocationRelativeTo(this);
        dialogReporteGanancias.setEm(em);
        dialogReporteGanancias.setEmpresa(empresaVenta);
        dialogReporteGanancias.setUsuario(usuarioVenta);
        dialogReporteGanancias.inicializar();
        dialogReporteGanancias.setVisible(true);
        
        dialogReporteGanancias.setTitle("REPORTE INGRESOS - " + getEmpresaVenta().getNombreEmpresa());
    }//GEN-LAST:event_resumenVentasJButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        JDialogLogin dialogLogin = new JDialogLogin(this, true);
        
        // Inicia login
        dialogLogin.setEm(em);
        dialogLogin.setLocationRelativeTo(this);
        dialogLogin.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogLogin.setVisible(true);
        
        if ( !dialogLogin.isCancelar() ) {

            // Si pasa se va a seleccionar empresa
            
            PuntoventaUsuario usuario = dialogLogin.getUsuario();
            
            JDialogLoginSeleccionarEmpresa loginSeleccionarEmpresa = new JDialogLoginSeleccionarEmpresa(this, true);

            loginSeleccionarEmpresa.setEm(em);
            loginSeleccionarEmpresa.setUsuario(usuario);
            loginSeleccionarEmpresa.inicializar();
            loginSeleccionarEmpresa.setLocationRelativeTo(this);
            loginSeleccionarEmpresa.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            loginSeleccionarEmpresa.setVisible(true);
            setEmpresaVenta(loginSeleccionarEmpresa.getEmpresa());
            setUsuarioVenta(loginSeleccionarEmpresa.getUsuario());
            
            setTitle(getTitle() + " - " + getEmpresaVenta().getNombreEmpresa());
            
        } else {
            
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_X) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButtonCambiarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarEmpresaActionPerformed
        
        JDialogLoginSeleccionarEmpresa loginSeleccionarEmpresa = new JDialogLoginSeleccionarEmpresa(this, true);

        loginSeleccionarEmpresa.setEm(em);
        loginSeleccionarEmpresa.setUsuario(getUsuarioVenta());
        loginSeleccionarEmpresa.inicializar();
        loginSeleccionarEmpresa.setLocationRelativeTo(this);
        loginSeleccionarEmpresa.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        loginSeleccionarEmpresa.setVisible(true);
        setEmpresaVenta(loginSeleccionarEmpresa.getEmpresa());
        setUsuarioVenta(loginSeleccionarEmpresa.getUsuario());
    }//GEN-LAST:event_jButtonCambiarEmpresaActionPerformed

    private void JButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonLogoutActionPerformed

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
    
    // Custom methods
    private  void customInit() {
        
        this.setLocationRelativeTo(null);
        configuracion = new PuntoVentaConfiguracion();
        configuracion.cargarConfiguracion();
        printer = new PuntoVentaPrinter();
        initConnection();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage( (new ImageIcon(getClass().getResource("/puntoventa/frames/LOGO-AZPTEC05.png")).getImage()));
    }
    
    private void initConnection() {
        
        String mensajeError = "";
        
        try {
            emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
            em = emf.createEntityManager();
        }
        
        catch ( Exception e ) {
            
            mensajeError = "No es posible establecer conexión con el servidor. El mensaje de error es: \n\n" + e.getMessage() ;
        }
        
        if ( mensajeError.equals("") ) {
            
            JOptionPane.showMessageDialog(this, "Bienvenido s su punto de venta");
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, mensajeError );
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
    
    // Custom variables
    private PuntoVentaPrinter printer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLogout;
    private javax.swing.JButton categoriasJbutton;
    private javax.swing.JButton configuracionJButton;
    private javax.swing.JButton gruposMenuJbutton;
    private javax.swing.JButton jButtonCambiarEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton productosJbutton;
    private javax.swing.JButton resumenVentasJButton;
    private javax.swing.JButton resumenVentasJButton1;
    private javax.swing.JButton salirJButton;
    private javax.swing.JButton ventasJbutton;
    // End of variables declaration//GEN-END:variables

    private PuntoventaUsuario usuarioVenta;
    private PuntoventaEmpresa empresaVenta;
    
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

    /**
     * @return the usuarioVenta
     */
    public PuntoventaUsuario getUsuarioVenta() {
        return usuarioVenta;
    }

    /**
     * @param usuarioVenta the usuarioVenta to set
     */
    public void setUsuarioVenta(PuntoventaUsuario usuarioVenta) {
        this.usuarioVenta = usuarioVenta;
        jLabelUsuario.setText("Bienvenido " + usuarioVenta.getIdAuthUser().getFirstName());
    }

    /**
     * @return the empresaVenta
     */
    public PuntoventaEmpresa getEmpresaVenta() {
        return empresaVenta;
    }

    /**
     * @param empresaVenta the empresaVenta to set
     */
    public void setEmpresaVenta(PuntoventaEmpresa empresaVenta) {
        this.empresaVenta = empresaVenta;
        jLabelEmpresa.setText(empresaVenta.getNombreEmpresa());
    }
    
    
}
