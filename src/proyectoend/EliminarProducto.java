package proyectoend;
import javax.swing.JOptionPane;

public class EliminarProducto extends javax.swing.JFrame {

    Usuario[] empleado;
    int cantidadUsuarios = 0, identificador = 0;
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public EliminarProducto(Usuario[] empleado, int identificador, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        
        this.empleado = empleado;
        this.cantidadUsuarios = cantidadUsuarios;
        this.identificador = identificador;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
    }
    
    public EliminarProducto() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EliminarProducto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Eliminar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setText("Salir");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, -1));

        jLabelUsername.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabelUsername.setText("User...");
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 210, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("ID del producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("para eliminar de la lista ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 70));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa la id del producto  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, -1, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 314, 170));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean borrarProducto = false;
        if(!(jID.getText().equals(""))){
            for(int i = 0; i < 50; i++){
                if(jID.getText().equals(producto[i].getIdProducto() + "")){
                    System.out.println("NO HACE NADA PERO SI ENTRA " + i);
                    JOptionPane.showMessageDialog(null, "ID encontrada");
                    Object [] botones = { "Sí", "No"};
                    int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas eliminar este producto? ( " + jID.getText() + " )." , "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
                    if(warning == 0){
                        borrarProducto = true;
                        cantidadProductos--;
                        producto[i] = producto[i + 1];
                    }
                }
                if(borrarProducto){
                    if(i < 49){
                        producto[i] = producto[i + 1];
                    }
                }
            }
            if(borrarProducto){
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Llena los campos para poder eliminar un usuario");
            jID.setText("");
        }
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
