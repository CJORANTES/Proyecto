
package Administrador;

import Administrador.Profesor;
import Administrador.AdministradorCursos;
import Administrador.ActualizarProfesor;
import Proyecto1.Login;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Javier
 */
public class AdministradorProfesores extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();

    public static Profesor[] profesores = new Profesor[50];
    public static int contadorProfesores;

    // Para actualizar profesor
    public static int fila;

    public static String codigo;
    public static String nombre;
    public static String apellido;
    public static String correo;
    public static String contrasenia;
    public static String genero;

    /**
     * Creates new form AdministradorProfesores
     */
    public AdministradorProfesores() {
        this.setContentPane(fondo);
        initComponents();
        actualizarListadoProfesores();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearProfBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoProfesores = new javax.swing.JTable();
        EliminarBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        CargaMBtn = new javax.swing.JButton();
        CargaMBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGenero = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearProfBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CrearProfBtn.setText("Crear Profesor");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CrearProfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 70, -1, -1));

        ListadoProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Contrasenia", "Genero"
            }
        ));
        jScrollPane1.setViewportView(ListadoProfesores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 70, 370, 325));

        EliminarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 118, -1, -1));

        ActualizarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 70, 133, -1));

        CargaMBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CargaMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 118, -1, -1));

        CargaMBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn1.setText("Exportar Listado HTML");
        CargaMBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(CargaMBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 183, 307, -1));

        TablaGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Genero", "Porcentaje"
            }
        ));
        jScrollPane2.setViewportView(TablaGenero);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 220, 110));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Cursos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 27, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listado Profesores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 240, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/cuatro.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CrearProfesor cp = new CrearProfesor();
        cp.setVisible(true);
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();

        for (int i = fila; i < contadorProfesores - 1; i++) {
            profesores[i] = profesores[i + 1];
        }
        // se reduce en 1 la cantidad de profesores
        contadorProfesores--;

        /*
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoProfesores.getModel();
        modeloListado.setRowCount(contadorProfesores);
         */
        actualizarListadoProfesores();

    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();

        codigo = ListadoProfesores.getModel().getValueAt(fila, 0).toString();
        nombre = ListadoProfesores.getModel().getValueAt(fila, 1).toString();
        apellido = ListadoProfesores.getModel().getValueAt(fila, 2).toString();
        correo = ListadoProfesores.getModel().getValueAt(fila, 3).toString();
        contrasenia = ListadoProfesores.getModel().getValueAt(fila, 4).toString();
        genero = ListadoProfesores.getModel().getValueAt(fila, 5).toString();

        this.setVisible(false);
        ActualizarProfesor ap = new ActualizarProfesor();
        ap.setVisible(true);
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    private void CargaMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtnActionPerformed
        // TODO add your handling code here:

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        String filePath = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader reader = null;
        String line = "";

        contadorProfesores = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    Profesor prof = new Profesor(columnas[0], columnas[1],
                            columnas[2], columnas[3], "1234", columnas[4]);

                    profesores[contadorFila - 1] = prof;

                }
                contadorFila++;

            }
            contadorProfesores = contadorFila - 1;
            System.out.println(Arrays.toString(profesores));
            actualizarListadoProfesores();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void CargaMBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaMBtn1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministradorCursos ac = new AdministradorCursos();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarListadoProfesores() {

        if (contadorProfesores > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoProfesores.getModel();
            modeloListado.setRowCount(contadorProfesores);

            for (int i = 0; i < contadorProfesores; i++) {
                modeloListado.setValueAt(profesores[i].codigo, i, 0);
                modeloListado.setValueAt(profesores[i].nombre, i, 1);
                modeloListado.setValueAt(profesores[i].apellido, i, 2);
                modeloListado.setValueAt(profesores[i].correo, i, 3);
                modeloListado.setValueAt(profesores[i].contrasenia, i, 4);
                modeloListado.setValueAt(profesores[i].genero, i, 5);
            }

            // contar generos
            int masculino = 0;
            int femenino = 0;

            for (int i = 0; i < contadorProfesores; i++) {
                // si es hombre
                if (profesores[i].genero.equals("m")) {
                    masculino++;
                    // si es mujer
                } else {
                    femenino++;
                }
            }

            System.out.println(masculino);
            System.out.println(femenino);
            System.out.println(contadorProfesores);

            System.out.println((double) (femenino / contadorProfesores));

            // actualizar tabla
            DefaultTableModel modeloListadoG = (DefaultTableModel) TablaGenero.getModel();
            modeloListadoG.setValueAt("Femenino", 0, 0);
            modeloListadoG.setValueAt("Masculino", 1, 0);

            modeloListadoG.setValueAt((double) ((double) femenino / (double) contadorProfesores) * 100, 0, 1);
            modeloListadoG.setValueAt((double) ((double) masculino / (double) contadorProfesores) * 100, 1, 1);
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
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CargaMBtn1;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JTable ListadoProfesores;
    private javax.swing.JTable TablaGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


}
