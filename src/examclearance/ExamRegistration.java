package examclearance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExamRegistration extends javax.swing.JPanel {
public double amount;
    public int u;
    String columns[] = {"Course name", "Attedance(%)", "Select",};
    Object[][] row = {};
    String[] attendance;
    DefaultTableModel model = new DefaultTableModel(row, columns) {

        public Class<?> getColumnClass(int column) {

            switch (column) {
                case 0:
                    return String.class;
                case 1:
                    return String.class;
                case 2:
                    return Boolean.class;
                default:
                    return String.class;
            }

        }
    };

    public ExamRegistration() {
        initComponents();
        regno.setText(studentReg.reg);
        //jTable1.setCellSelectionEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        academicyear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sem = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        units = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), new java.awt.Color(255, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Gisha", 0, 24)); // NOI18N
        jLabel1.setText("Register for exam");

        jLabel2.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel2.setText("Registration number");

        regno.setEditable(false);
        regno.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnoActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel3.setText("Academic Year");

        academicyear.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015/2016", "2016/2017", "2017/2018", "2018/2019", "2020/2021" }));
        academicyear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                academicyearMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                academicyearMouseMoved(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel5.setText("Semester");

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course name", "Attendance(%)", "Select"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                semMouseMoved(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel8.setText("Eligible to register for");

        jLabel9.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel9.setText("Units");

        units.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(432, 432, 432))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(191, 191, 191)
                                        .addComponent(jButton1)))))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(register)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        //UNIT COSTING

        try {
            String qr = "Select ExpectedAmount, AmountPaid from fees where Regno='" + regno.getText() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smtt = conn.createStatement();
            ResultSet rss = smtt.executeQuery(qr);
            while (rss.next()) {
                String AP = rss.getString(2);
                 amount = Double.parseDouble(AP);
                double unit = amount / 5000;
                u = (int) Math.round(unit);

            }
        } catch (Exception en) {
            en.getMessage();
        }
        //CHECKED VALUES
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            //int selected = jTable1.getSelectedRowCount();
            boolean checked = Boolean.valueOf(jTable1.getValueAt(i, 2).toString());
            //String nem = jTable1.getValueAt(i, 1).toString();

            if (checked) {

                 int selected = jTable1.getSelectedRowCount();
               // String n = "m";
                ///int a=Integer.parseInt(jTable1.getValueAt(i, 1).toString());
                Double[] at = new Double[200];
          
                       at[i] = Double.parseDouble(jTable1.getValueAt(i, 1).toString());
                
             
  
//                 System.out.println("array values:" + at[i]);
//                             //System.out.println("array lenght:" + at.length);
//                             
//                            System.out.println("array lenght:"+selected);  
                            
            
                double t = (double) u;
                
                //System.out.println(attend);
                 if (selected >u) {
                    JOptionPane.showMessageDialog(null, "The number of selected units should be equal or less than the number of units you are eligible to register" + t);

                }  else{
//                 }
//                if(selected < u && selected>0){
                String attend = jTable1.getValueAt(i, 1).toString();
                Double attt = Double.parseDouble(attend);
                    t = (int) Math.round(attt);
                 if (t >80) {
                  System.out.println(attt);

 
   



                    try {

                      //  String query = "select catsexam.cats,catsexam.exam from catsexam,course where course.Coursename='"+jTable1.getValueAt(i, 1).toString()+"'and catsexam.Coursecode=course.Coursecode and catsexam.AcademicYear='" + academicyear.getSelectedItem() + "' and  catsexam.RegNo='" + regno.getText() + "' ";
                        String query = "select cats,exam  from catsexam where AcademicYear='" + academicyear.getSelectedItem() + "' and  RegNo='" + regno.getText() + "' ";

                      Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                        Statement smt = con.createStatement();
                        ResultSet rs = smt.executeQuery(query);

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "You have already done the exam for"+jTable1.getValueAt(i,0).toString());

                        }  else{
                            try {

                                String qu = "select Coursecode  from registeredforexam where Coursecode='"+jTable1.getValueAt(i,0).toString()+"' and AcademicYear='" + academicyear.getSelectedItem() + "' and  Regno='" + regno.getText() + "' and Coursecode='"+jTable1.getValueAt(i,0).toString()+"'";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                                Statement smtt = conn.createStatement();
                                ResultSet rss = smtt.executeQuery(qu);

                                if (rss.next()) {
                                    JOptionPane.showMessageDialog(null, "You have already registered for" +jTable1.getValueAt(i,0).toString());
                                } else {

                                    try {
                                        int rows = jTable1.getRowCount();

                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                                        connect.setAutoCommit(false);
                                        String queryco = "insert into registeredforexam values(?,?,?,?)";
                                        PreparedStatement pst = connect.prepareStatement(queryco);
                                        pst.setString(1, regno.getText());
                                        pst.setString(2, jTable1.getValueAt(i, 0).toString());
                                        pst.setString(3, String.valueOf(academicyear.getSelectedItem()));
                                        pst.setString(4, String.valueOf(sem.getSelectedItem()));

                                        pst.execute();
                                        connect.commit();
                                        JOptionPane.showMessageDialog(null, "Successful registration of" + jTable1.getValueAt(i,0).toString());

                                    } catch (Exception ee) {
                                        ee.getMessage();
                                    }

                                }

                            } catch (Exception ex) {
                                ex.getMessage();
                            }

                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                                

                    }

                } else if (attt < 80.0) {
 System.out.println("t");
                    try {

                        String quer = "select cats,exam  from catsexam where AcademicYear='" + academicyear.getSelectedItem() + "' and  RegNo='" + regno.getText() + "' ";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                        Statement smt = con.createStatement();
                        ResultSet rs = smt.executeQuery(quer);

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "You have already done the exam or the attendance is less than 80% for "+jTable1.getValueAt(i, 0).toString());

                        }
                    } catch (Exception em) {
                        em.getMessage();
                    }

                }
            }
          
            }
        }

    }//GEN-LAST:event_registerActionPerformed

    private void academicyearMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicyearMouseDragged

        try {
            academicyear.removeAllItems();
            String query = "select AcademicYear from coursestaken where regno='" + regno.getText() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                academicyear.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_academicyearMouseDragged

    private void academicyearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicyearMouseMoved

        try {
            academicyear.removeAllItems();
            String query = "select AcademicYear from coursestaken where regno='" + regno.getText() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                academicyear.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_academicyearMouseMoved

    private void regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_regnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model.setRowCount(0);
        try {

            String query = "select coursename,count(attendance.Status) from attendance where   attendance.RegNo='" + regno.getText() + "' and attendance.Status='P' group by attendance.Coursename";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {

                double totalattendance = ((Double.parseDouble(rs.getString(2)) / 13) * 100);
                int ta = (int) Math.round(totalattendance);

                model.addRow(new Object[]{rs.getString(1), ta, false});
               
                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Boolean checked = Boolean.valueOf(jTable1.getValueAt(i, 2).toString());
                    String coz = jTable1.getValueAt(i, 0).toString();
                    String attend = jTable1.getValueAt(i, 1).toString();
                    int att = Integer.parseInt(attend);
                    Boolean a = checked.booleanValue();
                    System.out.println(a);
                    if (att < 80) {
                        DefaultTableModel dtm = new DefaultTableModel(i, 2) {
                            public boolean isCellEditable(int row, int column) {

                                return false;
                            }

                        };
                        jTable1.setModel(dtm);
                    }

                }

            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

        } catch (Exception ee) {
            ee.getMessage();
        }
        try {
            String qr = "Select ExpectedAmount, AmountPaid from fees where Regno='" + regno.getText() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smtt = conn.createStatement();
            ResultSet rss = smtt.executeQuery(qr);
            while (rss.next()) {
                String AP = rss.getString(2);
                double amount = Double.parseDouble(AP);
                double units = amount / 5000;
                u = (int) Math.round(units);

            }
        } catch (Exception en) {
            en.getMessage();
        }

        units.setText(String.valueOf(u));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void semMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseMoved

        try {
            sem.removeAllItems();
            String query = "select Semester from coursestaken where regno='" + regno.getText() + "' and AcademicYear='" + academicyear.getSelectedItem().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                sem.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sem.removeAllItems();
            String query = "select Semester from coursestaken where regno='" + regno.getText() + "' and AcademicYear='" + academicyear.getSelectedItem().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                sem.addItem(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseMoved

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTable1MouseClicked

    //check attendance
    public void checkattendance() {

        try {
            String query = " select count(RegNo) as count from attendance where RegNo='" + regno.getText() + "'and AcademicYear='" + academicyear.getSelectedItem().toString() + "' and Status='present' group by RegNo";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                // course.addItem(rs.getString(1));
                // String attendances=rs.getString(1);
                //if(attendances.matches("Present")){
                System.out.println("Present :" + rs.getString(1) + " times");
                String at = rs.getString(1);

                //int attend=Integer.parseInt(at);
                double totalattendance = ((Double.parseDouble(at) / 13) * 100);

                System.out.println("Your attendance is " + totalattendance + "%");
                // }
                //System.out.println(rs.getString(1)+" "+attendances);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//check fees
    public void checkfees() {

    }

    //check previous cats and exams
    public void checkcatsexams() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> academicyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton register;
    private javax.swing.JTextField regno;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JLabel units;
    // End of variables declaration//GEN-END:variables
}
