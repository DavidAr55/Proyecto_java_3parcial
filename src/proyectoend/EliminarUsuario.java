package proyectoend;
import javax.swing.JOptionPane;

public class EliminarUsuario extends javax.swing.JFrame {

    Usuario[] empleado;
    int cantidadUsuarios = 0, identificador = 0;
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public EliminarUsuario(Usuario[] empleado, int identificador, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        
        this.empleado = empleado;
        this.cantidadUsuarios = cantidadUsuarios;
        this.identificador = identificador;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
    }
    
    public EliminarUsuario(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Ingresa el usuario y contraseña para eliminar un usuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EliminarUsuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 245, 63, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 245, 70, -1));

        jLabelUsername.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabelUsername.setText("User...");
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 144, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        JPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(JPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 144, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Ingresa Usuario y Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("para eliminar Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 320, 160));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean borrarUser = false;
        if(!(jUsuario.getText().equals("") || JPassword.getText().equals(""))){
            for(int i = 0; i < 30; i++){
                if(jUsuario.getText().equals(empleado[i].getUsuario()) && JPassword.getText().equals(empleado[i].getPassword())){
                    JOptionPane.showMessageDialog(null, "Usuario encontrado");
                    Object [] botones = { "Sí", "No"};
                    int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas eliminar este usuario? ( " + jUsuario.getText() + " )." , "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
                    if(warning == 0){
                        borrarUser = true;
                        cantidadUsuarios--;
                        empleado[i] = empleado[i + 1];
                    }
                }
                if(borrarUser){
                    if(i < 29){
                        empleado[i] = empleado[i + 1];
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Llena los campos para poder eliminar un usuario");
            jUsuario.setText("");
            JPassword.setText("");
        }
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}
