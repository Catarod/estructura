package aplicaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;




import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import clases.Docente;
import clases.Asignatura;
import clases.Sala;
import javax.swing.JOptionPane;
/**
 *
 * @author Catita
 */
public class DlgIngresoAsignatura extends javax.swing.JDialog {  
    String cod;
    String nombre;
    String docente;
    String jornada;
    String horario;
    String sala;
    
    public DlgIngresoAsignatura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(320, 450);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cboJornada = new javax.swing.JComboBox<>();
        cboHorario = new javax.swing.JComboBox<>();
        cboSala = new javax.swing.JComboBox<>();
        cboDocente = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Asignaturas");
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de Asignaturas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 330, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Horario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 220, 60, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Código:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 60, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Docente:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 140, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Sala:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 260, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Jornada:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 180, 60, 20);

        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(90, 100, 160, 30);

        txtCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(90, 60, 160, 30);

        cboJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurna", "Vespertina" }));
        cboJornada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJornadaActionPerformed(evt);
            }
        });
        getContentPane().add(cboJornada);
        cboJornada.setBounds(90, 180, 160, 30);

        cboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cboHorario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(cboHorario);
        cboHorario.setBounds(90, 220, 160, 30);

        cboSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSala.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSalaActionPerformed(evt);
            }
        });
        getContentPane().add(cboSala);
        cboSala.setBounds(90, 260, 160, 30);

        cboDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDocente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(cboDocente);
        cboDocente.setBounds(90, 140, 160, 30);

        btnInscribir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInscribir);
        btnInscribir.setBounds(100, 300, 120, 40);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(30, 350, 80, 30);

        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnSalir);
        btnSalir.setBounds(190, 350, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJornadaActionPerformed
        
    }//GEN-LAST:event_cboJornadaActionPerformed

    private void cboHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHorarioActionPerformed
        
    }//GEN-LAST:event_cboHorarioActionPerformed

    private void cboSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSalaActionPerformed
        
    }//GEN-LAST:event_cboSalaActionPerformed

    private void cboDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDocenteActionPerformed
        
    }//GEN-LAST:event_cboDocenteActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        if(verificar()){
            inscribir();
        }
    }//GEN-LAST:event_btnInscribirActionPerformed
    public boolean verificar(){
         boolean ok=false;
        if(cod==""){
            JOptionPane.showMessageDialog(null, "codigo no debe estar vacio");
        }
        else if(nombre==""){
            JOptionPane.showMessageDialog(null, "nombre no debe estar vacio");
        }
        else if(docente=="")
        {
            JOptionPane.showMessageDialog(null, "seleccionar docente");
        }
        else if(jornada=="Seleccionar"){
            JOptionPane.showMessageDialog(null, "debe Seleccionar una jornada");
        }
        else if(horario =="Seleccionar"){
            JOptionPane.showMessageDialog(null, "debe Seleccionar un horario");
        }
        else if(sala=="Seleccionar"){
            JOptionPane.showMessageDialog(null, "debe Seleccionar una sala");
        }
        else{
            ok=true;
        }
        return ok;
    }
    public void inscribir(){
        
    cod=this.txtCodigo.getText();
     nombre=this.txtNombre.getText();
     docente=this.cboDocente.getSelectedItem().toString();
     jornada=this.cboJornada.getSelectedItem().toString();
     horario=this.cboHorario.getSelectedItem().toString();
     sala=this.cboSala.getSelectedItem().toString();
        Asignatura asig = new Asignatura(cod,nombre,docente,jornada);
        asig.addAsignatura(sala, horario);
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
            java.util.logging.Logger.getLogger(DlgIngresoAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgIngresoAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgIngresoAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgIngresoAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgIngresoAsignatura dialog = new DlgIngresoAsignatura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboDocente;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboJornada;
    private javax.swing.JComboBox<String> cboSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
