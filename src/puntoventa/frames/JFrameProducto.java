package puntoventa.frames;

import java.awt.event.WindowEvent;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import puntodeventa.sql.PuntoventaProducto;

public class JFrameProducto extends javax.swing.JFrame {

    public JFrameProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productosJTable = new javax.swing.JTable();
        nuevojButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        eliminarjButton = new javax.swing.JButton();
        cerrarjButton = new javax.swing.JButton();
        inventariojButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarNombreProductoJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        productosJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Categoria", "Compra", "Venta", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productosJTable.setRowHeight(40);
        productosJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(productosJTable);

        nuevojButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nuevojButton.setText("Nuevo");
        nuevojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevojButtonActionPerformed(evt);
            }
        });

        editarjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        eliminarjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminarjButton.setText("Eliminar");

        cerrarjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cerrarjButton.setText("Cerrar");
        cerrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarjButtonActionPerformed(evt);
            }
        });

        inventariojButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inventariojButton.setText("Inventario");
        inventariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventariojButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de productos");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por nombre de producto");

        buscarNombreProductoJTextField.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        buscarNombreProductoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreProductoJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarNombreProductoJTextField))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevojButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inventariojButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inventariojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarNombreProductoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(cerrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        customInit();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        em.close();
        emf.close();
    }//GEN-LAST:event_formWindowClosing

    private void cerrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarjButtonActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cerrarjButtonActionPerformed

    private void nuevojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevojButtonActionPerformed

        em.getTransaction().begin();

        PuntoventaProducto productoNuevo = new PuntoventaProducto();

        JDialogProducto productoNuevoDialog = new JDialogProducto(this, true);
        productoNuevoDialog.setPuntoventaProducto(productoNuevo);
        productoNuevoDialog.setEditar(false);
        productoNuevoDialog.setEm(em);
        productoNuevoDialog.setLocationRelativeTo(this);
        productoNuevoDialog.setVisible(true);
        productoNuevoDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        if (!productoNuevoDialog.isCancelado()) {

            em.persist(productoNuevo);
            em.getTransaction().commit();
        } else {

            em.getTransaction().rollback();
        }

        deleteAllRows();
        getAllProducts();
        setAllProductsToTable();
    }//GEN-LAST:event_nuevojButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed

        try {

            int idProductoSeleccionado = productosJTable.getSelectedRow();
            PuntoventaProducto productoModificado = listaProductos.get(idProductoSeleccionado);

            em.getTransaction().begin();

            JDialogProducto productoModificadoDialog = new JDialogProducto(this, true);
            productoModificadoDialog.setPuntoventaProducto(productoModificado);
            productoModificadoDialog.setEditar(true);
            productoModificadoDialog.setEm(em);
            productoModificadoDialog.setLocationRelativeTo(this);
            productoModificadoDialog.setVisible(true);
            productoModificadoDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

            if (!productoModificadoDialog.isCancelado()) {

                em.getTransaction().commit();
                deleteAllRows();
                getAllProducts();
                setAllProductsToTable();
            } else {

                em.getTransaction().rollback();
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar algún producto de la lista para editar.");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void inventariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventariojButtonActionPerformed
        
        try {

            int idProductoSeleccionado = productosJTable.getSelectedRow();
            PuntoventaProducto productoModificado = listaProductos.get(idProductoSeleccionado);

            em.getTransaction().begin();

            JDialogProductoInventario productoModificadoDialog = new JDialogProductoInventario(this, true);
            productoModificadoDialog.setProducto(productoModificado);
            
            
            productoModificadoDialog.setLocationRelativeTo(this);
            productoModificadoDialog.setVisible(true);
            productoModificadoDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

            if (!productoModificadoDialog.isCancelado()) {

                em.getTransaction().commit();
                deleteAllRows();
                getAllProducts();
                setAllProductsToTable();
            } else {

                em.getTransaction().rollback();
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar algún producto de la lista para Inventario.");
        }
    }//GEN-LAST:event_inventariojButtonActionPerformed

    private void buscarNombreProductoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreProductoJTextFieldActionPerformed
        
        deleteAllRows();
        getProductsByName( buscarNombreProductoJTextField.getText() );
        setAllProductsToTable();
        System.out.println("Si pasa por aquí");
    }//GEN-LAST:event_buscarNombreProductoJTextFieldActionPerformed

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
            public void run() {
                new JFrameProducto().setVisible(true);
            }
        });
    }

    // Custom methods
    private void customInit() {

        emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
        em = emf.createEntityManager();
        getAllProducts();
        setAllProductsToTable();
    }

    private void getAllProducts() {

        TypedQuery<PuntoventaProducto> typedQuery;
        typedQuery = em.createNamedQuery(
                "PuntoventaProducto.findAll", PuntoventaProducto.class).setMaxResults(100);
        listaProductos = typedQuery.getResultList();
    }
    
    private void getProductsByName ( String productName) {
        
        List<PuntoventaProducto> listaProductosEncontrados = null;
        
        if ( productName.length() > 0 ) {
            
            String nombreLike = "%" + productName;
            nombreLike += "%";
            TypedQuery<PuntoventaProducto> typedQuery;
            typedQuery = em.createNamedQuery(
                    "PuntoventaProducto.findLikeNombreProducto", PuntoventaProducto.class);
            typedQuery.setParameter("nombreProductoLike", nombreLike);

            try {
                listaProductosEncontrados = typedQuery.getResultList();
                
            } catch (NoResultException noResultException) {

                System.out.println( noResultException.getMessage() );
                listaProductosEncontrados = null;
            }
        }
        
        else {
            
            TypedQuery<PuntoventaProducto> typedQuery;
            typedQuery = em.createNamedQuery(
                "PuntoventaProducto.findAll", PuntoventaProducto.class).setMaxResults(100);
            listaProductosEncontrados = typedQuery.getResultList();
        }
        
        listaProductos = listaProductosEncontrados;

    }

    private void setAllProductsToTable() {

        for (PuntoventaProducto producto : listaProductos) {

            addRowProducto(producto);
        }
    }

    private void deleteAllRows() {

        DefaultTableModel dm = (DefaultTableModel) productosJTable.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private void addRowProducto(PuntoventaProducto producto) {

        DefaultTableModel modelo = (DefaultTableModel) productosJTable.getModel();
        modelo.addRow(new Object[]{
            producto.getIdProducto(),
            producto.getNombreProducto(),
            producto.getIdCategoria() == null ? "" : producto.getIdCategoria().getNombreCategoria(),
            producto.getPrecioCompra(),
            producto.getPrecioVenta(),
            producto.getCantidadDisponible()
        }
        );
    }

    // Custom variables
    private EntityManagerFactory emf;
    private EntityManager em;
    private List<PuntoventaProducto> listaProductos;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarNombreProductoJTextField;
    private javax.swing.JButton cerrarjButton;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton eliminarjButton;
    private javax.swing.JButton inventariojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevojButton;
    private javax.swing.JTable productosJTable;
    // End of variables declaration//GEN-END:variables
}
