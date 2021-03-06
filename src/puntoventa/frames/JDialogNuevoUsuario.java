/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import puntodeventa.sql.AuthUser;
import puntodeventa.sql.PuntoventaUsuario;

/**
 *
 * @author asus
 */
public class JDialogNuevoUsuario extends javax.swing.JDialog {

    /**
     * Creates new form JDialogNuevaEmpresa
     * @param parent
     * @param modal
     */
    public JDialogNuevoUsuario(java.awt.Frame parent, boolean modal) {
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

        jTextFieldNEUsuario = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldNEPass = new javax.swing.JTextField();
        jTextFieldNEMail = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldNENombre = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jTextFieldNEApellidoPaterno = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jTextFieldNEConfirmarPass = new javax.swing.JTextField();
        jPasswordFieldPassConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROPIEDADES USUARIO");
        setResizable(false);

        jTextFieldNEUsuario.setEditable(false);
        jTextFieldNEUsuario.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEUsuario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEUsuario.setText("NOMBRE USUARIO");

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNEPass.setEditable(false);
        jTextFieldNEPass.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEPass.setText("CONTRASEÑA");

        jTextFieldNEMail.setEditable(false);
        jTextFieldNEMail.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEMail.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEMail.setText("MAIL");

        jTextFieldMail.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNENombre.setEditable(false);
        jTextFieldNENombre.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNENombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNENombre.setText("NOMBRE");

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldApellidoPaterno.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNEApellidoPaterno.setEditable(false);
        jTextFieldNEApellidoPaterno.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEApellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEApellidoPaterno.setText("APELLIDO PATERNO");

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

        jPasswordFieldPass.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextFieldNEConfirmarPass.setEditable(false);
        jTextFieldNEConfirmarPass.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextFieldNEConfirmarPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNEConfirmarPass.setText("CONFIRMAR CONTRASEÑA");

        jPasswordFieldPassConfirm.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNEUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNEPass, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldPass))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNENombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNEApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellidoPaterno))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 320, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldNEConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldPassConfirm)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNEUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNEPass, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNEConfirmarPass)
                    .addComponent(jPasswordFieldPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNENombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNEApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        String nombreUsuario = jTextFieldUsuario.getText();
        String password = new String(jPasswordFieldPass.getPassword());
        String passwordConfirm = new String(jPasswordFieldPassConfirm.getPassword());
        String mail = jTextFieldMail.getText();
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellidoPaterno.getText();
        String direccion = "SIN DIRECCION";
        
     
        if ( valdiarDatos(nombreUsuario, password, nombre, mail, apellido, direccion) ) {
            if ( validarPassword(password, passwordConfirm) ){

                if ( !isModoEdicion() ) {
                    PuntoventaUsuario nuevoUsuario;
                    nuevoUsuario = crearNuevoUsuario(nombreUsuario, password, nombre, mail, apellido, direccion);
                    if ( nuevoUsuario != null  ) {

                        JOptionPane.showMessageDialog(this, "¡El usuario fue creado exitosamente!.","Mensaje", JOptionPane.INFORMATION_MESSAGE );
                        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                        this.setCancelado(false);
                    } else {

                        JOptionPane.showMessageDialog(this, "Sucedió un error al crear el usuario, Intente nuevamente","Error", JOptionPane.ERROR_MESSAGE );
                    }
                } else {
                    
                    boolean resultado = modificarUsuario(nombreUsuario, password, nombre, mail, apellido, direccion, this.usuario);
                    if ( resultado  ) {

                        JOptionPane.showMessageDialog(this, "¡El usuario fue modificado exitosamente!.","Mensaje", JOptionPane.INFORMATION_MESSAGE );
                        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                        this.setCancelado(false);
                    } else {

                        JOptionPane.showMessageDialog(this, "Sucedió un error al modificar el usuario, Intente nuevamente","Error", JOptionPane.ERROR_MESSAGE );
                    }
                }

            } else {

                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden, favor de rectificar.","Error", JOptionPane.ERROR_MESSAGE );
            }
        } else {
            
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos.","Error", JOptionPane.ERROR_MESSAGE );
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
            java.util.logging.Logger.getLogger(JDialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogNuevoUsuario dialog = new JDialogNuevoUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JPasswordField jPasswordFieldPassConfirm;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNEApellidoPaterno;
    private javax.swing.JTextField jTextFieldNEConfirmarPass;
    private javax.swing.JTextField jTextFieldNEMail;
    private javax.swing.JTextField jTextFieldNENombre;
    private javax.swing.JTextField jTextFieldNEPass;
    private javax.swing.JTextField jTextFieldNEUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean cancelado;
    private boolean modoEdicion;
    private PuntoventaUsuario usuario;
   private EntityManager em;

    private PuntoventaUsuario crearNuevoUsuario( String usuario, String password, String nombre, String mail, String apellidoPaterno, String direccion  ){
        
        PuntoventaUsuario nuevoUsuario;
        AuthUser nuevoUsuarioAuth;
        
        try {
            em.getTransaction().begin();
            
            nuevoUsuarioAuth = new AuthUser();
            nuevoUsuario = new PuntoventaUsuario();
            
            // Poblando campos de AuthUser
            nuevoUsuarioAuth.setUsername(usuario);
            nuevoUsuarioAuth.setPassword(password);
            nuevoUsuarioAuth.setEmail(mail);
            nuevoUsuarioAuth.setFirstName(nombre);
            nuevoUsuarioAuth.setLastName(apellidoPaterno);

            Calendar calendario = Calendar.getInstance();
            nuevoUsuarioAuth.setIsActive(true);
            nuevoUsuarioAuth.setIsStaff(false);
            nuevoUsuarioAuth.setIsSuperuser(false);
            nuevoUsuarioAuth.setDateJoined(calendario.getTime());
            
            em.persist(nuevoUsuarioAuth);
            
            nuevoUsuario.setIdAuthUser(nuevoUsuarioAuth);
            nuevoUsuario.setDireccion(direccion);
            nuevoUsuario.setUsernameDesk(usuario);
            nuevoUsuario.setPasswordDesk(password);
            
             em.persist(nuevoUsuario);
             em.getTransaction().commit();

            return nuevoUsuario;
        }
        
        catch ( Exception exception ) {
            
            System.out.println(exception.getMessage());
            nuevoUsuario = null;
            try {
                
                em.getTransaction().rollback();
            }
            catch (Exception exception1) {
                
                System.out.println("No es posible hacer rollback en este punto");
            }
        } 
        
        return nuevoUsuario;
    }
    
     private boolean modificarUsuario( String nombreUsuario, String password, String nombre, String mail, String apellidoPaterno, String direccion, PuntoventaUsuario usuario  ){
        
        try {
            em.getTransaction().begin();
            
        
            // Poblando campos de AuthUser
            usuario.getIdAuthUser().setUsername(nombreUsuario);
            usuario.getIdAuthUser().setPassword(password);
            usuario.getIdAuthUser().setEmail(mail);
            usuario.getIdAuthUser().setFirstName(nombre);
            usuario.getIdAuthUser().setLastName(apellidoPaterno);

            usuario.setDireccion(direccion);
            usuario.setUsernameDesk(nombreUsuario);
            usuario.setPasswordDesk(password);
            
             em.getTransaction().commit();
             return true;
        }
        
        catch ( Exception exception ) {
            
            System.out.println(exception.getMessage());
            try {
                
                em.getTransaction().rollback();
            }
            catch (Exception exception1) {
                
                System.out.println("No es posible hacer rollback en este punto");
            }
            return false;
        } 
    }
    
    public boolean validarPassword(String pass, String passConfirm) {
        
        return pass.equals(passConfirm);
    }
    
    private boolean valdiarDatos( String usuario, String password, String nombre, String mail, String apellidoPaterno, String direccion  ){
        
        return !(usuario.equals("") |
                password.equals("") |
                nombre.equals("") |
                mail.equals("") |
                apellidoPaterno.equals("") |
                direccion.equals(""));
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
    public PuntoventaUsuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(PuntoventaUsuario usuario) {
        this.usuario = usuario;
        this.jTextFieldUsuario.setText(usuario.getIdAuthUser().getUsername());
        this.jPasswordFieldPass.setText(usuario.getIdAuthUser().getPassword());
        this.jPasswordFieldPassConfirm.setText(usuario.getIdAuthUser().getPassword());
        this.jTextFieldMail.setText(usuario.getIdAuthUser().getEmail());
        this.jTextFieldNombre.setText(usuario.getIdAuthUser().getFirstName());
        this.jTextFieldApellidoPaterno.setText(usuario.getIdAuthUser().getLastName());
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
