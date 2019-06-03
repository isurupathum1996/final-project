
package Control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.text.MessageFormat;
import java.util.HashMap;
import static javafx.scene.input.KeyCode.G;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import sun.security.x509.AttributeNameEnumeration;

public class AViewAll extends javax.swing.JInternalFrame {

    private Connection con;

    public AViewAll() {
        initComponents();
        Connection  con;
        Statement st;
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
            String s;
            st=con.createStatement();
            s="select * from admin";
            rs=st.executeQuery(s);
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2)});
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(735, 335));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("Admins");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Print Report");
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
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    

        
       try{
            InputStream in=new FileInputStream(new File("G:\\MA\\Bus Reservation\\src\\Reports\\admin.jrxml"));
            JasperDesign jd=JRXmlLoader.load(in);
            String sql="select * from admin";
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            HashMap para=new HashMap();
          
            JasperPrint j=JasperFillManager.fillReport(jr,para,con);
            JasperViewer.viewReport(j,false);
            OutputStream os=new FileOutputStream(new File("G:\\MA\\genReport"));
            JasperExportManager.exportReportToPdfStream(j, os);
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String uname=(String)model.getValueAt(index,0);

    int result=JOptionPane.showConfirmDialog(null,"Want to Delete? ","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
    if(result==JOptionPane.OK_OPTION)
    {
        Connection  con;
        Statement st;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
            String s;
            st=con.createStatement();
            s="delete from admin where Username='"+uname+"'";
            int i=st.executeUpdate(s);
            if(i>0)
            {
                int res=JOptionPane.showConfirmDialog(null,"Deleted Sucessfully","Done",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                if(res==JOptionPane.OK_OPTION)
                {
                    DefaultTableModel model2=(DefaultTableModel) jTable1.getModel();
                    model2.removeRow(index);
                }
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
