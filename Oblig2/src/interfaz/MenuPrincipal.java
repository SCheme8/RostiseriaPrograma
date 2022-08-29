// Santiago Chemello (251469)
package interfaz;

import dominio.Sistema;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal(Sistema unSistema) {
        initComponents();
        sistema = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSistemaVacio = new javax.swing.JMenuItem();
        cargarSoloDatosDePrueba = new javax.swing.JMenuItem();
        datosEjecucionPrevia = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/RostiseriaIcon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 380, 290));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROTISERIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 210, -1));

        jMenu1.setText("Menu Principal");

        menuSistemaVacio.setText("Comenzar con sistema vacio");
        menuSistemaVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSistemaVacioActionPerformed(evt);
            }
        });
        jMenu1.add(menuSistemaVacio);

        cargarSoloDatosDePrueba.setText("Cargar solo datos de prueba");
        cargarSoloDatosDePrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarSoloDatosDePruebaActionPerformed(evt);
            }
        });
        jMenu1.add(cargarSoloDatosDePrueba);

        datosEjecucionPrevia.setText("Continuar con la ejecucion previa");
        datosEjecucionPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosEjecucionPreviaActionPerformed(evt);
            }
        });
        jMenu1.add(datosEjecucionPrevia);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ventanaRostiseriaVisible() {
        VentanaRotiseria vent = new VentanaRotiseria(sistema);
        vent.setVisible(true);
    }

    private void menuSistemaVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSistemaVacioActionPerformed
        ventanaRostiseriaVisible();
        dispose();
    }//GEN-LAST:event_menuSistemaVacioActionPerformed

    private void cargarSoloDatosDePruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarSoloDatosDePruebaActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        if (archivo == null) {
            JOptionPane.showMessageDialog(null, "No se selecciono un archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String ruta = archivo.getAbsolutePath();
            sistema.leerArchivo(ruta);

            ventanaRostiseriaVisible();
            dispose();
        }
    }//GEN-LAST:event_cargarSoloDatosDePruebaActionPerformed

    private void datosEjecucionPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosEjecucionPreviaActionPerformed

        try {
            FileInputStream file = new FileInputStream("archivo");
            ObjectInputStream in = new ObjectInputStream(file);

            sistema = (Sistema) in.readObject();

            in.close();
            file.close();

        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }

        ventanaRostiseriaVisible();
        dispose();

    }//GEN-LAST:event_datosEjecucionPreviaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cargarSoloDatosDePrueba;
    private javax.swing.JMenuItem datosEjecucionPrevia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuSistemaVacio;
    // End of variables declaration//GEN-END:variables
    private Sistema sistema;
}
