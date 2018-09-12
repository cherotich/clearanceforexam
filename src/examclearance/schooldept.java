package examclearance;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class schooldept extends javax.swing.JPanel {

    public schooldept() {
        initComponents();
        
        ds.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ds.getSelectedItem().equals("School")) {
                    // school.removeAllItems();
                    school.disable();
                    schoolid.setEnabled(true);
                    schoolid.setText("");
                    txtds.setText("");
                    school.removeAllItems();
                } else if (ds.getSelectedItem().equals("Department")) {
                    school.enable();
                    schoolid.setEnabled(false);
                 
                    schoolid.setText("");
                    txtds.setText("");
                    school.removeAllItems();
                    
                     try {
            school.removeAllItems();
            String query = "select schoolname,schoolid from schools";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                school.addItem(rs.getString(1));
                
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }  
                     
                    
                }
                                    
           
                
            }

        });
           school.addItemListener(new ItemListener() {
                  @Override
            public void itemStateChanged(ItemEvent ie) {
                  try {
            
            String query = "select schoolname,schoolid from schools where schoolname='"+school.getSelectedItem().toString()+"' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                schoolid.setText(rs.getString(2));
                
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }}});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ds = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtds = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        schoolid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        school = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setText("Dept/School");

        ds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "School" }));
        ds.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dsPropertyChange(evt);
            }
        });

        jLabel2.setText("Name");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("School id");

        jLabel4.setText("School");

        school.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtds)
                                    .addComponent(school, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(schoolid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schoolid, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(school, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        if (ds.getSelectedItem().equals("School")) {
            if (schoolid.getText().equals("") && txtds.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Ensure that you have entered both school id and school name");
            } else {
                try {
                    String query = "select schoolname,schoolid from schools where schoolname='" + txtds.getText() + "' and schoolid='" + schoolid.getText() + "'";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                    Statement smt = con.createStatement();
                    ResultSet rs = smt.executeQuery(query);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "The school already exist");
                    } else {
                        try {
                            String insertschool = "Insert into schools value (?,?)";
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                            PreparedStatement ps = conn.prepareStatement(insertschool);
                            ps.setString(1, txtds.getText());
                            ps.setString(2, schoolid.getText());
                            ps.execute();
                            JOptionPane.showMessageDialog(null, "Successfull");
                             schoolid.setEnabled(true);
                    schoolid.setText("");
                    txtds.setText("");
                    school.removeAllItems();
                            conn.close();
                        } catch (Exception ex) {

                            JOptionPane.showMessageDialog(null, "Kindly enter another school name or school id it already exist");

                        }
                    }

                } catch (Exception ex) {

                    if (ex.getMessage().startsWith("Primary key violated")) {
                        JOptionPane.showMessageDialog(null, "Kindly enter another school name or school id it already exist");

                    }
                }
            }
        } //check if dept exist if not then add the department
        else if (ds.getSelectedItem().equals("Department")) {
          
            if (txtds.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Ensure that you have entered department name");

            }
            else{
            try {
                String query = "select deptname from school where deptname='" + txtds.getText() + "'";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(query);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "The department already exist");

                }
                else{
               try {
                            String insertschool = "Insert into school value (?,?)";
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                            PreparedStatement ps = conn.prepareStatement(insertschool);
                                 
                            ps.setString(2,schoolid.getText());
                            ps.setString(1, txtds.getText());
                     
                            ps.execute();
                            JOptionPane.showMessageDialog(null, "Successfull");
                             schoolid.setEnabled(true);
                    schoolid.setText("");
                    txtds.setText("");
                    school.removeAllItems();
                            conn.close();
                        } catch (Exception ex) {
ex.printStackTrace();
                           // JOptionPane.showMessageDialog(null, "Kindly enter another department name it already exist");

                        } 
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }}

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void dsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dsPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ds;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> school;
    private javax.swing.JTextField schoolid;
    private javax.swing.JTextField txtds;
    // End of variables declaration//GEN-END:variables
}
