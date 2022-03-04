
package lab7;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author rsk
 */
public class Menu extends javax.swing.JFrame {
     private adminEquipos admin = new adminEquipos("./listaequipos.txt");
    
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearEqui = new javax.swing.JDialog();
        jMenuBar1 = new javax.swing.JMenuBar();
        crear = new javax.swing.JMenu();
        Crear = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        cargarArchivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout CrearEquiLayout = new javax.swing.GroupLayout(CrearEqui.getContentPane());
        CrearEqui.getContentPane().setLayout(CrearEquiLayout);
        CrearEquiLayout.setHorizontalGroup(
            CrearEquiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        CrearEquiLayout.setVerticalGroup(
            CrearEquiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear.setText("Equipos");

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        crear.add(Crear);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        crear.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        crear.add(Eliminar);

        cargarArchivo.setText("CargarNuevoArchivo");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });
        crear.add(cargarArchivo);

        jMenuBar1.add(crear);

        jMenu2.setText("Partidos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
       String nombreEquipo=JOptionPane.showInputDialog("Ingrese el nombre del equipo");
        try {
            admin.guardar();
            admin.setequipos(new equipos(nombreEquipo));
            admin.escritura();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo crear el equipo");
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
       
        
        
        
    }//GEN-LAST:event_cargarArchivoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear;
    private javax.swing.JDialog CrearEqui;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem cargarArchivo;
    private javax.swing.JMenu crear;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
