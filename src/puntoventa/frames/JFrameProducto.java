package puntoventa.frames;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import puntodeventa.sql.PuntoventaCategoria;
import puntodeventa.sql.PuntoventaEmpresa;
import puntodeventa.sql.PuntoventaImagen;
import puntodeventa.sql.PuntoventaProducto;
import puntodeventa.sql.PuntoventaProducto_;
import puntoventa.test.ImageResizer;

public class JFrameProducto extends javax.swing.JFrame {

    public JFrameProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productosJTable = new javax.swing.JTable();
        cerrarjButton = new javax.swing.JButton();
        jLabelProductoTitulo = new javax.swing.JLabel();
        jLabelBuscarProducto = new javax.swing.JLabel();
        buscarNombreProductoJTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nuevojButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        eliminarjButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL PRODUCTOS");

        productosJTable.setAutoCreateRowSorter(true);
        productosJTable.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        productosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "CATEGORIA", "COMPRA", "VENTA", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productosJTable.setRowHeight(30);
        productosJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(productosJTable);

        cerrarjButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cerrarjButton.setText("Cerrar");
        cerrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarjButtonActionPerformed(evt);
            }
        });

        jLabelProductoTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelProductoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductoTitulo.setText("CONTROL DE PRODUCTOS");

        jLabelBuscarProducto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelBuscarProducto.setText("BUSCAR PRODUCTO");

        buscarNombreProductoJTextField.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        buscarNombreProductoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreProductoJTextFieldActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        nuevojButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        nuevojButton.setText("NUEVO");
        nuevojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevojButtonActionPerformed(evt);
            }
        });

        editarjButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        editarjButton.setText("EDITAR");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        eliminarjButton.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        eliminarjButton.setText("ELIMINAR");
        eliminarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProductoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBuscarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarNombreProductoJTextField))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(cerrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProductoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarNombreProductoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarjButtonActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cerrarjButtonActionPerformed

    private void nuevojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevojButtonActionPerformed

        JDialogProducto dialogProductoEditaro = new JDialogProducto(this, true);
        dialogProductoEditaro.setEm(getEm());
        dialogProductoEditaro.setEmpresa(getEmpresa());
        dialogProductoEditaro.inicializar();
        dialogProductoEditaro.setLocationRelativeTo(this);
        dialogProductoEditaro.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialogProductoEditaro.setVisible(true);
        if (!dialogProductoEditaro.isCancelado()) {

            eliminarTodasFilasTabla(productosJTable);
            mostrarProdcutosEnTabla(selectTodosProductosEmpresa(getEmpresa()), productosJTable);
        }
    }//GEN-LAST:event_nuevojButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed

        Object productoSeleccionado = obtenerObjetoSeleccionado(productosJTable, 0);
        Object productoCategoriaSeleccionado = obtenerObjetoSeleccionado(productosJTable, 1);

        if (productoSeleccionado != null) {
            JDialogProducto dialogProductoEditaro = new JDialogProducto(this, true);
            dialogProductoEditaro.setEm(getEm());
            dialogProductoEditaro.setEmpresa(getEmpresa());
            dialogProductoEditaro.inicializar();
            dialogProductoEditaro.setPuntoventaProducto((PuntoventaProducto) productoSeleccionado);
            dialogProductoEditaro.setCategoria((PuntoventaCategoria) productoCategoriaSeleccionado);
            dialogProductoEditaro.setModoEdicion(true);
            dialogProductoEditaro.setLocationRelativeTo(this);
            dialogProductoEditaro.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            dialogProductoEditaro.setVisible(true);
            if (!dialogProductoEditaro.isCancelado()) {

                eliminarTodasFilasTabla(productosJTable);
                mostrarProdcutosEnTabla(selectTodosProductosEmpresa(getEmpresa()), productosJTable);
            }
        } else {

            mensajeValidacionSeleccion(this);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void buscarNombreProductoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreProductoJTextFieldActionPerformed

        eliminarTodasFilasTabla(productosJTable);
        mostrarProdcutosEnTabla(selectProductosPorNombre(buscarNombreProductoJTextField.getText(), this.getEmpresa()), productosJTable);

    }//GEN-LAST:event_buscarNombreProductoJTextFieldActionPerformed

    private void eliminarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarjButtonActionPerformed

        Object objeto = obtenerObjetoSeleccionado(productosJTable, 0);

        if (objeto != null) {
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "¿Desea continuar con la eliminación de este producto? "
                    + "No se podrán revertir los cambios una vez confirmado",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (respuesta == JOptionPane.YES_OPTION) {

                boolean seElimino = eliminarProducto((PuntoventaProducto) objeto);

                if (seElimino) {

                    eliminarTodasFilasTabla(productosJTable);
                    mostrarProdcutosEnTabla(selectTodosProductosEmpresa(getEmpresa()), productosJTable);
                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Sucedió un error y no fue posible eliminar el producto, "
                            + "intente nuevamente por favor.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } else {

            mensajeValidacionSeleccion(this);
        }
    }//GEN-LAST:event_eliminarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarNombreProductoJTextField;
    private javax.swing.JButton cerrarjButton;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton eliminarjButton;
    private javax.swing.JLabel jLabelBuscarProducto;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelProductoTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevojButton;
    private javax.swing.JTable productosJTable;
    // End of variables declaration//GEN-END:variables

    // Custom variables
    private EntityManager em;
    private PuntoventaEmpresa empresa;
    // Pendiente hacer la paginacion
    private int pageItemNumber;
    private int pageSize;
    private int pageTotal;
    private int pageNumber;
    private int pageItemTotal;

    public void inicializar() {

        mostrarProdcutosEnTabla(selectTodosProductosEmpresa(getEmpresa()), productosJTable);
        cambiarFuenteTabla(productosJTable, new Font("Arial", Font.PLAIN, 15));
        ListSelectionModel cellSelectionModel = productosJTable.getSelectionModel();
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    mostrarImagenProducto();
                }
            }
        });
    }

    public void mostrarImagenProducto() {

        jLabelImage.setIcon(null);

        PuntoventaProducto productoSeleccionado = (PuntoventaProducto) obtenerObjetoSeleccionado(productosJTable, 0);

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

    private List<PuntoventaProducto> selectTodosProductosEmpresa(PuntoventaEmpresa empresa) {

        System.out.println("Cargando productos desde DB..");

        CriteriaBuilder cb = getEm().getCriteriaBuilder();

        CriteriaQuery<PuntoventaProducto> cq = cb.createQuery(PuntoventaProducto.class);
        Root<PuntoventaProducto> productosEmpresa = cq.from(PuntoventaProducto.class);

        cq.where(cb.equal(productosEmpresa.get(PuntoventaProducto_.idEmpresa), empresa));
        cq.select(productosEmpresa);

        TypedQuery<PuntoventaProducto> q = getEm().createQuery(cq);
        q.setFirstResult(0);
        q.setMaxResults(20);

        List<PuntoventaProducto> listaItems = q.getResultList();
        return listaItems;
    }

    private void cambiarFuenteTabla(JTable tabla, Font fuente) {

        JTableHeader header = tabla.getTableHeader();
        header.setFont(fuente);
    }

    private void mensajeValidacionSeleccion(JFrame frame) {

        JLabel label = new JLabel("Debe seleccionar un objeto de la lista.");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        JOptionPane.showMessageDialog(frame, label, "Mensaje de validación", JOptionPane.INFORMATION_MESSAGE);
    }

    private List<PuntoventaProducto> selectProductosPorNombre(String productName, PuntoventaEmpresa empresa) {

        CriteriaBuilder cb = getEm().getCriteriaBuilder();

        CriteriaQuery<PuntoventaProducto> cq = cb.createQuery(PuntoventaProducto.class);
        Root<PuntoventaProducto> productosEmpresa = cq.from(PuntoventaProducto.class);

        cq.where(
                cb.and(
                        cb.equal(
                                productosEmpresa.get(PuntoventaProducto_.idEmpresa),
                                empresa),
                        cb.like(
                                cb.lower(productosEmpresa.get(PuntoventaProducto_.nombreProducto)),
                                "%" + productName.toLowerCase() + "%")
                )
        );

        cq.select(productosEmpresa);

        TypedQuery<PuntoventaProducto> q = getEm().createQuery(cq);
        List<PuntoventaProducto> listaItems = q.getResultList();
        return listaItems;
    }

    private boolean eliminarProducto(PuntoventaProducto producto) {

        try {
            em.getTransaction().begin();

            em.remove(producto);
            em.getTransaction().commit();
            return true;
        } catch (Exception exception) {

            try {
                em.getTransaction().rollback();
            } catch (Exception exception1) {
                System.out.println("No es posible hacer rollback en este punto");
            }

            System.out.println(exception);

            return false;
        }
    }

    private void mostrarProdcutosEnTabla(List<PuntoventaProducto> productos, JTable tabla) {

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        for (PuntoventaProducto producto : productos) {

            modelo.addRow(new Object[]{
                producto,
                producto.getIdCategoria() == null ? "" : producto.getIdCategoria(),
                producto.getPrecioCompra(),
                producto.getPrecioVenta(),
                producto.getCantidadDisponible()
            });
        }
    }

    private void eliminarTodasFilasTabla(JTable tabla) {

        DefaultTableModel dm = (DefaultTableModel) tabla.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private Object obtenerObjetoSeleccionado(JTable tabla, int column) {

        int idSelectedRow = -100;
        Object objectoSeleccionado = null;

        try {

            idSelectedRow = tabla.getSelectedRow();
            objectoSeleccionado = tabla.getValueAt(idSelectedRow, column);

        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Debe seleccionar un objeto de la lista: " + idSelectedRow);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Debe seleccionar un objeto de la lista: " + idSelectedRow);
        }
        return objectoSeleccionado;
    }

    private Long contarProductosSQL(PuntoventaEmpresa empresa) {

        CriteriaBuilder cb = getEm().getCriteriaBuilder();

        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        CriteriaQuery<PuntoventaProducto> cq2 = cb.createQuery(PuntoventaProducto.class);
        Root<PuntoventaProducto> productos = cq2.from(PuntoventaProducto.class);

        cq.select(cb.count(cq.from(PuntoventaProducto.class)));
        cq.where(cb.equal(productos.get("idEmpresa"), empresa));

        return getEm().createQuery(cq).getSingleResult();
    }

    private void paginadorIniciar(int pageItemsTotal) {

        setPageItemNumber(pageItemsTotal);
        setPageItemNumber(0);
        setPageNumber(1);
        setPageTotal(getPageItemTotal() / getPageSize());
    }

    private boolean paginadorSiguiente() {

        if (getPageItemNumber() < getPageItemTotal()) {

            setPageItemNumber(getPageItemNumber() + getPageSize());
            setPageNumber(getPageNumber() + 1);
            return true;
        } else {

            return false;
        }
    }

    private boolean paginadorAnterior() {

        if (getPageItemNumber() > 0) {

            setPageItemNumber(getPageItemNumber() - getPageSize());
            setPageNumber(getPageNumber() - 1);
            return true;
        } else {

            return false;
        }
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
     * @return the pageItemNumber
     */
    public int getPageItemNumber() {
        return pageItemNumber;
    }

    /**
     * @param pageItemNumber the pageItemNumber to set
     */
    public void setPageItemNumber(int pageItemNumber) {
        this.pageItemNumber = pageItemNumber;
    }

    /**
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the pageTotal
     */
    public int getPageTotal() {
        return pageTotal;
    }

    /**
     * @param pageTotal the pageTotal to set
     */
    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    /**
     * @return the pageItemTotal
     */
    public int getPageItemTotal() {
        return pageItemTotal;
    }

    /**
     * @param pageItemTotal the pageItemTotal to set
     */
    public void setPageItemTotal(int pageItemTotal) {
        this.pageItemTotal = pageItemTotal;
    }

    /**
     * @return the pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
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
}
