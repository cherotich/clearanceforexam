package examclearance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class test extends javax.swing.JFrame {
//

    // String columns[] = {"Select", "Course", "Attendance",};
    Object[][] row = {};
    DefaultTableModel model = new DefaultTableModel() {

        public Class<?> getColumnClass(int column) {

            switch (column) {
                case 0:
                    return Boolean.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                default:
                    return String.class;
            }

        }

    };

    public String coursename;
    int nocourses;
    public String cousre;
    public double attendance;

    public test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        reg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        academicyear = new javax.swing.JComboBox<>();
        sem = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Reg no");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel2.setText("Academic Year");

        jLabel3.setText("Semester");

        academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        academicyear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                academicyearMouseMoved(evt);
            }
        });

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                semMouseMoved(evt);
            }
        });

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reg)
                            .addComponent(sem, 0, 78, Short.MAX_VALUE)
                            .addComponent(academicyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnsubmit)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(register)
                        .addGap(404, 404, 404))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c1)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(c2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnsubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(c3)))
                .addGap(90, 90, 90)
                .addComponent(register)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
// model.setRowCount(0);
// try{
// if(reg.getText().equals("")){
// JOptionPane.showMessageDialog(null,"Kindly ensure that you have entered your reg no");
//
// }
// else
//     
// {
//    
//  model.addRow(new Object[]{false});
// 
//     
// 
// }
// table.setModel(model);
// model.addColumn("Select");
// model.addColumn("Course");
// }
// catch(Exception ev){
// ev.printStackTrace();}

//
//        table.setModel(model);
//        model.addColumn("select");
//        model.addColumn("course");
//        model.addColumn("attendance");
////nocoursestaken();
//DefaultTableModel model = new DefaultTableModel() {
//        public Class<?> getColumnClass(int column) {
//            switch (column) {
//                case 0:
//                    return Boolean.class;
//                case 1:
//                    return String.class;
//                case 2:
//                    return String.class;
//                default:
//                    return String.class;
//            }
//
//        }
//
//    };
//    
//    //row
//    
//    for(int i=0;i<=nocourses;i++){
//model.addRow(new Object[0]);
//model.setValueAt(false, i, 0);
//model.setValueAt(coursename, i, 1);
//model.setValueAt("attendance", i, 2);
//}
//attendance();
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void academicyearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicyearMouseMoved

        try {
            academicyear.removeAllItems();
            String query = "select AcademicYear from coursestaken where regno='" + reg.getText() + "' ";
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
        // TODO add your handling code here:
    }//GEN-LAST:event_academicyearMouseMoved

    private void semMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseMoved
//        try {
//            sem.removeAllItems();
//            String query = "select Semester from coursestaken where regno='" + reg.getText() + "' and AcademicYear='" + academicyear.getSelectedItem().toString() + "'";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
//            Statement smt = con.createStatement();
//            ResultSet rs = smt.executeQuery(query);
//
//            if (rs.next()) {
//                sem.addItem(rs.getString(1));
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseMoved

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        model.setRowCount(0);
        try {
            if (reg.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kindly ensure that you have entered your reg no");

            } else {
                String query = "select RegNo from student where RegNo='" + reg.getText() + "'  ";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(query);
                if (rs.next()) {
                    //model.addRow(new Object[]{false,rs.getString(1)});

                    model.addRow(new Object[]{false, coursename});

                    //  model.addColumn("Course");
                    //model.addRow(new Object[]{coursename});
                } else {

                    JOptionPane.showMessageDialog(null, "Kindly ensure that you have typed your reg no correctly");
                }

            }
            table.setModel(model);
            model.addColumn("Select");
            model.addColumn("Course");
            model.addColumn("Attendance");
        } catch (Exception ev) {
            ev.printStackTrace();
        }

coursestaken();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed
//methods

    //courses taken
    public void coursestaken() {
        try {

            String query = "select coursename from coursestaken where regno='" + reg.getText() + "' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            int num = 0;
            while (rs.next()) {
              
                if (num == 0) {
                    c1.setText(rs.getString(1));
                }
                else if(num==1)
                {
                    c2.setText(rs.getString(1));
                    
                }
                else if(num==2)
                {
                    c3.setText(rs.getString(1));
                    
                }
                num++;
                coursename = rs.getString(1);

                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //number of the courses taken
    public void nocoursestaken() {
        if (reg.getText().equals("")) {

            System.out.println("Ensure that you have entered your reg no");

        } else {

            try {
                String query = " select count(RegNo) as count from coursestaken where RegNo='" + reg.getText() + "' group by RegNo";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery(query);
                if (rs.next()) {

                    cousre = rs.getString(1);
                    nocourses = Integer.parseInt(cousre);
                    System.out.println("  The number of courses is" + nocourses);
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    //percentage attendance
    public void attendance() {
        try {
            String query = " select coursename from attendance where RegNo='" + reg.getText() + "' and Status='present' group by coursename";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
//count(RegNo) as count,
            if (rs.next()) {
                // course.addItem(rs.getString(1));
                // String attendances=rs.getString(1);
                //if(attendances.matches("Present")){
//               System.out.println("Present :"+rs.getString(1)+" times");
                String at = rs.getString(1);
                //String course=rs.getString(2);

                //int attend=Integer.parseInt(at);
                //  double totalattendance = ((Double.parseDouble(at) / 13) * 100);
                System.out.println("Your attendance is" + at);
                // System.out.println("Your attendance is"+course);
            }
        } catch (Exception ec) {
            ec.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> academicyear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reg;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
