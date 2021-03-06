/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa.frames;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import puntodeventa.sql.PuntoventaCategoria;
import puntodeventa.sql.PuntoventaGrupo;

/**
 *
 * @author SERVIDOR-PC
 */
public class JDialogGrupo extends javax.swing.JDialog {

    /**
     * Creates new form CategoriaJDialog
     *
     * @param parent
     * @param modal
     */
    public JDialogGrupo(java.awt.Frame parent, boolean modal) {
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

        okjButton1 = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        nombreCategoriajTextField = new javax.swing.JTextField();
        idGrupojLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoriasjTable = new javax.swing.JTable();
        adicionarjButton2 = new javax.swing.JButton();
        eliminarjButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        okjButton1.setText("OK");
        okjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjButton1ActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        idGrupojLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idGrupojLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("NOMBRE GRUPO");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GRUPO");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("ID GRUPO");

        categoriasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORIA", "ELIMINAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        categoriasjTable.setToolTipText("");
        jScrollPane1.setViewportView(categoriasjTable);

        adicionarjButton2.setText("Adicionar");
        adicionarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjButton2ActionPerformed(evt);
            }
        });

        eliminarjButton3.setText("Eliminar");
        eliminarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarjButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCategoriajTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idGrupojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarjButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(eliminarjButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idGrupojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCategoriajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(okjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(cancelarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarjButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarjButton3)
                        .addGap(0, 161, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okjButton1ActionPerformed

        String nombreGrupo = nombreCategoriajTextField.getText();
        getEm().getTransaction().begin();
        if (!isModoEdicion()) {
            PuntoventaGrupo grupoNuevo = new PuntoventaGrupo();
            grupoNuevo.setNombreGrupo(nombreGrupo);
            grupoNuevo.setPuntoventaCategoriaCollection(descargarCategoriasDeTabla(grupoNuevo));
            getEm().persist(grupoNuevo);
        } else {
            getGrupo().setNombreGrupo(nombreGrupo);
            getGrupo().setPuntoventaCategoriaCollection(descargarCategoriasDeTabla(getGrupo()));
        }
        getEm().getTransaction().commit();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_okjButton1ActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        inicializar();
        if (isModoEdicion()) {
            cargarGrupoParaEditar();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void adicionarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButton2ActionPerformed

        adicionarFilaCategoriasjTable("");
    }//GEN-LAST:event_adicionarjButton2ActionPerformed

    private void eliminarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarjButton3ActionPerformed

        eliminarCategoriasSeleccionadas();
    }//GEN-LAST:event_eliminarjButton3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogGrupo dialog = new JDialogGrupo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton adicionarjButton2;
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JTable categoriasjTable;
    private javax.swing.JButton eliminarjButton3;
    private javax.swing.JLabel idGrupojLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCategoriajTextField;
    private javax.swing.JButton okjButton1;
    // End of variables declaration//GEN-END:variables

    // azptec: Custom code
    private boolean modoEdicion;
    private EntityManager em;
    private PuntoventaGrupo grupo;

    private void inicializar() {

        cargarCategoriasEnCategoriasjTableCombo();
    }

    // Metodo para que las celdas de la JTable sean de tipo ComboBox y en los valores del 
    // combo se carguen las categorias disponibles
    private void cargarCategoriasEnCategoriasjTableCombo() {

        JComboBox categoriasCombo = new JComboBox();
        // Se obtienen las categorias de la BD y se cargan en el Combo
        for ( PuntoventaCategoria categoria : cargarCategoriasSQL() ){
            
            if ( isModoEdicion() ) {
                // Para el caso de la edición solo queremos cargar las categorias que estan disponibles
                // Es decir que no pertenecen a un grupo o que pertenecen al grupo que se está editando
                System.out.println("CATEGORIA->"+categoria.getIdGrupo());
                System.out.println("GRUPO->"+getGrupo());
                if ( categoria.getIdGrupo() == null )
                    categoriasCombo.addItem(categoria);
                else if ( (categoria.getIdGrupo().equals(getGrupo())  ) )
                    categoriasCombo.addItem(categoria);
            } else {
                // En el caso de que sea nuevo solo cargamos las categorias que no pertenecen a un grupo
                if ( categoria.getIdGrupo() == null )
                    categoriasCombo.addItem(categoria);
            }
        }
        TableColumn categoriasColumn = categoriasjTable.getColumnModel().getColumn(0);
        categoriasColumn.setCellEditor(new DefaultCellEditor(categoriasCombo));
        // Se adiciona un evento para cuando cambie la categoria en el combo
        // también cambie la referencia de ID_GRUPO a nulo
        ItemListenerInterno listener = new ItemListenerInterno();
        categoriasCombo.addItemListener(listener);
    }

    // Metodo que trabaja en modo edición. Carga las categorias en la JTable
    // que pertenecen al grupo
    private void cargarCategoriasGrupoParaEditar() {

        for (PuntoventaCategoria categoria : getGrupo().getPuntoventaCategoriaCollection()) {
            DefaultTableModel categoriasModelo = (DefaultTableModel) categoriasjTable.getModel();
            categoriasModelo.addRow(new Object[]{
                categoria,
                false 
            });
        }
    }

    private void cargarGrupoParaEditar() {

        nombreCategoriajTextField.setText(grupo.toString());
        idGrupojLabel.setText(String.valueOf(grupo.getIdGrupo()));
        cargarCategoriasGrupoParaEditar();
    }

    private List<PuntoventaCategoria> cargarCategoriasSQL() {

        TypedQuery<PuntoventaCategoria> typedQuery;
        typedQuery = em.createNamedQuery(
                "PuntoventaCategoria.findAll", PuntoventaCategoria.class);
        return typedQuery.getResultList();
    }

    private void adicionarFilaCategoriasjTable(Object defaultValue) {

        DefaultTableModel modelo = (DefaultTableModel) categoriasjTable.getModel();
        modelo.addRow(new Object[]{
            defaultValue,
            false
        });
    }

    private Collection<PuntoventaCategoria> descargarCategoriasDeTabla(PuntoventaGrupo grupo) {

        Collection<PuntoventaCategoria> categoriaCollection = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) categoriasjTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {

            Object object = model.getValueAt(i, 0);

            if (object instanceof PuntoventaCategoria) {

                PuntoventaCategoria categoria = (PuntoventaCategoria) object;
                categoria.setIdGrupo(grupo);
                categoriaCollection.add(categoria);
            }
        }

        return categoriaCollection;
    }

    private void eliminarCategoriasSeleccionadas() {

        DefaultTableModel model = (DefaultTableModel) categoriasjTable.getModel();
        for (int idRow = 0; idRow < categoriasjTable.getRowCount(); idRow++) {

            boolean eliminar = (boolean) categoriasjTable.getValueAt(idRow, 1);
            Object objeto = categoriasjTable.getValueAt(idRow, 0);
            if (eliminar) {
                // Verifica que sea un objeto Categoria y no un String
                if (objeto instanceof PuntoventaCategoria) {
                    PuntoventaCategoria categoria = (PuntoventaCategoria) objeto;
                    // Con esto queda nula la llave foranea Grupo
                    categoria.setIdGrupo(null);
                }
                // Se elimina la fila de la tabla
                model.removeRow(idRow);
                // Se manda llamar recursivo debido a que se recorren los índices 
                // del arreglo y disminuye en 1 el tamaño
                eliminarCategoriasSeleccionadas();
            }
        }
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityManager getEm() {
        return this.em;
    }

    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    public boolean isModoEdicion() {
        return this.modoEdicion;
    }

    public PuntoventaGrupo getGrupo() {
        return grupo;
    }

    public void setGrupo(PuntoventaGrupo grupo) {
        this.grupo = grupo;
    }
}

class ItemListenerInterno implements ItemListener {


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem() instanceof PuntoventaCategoria) {
            Object objeto = e.getItem();
            System.out.println("objeto->" + objeto);
            PuntoventaCategoria categoria = (PuntoventaCategoria) objeto;
            System.out.println("categoria->" + categoria);
            PuntoventaGrupo idGrupo = categoria.getIdGrupo();
            System.out.println("idGrupo->" + idGrupo);
            categoria.setIdGrupo(null);
        }
    }

}
