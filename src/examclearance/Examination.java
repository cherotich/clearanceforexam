package examclearance;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Examination extends javax.swing.JPanel {

    String columns[] = {"Registration number", " First Name"," Second Name","Marks"};
    Object[][] row = {};
    DefaultTableModel model = new DefaultTableModel(row, columns);

    /**
     * Creates new form Examination
     */
    public Examination() {
        initComponents();
        lectid.setText(studentReg.pfno);
        course.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
             try {
           
            String query = "select Coursecode, Coursename from course where Coursename ='" +course.getSelectedItem().toString()+ "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
              code.setText(rs.getString(1));
            }
            con.close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }   
                
            }
    
    } );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        academicyear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lectid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        labelcats = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelcourse = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        reglabel = new javax.swing.JLabel();
        marks = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        marks1 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        marks2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(899, 711));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), new java.awt.Color(255, 153, 153)));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setPreferredSize(new java.awt.Dimension(744, 520));

        jLabel1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Academic Year");

        academicyear.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017/2018", "2016/2017", "2015/2016" }));

        jLabel4.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Course");

        course.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        course.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                courseMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                courseMouseMoved(evt);
            }
        });
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD CATS OR EXAMS");

        jButton1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Employment number");

        lectid.setEditable(false);
        lectid.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        lectid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lectidMouseEntered(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration number", "First name", "Second name", "Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelcats.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        labelcats.setText("Examination");

        jLabel8.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel8.setText("for");

        labelcourse.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Semester");

        semester.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel10.setText("Reg number");

        label.setText("CAT");

        label1.setText("Main Exam");

        label2.setText("Total");

        jLabel5.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Course Code");

        code.setEditable(false);
        code.setFont(new java.awt.Font("Gisha", 0, 14)); // NOI18N
        code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                codeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(code))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lectid)
                                    .addComponent(course, 0, 189, Short.MAX_VALUE))))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(academicyear, 0, 196, Short.MAX_VALUE)
                                    .addComponent(semester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(reglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(marks1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(748, 748, 748)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(labelcats, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lectid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelcats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(reglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void courseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseDragged
        try {
            course.removeAllItems();
            String query = "select course.Coursename, course.Coursecode,coursestaught.coursecode from coursestaught,course where lectid ='" + lectid.getText().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                course.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseDragged

    private void courseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseMoved
        try {
            course.removeAllItems();
            String query = "select course.Coursename, course.Coursecode,coursestaught.coursecode from coursestaught,course where course.Coursecode=coursestaught.coursecode and coursestaught.lectid ='" + lectid.getText().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                course.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseMoved

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String query = "select Coursecode,Semester,AcademicYear from catsexam where  Coursecode='" + code.getText() + "' and Semester='" + semester.getSelectedItem().toString() + "' and AcademicYear='" + academicyear.getSelectedItem().toString() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "You have alread marked entered the marks for" + semester.getSelectedItem().toString());
            } else {

                model.setRowCount(0);
                try {

                    String queryy = "select coursestaken.RegNo,student.fname,student.fname from coursestaken,student where  coursestaken.RegNo=student.RegNo and  coursestaken.Coursecode='" + code.getText() + "'  and AcademicYear='" + academicyear.getSelectedItem().toString() + "' and Semester='" + semester.getSelectedItem().toString() + "'";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                    Statement smtt = conn.createStatement();
                    ResultSet rss = smtt.executeQuery(queryy);

                    while (rss.next()) {

                        model.addRow(new Object[]{rss.getString(1), rss.getString(2) + "  " + rss.getString(3)});

                    }
                    jTable1.setModel(model);

                    labelcourse.setText(course.getSelectedItem().toString());
                    int index = jTable1.getSelectedRow();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void lectidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectidMouseEntered
        try {
            course.removeAllItems();
            String query = "select course.coursename,coursestaught.Coursecode from coursestaught,course where coursestaught.Coursecode=course.Coursecode and lectid ='" + lectid.getText().toString() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                course.addItem(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }             // TODO add your handling code here:
    }//GEN-LAST:event_lectidMouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        String regn = model.getValueAt(index, 0).toString();
        reglabel.setText(regn);
        marks.setText("");
        marks1.setText("");
        marks2.setText("");
        try {

            String query = "select cats,Exam from catsexam where  Coursecode='" +code.getText() + "' and RegNo=  '" + reglabel.getText() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            if (rs.next()) {
                marks.setText(rs.getString(1));
                marks1.setText(rs.getString(2));

                jButton2.setText("Update Record");

                marks2.setText(String.valueOf(Integer.parseInt(rs.getString(1)) + Integer.parseInt(rs.getString(2))));
            } else {
                System.out.println("No entry");
                jButton2.setText("Insert Record");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //            try {
        //                int rows = jTable1.getRowCount();
        //
        //                Class.forName("com.mysql.jdbc.Driver").newInstance();
        //                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
        //                conn.setAutoCommit(false);
        //                String queryco = "insert into catsexam values(?,?,?,?,?,?)";
        //                PreparedStatement pst = conn.prepareStatement(queryco);
        //                pst.setString(1, reglabel.getText());
        //                pst.setString(2, String.valueOf(course.getSelectedItem()));
        //                pst.setString(3, String.valueOf(academicyear.getSelectedItem()));
        //                pst.setString(4, String.valueOf(semester.getSelectedItem()));
        //                pst.setString(5, marks.getText());
        //                pst.setString(6, "0");
        //                pst.execute();
        //
        //                conn.commit();
        //                System.out.println("Success");
        //
        //            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException exx) {
        //                exx.printStackTrace();
        //            }
        if (jButton2.getText().equalsIgnoreCase("Insert Record")) {
            insert();
        } else if (jButton2.getText().equalsIgnoreCase("Update Record")) {
            update();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void codeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_codeMouseEntered
    public void insert() {
//       try{
//      String query = "select CAT,Exam from catsexam where  coursename='" + String.valueOf(course.getSelectedItem()) + "' and RegNo=  '" + reglabel.getText() + "' ";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
//            Statement smt = con.createStatement();
//            ResultSet rs = smt.executeQuery(query);
//            if(rs.next()){
//            JOptionPane.showMessageDialog(null, "The record already exist");
//            }
//            else{
   
        
        try {
            int rows = jTable1.getRowCount();

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            conn.setAutoCommit(false);
            String queryco = "insert into catsexam values(?,?,?,?,?,? )";
            PreparedStatement pst = conn.prepareStatement(queryco);
            pst.setString(1, reglabel.getText());
            pst.setString(2, code.getText());
            pst.setString(3, String.valueOf(academicyear.getSelectedItem()));
            pst.setString(4, String.valueOf(semester.getSelectedItem()));
            pst.setString(5, marks.getText());
            pst.setString(6, "0");
          
            pst.execute();

            conn.commit();
            JOptionPane.showMessageDialog(null, "Successful");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException exx) {
            exx.printStackTrace();
        }

        
            //}
           
        
    //} 
//        catch(Exception e){
//                    e.printStackTrace();
//                    }
    }
    public void update() {
        try {
            int rows = jTable1.getRowCount();

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            conn.setAutoCommit(false);
            String queryco = "UPDATE catsexam set cats='" + this.marks.getText().toString() + "',exam='" + this.marks1.getText().toString() + "' where RegNo='" + reglabel.getText() + "'";
            PreparedStatement pst = conn.prepareStatement(queryco);

            pst.execute();

            conn.commit();
            System.out.println("Success");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException exx) {
            exx.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> academicyear;
    private javax.swing.JTextField code;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelcats;
    private javax.swing.JLabel labelcourse;
    private javax.swing.JTextField lectid;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField marks1;
    private javax.swing.JTextField marks2;
    private javax.swing.JLabel reglabel;
    private javax.swing.JComboBox<String> semester;
    // End of variables declaration//GEN-END:variables
}
