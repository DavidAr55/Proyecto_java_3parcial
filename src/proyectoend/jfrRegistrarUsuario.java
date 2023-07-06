package proyectoend;
import javax.swing.JOptionPane;

public class jfrRegistrarUsuario extends javax.swing.JFrame {
   
    int identificador, cantidadUsuarios;
    Usuario[] empleado = new Usuario[30];
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public jfrRegistrarUsuario(Usuario[] empleado, int identificador, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        this.empleado = empleado;
        this.identificador = identificador;
        this.cantidadUsuarios = cantidadUsuarios;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
        jH.setSelected(true);
    }
    
    public void registrarNuevoUsuario(){
        if(!(jUsuario.getText().equals("") || jCorreo.getText().equals("") || jPass1.getText().equals("") || jPass2.getText().equals(""))){
            if(jPass1.getText().equals(jPass2.getText())){
                empleado[cantidadUsuarios].setUsuario(jUsuario.getText());
                empleado[cantidadUsuarios].setPassword(jPass1.getText());
                empleado[cantidadUsuarios].setEdad(Integer.parseInt(jEdad.getText()));
                if(jH.isSelected())  empleado[cantidadUsuarios].setSexo("Hombre");
                else                 empleado[cantidadUsuarios].setSexo("Mujer");
                empleado[cantidadUsuarios].setPuesto((String)jComboBox.getSelectedItem());
                empleado[cantidadUsuarios].seteMail(jCorreo.getText());
                
                cantidadUsuarios++;
                JOptionPane.showMessageDialog(null, "Usuario registrado existosamente!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
                jPass1.setText("");
                jPass2.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Porfavor llena todos los campos para hacer el registro completo");
            
            jUsuario.setText("");
            jCorreo.setText("");
            jPass1.setText("");
            jPass2.setText("");
            jH.setSelected(false);
            jM.setSelected(false);
        }
    }
    
    public jfrRegistrarUsuario() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jEdad = new javax.swing.JTextField();
        jH = new javax.swing.JRadioButton();
        jM = new javax.swing.JRadioButton();
        jComboBox = new javax.swing.JComboBox<>();
        jPass2 = new javax.swing.JPasswordField();
        jPass1 = new javax.swing.JPasswordField();
        jCorreo = new javax.swing.JTextField();
        jUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(580, 540));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsername.setBackground(new java.awt.Color(255, 204, 255));
        jLabelUsername.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabelUsername.setText("Usuario...");
        jLabelUsername.setOpaque(true);
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 230, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setText("Registrar y continuar con el nuevo usuario");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 380, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 204));
        jButton4.setText("Regresar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 80, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setText("Borrar form");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 90, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Registrar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 70, -1));

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("\" MOY'S BAR  SNACKS & FUN \"");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEdad.setBackground(new java.awt.Color(255, 204, 255));
        jEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 20));

        jH.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup.add(jH);
        jH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jH.setText("Hombre ");
        jH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jH, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jM.setBackground(new java.awt.Color(255, 204, 255));
        buttonGroup.add(jM);
        jM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jM.setText("Mujer ");
        jM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jM, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jComboBox.setBackground(new java.awt.Color(255, 204, 255));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesero", "Seguridad", "Cocinero", "Chef", "Cargador", "Conserje", "Barista" }));
        jComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 240, -1));

        jPass2.setBackground(new java.awt.Color(255, 204, 255));
        jPass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, -1));

        jPass1.setBackground(new java.awt.Color(255, 204, 255));
        jPass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, -1));

        jCorreo.setBackground(new java.awt.Color(255, 204, 255));
        jCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 240, -1));

        jUsuario.setBackground(new java.awt.Color(255, 204, 255));
        jUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 240, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Edad:");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText(" Sexo: ");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText(" Puesto: ");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText(" Confirmar contraseña: ");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Contraseña: ");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText(" Correo electronico: ");
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Ingresa un nombre de usuario:");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 490, 320));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jUsuario.setText("");
        jCorreo.setText("");
        jPass1.setText("");
        jPass2.setText("");
        jH.setSelected(false);
        jM.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(identificador < 30){
            registrarNuevoUsuario();
        }
        else{
            JOptionPane.showMessageDialog(null, "Has llenado todos los espacios de usuario, elimina uno");
        }
        jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object [] botones = { "Sí", "No"};
        int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas regresar?", "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
        if(warning == 0){
            jfrMenu menu = new jfrMenu(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object [] botones = { "Sí", "No"};
        int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas regresar cómo " + jUsuario.getText() + "?", "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
        if(warning == 0){
            if(identificador < 30){
                registrarNuevoUsuario();
            }
            else{
                JOptionPane.showMessageDialog(null, "Has llenado todos los espacios de usuario, elimina uno");
            }
            jfrMenu menu = new jfrMenu(empleado, cantidadUsuarios-1, cantidadUsuarios, producto, cantidadProductos);
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JTextField jEdad;
    private javax.swing.JRadioButton jH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JRadioButton jM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPass1;
    private javax.swing.JPasswordField jPass2;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}

