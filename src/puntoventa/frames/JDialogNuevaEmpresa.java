/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import java.awt.event.WindowEvent;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import puntodeventa.sql.PuntoventaEmpresa;

/**
 *
 * @author asus
 */
public class JDialogNuevaEmpresa extends javax.swing.JDialog {

    /**
     * Creates new form JDialogNuevaEmpresa
     *
     * @param parent
     * @param modal
     */
    public JDialogNuevaEmpresa(java.awt.Frame parent, boolean modal) {
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

        jTextFieldNENombreEmpresa = new javax.swing.JTextField();
        jTextFieldNombreEmpresa = new javax.swing.JTextField();
        jTextFieldNENombreCorto = new javax.swing.JTextField();
        jTextFieldNERFC = new javax.swing.JTextField();
        jTextFieldRFC = new javax.swing.JTextField();
        jTextFieldNETelefono = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldPaginaWeb = new javax.swing.JTextField();
        jTextFieldNEPaginaWeb = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jTextFieldNEDireccion = new javax.swing.JTextField();
        jTextFieldNombreCorto = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVA EMPRESA");
        setResizable(false);

        jTextFieldNENombreEmpresa.setEditable(false);
        jTextFieldNENombreEmpresa.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNENombreEmpresa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNENombreEmpresa.setText("NOMBRE EMPRESA");

        jTextFieldNombreEmpresa.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNENombreCorto.setEditable(false);
        jTextFieldNENombreCorto.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNENombreCorto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNENombreCorto.setText("NOMBRE CORTO");

        jTextFieldNERFC.setEditable(false);
        jTextFieldNERFC.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNERFC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNERFC.setText("RFC");

        jTextFieldRFC.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNETelefono.setEditable(false);
        jTextFieldNETelefono.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNETelefono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNETelefono.setText("TELEFONO");

        jTextFieldTelefono.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldPaginaWeb.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNEPaginaWeb.setEditable(false);
        jTextFieldNEPaginaWeb.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEPaginaWeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEPaginaWeb.setText("PAGINA WEB");

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAceptar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jTextFieldNEDireccion.setEditable(false);
        jTextFieldNEDireccion.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEDireccion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEDireccion.setText("DIRECCION");

        jTextFieldNombreCorto.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldDireccion.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNENombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombreEmpresa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNERFC, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRFC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNETelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefono))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNEPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPaginaWeb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 320, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNEDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNENombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombreCorto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNENombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNENombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNEDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNERFC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNETelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNEPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        this.setCancelado(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        String nombreEmpresa = jTextFieldNombreEmpresa.getText();
        String nombreCorto = jTextFieldNombreCorto.getText();
        String direccion = jTextFieldDireccion.getText();
        String rfc = jTextFieldRFC.getText();
        String telefono = jTextFieldTelefono.getText();
        String paginaWeb = jTextFieldPaginaWeb.getText();
        
        if (valdiarDatos(nombreEmpresa, nombreCorto, direccion, rfc, telefono, paginaWeb)) {

            if (!isModoEdicion()) {
                boolean empresaCreada = crearNuevaEmpresa(nombreEmpresa, nombreCorto, direccion, rfc, telefono, paginaWeb);
                if (empresaCreada) {

                    JOptionPane.showMessageDialog(this, "¡La empresa fue creada exitosamente!.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    this.setCancelado(false);
                } else {

                    JOptionPane.showMessageDialog(this, "Sucedió un error al crear la empresa, Intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                boolean resultado = modificarEmpresa(nombreEmpresa, nombreCorto, direccion, rfc, telefono, paginaWeb, this.empresa);
                if (resultado) {

                    JOptionPane.showMessageDialog(this, "¡La empresa fue modificada exitosamente!.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    this.setCancelado(false);
                } else {

                    JOptionPane.showMessageDialog(this, "Sucedió un error al modificar la empresa, Intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {

            JOptionPane.showMessageDialog(this, "Por favor llene los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogNuevaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogNuevaEmpresa dialog = new JDialogNuevaEmpresa(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNEDireccion;
    private javax.swing.JTextField jTextFieldNENombreCorto;
    private javax.swing.JTextField jTextFieldNENombreEmpresa;
    private javax.swing.JTextField jTextFieldNEPaginaWeb;
    private javax.swing.JTextField jTextFieldNERFC;
    private javax.swing.JTextField jTextFieldNETelefono;
    private javax.swing.JTextField jTextFieldNombreCorto;
    private javax.swing.JTextField jTextFieldNombreEmpresa;
    private javax.swing.JTextField jTextFieldPaginaWeb;
    private javax.swing.JTextField jTextFieldRFC;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    private boolean cancelado;
    private boolean modoEdicion;
    private PuntoventaEmpresa empresa;
    private EntityManager em;

    private boolean crearNuevaEmpresa(String nombreEmpresa, String nombreCorto, String direccion, String rfc, String telefono, String paginaWeb) {

        try {
            em.getTransaction().begin();

            PuntoventaEmpresa nuevaEmpresa = new PuntoventaEmpresa();

            nuevaEmpresa.setNombreEmpresa(nombreEmpresa);
            nuevaEmpresa.setNombreCorto(nombreCorto);
            nuevaEmpresa.setDireccion(direccion);
            nuevaEmpresa.setRfc(rfc);
            nuevaEmpresa.setTelefono(telefono);
            nuevaEmpresa.setPaginaWeb(paginaWeb);

            em.persist(nuevaEmpresa);
            em.getTransaction().commit();

            return true;
        } catch (Exception exception) {

            System.out.println(exception.getMessage());

            try {

                em.getTransaction().rollback();
            } catch (Exception exception1) {

                System.out.println("No es posible hacer rollback en este punto");
            }
            return false;
        }

    }

    private boolean modificarEmpresa(String nombreEmpresa, String nombreCorto, String direccion, String rfc, String telefono, String paginaWeb, PuntoventaEmpresa empresa) {

        try {
            em.getTransaction().begin();

            empresa.setNombreEmpresa(nombreEmpresa);
            empresa.setNombreCorto(nombreCorto);
            empresa.setDireccion(direccion);
            empresa.setRfc(rfc);
            empresa.setTelefono(telefono);
            empresa.setPaginaWeb(paginaWeb);

            em.persist(empresa);
            em.getTransaction().commit();
            return true;
        } catch (Exception exception) {

            System.out.println(exception.getMessage());
            try {

                em.getTransaction().rollback();
            } catch (Exception exception1) {

                System.out.println("No es posible hacer rollback en este punto");
            }
            return false;
        }
    }

    public boolean validarPassword(String pass, String passConfirm) {

        return pass.equals(passConfirm);
    }

    private boolean valdiarDatos(String nombreEmpresa, String nombreCorto, String direccion, String rfc, String telefono, String paginaWeb) {

        return !(nombreEmpresa.equals("")
                | nombreCorto.equals("")
                | direccion.equals("")
                | rfc.equals(""));
    }

    /**
     * @return the cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * @param cancelado the cancelado to set
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    /**
     * @return the usuario
     */
    public PuntoventaEmpresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa
     */
    public void setEmpresa(PuntoventaEmpresa empresa) {
        this.empresa = empresa;
        this.jTextFieldNombreEmpresa.setText(empresa.getNombreEmpresa());
        this.jTextFieldNombreCorto.setText(empresa.getNombreCorto());
        this.jTextFieldDireccion.setText(empresa.getDireccion());
        this.jTextFieldRFC.setText(empresa.getRfc());
        this.jTextFieldTelefono.setText(empresa.getTelefono());
        this.jTextFieldPaginaWeb.setText(empresa.getRfc());
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the modoEdicion
     */
    public boolean isModoEdicion() {
        return modoEdicion;
    }

    /**
     * @param modoEdicion the modoEdicion to set
     */
    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

}
