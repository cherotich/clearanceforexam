package examclearance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Attendance extends javax.swing.JPanel {

    String columns[] = {"Reg No", "Name", "Status",};
    Object[][] row = {};
     DefaultTableModel model = new DefaultTableModel(row, columns){
     
  

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

        }};
//        
//        
//
//    };

    public Attendance() {
        initComponents();
        lectid.setText(studentReg.pfno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        school_combo = new javax.swing.JComboBox<>();
        Coursename = new javax.swing.JComboBox<>();
        combo_week = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dept_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        courselabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        weeklabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_academicyear = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        lectid = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(744, 520));

        jLabel1.setFont(new java.awt.Font("Gisha", 1, 24)); // NOI18N
        jLabel1.setText("Attendance selection");

        jLabel2.setFont(new java.awt.Font("Gisha", 1, 24)); // NOI18N
        jLabel2.setText("Mark Attendance");

        jLabel3.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel3.setText("Course name");

        jLabel4.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel4.setText("Week");

        jLabel5.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel5.setText("School");

        school_combo.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        school_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "school" }));
        school_combo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                school_comboMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                school_comboMouseMoved(evt);
            }
        });

        Coursename.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        Coursename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "course" }));
        Coursename.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CoursenameMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CoursenameMouseMoved(evt);
            }
        });

        combo_week.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        combo_week.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_weekActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel6.setText("Department");

        dept_combo.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        dept_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dept" }));
        dept_combo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dept_comboMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dept_comboMouseMoved(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration number", "Name", "Present/Absent"
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

        submit.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel7.setText("Attendance for");

        courselabel.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel9.setText("Week");

        weeklabel.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Gisha", 0, 12)); // NOI18N
        jLabel12.setText("Academic year");

        combo_academicyear.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        combo_academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015/2016", "2016/2017", "2017/2018", "2019/2020" }));

        jLabel13.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel13.setText("Employment no");

        lectid.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(courselabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(weeklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_academicyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lectid)
                                    .addComponent(school_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo_week, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Coursename, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap(88, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lectid, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dept_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Coursename, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(school_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_week))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courselabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(weeklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void school_comboMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_school_comboMouseDragged
        try {
            school_combo.removeAllItems();
            String query = "select distinct schoolname from school";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1));
                school_combo.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_school_comboMouseDragged

    private void school_comboMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_school_comboMouseMoved
        try {
            school_combo.removeAllItems();
            String query = "select distinct schoolname from schoolS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                //System.out.println(rs.getString(1));
                school_combo.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_school_comboMouseMoved

    private void CoursenameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursenameMouseDragged
        try {
            Coursename.removeAllItems();
            String query = "select coursename from coursestaught where    lectid='" + lectid.getText() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                Coursename.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }               // TODO add your handling code here:
    }//GEN-LAST:event_CoursenameMouseDragged

    private void CoursenameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursenameMouseMoved
        try {
            Coursename.removeAllItems();
            String query = "select course.coursename,course.Coursecode,coursestaught.coursecode from coursestaught,course where  coursestaught.coursecode=course.Coursecode and   lectid='" + lectid.getText() + "' and course.deptname='"+dept_combo.getSelectedItem().toString()+"'  ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                Coursename.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_CoursenameMouseMoved

    private void dept_comboMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept_comboMouseDragged
        try {
            dept_combo.removeAllItems();
            String query = "select deptname from school where schoolname ='" + school_combo.getSelectedItem() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                dept_combo.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_dept_comboMouseDragged

    private void dept_comboMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept_comboMouseMoved
        try {
            dept_combo.removeAllItems();
            String query = "select school.deptname,schools.schoolname,school.schoolid,schools.schoolid from school,schools where schools.schoolid=school.schoolid and schools.schoolname ='" + school_combo.getSelectedItem() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                dept_combo.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_dept_comboMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      model.setRowCount(0);
        try{
        
           String query = "select Coursename,week from attendance where week='" + combo_week.getSelectedItem() + "'and Coursename='" + Coursename.getSelectedItem() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
        if(rs.next()){
        JOptionPane.showMessageDialog(null, "You have already marked the attendance for week"+combo_week.getSelectedItem());
       }
        else{
        
        try {

            String queryy = "select coursestaken.RegNo,student.fname,student.lname,student.RegNo,course.Coursename from coursestaken,student,course,coursestaught where coursestaught.coursecode=course.Coursecode and coursestaken.Coursecode=course.Coursecode and  coursestaught.lectid='"+lectid.getText()+"' and coursestaken.RegNo=student.RegNo and course.coursename='" + Coursename.getSelectedItem().toString() + "' and coursestaken.AcademicYear='" + combo_academicyear.getSelectedItem().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smtt = conn.createStatement();
            ResultSet rss = smtt.executeQuery(queryy);

            while (rss.next()) {
              
                model.addRow(new Object[]{rss.getString(1), rss.getString(2).concat(rss.getString(3)), false});

            }
            jTable1.setModel(model);

            courselabel.setText(Coursename.getSelectedItem().toString());
            weeklabel.setText(combo_week.getSelectedItem().toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }
        
        }
        catch (Exception e){
        e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int index = jTable1.getSelectedRow();
        String regn = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
for(int i=0;i<jTable1.getRowCount();i++){
    Boolean checked=Boolean.valueOf(jTable1.getValueAt(i, 2).toString());
    String regg=jTable1.getValueAt(i, 0).toString();
    String nem=jTable1.getValueAt(i, 1).toString();
    if(checked){
       try {          
            String query = "select RegNo,Coursename,week from attendance where RegNo='" + regg + "' and week='" + combo_week.getSelectedItem() + "'and Coursename='" + Coursename.getSelectedItem() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "record exist");

            } else {
                try {
                    
                    
                    int rows = jTable1.getRowCount();

                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                    conn.setAutoCommit(false);
                    String queryco = "insert into attendance values(?,?,?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(queryco);
//                    pst.setString(1, reg.getText());
                     pst.setString(1, regg);
                    pst.setString(2, "P");
                    pst.setString(3, String.valueOf(Coursename.getSelectedItem()));
                    pst.setString(4, String.valueOf(combo_week.getSelectedItem()));
                    pst.setString(5, String.valueOf(combo_academicyear.getSelectedItem()));

                    pst.execute();
 System.out.println("Success");
                    JOptionPane.showMessageDialog(null, "success");
                    conn.commit();
                   

                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException exx) {
                    exx.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
}
    else{
      try {
                    
                    
                    int rows = jTable1.getRowCount();

                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                    conn.setAutoCommit(false);
                    String queryco = "insert into attendance values(?,?,?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(queryco);
//                    pst.setString(1, reg.getText());
                     pst.setString(1, regg);
                    pst.setString(2, "A");
                    pst.setString(3, String.valueOf(Coursename.getSelectedItem()));
                    pst.setString(4, String.valueOf(combo_week.getSelectedItem()));
                    pst.setString(5, String.valueOf(combo_academicyear.getSelectedItem()));

                    pst.execute();
 System.out.println("Success");
                    JOptionPane.showMessageDialog(null, "success");
                    conn.commit();
                   

                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException exx) {
                    exx.printStackTrace();
                }
    
    
    }
    
}


    }//GEN-LAST:event_submitActionPerformed

    private void combo_weekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_weekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_weekActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Coursename;
    private javax.swing.JComboBox<String> combo_academicyear;
    private javax.swing.JComboBox<String> combo_week;
    private javax.swing.JLabel courselabel;
    private javax.swing.JComboBox<String> dept_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lectid;
    private javax.swing.JComboBox<String> school_combo;
    private javax.swing.JButton submit;
    private javax.swing.JLabel weeklabel;
    // End of variables declaration//GEN-END:variables
}
