
package Administrador;

//import Administrador.ActualizarCurso;
import Proyecto1.Login;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Javier
 */
public class AdministradorCursos extends javax.swing.JFrame {

    public static Curso[] cursos = new Curso[100];
    public static int contadorCursos;

    // Para actualizar curso
    public static int fila;

    public static String codigo;
    public static String nombre;
    public static String credito;
    public static String profesor;

    /**
     * Creates new form AdministradorCursos
     */
    public AdministradorCursos() {
        initComponents();
        actualizarListadoCursos();
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

        jLabel1 = new javax.swing.JLabel();
        CrearProfBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoCursos = new javax.swing.JTable();
        EliminarBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        CargaMBtn = new javax.swing.JButton();
        ExportarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTop3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Listado Cursos");

        CrearProfBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CrearProfBtn.setText("Crear Curso");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });

        ListadoCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Creditos", "Alumno", "Profesor"
            }
        ));
        jScrollPane1.setViewportView(ListadoCursos);

        EliminarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        CargaMBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });

        ExportarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ExportarBtn.setText("Exportar Listado HTML");
        ExportarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBtnActionPerformed(evt);
            }
        });

        TablaTop3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Puesto", "Curso", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(TablaTop3);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Cursos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CrearProfBtn)
                        .addGap(26, 26, 26)
                        .addComponent(ActualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EliminarBtn)
                        .addGap(72, 72, 72)
                        .addComponent(CargaMBtn))
                    .addComponent(ExportarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CrearProfBtn)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CargaMBtn)
                                    .addComponent(EliminarBtn)))
                            .addComponent(ActualizarBtn))
                        .addGap(35, 35, 35)
                        .addComponent(ExportarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CrearCurso cp = new CrearCurso();
        cp.setVisible(true);
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoCursos.getSelectedRow();

        for (int i = fila; i < contadorCursos - 1; i++) {
            cursos[i] = cursos[i + 1];
        }
        // se reduce en 1 la cantidad de cursos
        contadorCursos--;

        /*
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
        modeloListado.setRowCount(contadorCursos);
         */
        actualizarListadoCursos();

    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoCursos.getSelectedRow();

        codigo = ListadoCursos.getModel().getValueAt(fila, 0).toString();
        nombre = ListadoCursos.getModel().getValueAt(fila, 1).toString();
        credito = ListadoCursos.getModel().getValueAt(fila, 2).toString();
        profesor = ListadoCursos.getModel().getValueAt(fila, 3).toString();
        //contrasenia = ListadoCursos.getModel().getValueAt(fila, 4).toString();
        //genero = ListadoCursos.getModel().getValueAt(fila, 5).toString();

        this.setVisible(false);
        ActualizarCurso ap = new ActualizarCurso();
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


        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    int cantAlumnos = (int) Math.floor(Math.random() * (80 - 0) + 0);
                    Curso curso = new Curso(columnas[0], columnas[1],
                            columnas[2], String.valueOf(cantAlumnos), columnas[3]);

                    cursos[contadorFila - 1] = curso;

                }
                contadorFila++;

            }
            contadorCursos = contadorFila - 1;
            System.out.println(Arrays.toString(cursos));
            actualizarListadoCursos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void ExportarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBtnActionPerformed
        // TODO add your handling code here:
        // codigo nombre creditos alumnos profesor
        String cadenaHTML = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>\n"
                + "\n"
                + "<h1>Ejemplo</h1>\n"
                + "\n"
                + "<table style=\"margin:auto\">\n"
                + "    <tr>\n"
                + "      <th>codigo</th>\n"
                + "      <th>nombre</th>\n"
                + "      <th>creditos</th>\n"
                + "      <th>alumnos</th>\n"
                + "      <th>profesor</th>\n"
                + "    </tr>";

        /*
        <tr>
      <td>Alfreds Futterkiste</td>
      <td>Maria Anders</td>
      <td>Germany</td>
    </tr>
    <tr>
      <td>Centro comercial Moctezuma</td>
      <td>Francisco Chang</td>
      <td>Mexico</td>
    </tr>
         */
        for (int i = 0; i < contadorCursos; i++) {
            cadenaHTML += "<tr>\n"
                    + "<td>" + cursos[i].codigo + "</td>\n"
                    + "<td>" + cursos[i].nombre + "</td>\n"
                    + "<td>" + cursos[i].creditos + "</td>\n"
                    + "<td>" + cursos[i].alumnos + "</td>\n"
                    + "<td>" + cursos[i].profesor + "</td>\n"
                    + "</tr>";
        }
        
        cadenaHTML += "</table>\n"
                + "</body>\n"
                + "</html>\n";
        
        System.out.println(cadenaHTML);
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter("./Reportes/ReporteHTML.html");
            pw = new PrintWriter(fichero);
              
            pw.println(cadenaHTML);
            fichero.close();
            //System.out.println(cadenaHTML);
        }catch (Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_ExportarBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*
        this.setVisible(false);
        CrearCurso cp = new CrearCurso();
        cp.setVisible(true);
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarListadoCursos() {

        if (contadorCursos > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
            modeloListado.setRowCount(contadorCursos);

            for (int i = 0; i < contadorCursos; i++) {
                modeloListado.setValueAt(cursos[i].codigo, i, 0);
                modeloListado.setValueAt(cursos[i].nombre, i, 1);
                modeloListado.setValueAt(cursos[i].creditos, i, 2);
                modeloListado.setValueAt(cursos[i].alumnos, i, 3);
                modeloListado.setValueAt(cursos[i].profesor, i, 4);
            }

            // hacer top 3
            Curso[] arregloCopia = cursos.clone();

            // burbuja
            for (int comprobacion = 0; comprobacion < contadorCursos; comprobacion++) {
                System.out.println("Iniciando comprobacion");

                // ciclo para recorrer los elementos del arreglo
                for (int elementoArreglo = 0; elementoArreglo < contadorCursos - 1; elementoArreglo++) {
                    Curso elementoActual = arregloCopia[elementoArreglo];
                    Curso elementoSiguiente = arregloCopia[elementoArreglo + 1];

                    // si el actual es mayor al siguiente
                    if (Integer.valueOf(elementoActual.alumnos)
                            < Integer.valueOf(elementoSiguiente.alumnos)) {
                        // Se hace el intercambio
                        arregloCopia[elementoArreglo] = elementoSiguiente;
                        arregloCopia[elementoArreglo + 1] = elementoActual;

                    }
                }
            }

            System.out.println("entra aquii");
            // actualizar listado
            DefaultTableModel modeloTop3 = (DefaultTableModel) TablaTop3.getModel();

            modeloTop3.setValueAt("1", 0, 0);
            modeloTop3.setValueAt("2", 1, 0);
            modeloTop3.setValueAt("3", 2, 0);

            for (int i = 0; i < 3; i++) {
                // puesto, nombre, cantidad
                modeloTop3.setValueAt(arregloCopia[i].nombre, i, 1);
                modeloTop3.setValueAt(arregloCopia[i].alumnos, i, 2);
            }

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
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton ExportarBtn;
    private javax.swing.JTable ListadoCursos;
    private javax.swing.JTable TablaTop3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
