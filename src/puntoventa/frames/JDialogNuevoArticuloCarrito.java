/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import java.awt.event.WindowEvent;
import javax.persistence.EntityManager;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import puntodeventa.sql.PuntoventaEmpresa;
import puntodeventa.sql.PuntoventaProducto;

/**
 *
 * @author SERVIDOR-PC
 */
public class JDialogNuevoArticuloCarrito extends javax.swing.JDialog {

    /**
     * Creates new form JDialogNuevoArticuloCarrito
     * @param parent
     * @param modal
     */
    public JDialogNuevoArticuloCarrito(java.awt.Frame parent, boolean modal) {
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

        nombreProductoJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidadJSpinner = new javax.swing.JSpinner();
        totalJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aceptarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        precioJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        nombreProductoJTextField.setEditable(false);
        nombreProductoJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Producto:");

        buscarJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscarJButton.setText("Buscar");
        buscarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresar nuevo artículo a carrito");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        cantidadJSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, null, 1.0d));
        cantidadJSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadJSpinnerStateChanged(evt);
            }
        });

        totalJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalJTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Total:");

        aceptarJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aceptarJButton.setText("Aceptar");
        aceptarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarJButtonActionPerformed(evt);
            }
        });

        cancelarJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelarJButton.setText("Cancelar");
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });

        precioJTextField.setEditable(false);
        precioJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioJTextField)
                            .addComponent(nombreProductoJTextField)
                            .addComponent(cantidadJSpinner)
                            .addComponent(totalJTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreProductoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(totalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aceptarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJButtonActionPerformed
        
        JDialogBuscarProducto buscarProducto = new JDialogBuscarProducto((JFrame)this.getParent(), true);
        buscarProducto.setLocationRelativeTo(this);
        buscarProducto.setEm(em);
        buscarProducto.setEmpresa(getEmpresa());
        buscarProducto.setVisible(true);
        buscarProducto.setDefaultCloseOperation( JDialog.HIDE_ON_CLOSE );
        
        if ( !buscarProducto.isCancelado() ) {
            
            producto = buscarProducto.getProducto();
            nombreProductoJTextField.setText( producto.getNombreProducto() );
            precioJTextField.setText( producto.getPrecioVenta().toString() );
            
            Double cantidadTmp = (Double)cantidadJSpinner.getValue();
            Double totalTmp = cantidadTmp * producto.getPrecioVenta();
            
            totalJTextField.setText( String.valueOf(totalTmp) );
        }
    }//GEN-LAST:event_buscarJButtonActionPerformed

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
       
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        cancelado = true;
    }//GEN-LAST:event_formWindowClosing

    private void cantidadJSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadJSpinnerStateChanged
        
        Double cantidadTmp = (Double)cantidadJSpinner.getValue();
        Double precioTmp = Double.parseDouble(precioJTextField.getText());
        Double totalTmp = cantidadTmp * precioTmp;
        totalJTextField.setText(String.valueOf(totalTmp));
    }//GEN-LAST:event_cantidadJSpinnerStateChanged

    private void aceptarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarJButtonActionPerformed
        
        if ( valida() ) {
            
            setCantidad((Double)cantidadJSpinner.getValue());
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            cancelado = false;
        }
    }//GEN-LAST:event_aceptarJButtonActionPerformed

    private void totalJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalJTextFieldActionPerformed
        
        Double totalTmp = Double.parseDouble(totalJTextField.getText());
        Double precioTmp = Double.parseDouble(precioJTextField.getText());
        Double cantidadTmp = (1 / precioTmp ) * totalTmp;
        cantidadJSpinner.setValue(cantidadTmp);
    }//GEN-LAST:event_totalJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogNuevoArticuloCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoArticuloCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoArticuloCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoArticuloCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogNuevoArticuloCarrito dialog = new JDialogNuevoArticuloCarrito(new javax.swing.JFrame(), true);
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
    
    // Custom methods
    private boolean valida() {
        
        boolean pasaValidacion = true;
        
        if ( nombreProductoJTextField.getText().equals("") ) {
            
            JOptionPane.showMessageDialog(this, "No se han ingresado todos los valores. Favor de verificar.");
            pasaValidacion = false;
        }
        
        return pasaValidacion;
    }
    
    // Custom variables
    private PuntoventaProducto producto;
    private PuntoventaEmpresa empresa;
    private boolean modoEdicion;
    private boolean cancelado;
    private Double cantidad;
    private double total;
    private EntityManager em;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarJButton;
    private javax.swing.JButton buscarJButton;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JSpinner cantidadJSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreProductoJTextField;
    private javax.swing.JTextField precioJTextField;
    private javax.swing.JTextField totalJTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the producto
     */
    public PuntoventaProducto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(PuntoventaProducto producto) {
        this.producto = producto;
        
        nombreProductoJTextField.setText( producto.getNombreProducto() );
        precioJTextField.setText( String.valueOf( producto.getPrecioVenta() ) );
        buscarJButton.setEnabled(false);
    }

    /**
     * @param modoEdicion the modoEdicion to set
     */
    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    /**
     * @return the cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * @return the cantidad
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
        
        cantidadJSpinner.setValue( cantidad );
        totalJTextField.setText( String.format("%f",cantidad * producto.getPrecioVenta() ) );
    }

    /**
     * @return the empresa
     */
    public PuntoventaEmpresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(PuntoventaEmpresa empresa) {
        this.empresa = empresa;
    }
}
