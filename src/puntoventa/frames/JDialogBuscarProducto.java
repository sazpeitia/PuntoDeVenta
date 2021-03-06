/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import puntodeventa.sql.PuntoventaEmpresa;
import puntodeventa.sql.PuntoventaImagen;
import puntodeventa.sql.PuntoventaProducto;
import puntodeventa.sql.PuntoventaProducto_;
import puntoventa.test.ImageResizer;

/**
 *
 * @author SERVIDOR-PC
 */
public class JDialogBuscarProducto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogVentaIngresarProducto
     *
     * @param parent
     */
    public JDialogBuscarProducto(java.awt.Frame parent, boolean modal) {
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

        busquedaJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductosJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        aceptarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelImage = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jTextFieldCantidadDisponible = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        busquedaJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        busquedaJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaJTextFieldActionPerformed(evt);
            }
        });

        listaProductosJList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaProductosJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProductosJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductosJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaProductosJList);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por nombre:");

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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Búsqueda producto");

        jPanelImage.setBackground(new java.awt.Color(0, 0, 51));

        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextFieldCantidadDisponible.setEditable(false);
        jTextFieldCantidadDisponible.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCantidadDisponible.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldCantidadDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidadDisponible.setText("Cantidad Disponible: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCantidadDisponible)
                            .addComponent(busquedaJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(aceptarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(busquedaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aceptarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelarJButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        cancelado = true;
    }//GEN-LAST:event_formWindowClosing

    private void aceptarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarJButtonActionPerformed

        if (validacion()) {

            producto = listaProductos.get(listaProductosJList.getSelectedIndex());
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            cancelado = false;
        }
    }//GEN-LAST:event_aceptarJButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        customInit();
    }//GEN-LAST:event_formWindowOpened

    private void busquedaJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaJTextFieldActionPerformed

        //System.out.println("Pasa por evento de escritura");
        listaProductos = buscarLikeNombre(busquedaJTextField.getText());

        if (listaProductos != null) {

            mostrarProductosEnLista(listaProductos);
        } else //DefaultListModel listModel = (DefaultListModel) listaProductosJList.getModel();
        {
            if (listModel != null) {

                listModel.removeAllElements();
            }
        }
    }//GEN-LAST:event_busquedaJTextFieldActionPerformed

    private void listaProductosJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductosJListValueChanged

        if (!evt.getValueIsAdjusting()) {

            System.out.println("Prueba1: " + listaProductosJList.getSelectedValue());
            System.out.println("Prueba2: " + listaProductosJList);
            if ( listaProductosJList.getSelectedValue() != null) {
                System.out.println("Pasa Prueba1");
                if (!listaProductosJList.getSelectedValue().equals(LEYENDA01)){
                    System.out.println("Pasa Prueba2");
                     mostrarImagenProducto();
                } else {
                    jLabelImage.setIcon(null);
                }
               
            } else {
                jLabelImage.setIcon(null);
            }

        }
    }//GEN-LAST:event_listaProductosJListValueChanged

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
            java.util.logging.Logger.getLogger(JDialogBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogBuscarProducto dialog = new JDialogBuscarProducto(new javax.swing.JFrame(), true);
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
    public void mostrarImagenProducto() {

        jLabelImage.setIcon(null);

        PuntoventaProducto productoSeleccionado = listaProductos.get(listaProductosJList.getSelectedIndex());

        if (productoSeleccionado != null) {

            System.out.println("Obteniendo objetos imagen...");
            List<PuntoventaImagen> listaImagenes = ImageResizer.getListOfImagesFromCommonObject(em, productoSeleccionado.getIdCommonObject());
            if (listaImagenes.size() > 0) {
                PuntoventaImagen primerImagen = listaImagenes.get(0);
                String imageLocalPath = "cache\\" + primerImagen;
                if (ImageResizer.fileExists(imageLocalPath)) {

                    try {
                        BufferedImage inputImage = ImageResizer.loadImageToBuffer(imageLocalPath);
                        ImageResizer.loadImageOnLabel(inputImage, jLabelImage);
                    } catch (IOException ex) {
                        System.out.println("Ocurrió un problema al cargar la imagen: " + ex.getMessage());
                    }

                } else {

                    Properties properties = ImageResizer.readFilePropeties("ftpProperties.properties");
                    String ftpServer = properties.getProperty("server");
                    String ftpUser = properties.getProperty("user");
                    String ftpPassword = properties.getProperty("password");

                    boolean success;
                    if (!ImageResizer.fileExists("cache")) {

                        System.out.println("Creando directorio cache...");
                        success = ImageResizer.createLocalDirectory("cache");
                    } else {

                        System.out.println("No se crea cache...");
                        success = true;
                    }

                    if (success) {
                        System.out.println("Descargando imagen de servidor...");
                        success = ImageResizer.retriveFileFromServer(imageLocalPath, ftpServer, ftpUser, ftpPassword, primerImagen.getPath());
                    }

                    if (success) {
                        try {
                            System.out.println("Cargando imagen en label...");
                            BufferedImage inputImage = ImageResizer.loadImageToBuffer(imageLocalPath);
                            ImageResizer.loadImageOnLabel(inputImage, jLabelImage);
                        } catch (IOException ex) {
                            System.out.println("Ocurrió un problema al cargar la imagen: " + ex.getMessage());
                        }
                    }
                }
            }
        }
    }

    private boolean validacion() {

        boolean pasaValidacion = true;

        if (listaProductosJList.isSelectionEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un valor de la lista. Favor de verificar.");
            pasaValidacion = false;
        }

        if (listaProductosJList.getSelectedValue().equals(LEYENDA01)) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar algun producto. Favor de verificar.");
            pasaValidacion = false;
        }

        return pasaValidacion;
    }

    private void customInit() {

        listModel = new DefaultListModel<String>();
        listaProductosJList.setModel(listModel);

        if (listModel == null) {

            listModel = new DefaultListModel();
            listaProductosJList.setModel(listModel);
        }

        listModel.removeAllElements();

        listModel.addElement(LEYENDA01);
    }

    private void mostrarProductosEnLista(List<PuntoventaProducto> listaProductos) {

        //DefaultListModel listModel = (DefaultListModel) listaProductosJList.getModel();
        if (listModel == null) {

            listModel = new DefaultListModel();
            listaProductosJList.setModel(listModel);
        }

        listModel.removeAllElements();

        for (PuntoventaProducto productoActual : listaProductos) {

            String conFormato = String.format("$%.2f - %s",
                    productoActual.getPrecioVenta(),
                    productoActual.getNombreProducto());
            listModel.addElement(conFormato);
        }
    }

    private List<PuntoventaProducto> buscarLikeNombre(String nombre) {

        List<PuntoventaProducto> listaProductosEncontrados = null;

        if (nombre.length() > 0) {

            CriteriaBuilder cb = getEm().getCriteriaBuilder();

            CriteriaQuery<PuntoventaProducto> cq = cb.createQuery(PuntoventaProducto.class);
            Root<PuntoventaProducto> productosEmpresa = cq.from(PuntoventaProducto.class);

            cq.where(
                    cb.and(
                            cb.equal(
                                    productosEmpresa.get(PuntoventaProducto_.idEmpresa),
                                    getEmpresa()),
                            cb.like(
                                    cb.lower(productosEmpresa.get(PuntoventaProducto_.nombreProducto)),
                                    "%" + nombre.toLowerCase() + "%")
                    )
            );

            cq.select(productosEmpresa);

            TypedQuery<PuntoventaProducto> q = getEm().createQuery(cq);
            List<PuntoventaProducto> listaItems = q.getResultList();

            if (listaItems.isEmpty()) {

                listaProductosEncontrados = null;
            } else {

                listaProductosEncontrados = listaItems;
            }

        } else {

            CriteriaBuilder cb = getEm().getCriteriaBuilder();

            CriteriaQuery<PuntoventaProducto> cq = cb.createQuery(PuntoventaProducto.class);
            Root<PuntoventaProducto> productosEmpresa = cq.from(PuntoventaProducto.class);

            cq.where(
                    cb.and(
                            cb.equal(
                                    productosEmpresa.get(PuntoventaProducto_.idEmpresa),
                                    getEmpresa()),
                            cb.like(
                                    cb.lower(productosEmpresa.get(PuntoventaProducto_.nombreProducto)),
                                    "%" + nombre.toLowerCase() + "%")
                    )
            );

            cq.select(productosEmpresa);

            TypedQuery<PuntoventaProducto> q = getEm().createQuery(cq);
            q.setFirstResult(0);
            q.setMaxResults(20);
            List<PuntoventaProducto> listaItems = q.getResultList();

            if (listaItems.isEmpty()) {

                listaProductosEncontrados = null;
            } else {

                listaProductosEncontrados = listaItems;
            }

        }

        return listaProductosEncontrados;
    }

    // Custom variables
    private PuntoventaProducto producto;
    private List<PuntoventaProducto> listaProductos;
    private boolean cancelado;
    private EntityManager em;
    private DefaultListModel listModel;
    private static final String LEYENDA01 = "Escriba parte del nombre del producto y presione enter.";
    private PuntoventaEmpresa empresa;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarJButton;
    private javax.swing.JTextField busquedaJTextField;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCantidadDisponible;
    private javax.swing.JList<String> listaProductosJList;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the producto
     */
    public PuntoventaProducto getProducto() {
        return producto;
    }

    /**
     * @return the cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
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

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }
}
