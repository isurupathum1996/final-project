package Control;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EditBus extends javax.swing.JInternalFrame {
int index;
String busno;
    public EditBus() {
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
            s="select * from bus_detail";
            rs=st.executeQuery(s);
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb2 = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(775, 400));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("All Bus Details");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Edit Bus Detail");

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus No.", "Source", "Destination", "Time", "Price", "Seats"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Bus No :");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Seats :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Source :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Destination :");

        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("G:\\MA\\jdbc\\student\\img\\Actions-edit-clear-icon.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setText("Date & Time :");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel8.setText("Price :");

        t2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        t5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        t6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("G:\\MA\\jdbc\\student\\img\\Save-icon.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Galle", "Anuradhapuraya", "Akuressa", "Aluthgama", "Bandarawela", "Badulla", "Colombo", "Deniyaya", "Nuwara Eliya", "Matugama", "Kandy" }));

        cb1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Galle", "Colombo", "Matarar" }));

        jLabel9.setText("Rs/=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(cb1, 0, 173, Short.MAX_VALUE)
                            .addComponent(t5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        busno=(String)model.getValueAt(index,0);

    int result=JOptionPane.showConfirmDialog(null,"Want to Edit? ","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
    if(result==JOptionPane.OK_OPTION)
    {
        Connection  con;
        Statement st;
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
            String s;
            st=con.createStatement();
            s="select * from bus_detail where Bus_No='"+busno+"'";
            rs=st.executeQuery(s);
            if(rs.next())
            {
                String bus_no=rs.getString("Bus_No");
                String source=rs.getString("Source");
                String destination =rs.getString("Destination");
                String time=rs.getString("Time");
                String price=rs.getString("Price");
                String seat=rs.getString("Seats");
            
            
                t1.setText(bus_no);
                cb1.setSelectedItem(source);
                cb2.setSelectedItem(destination);
                t2.setText(time);
                t5.setText(price);
                t6.setText(seat);
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }

 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        t1.setText("");
        t2.setText("");
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        t5.setText("");
        t6.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Connection  con;
        Statement st;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
            String s="0";
            st=con.createStatement(); 
            s="update bus_detail set Bus_No='"+t1.getText()+"',Source='"+cb1.getSelectedItem()+"',Destination='"+cb2.getSelectedItem()+"',Time='"+t2.getText()+"',Price="+Integer.parseInt(t5.getText())+",Seats="+Integer.parseInt(t6.getText())+" where Bus_No='"+busno+"'"; 
            st.executeUpdate(s);
            t1.setText("");
            t2.setText("");
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            t5.setText("");
            t6.setText("");
            int result=JOptionPane.showConfirmDialog(null,"Edited Sucessfully","Done",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
            if(result==JOptionPane.OK_OPTION)
            {
                Connection  conn;
                Statement stt;
                ResultSet rs;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
                    String ss;
                    stt=con.createStatement();
                    ss="select * from bus_detail";
                    rs=st.executeQuery(ss);
                    DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                    while(rs.next())
                    {   
                        model.removeRow(index);
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                     }
                }
                catch(Exception  e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                Connection  conn;
                Statement stt;
                ResultSet rs;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busmanage","root","");
                    String ss;
                    stt=con.createStatement();
                    ss="select * from bus_detail";
                    rs=st.executeQuery(ss);
                    DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                    while(rs.next())
                    {   
                        model.removeRow(index);
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                     }
                }
                catch(Exception  e)
                {
                    System.out.println(e);
                }
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
