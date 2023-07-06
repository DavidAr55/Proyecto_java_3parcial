package proyectoend;
import javax.swing.JOptionPane;

public class jfrAgregarProducto extends javax.swing.JFrame {

    Usuario[] empleado;
    int cantidadUsuarios = 0, identificador = 0;
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public jfrAgregarProducto(Usuario[] empleado, int identificador, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        this.empleado = empleado;
        this.cantidadUsuarios = cantidadUsuarios;
        this.identificador = identificador;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
    }
    
    public jfrAgregarProducto() {
        initComponents();
        
    }
    
    public void registrarNuevoProducto(){
        if(!(jProducto.getText().equals("") || jIdProducto.getText().equals("") || jCantidad.getText().equals("") || jProveedor.getText().equals(""))){
            producto[cantidadProductos].setProducto(jProducto.getText());
            producto[cantidadProductos].setIdProducto(Integer.parseInt(jIdProducto.getText()));
            producto[cantidadProductos].setCantidad(Integer.parseInt(jCantidad.getText()));
            producto[cantidadProductos].setProveedor((String)jProveedor.getText());
            cantidadProductos++;
            JOptionPane.showMessageDialog(null, "Producto registrado existosamente!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Porfavor llena todos los campos para hacer el registro completo");
            jProducto.setText("");
            jIdProducto.setText("");
            jCantidad.setText("");
            jProveedor.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jIdProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 70, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Mostrar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Registro de Producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabelUsername.setBackground(new java.awt.Color(255, 204, 255));
        jLabelUsername.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabelUsername.setText("Usuario...");
        jLabelUsername.setOpaque(true);
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 230, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProducto.setBackground(new java.awt.Color(255, 204, 255));
        jProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Producto: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ID Producto: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jIdProducto.setBackground(new java.awt.Color(255, 204, 255));
        jIdProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jCantidad.setBackground(new java.awt.Color(255, 204, 255));
        jCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Proveedor: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jProveedor.setBackground(new java.awt.Color(255, 204, 255));
        jProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 370, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registrarNuevoProducto();
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object [] botones = { "Sí", "No"};
        int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas ir a mostrar?", "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
        if(warning == 0){
            registrarNuevoProducto();
            jfrMostrarAlmacen almacen = new jfrMostrarAlmacen(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
            almacen.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object [] botones = { "Sí", "No"};
        int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas regresar?", "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
        if(warning == 0){
            jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
            menu.setVisible(true);
            this.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(jfrAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrAgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jCantidad;
    private javax.swing.JTextField jIdProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jProducto;
    private javax.swing.JTextField jProveedor;
    // End of variables declaration//GEN-END:variables
}
