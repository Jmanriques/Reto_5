
package reto_5.informeGUI;

import java.sql.*;

import javax.swing.table.DefaultTableModel;

import reto_5.informeDAL.conexion;
/**
 *
 * @author Jhon Manrique
 */
public class frminforme extends javax.swing.JFrame {

    
    /**
     * Creates new form frminforme
     */
    DefaultTableModel model;
    public frminforme() {
        initComponents();
        
        String [] titulos = {"Campo1", "Campo2", "Campo3","Campo4"};
        model = new DefaultTableModel(null, titulos);
        tblInforme_1.setModel(model);
        mostrarDatos_1();
        mostrarDatos_2();
        mostrarDatos_3();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnInforme_1 = new javax.swing.JButton();
        btnInforme_2 = new javax.swing.JButton();
        btnInforme_3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInforme_1 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInforme_1.setText("Informe_1");
        btnInforme_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme_1ActionPerformed(evt);
            }
        });

        btnInforme_2.setText("Informe_2");
        btnInforme_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme_2ActionPerformed(evt);
            }
        });

        btnInforme_3.setText("Informe_3");
        btnInforme_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme_3ActionPerformed(evt);
            }
        });

        tblInforme_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblInforme_1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInforme_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(btnInforme_2)
                        .addGap(67, 67, 67)
                        .addComponent(btnInforme_3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInforme_1)
                    .addComponent(btnInforme_2)
                    .addComponent(btnInforme_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInforme_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme_1ActionPerformed

        this.mostrarDatos_1();
               
            
    }//GEN-LAST:event_btnInforme_1ActionPerformed

    private void btnInforme_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme_2ActionPerformed
        // TODO add your handling code here:
        this.mostrarDatos_2();
    }//GEN-LAST:event_btnInforme_2ActionPerformed

    private void btnInforme_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme_3ActionPerformed
        // TODO add your handling code here:
        this.mostrarDatos_3();
        
    }//GEN-LAST:event_btnInforme_3ActionPerformed

 
    
 
    
        public void mostrarDatos_1(){
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }
        conexion objtConexion = new conexion();
        try{
            ResultSet resultado = objtConexion.consultarRegistros("SELECT ID_Lider,Nombre, Primer_Apellido,"
                    + "Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia");
            while (resultado.next()){
               
                Object []usuario = {resultado.getString("ID_Lider"), resultado.getString("Nombre"), 
                    resultado.getString("Primer_Apellido"),resultado.getString("Ciudad_Residencia")
                
                };
                model.addRow(usuario);
            }
                
            }
            catch (Exception e){
                System.out.println(e);
                
            }
        
    }
        
        public void mostrarDatos_2(){
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }
        conexion objtConexion = new conexion();
        try{
            ResultSet resultado = objtConexion.consultarRegistros("SELECT ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad "
                    + "FROM Proyecto WHERE Ciudad in ('Barranquilla','Santa Marta','Cartagena') "
                    + "and Clasificacion = 'Casa Campestre'");
            while (resultado.next()){
               
                Object []usuario = {resultado.getString("ID_Proyecto"), resultado.getString("Constructora"), 
                    resultado.getString("Numero_Habitaciones"),resultado.getString("Ciudad")
                
                };
                model.addRow(usuario);
            }
                
            }
            catch (Exception e){
                System.out.println(e);
                
            }
        
    }
        
        public void mostrarDatos_3(){
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }
        conexion objtConexion = new conexion();
        try{
            ResultSet resultado = objtConexion.consultarRegistros
        ("SELECT ID_Compra,Constructora,Banco_Vinculado FROM Proyecto JOIN Compra WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento'" );
            while (resultado.next()){
               
                Object []usuario = {resultado.getString("ID_Compra"), resultado.getString("Constructora"), 
                    resultado.getString("Banco_Vinculado")
                
                };
                model.addRow(usuario);
            }
                
            }
            catch (Exception e){
                System.out.println(e);
                
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
            java.util.logging.Logger.getLogger(frminforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme_1;
    private javax.swing.JButton btnInforme_2;
    private javax.swing.JButton btnInforme_3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblInforme_1;
    // End of variables declaration//GEN-END:variables
}