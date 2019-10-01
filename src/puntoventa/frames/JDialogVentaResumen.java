/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author SERVIDOR-PC
 */
public class JDialogVentaResumen extends javax.swing.JDialog {

    /**
     * Creates new form JDialogVentaResumen
     */
    public JDialogVentaResumen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalJTextField = new javax.swing.JTextField();
        pagoJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cambioJTextField = new javax.swing.JTextField();
        cancelarJButton = new javax.swing.JButton();
        aceptarJButton = new javax.swing.JButton();
        imprimirTicketJCheckBox = new javax.swing.JCheckBox();
        fechaCompraJSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Fecha/Hora de Venta:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Total:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Pago del Cliente:");

        totalJTextField.setEditable(false);
        totalJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalJTextField.setToolTipText("");

        pagoJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pagoJTextField.setToolTipText("");
        pagoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoJTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cambio:");

        cambioJTextField.setEditable(false);
        cambioJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cambioJTextField.setToolTipText("");

        cancelarJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelarJButton.setText("Cancelar");
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });

        aceptarJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aceptarJButton.setText("Aceptar");
        aceptarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarJButtonActionPerformed(evt);
            }
        });

        imprimirTicketJCheckBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        imprimirTicketJCheckBox.setText("Imprimir ticket");

        fechaCompraJSpinner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fechaCompraJSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imprimirTicketJCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalJTextField)
                            .addComponent(pagoJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(cambioJTextField)
                            .addComponent(fechaCompraJSpinner))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaCompraJSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalJTextField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pagoJTextField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cambioJTextField)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(aceptarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imprimirTicketJCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
       
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        compraCancelada = true;
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        compraCancelada = true;
    }//GEN-LAST:event_formWindowClosing

    private void aceptarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarJButtonActionPerformed
        
        if ( validar() ) {
            
            setPagoCompra( Double.parseDouble(pagoJTextField.getText()) );
            setCambioCompra(getPagoCompra()  - totalCompra);
            setFechaCompra( (Date) fechaCompraJSpinner.getValue());
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            compraCancelada = false;
            if ( imprimirTicketJCheckBox.isSelected() ) {
                imprimeTicket = true;
            }
        }
        
        
    }//GEN-LAST:event_aceptarJButtonActionPerformed

    private void pagoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoJTextFieldActionPerformed
       
        if ( validar() ) {
            
            setPagoCompra( Double.parseDouble(pagoJTextField.getText()) );
            setCambioCompra(getPagoCompra()  - totalCompra);
        }
    }//GEN-LAST:event_pagoJTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDialogVentaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogVentaResumen dialog = new JDialogVentaResumen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    //Custom methods
    private boolean validar() {
        
        
        String pagoTexto = pagoJTextField.getText();
        
        
        try {
        double pagoDouble = Double.parseDouble( pagoTexto );

        if ( pagoDouble < totalCompra )
        {
            
            JOptionPane.showMessageDialog(this, "El pago debe ser mayor al total de la compra. Favor de verificar");
            return false;
                    }
        }
        
        catch ( NumberFormatException numberFormatException ) {
            
            JOptionPane.showMessageDialog(this, "Solo se permiten ingresar números. Favor de verificar");
            pagoJTextField.setText("");
            return false;
        }
        
        return true;
    }
    
    //Custom variables
    private Date fechaCompra;
    private double totalCompra;
    private double pagoCompra;
    private double cambioCompra;
    private boolean compraCancelada;
    private boolean imprimeTicket;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarJButton;
    private javax.swing.JTextField cambioJTextField;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JSpinner fechaCompraJSpinner;
    private javax.swing.JCheckBox imprimirTicketJCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pagoJTextField;
    private javax.swing.JTextField totalJTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fechaCompra
     */
    public Date getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @return the totalCompra
     */
    public double getTotalCompra() {
        return totalCompra;
    }

    /**
     * @param totalCompra the totalCompra to set
     */
    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
        totalJTextField.setText( String.valueOf(totalCompra) );
    }

    /**
     * @return the pagoCompra
     */
    public double getPagoCompra() {
        return pagoCompra;
    }

    /**
     * @return the cambioCompra
     */
    public double getCambioCompra() {
        return cambioCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(Date fechaCompra) {
        System.out.println("---->setFechaCompra");
        this.fechaCompra = fechaCompra;
        
    }

    /**
     * @return the compraCancelada
     */
    public boolean isCompraCancelada() {
        return compraCancelada;
    }

    /**
     * @param cambioCompra the cambioCompra to set
     */
    public void setCambioCompra(double cambioCompra) {
        this.cambioCompra = cambioCompra;
        cambioJTextField.setText(String.valueOf(cambioCompra));
    }

    /**
     * @param pagoCompra the pagoCompra to set
     */
    public void setPagoCompra(double pagoCompra) {
        this.pagoCompra = pagoCompra;
    }

    /**
     * @return the imprimeTicket
     */
    public boolean isImprimeTicket() {
        return imprimeTicket;
    }
}
