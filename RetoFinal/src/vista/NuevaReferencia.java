/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Equipo
 */
public class NuevaReferencia extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public NuevaReferencia() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMainNuevo = new javax.swing.JButton();
        btnMainEliminar = new javax.swing.JButton();
        lblBuscar1 = new javax.swing.JLabel();
        panelTxtBuscar1 = new javax.swing.JPanel();
        txtBuscar1 = new javax.swing.JTextField();
        panelTxtBuscar2 = new javax.swing.JPanel();
        txtBuscar2 = new javax.swing.JTextField();
        lblBuscar2 = new javax.swing.JLabel();
        lblBuscar3 = new javax.swing.JLabel();
        lblBuscar4 = new javax.swing.JLabel();
        panelTxtBuscar4 = new javax.swing.JPanel();
        txtBuscar4 = new javax.swing.JTextField();
        lblBuscar5 = new javax.swing.JLabel();
        panelTxtBuscar5 = new javax.swing.JPanel();
        txtBuscar5 = new javax.swing.JTextField();
        lblBuscar6 = new javax.swing.JLabel();
        panelTxtBuscar6 = new javax.swing.JPanel();
        txtBuscar6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva Referencia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 250, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Referencia");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, 460, 50));

        btnMainNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnMainNuevo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMainNuevo.setText("Agregar");
        jPanel1.add(btnMainNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, 35));

        btnMainEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnMainEliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnMainEliminar.setText("Cancelar");
        btnMainEliminar.setToolTipText("");
        jPanel1.add(btnMainEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 35));

        lblBuscar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar1.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar1.setText("Nombre");
        lblBuscar1.setToolTipText("");
        jPanel1.add(lblBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        panelTxtBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        panelTxtBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelTxtBuscar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtBuscar1.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar1.setToolTipText("");
        txtBuscar1.setBorder(null);
        panelTxtBuscar1.add(txtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 290, 20));

        jPanel1.add(panelTxtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 80, 300, 22));

        panelTxtBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        panelTxtBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelTxtBuscar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtBuscar2.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar2.setToolTipText("");
        txtBuscar2.setBorder(null);
        panelTxtBuscar2.add(txtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 290, 20));

        jPanel1.add(panelTxtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 200, 300, 22));

        lblBuscar2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar2.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar2.setText("Telefono");
        lblBuscar2.setToolTipText("");
        jPanel1.add(lblBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        lblBuscar3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar3.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar3.setText("Ciudad");
        lblBuscar3.setToolTipText("");
        jPanel1.add(lblBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        lblBuscar4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar4.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar4.setText("Celular");
        lblBuscar4.setToolTipText("");
        jPanel1.add(lblBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        panelTxtBuscar4.setBackground(new java.awt.Color(255, 255, 255));
        panelTxtBuscar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelTxtBuscar4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtBuscar4.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar4.setToolTipText("");
        txtBuscar4.setBorder(null);
        panelTxtBuscar4.add(txtBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 290, 20));

        jPanel1.add(panelTxtBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 240, 300, 22));

        lblBuscar5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar5.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar5.setText("Dirección");
        lblBuscar5.setToolTipText("");
        jPanel1.add(lblBuscar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, -1));

        panelTxtBuscar5.setBackground(new java.awt.Color(255, 255, 255));
        panelTxtBuscar5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelTxtBuscar5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtBuscar5.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar5.setToolTipText("");
        txtBuscar5.setBorder(null);
        panelTxtBuscar5.add(txtBuscar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 290, 20));

        jPanel1.add(panelTxtBuscar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 160, 300, 22));

        lblBuscar6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar6.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuscar6.setText("Email");
        lblBuscar6.setToolTipText("");
        jPanel1.add(lblBuscar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        panelTxtBuscar6.setBackground(new java.awt.Color(255, 255, 255));
        panelTxtBuscar6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelTxtBuscar6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtBuscar6.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar6.setToolTipText("");
        txtBuscar6.setBorder(null);
        panelTxtBuscar6.add(txtBuscar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 290, 20));

        jPanel1.add(panelTxtBuscar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 280, 300, 22));

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 120, 210, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NuevaReferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaReferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaReferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaReferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaReferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainEliminar;
    private javax.swing.JButton btnMainNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblBuscar2;
    private javax.swing.JLabel lblBuscar3;
    private javax.swing.JLabel lblBuscar4;
    private javax.swing.JLabel lblBuscar5;
    private javax.swing.JLabel lblBuscar6;
    private javax.swing.JPanel panelTxtBuscar1;
    private javax.swing.JPanel panelTxtBuscar2;
    private javax.swing.JPanel panelTxtBuscar4;
    private javax.swing.JPanel panelTxtBuscar5;
    private javax.swing.JPanel panelTxtBuscar6;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtBuscar4;
    private javax.swing.JTextField txtBuscar5;
    private javax.swing.JTextField txtBuscar6;
    // End of variables declaration//GEN-END:variables
}