package proyectoend;
import javax.swing.JOptionPane;

public class jfrUser extends javax.swing.JFrame {
    
    Usuario usuario[] = new Usuario[30];
    int cantidadUsuarios = 4;
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public jfrUser() {
        initComponents();
        usuario[0] = new Usuario("David", "Admin", 20, "Claro que sí", "a21110121@ceti.mx", "Conserje");
        usuario[1] = new Usuario("Daniel", "1234", 19, "Hombre", "a21110156@ceti.mx", "Cargador");
        usuario[2] = new Usuario("Carlos", "4567", 21, "Hombre", "a21110130@ceti.mx", "Patron");
        usuario[3] = new Usuario("Emco", "7891", 20, "Hombre", "a21110118@ceti.mx", "Barista");
        for(int i = 4; i < 30; i++)
            usuario[i] = new Usuario("", "", 0, "", "", "");
        
        producto[0] = new Producto("Cerveza", 10001, 42, "Consuvino");
        producto[1] = new Producto("Cerveza clara", 10002, 82, "cerveceria Hectorin");
        producto[2] = new Producto("Cerveza obscura", 10003, 20, "cerveceria Hectorin");
        producto[3] = new Producto("Sidra", 10004, 10, "Consuvino");
        producto[4] = new Producto("Vinos espumoso", 10005, 40, "Consuvino");
        producto[5] = new Producto("Tequila", 10006, 45, "cerveceria Hectorin");
        producto[6] = new Producto("Whisky", 10007, 20, "cerveceria Hectorin");
        producto[7] = new Producto("Vodka", 10008, 72, "Consuvino");
        producto[8] = new Producto("Refresco", 10009, 90, "Peñafiel");
        producto[9] = new Producto("Hielo", 100010, 50, "Peñafiel");
        producto[10] = new Producto("Agua", 100011, 100, "Peñafiel");
        for(int i = 11; i < 50; i++)
            producto[i] = new Producto("", 0, 0, "");
    }
    
    public jfrUser(Usuario[] usuario, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        this.usuario = usuario;
        this.cantidadUsuarios = cantidadUsuarios;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUsuario.setBackground(new java.awt.Color(255, 204, 255));
        jUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jUsuario.setOpaque(true);
        jPanel2.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 360, 30));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("User");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 204, 255));
        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 360, 30));

        jLabel8.setText("© 2022 HotTaco Bread EMCO DEPL 🎉");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 360, 30));

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText(" ALMACEN");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("\" MOY'S BAR  SNACKS & FUN \"");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 280, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/554857 1 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Card_Header.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Card_Content.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 380));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 450, 490));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //System.out.print(ArrLength);
        boolean encontrarUsuario = false;
        if(!(jUsuario.getText().equals("") || jPassword.getText().equals(""))){
            for(int i = 0; i < 30; i++){
                if(jUsuario.getText().equals(usuario[i].getUsuario()) && jPassword.getText().equals(usuario[i].getPassword())){
                    encontrarUsuario = true;
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuario[i].getUsuario() + " nos da gusto verte de nuevo!!");
                    jfrMenu menu = new jfrMenu(usuario, i, cantidadUsuarios, producto, cantidadProductos);
                    menu.setVisible(true);
                    this.setVisible(false);
                }
            }
            if(encontrarUsuario == false){
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidas, intenta de nuevo");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor ingresa todos los campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}
