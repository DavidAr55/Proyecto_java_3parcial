package proyectoend;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jfrMostrarAlmacen extends javax.swing.JFrame {

    Usuario[] empleado;
    int cantidadUsuarios = 0, identificador = 0;
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    DefaultTableModel tabla = new DefaultTableModel();
    
    public jfrMostrarAlmacen(Usuario[] empleado, int identificador, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        this.empleado = empleado;
        this.cantidadUsuarios = cantidadUsuarios;
        this.identificador = identificador;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
        
        String[] columnas  = new String[] {"Producto", "ID", "Cantidad", "Proveedor"};
        tabla.setColumnIdentifiers(columnas );
        jTable1.setModel(tabla);
        for(int i = cantidadProductos-1; i >= 0; i--){
            tabla.addRow(new Object[] {producto[i].getProducto(), producto[i].getIdProducto(), producto[i].getCantidad(), producto[i].getProveedor()});
        }
    }
    
    public jfrMostrarAlmacen() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unknown.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 250, 180));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "ID Producto ", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 500, 380));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 140, 30));

        jLabelUsername.setBackground(new java.awt.Color(255, 204, 255));
        jLabelUsername.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabelUsername.setText("Usuario...");
        jLabelUsername.setOpaque(true);
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 260, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EliminarProducto elimProducto = new EliminarProducto(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        elimProducto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrMostrarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrMostrarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrMostrarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrMostrarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrMostrarAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
