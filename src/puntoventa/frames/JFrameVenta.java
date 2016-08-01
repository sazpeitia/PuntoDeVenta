/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import puntodeventa.PuntoVentaConfiguracion;
import puntodeventa.PuntoVentaPrinter;
import puntodeventa.sql.PuntoventaCarrito;
import puntodeventa.sql.PuntoventaProducto;
import puntodeventa.sql.PuntoventaVenta;

/**
 *
 * @author SERVIDOR-PC
 */
public class JFrameVenta extends javax.swing.JFrame {

    /**
     * Creates new form JFrameVenta
     */
    public JFrameVenta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        carritoJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nuevoProductoJButton = new javax.swing.JButton();
        editarProductoJButton = new javax.swing.JButton();
        eliminarProductoJButton = new javax.swing.JButton();
        cerrarVentnaJButton = new javax.swing.JButton();
        concretarVentaJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        carritoJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        carritoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carritoJTable.setRowHeight(40);
        carritoJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        carritoJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carritoJTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(carritoJTable);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Realizar una venta");

        nuevoProductoJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nuevoProductoJButton.setText("Ingresar producto");
        nuevoProductoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoProductoJButtonActionPerformed(evt);
            }
        });

        editarProductoJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editarProductoJButton.setText("Editar");
        editarProductoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProductoJButtonActionPerformed(evt);
            }
        });

        eliminarProductoJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminarProductoJButton.setText("Eliminar");
        eliminarProductoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoJButtonActionPerformed(evt);
            }
        });

        cerrarVentnaJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cerrarVentnaJButton.setText("Cerrar Ventana");
        cerrarVentnaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentnaJButtonActionPerformed(evt);
            }
        });

        concretarVentaJButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        concretarVentaJButton.setText("Concretar venta");
        concretarVentaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concretarVentaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nuevoProductoJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarProductoJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarProductoJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(concretarVentaJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cerrarVentnaJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoProductoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarProductoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarProductoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(concretarVentaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarVentnaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        customInit();
    }//GEN-LAST:event_formWindowOpened

    private void cerrarVentnaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentnaJButtonActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cerrarVentnaJButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        em.close();
        emf.close();
    }//GEN-LAST:event_formWindowClosing

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void carritoJTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carritoJTableKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            PuntoventaProducto producto = buscarProducto(codigoBarrasCache);

            if (producto != null) {
                adicionarProductoACarrito(producto, 1);
                codigoBarrasCache = new String();
            }
        } else {

            Calendar calendar = Calendar.getInstance();
            fechaUltimoEventoTeclado = calendar.getTime();
            codigoBarrasCache = codigoBarrasCache + evt.getKeyChar();
        }
    }//GEN-LAST:event_carritoJTableKeyReleased

    private void nuevoProductoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoProductoJButtonActionPerformed

        JDialogNuevoArticuloCarrito articuloCarrito = new JDialogNuevoArticuloCarrito(this, true);
        articuloCarrito.setModoEdicion(false);
        articuloCarrito.setLocationRelativeTo(this);
        articuloCarrito.setEm(em);
        articuloCarrito.setVisible(true);
        articuloCarrito.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        if (!articuloCarrito.isCancelado()) {

            PuntoventaProducto productoNuevo = articuloCarrito.getProducto();
            int cantidad = articuloCarrito.getCantidad();
            adicionarProductoACarrito(productoNuevo, cantidad);
        }

        carritoJTable.requestFocus();
    }//GEN-LAST:event_nuevoProductoJButtonActionPerformed

    private void editarProductoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProductoJButtonActionPerformed

        int row = carritoJTable.getSelectedRow();
        PuntoventaProducto productoAEditar;
        int cantidadAEditar;

        if (row == -1) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para modificar.");
        } else {

            JDialogNuevoArticuloCarrito articuloCarrito = new JDialogNuevoArticuloCarrito(this, true);
            articuloCarrito.setModoEdicion(true);
            articuloCarrito.setLocationRelativeTo(this);
            articuloCarrito.setEm(em);

            articuloCarrito.setModoEdicion(true);
            articuloCarrito.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

            productoAEditar = listaArticulos.get(row);
            cantidadAEditar = (Integer) carritoJTable.getValueAt(row, 3);

            articuloCarrito.setProducto(productoAEditar);
            articuloCarrito.setCantidad(cantidadAEditar);

            articuloCarrito.setVisible(true);

            cantidadAEditar = articuloCarrito.getCantidad();

            if (!articuloCarrito.isCancelado()) {

                modificarCantidadDeProductoEnCarrito(productoAEditar, cantidadAEditar);
            }
        }
    }//GEN-LAST:event_editarProductoJButtonActionPerformed

    private void eliminarProductoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoJButtonActionPerformed

        int row = carritoJTable.getSelectedRow();

        if (row == -1) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para eliminar de la lista.");
        } else {

            int resultDialog = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el producto del carrito de compra?");
            if (resultDialog == JOptionPane.YES_OPTION) {
                listaArticulos.remove(row);
                DefaultTableModel modelo = (DefaultTableModel) carritoJTable.getModel();
                modelo.removeRow(row);
            }

        }
    }//GEN-LAST:event_eliminarProductoJButtonActionPerformed

    private void concretarVentaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concretarVentaJButtonActionPerformed

        double totalCompra = 0.0;
       
        int numeroArticulos = carritoJTable.getRowCount();

        if (numeroArticulos > 0) {

            for (int index = 0; index < carritoJTable.getRowCount(); index++) {

                totalCompra += (Double) carritoJTable.getValueAt(index, 4);
            }

            JDialogVentaResumen ventaResumen = new JDialogVentaResumen(this, true);

            ventaResumen.setLocationRelativeTo(this);
            ventaResumen.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

            ventaResumen.setTotalCompra(totalCompra);

            ventaResumen.setVisible(true);

            if (!ventaResumen.isCompraCancelada()) {

                PuntoventaVenta ventaCarrito = nuevaVenta(ventaResumen.getFechaCompra(), totalCompra, ventaResumen.getPagoCompra(), ventaResumen.getCambioCompra());
                String items = "";

                for (int row = 0; row < numeroArticulos; row++) {

                    items += venderArticulo(ventaCarrito, listaArticulos.get(row), (Integer) carritoJTable.getValueAt(row, 3));
                }
                
                if ( ventaResumen.isImprimeTicket() ) {
                    imprimirTicket(items, ventaCarrito);
                }
                limpiarCarrito();
                JOptionPane.showMessageDialog(this, "Venta realizada correctamente.");
            }
        } else {

            JOptionPane.showMessageDialog(this, "No se han ingresado artículos al carrito.");
        }
    }//GEN-LAST:event_concretarVentaJButtonActionPerformed

    private void imprimirTicket(String items, PuntoventaVenta venta) {

        PuntoVentaConfiguracion configuracion = new PuntoVentaConfiguracion();
        PuntoVentaPrinter impresion = new PuntoVentaPrinter();
        configuracion.cargarConfiguracion();
        String impresora = configuracion.getImpresoraTickets();
        impresion.setSelectedService(impresora);
        
        String total = String.format("$%.2f", venta.getTotalVenta());
        String pago = String.format("$%.2f", venta.getPagoVenta());
        String cambio = String.format("$%.2f", venta.getCambioVenta());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String dateTime = formato.format(venta.getFechaVenta());
        
        impresion.setValuesTicket(dateTime, items, total, pago, cambio);
        
        try {
            impresion.printTicket();
        } catch (Exception ex) {
            Logger.getLogger(JFrameVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVenta().setVisible(true);
            }
        });
    }

    // Custom methods
    private void deleteRows() {

        DefaultTableModel dm = (DefaultTableModel) carritoJTable.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private PuntoventaVenta nuevaVenta(Date fechaVenta, double totalVenta, double pagoVenta, double cambioVenta) {

        em.getTransaction().begin();

        PuntoventaVenta venta = new PuntoventaVenta();
        venta.setFechaVenta(fechaVenta);
        venta.setTotalVenta(totalVenta);
        venta.setPagoVenta(pagoVenta);
        venta.setCambioVenta(cambioVenta);

        em.persist(venta);
        em.getTransaction().commit();

        return venta;
    }

    private String venderArticulo(PuntoventaVenta venta, PuntoventaProducto producto, int cantidadComprada) {
        
        String ventaString = "";

        em.getTransaction().begin();

        PuntoventaCarrito carrito = new PuntoventaCarrito();

        carrito.setCantidadProducto(cantidadComprada);
        carrito.setIdProducto(producto);
        carrito.setIdVenta(venta);
        carrito.setTotal(cantidadComprada * producto.getPrecioVenta());
        producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidadComprada);
        
        ventaString = String.format("%-35s%5d$%10.2f\n", producto.getNombreProducto(), cantidadComprada, carrito.getTotal());

        em.persist(carrito);
        em.getTransaction().commit();
        
        return ventaString;
    }

    private void limpiarCarrito() {

        deleteRows();
        listaArticulos.clear();
    }

    private void addRowProducto(PuntoventaProducto producto, int cantidad) {

        double total = producto.getPrecioVenta() * cantidad;

        DefaultTableModel modelo = (DefaultTableModel) carritoJTable.getModel();
        modelo.addRow(new Object[]{
            producto.getIdCodigoBarra(),
            producto.getNombreProducto(),
            producto.getPrecioVenta(),
            cantidad,
            total
        }
        );
    }

    private void updateCantProducto(int index, int cantidadNueva) {

        double precioUnitario = (Double) carritoJTable.getValueAt(index, 2);
        double totalNuevo = cantidadNueva * precioUnitario;
        carritoJTable.setValueAt(cantidadNueva, index, 3);
        carritoJTable.setValueAt(totalNuevo, index, 4);
    }

    private void sumRowProducto(int index, int cantidad) {

        int cantidadActual = (Integer) carritoJTable.getValueAt(index, 3);
        cantidadActual += cantidad;
        double precioUnitario = (Double) carritoJTable.getValueAt(index, 2);
        double totalNuevo = cantidadActual * precioUnitario;
        carritoJTable.setValueAt(cantidadActual, index, 3);
        carritoJTable.setValueAt(totalNuevo, index, 4);
    }

    private void robotInit() {

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Calendar calendar = Calendar.getInstance();
                Date nuevaFechaUltimoEventoTeclado = calendar.getTime();
                long diffMillies = nuevaFechaUltimoEventoTeclado.getTime() - fechaUltimoEventoTeclado.getTime();

                if (diffMillies > 100 & !codigoBarrasCache.equals("")) {
                    try {
                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);
                    } catch (AWTException aWTException) {
                        aWTException.printStackTrace();
                    }
                }
            }

        });

        timer.start();
    }

    private void dateInit() {

        Calendar calendar = Calendar.getInstance();
        fechaUltimoEventoTeclado = calendar.getTime();
    }

    private void customInit() {

        emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
        em = emf.createEntityManager();
        codigoBarrasCache = "";
        listaArticulos = new ArrayList<>();
        dateInit();
        robotInit();

    }

    private void adicionarProductoACarrito(PuntoventaProducto producto, int cantidad) {

        int index;

        if (!listaArticulos.contains(producto)) {
            listaArticulos.add(producto);
            addRowProducto(producto, cantidad);
        } else {
            index = listaArticulos.indexOf(producto);
            sumRowProducto(index, cantidad);
        }
    }

    private void modificarCantidadDeProductoEnCarrito(PuntoventaProducto producto, int cantidadNueva) {

        int index;

        if (!listaArticulos.contains(producto)) {
            JOptionPane.showMessageDialog(this, "No se encontró el producto modificado.");
        } else {
            index = listaArticulos.indexOf(producto);
            updateCantProducto(index, cantidadNueva);
        }
    }

    private PuntoventaProducto buscarProducto(String codigoBarras) {

        PuntoventaProducto producto = null;

        try {

            TypedQuery<PuntoventaProducto> typedQuery;
            typedQuery = em.createNamedQuery(
                    "PuntoventaProducto.findByIdCodigoBarra", PuntoventaProducto.class);
            typedQuery.setParameter("idCodigoBarra", codigoBarras);
            producto = typedQuery.getSingleResult();
        } catch (NoResultException noResultException) {

            codigoBarrasCache = "";
            JOptionPane.showMessageDialog(this, "No se encontró un producto con el código de barras especificado.");
        }

        return producto;
    }

    // Custom variables
    private EntityManagerFactory emf;
    private EntityManager em;
    private String codigoBarrasCache;
    private List<PuntoventaProducto> listaArticulos;
    private PuntoventaVenta ventaNueva;
    private Date fechaUltimoEventoTeclado;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carritoJTable;
    private javax.swing.JButton cerrarVentnaJButton;
    private javax.swing.JButton concretarVentaJButton;
    private javax.swing.JButton editarProductoJButton;
    private javax.swing.JButton eliminarProductoJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevoProductoJButton;
    // End of variables declaration//GEN-END:variables
}
