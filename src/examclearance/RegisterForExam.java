package examclearance;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegisterForExam extends javax.swing.JPanel {

    public RegisterForExam() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        academicyear = new javax.swing.JComboBox<>();
        course = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Register for exam");

        jLabel2.setText("Registration number");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel3.setText("Academic Year");

        jLabel4.setText("Course");

        academicyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015/2016", "2016/2017", "2017/2018", "2018/2019", "2020/2021" }));
        academicyear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                academicyearMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                academicyearMouseMoved(evt);
            }
        });

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        course.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                courseMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                courseMouseMoved(evt);
            }
        });
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                courseMouseReleased(evt);
            }
        });
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        jLabel5.setText("Semester");

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semItemStateChanged(evt);
            }
        });
        sem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                semMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                semMouseMoved(evt);
            }
        });
        sem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                semMousePressed(evt);
            }
        });
        sem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                semInputMethodTextChanged(evt);
            }
        });
        sem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                semPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regno, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(academicyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(academicyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(register)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
//public void registerexam(){
//    try {
//
//            String query = "select RegNo,Coursename,week from attendance where RegNo='"+reg.getText()+"' and week='"+combo_week.getSelectedItem()+"' ";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
//            Statement smt = con.createStatement();
//            ResultSet rs = smt.executeQuery(query);
//
//            if (rs.next()) {
//              JOptionPane.showMessageDialog(null, "record exist");
//
//            }}
//            catch(Exception e){
//                    e.printStackTrace();
//                    }
//    
//}
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
 
      checkcatsexams();  
        
        
    }//GEN-LAST:event_registerActionPerformed

    private void academicyearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicyearMouseMoved
    
     try {
 academicyear.removeAllItems();
            String query = "select AcademicYear from coursestaken where regno='"+regno.getText()+"' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                academicyear.addItem(rs.getString(1));

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
        
        
    }//GEN-LAST:event_academicyearMouseMoved

    private void courseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseDragged
      try {
 course.removeAllItems();
            String query = "select coursename from coursestaken where regno='"+regno.getText()+"' and AcademicYear='"+academicyear.getSelectedItem().toString()+"' and Semester='"+sem.getSelectedItem().toString()+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                course.addItem(rs.getString(1));
               

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
            // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseDragged

    private void academicyearMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicyearMouseDragged
  
     try {
 academicyear.removeAllItems();
            String query = "select AcademicYear from coursestaken where regno='"+regno.getText()+"' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                academicyear.addItem(rs.getString(1));

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
        
    }//GEN-LAST:event_academicyearMouseDragged

    private void semMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseMoved
     try {
 sem.removeAllItems();
            String query = "select Semester from coursestaken where regno='"+regno.getText()+"' and AcademicYear='"+academicyear.getSelectedItem().toString()+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                sem.addItem(rs.getString(1));

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
    }//GEN-LAST:event_semMouseMoved

    private void semMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseDragged
 
    }//GEN-LAST:event_semMouseDragged

    private void courseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseMoved
        try {
 course.removeAllItems();
            String query = "select coursename from coursestaken where regno='"+regno.getText()+"' and AcademicYear='"+academicyear.getSelectedItem().toString()+"' and Semester='"+sem.getSelectedItem().toString()+"'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
                course.addItem(rs.getString(1));
                checkattendance();

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
    }//GEN-LAST:event_courseMouseMoved

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
   
        
        
    }//GEN-LAST:event_courseActionPerformed

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
     
   

// TODO add your handling code here:
    }//GEN-LAST:event_courseMouseClicked

    private void courseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseReleased

    private void semPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_semPropertyChange


        // TODO add your handling code here:
    }//GEN-LAST:event_semPropertyChange

    private void semMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseEntered

    private void semMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseClicked

    private void semMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_semMouseExited

    private void semItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_semItemStateChanged

    private void semInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_semInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_semInputMethodTextChanged

    private void semMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semMousePressed
   try{
         String query = "select ExpectedAmount, AmountPaid,Regno from fees where regno='"+regno.getText()+"' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
      
      if(rs.next()){
      String ex=rs.getString(1);
      String ap=rs.getString(2);
      if(Integer.parseInt(ap)<1){
      JOptionPane.showMessageDialog(null, "Kindly ensure that you have paid the fee for you to register for an exam");

      }
            else if(Integer.parseInt(ap)>1){
              
              int unitcost=5000;
              
             int subjects=Integer.parseInt(ap)/unitcost;
             
             JOptionPane.showMessageDialog(null,"The number of subjects that you are eligible to register for are "+subjects  );
              
             
      
      }
      
      }
      }
      catch(Exception ec){
          ec.printStackTrace();  
      }             // TODO add your handling code here:
    }//GEN-LAST:event_semMousePressed

  //check attendance
    public void checkattendance(){
     
         try {
            String query = "select distinct week,Status from attendance where regno='"+regno.getText()+"' and AcademicYear='"+academicyear.getSelectedItem().toString()+"' and status ='Present' order by week";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);

            if (rs.next()) {
               // course.addItem(rs.getString(1));
               String attendances=rs.getString(2);
               
                System.out.println(rs.getString(1)+" "+attendances);

            }}
            catch(Exception e){
                    e.printStackTrace();
                    }   
        
    }

    
    

    //check previous cats and exams
    public void checkcatsexams(){
        try{
         String query = "select CAT,Regno,Coursename from catsexam where regno='"+regno.getText()+"'  and AcademicYear='"+academicyear.getSelectedItem().toString()+"' and Semester='"+sem.getSelectedItem().toString()+"' ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clearanceforexam", "root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
      
        while(rs.next()){
        String cat=rs.getString(1);
       String coz=rs.getString(3);
        if(Integer.parseInt(cat)<1){
        JOptionPane.showMessageDialog(null, "You have not done the CAT for"+coz);
        
        }
        else{JOptionPane.showMessageDialog(null, "You can register for exam");}
            
            
        
        }
        
        
        }
        catch(Exception ex){
        ex.printStackTrace();
        
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> academicyear;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton register;
    private javax.swing.JTextField regno;
    private javax.swing.JComboBox<String> sem;
    // End of variables declaration//GEN-END:variables
}
