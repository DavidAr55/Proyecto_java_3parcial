package proyectoend;
import javax.swing.JOptionPane;
import java.util.Random;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class jfrMenu extends javax.swing.JFrame {
    
    String[] chistes = {"-¿Qué le dice la foca a su madre?\n-I love you, mother foca.", "-Buenas, ¿cuánto cuesta el bus?\n-Un euro.\n-¡Pues que se bajen todos, que me lo quedo!", "-Mamá, ¿Europa está muy lejos?\n-Calla y sigue nadando.", "-Mamá, en el cole me llaman despistado.\n-Niño, que esta no es tu casa.", "-Melón y Melames eran albañiles, Melón agarro la pala y Melames el mazo!.", "-Melón y Melames son carniceros, Melón corta el filete y melames el chorizo.", "-¿Cómo te llamas?\n-Lancelot\n-Pues atrápalot", "-¿Qué hace un vampiro conduciendo un tractor? –Sembrar el miedo.", "-Si los zombies llegan a la tercera edad…, ¿zombiejitos…?", "-¿De dónde vienen los hamster? \n– De Hamsterdam", "– ¿Qué pasa si tiras un pato al agua? \n– Nada", "– Hombre, Juan, cómo has cambiado. \n– Yo no soy Juan. \n– Más a mi favor…", "- ¿Cuál animal puede saltar más alto que una casa? \n- Cualquiera, porque las casas no saltan.", "- Mi hermano anda en bicicleta desde los cinco años. \n- ¿Ah sí? ¡Qué lejos debe de estar ya!", "- ¡Me acaba de picar una serpiente! \n- ¿Cobra? \n- ¡No, idiota, lo ha hecho gratis!", "-¿Por qué llora un libro de matemáticas? \n-¡Porque tiene muchos problemas!"};
    String[] audChiste = {"src/aud/aud1.wav", "src/aud/aud2.wav", "src/aud/aud3.wav", "src/aud/aud4.wav", "src/aud/aud5.wav", "src/aud/aud6.wav", "src/aud/aud7.wav", "src/aud/aud8.wav", "src/aud/aud9.wav", "src/aud/aud10.wav", "src/aud/aud11.wav", "src/aud/aud12.wav", "src/aud/aud13.wav", "src/aud/aud14.wav", "src/aud/aud15.wav", "src/aud/aud16.wav"}; 
    Random random = new Random();
    
    int cantidadUsuarios = 0, identificador = 0;
    Usuario[] empleado = new Usuario[30];
    int cantidadProductos = 11;
    Producto[] producto = new Producto[50];
    
    public jfrMenu(Usuario[] empleado, int i, int cantidadUsuarios, Producto[] producto, int cantidadProductos) {
        initComponents();
        this.empleado = empleado;
        this.identificador = i;
        this.cantidadUsuarios = cantidadUsuarios;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
        
        jLabelUsername.setText(empleado[identificador].getPuesto()+ ": " + empleado[identificador].getUsuario());
    }
        
    public Clip clip;
    public String ruta = "/aud/";
    
    public jfrMenu() {
        initComponents();
    }
    
    public void ReproducirSonido(String nombreSonido){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } 
        catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/strong-alcohol-drinks-in-bar_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 211));

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Cuentame un Chiste");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 40));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Registrar nuevo Usuario");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 40));

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Registrar Producto");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 40));

        jButton5.setBackground(new java.awt.Color(153, 255, 204));
        jButton5.setText("Volver");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 341, -1));

        jLabelUsername.setBackground(new java.awt.Color(153, 255, 204));
        jLabelUsername.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabelUsername.setText("User...");
        jLabelUsername.setOpaque(true);
        jPanel1.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 183, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 330));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));

        jMenu2.setText("Ver más");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setText("Inventario");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Usuarios");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MostrarUsuarios mUser = new MostrarUsuarios(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        mUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object [] botones = { "Sí", "No"};
        int warning = JOptionPane.showOptionDialog (null, "¿Estas seguro que deseas cerrar secion?", "Volver", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[1]);
        //System.out.print(warning);
        if(warning == 0){
            jfrUser user = new jfrUser(empleado, cantidadUsuarios, producto, cantidadProductos);
            user.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int value = random.nextInt(16 + 0) + 0;
        ReproducirSonido(audChiste[value]);
        JOptionPane.showMessageDialog(null, chistes[value]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfrRegistrarUsuario RegistrarUsuario = new jfrRegistrarUsuario(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        RegistrarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jfrAgregarProducto agregar = new jfrAgregarProducto(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jfrMostrarAlmacen almacen = new jfrMostrarAlmacen(empleado, identificador, cantidadUsuarios, producto, cantidadProductos);
        almacen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
