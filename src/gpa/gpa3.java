/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import com.sun.corba.se.spi.orb.OperationFactory;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru Madhushan
 */
public class gpa3 extends javax.swing.JFrame {


public String name3;
public String rnumber3;
public String uniname3;
public String yearsem3;

public String sub1;
public String sub2;
public String sub3;
public String sub4;
public String sub5;
public String sub6;
public String sub7;
public String sub8;
public String sub9;
public String sub10;

public String res1;
public String res2;
public String res3;
public String res4;
public String res5;
public String res6;
public String res7;
public String res8;
public String res9;
public String res10;

public int C1;
public int C2;
public int C3;
public int C4;
public int C5;
public int C6;
public int C7;
public int C8;
public int C9;
public int C10;

public int subnum3;


public String gp;

    /**
     * Creates new form 
     */
    public gpa3() {
        initComponents();
        setTitle("GPA Calculator");
        setIcon() ;
       
        
        
        
    }
   
    public gpa3(String x,String y,String z,String w,String a,String b,String c,String d,String e,String f,String g
            ,String h,String i,String j,String k,String rr1,String rr2,String rr3,String rr4,
            String rr5,String rr6,String rr7,String rr8,String rr9,String rr10,int dd,int c1,int c2, int c3,int c4,int c5,int c6,int c7,
            int c8,int c9,int c10){
             initComponents();
        setTitle("GPA Calculator");
        setIcon() ;
        name3=x;
        rnumber3=y;
        uniname3=z;
        yearsem3=w;
        
        
        
         sub1=a;
        sub2=b;
        sub3=c;
        sub4=d;
        sub5=e;
        sub6=f;
        sub7=g;
        sub8=h;
        sub9=i;
        sub10=j;
        
        gp=k;
        
       
        
        res1=rr1;
        res2=rr2;
        res3=rr3;
        res4=rr4;
        res5=rr5;
        res6=rr6;
        res7=rr7;
        res8=rr8;
        res9=rr9;
        res10=rr10;
        
        C1=c1;
        C2=c2;
        C3=c3;
        C4=c4;
        C5=c5;
        C6=c6;
        C7=c7;
        C8=c8;
        C9=c9;
        C10=c10;
        
        subnum3=dd;
        
        
        
        lname.setText(name3);
        lnumber.setText(rnumber3);
        lcampus.setText(uniname3);
        lyear.setText(yearsem3);
        
        lsub1.setText(sub1);
        lsub2.setText(sub2);
        lsub3.setText(sub3);
        lsub4.setText(sub4);
        lsub5.setText(sub5);
        lsub6.setText(sub6);
        lsub7.setText(sub7);
        lsub8.setText(sub8);
        lsub9.setText(sub9);
        lsub10.setText(sub10);
        
        lgpa.setText("Your GPA is "+gp);
        
        lres1.setText(res1);
        lres2.setText(res2);
        lres3.setText(res3);
        lres4.setText(res4);
        lres5.setText(res5);
        lres6.setText(res6);
        lres7.setText(res7);
        lres8.setText(res8);
        lres9.setText(res9);
        lres10.setText(res10);
        
        autoo();
        
       
    }
   
   
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lcampus = new javax.swing.JLabel();
        gexit = new javax.swing.JButton();
        nnnn = new javax.swing.JLabel();
        lyear = new javax.swing.JLabel();
        aaaa = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        lnumber = new javax.swing.JLabel();
        lsub1 = new javax.swing.JLabel();
        lsub2 = new javax.swing.JLabel();
        lsub3 = new javax.swing.JLabel();
        lsub4 = new javax.swing.JLabel();
        lsub5 = new javax.swing.JLabel();
        lsub6 = new javax.swing.JLabel();
        lsub7 = new javax.swing.JLabel();
        lsub8 = new javax.swing.JLabel();
        lsub9 = new javax.swing.JLabel();
        lsub10 = new javax.swing.JLabel();
        lres1 = new javax.swing.JLabel();
        lres2 = new javax.swing.JLabel();
        lres3 = new javax.swing.JLabel();
        lres4 = new javax.swing.JLabel();
        lres5 = new javax.swing.JLabel();
        lres6 = new javax.swing.JLabel();
        lres7 = new javax.swing.JLabel();
        lres8 = new javax.swing.JLabel();
        lres9 = new javax.swing.JLabel();
        lres10 = new javax.swing.JLabel();
        lgpa = new javax.swing.JLabel();
        gprint = new javax.swing.JButton();
        gpre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        net = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2.setText("Result Sheet");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 430, 80));

        lcampus.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lcampus.setForeground(new java.awt.Color(0, 51, 153));
        lcampus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcampus.setText("c");
        getContentPane().add(lcampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 750, 40));

        gexit.setBackground(new java.awt.Color(0, 153, 204));
        gexit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        gexit.setForeground(new java.awt.Color(204, 204, 204));
        gexit.setText("Exit");
        gexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gexitActionPerformed(evt);
            }
        });
        gexit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gexitKeyPressed(evt);
            }
        });
        getContentPane().add(gexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 230, 60));

        nnnn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        nnnn.setForeground(new java.awt.Color(255, 255, 102));
        nnnn.setText("Name of Student     :");
        getContentPane().add(nnnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, -1));

        lyear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lyear.setForeground(new java.awt.Color(0, 51, 153));
        lyear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lyear.setText("y");
        getContentPane().add(lyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 690, 40));

        aaaa.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        aaaa.setForeground(new java.awt.Color(255, 255, 102));
        aaaa.setText("Admission Number :");
        getContentPane().add(aaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, -1));

        lname.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(51, 51, 51));
        lname.setText("n");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 560, -1));

        lnumber.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lnumber.setForeground(new java.awt.Color(51, 51, 51));
        lnumber.setText("n");
        getContentPane().add(lnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 560, -1));

        lsub1.setBackground(new java.awt.Color(255, 255, 255));
        lsub1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub1.setText("sub");
        getContentPane().add(lsub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 200, 30));

        lsub2.setBackground(new java.awt.Color(255, 255, 255));
        lsub2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub2.setText("sub");
        getContentPane().add(lsub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 200, 30));

        lsub3.setBackground(new java.awt.Color(255, 255, 255));
        lsub3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub3.setText("sub");
        getContentPane().add(lsub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 200, 30));

        lsub4.setBackground(new java.awt.Color(255, 255, 255));
        lsub4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub4.setText("sub");
        getContentPane().add(lsub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 200, 30));

        lsub5.setBackground(new java.awt.Color(255, 255, 255));
        lsub5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub5.setText("sub");
        getContentPane().add(lsub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 200, 30));

        lsub6.setBackground(new java.awt.Color(255, 255, 255));
        lsub6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub6.setText("sub");
        getContentPane().add(lsub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 200, 30));

        lsub7.setBackground(new java.awt.Color(255, 255, 255));
        lsub7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub7.setText("sub");
        getContentPane().add(lsub7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 200, 30));

        lsub8.setBackground(new java.awt.Color(255, 255, 255));
        lsub8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub8.setText("sub");
        getContentPane().add(lsub8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 200, 30));

        lsub9.setBackground(new java.awt.Color(255, 255, 255));
        lsub9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub9.setText("sub");
        getContentPane().add(lsub9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 200, 30));

        lsub10.setBackground(new java.awt.Color(255, 255, 255));
        lsub10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lsub10.setText("sub");
        getContentPane().add(lsub10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 200, 30));

        lres1.setBackground(new java.awt.Color(255, 255, 255));
        lres1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres1.setText("res");
        getContentPane().add(lres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 200, 30));

        lres2.setBackground(new java.awt.Color(255, 255, 255));
        lres2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres2.setText("res");
        getContentPane().add(lres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 290, 200, 30));

        lres3.setBackground(new java.awt.Color(255, 255, 255));
        lres3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres3.setText("res");
        getContentPane().add(lres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 200, 30));

        lres4.setBackground(new java.awt.Color(255, 255, 255));
        lres4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres4.setText("res");
        getContentPane().add(lres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 200, 30));

        lres5.setBackground(new java.awt.Color(255, 255, 255));
        lres5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres5.setText("res");
        getContentPane().add(lres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 200, 30));

        lres6.setBackground(new java.awt.Color(255, 255, 255));
        lres6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres6.setText("res");
        getContentPane().add(lres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, 200, 30));

        lres7.setBackground(new java.awt.Color(255, 255, 255));
        lres7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres7.setText("res");
        getContentPane().add(lres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 200, 30));

        lres8.setBackground(new java.awt.Color(255, 255, 255));
        lres8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres8.setText("res");
        getContentPane().add(lres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 200, 30));

        lres9.setBackground(new java.awt.Color(255, 255, 255));
        lres9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres9.setText("res");
        getContentPane().add(lres9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 200, 30));

        lres10.setBackground(new java.awt.Color(255, 255, 255));
        lres10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lres10.setText("res");
        getContentPane().add(lres10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 200, 30));

        lgpa.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lgpa.setForeground(new java.awt.Color(255, 0, 102));
        lgpa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lgpa.setText("dghdghdfgh");
        getContentPane().add(lgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 800, 40));

        gprint.setBackground(new java.awt.Color(0, 153, 204));
        gprint.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        gprint.setForeground(new java.awt.Color(204, 204, 204));
        gprint.setText("Print");
        gprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gprintActionPerformed(evt);
            }
        });
        gprint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gprintKeyPressed(evt);
            }
        });
        getContentPane().add(gprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 230, 60));

        gpre.setBackground(new java.awt.Color(0, 153, 204));
        gpre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        gpre.setForeground(new java.awt.Color(204, 204, 204));
        gpre.setText("Previous");
        gpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpreActionPerformed(evt);
            }
        });
        gpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpreKeyPressed(evt);
            }
        });
        getContentPane().add(gpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 230, 60));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Developed by isuru madhushan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 660, 370, 30));

        net.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        net.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/dddddd.jpg"))); // NOI18N
        getContentPane().add(net, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
   
    private void gexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gexitActionPerformed
      this.dispose();
    }//GEN-LAST:event_gexitActionPerformed
 public void autoo(){
      if(subnum3==10){
         
    }
     else if(subnum3==9){
          lres10.setVisible(false);  
          
     }
     else if(subnum3==8){
          lres10.setVisible(false);
          lres9.setVisible(false);
     }
     else if(subnum3==7){
        lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
     }
     else if(subnum3==6){
        lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
     }
     else if(subnum3==5){
         lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
          lres6.setVisible(false);
     }
     else if(subnum3==4){
         lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
          lres6.setVisible(false);
          lres5.setVisible(false);
     }
     else if(subnum3==3){
         lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
          lres6.setVisible(false);
          lres5.setVisible(false);
          lres4.setVisible(false);
          
     }
     else if(subnum3==2){
          lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
          lres6.setVisible(false);
          lres5.setVisible(false);
          lres4.setVisible(false);
          lres3.setVisible(false);
          
     }
     else if(subnum3==1){
           lres10.setVisible(false);
          lres9.setVisible(false);
          lres8.setVisible(false);
          lres7.setVisible(false);
          lres6.setVisible(false);
          lres5.setVisible(false);
          lres4.setVisible(false);
          lres3.setVisible(false);
          lres2.setVisible(false);
     }
   }
 
    
    
    private void gexitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gexitKeyPressed
      
      
    }//GEN-LAST:event_gexitKeyPressed

    private void gprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gprintActionPerformed

    private void gprintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gprintKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gprintKeyPressed

    private void gpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpreActionPerformed
gpa2 gn=new gpa2(subnum3,name3,rnumber3,uniname3,yearsem3,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10,res1,
                 res2,res3,res4,res5,res6,res7,res8,res9,res10,C1,C2,C3,C4,C5,C6,C7,C8,C9,C10);
gn.setVisible(true);// TODO add your handling code here:
this.dispose();
    }//GEN-LAST:event_gpreActionPerformed

    private void gpreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpreKeyPressed
 private void setIcon(){
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("download.png")));
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
            java.util.logging.Logger.getLogger(gpa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gpa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gpa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gpa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gpa3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaaa;
    public javax.swing.JButton gexit;
    public javax.swing.JButton gpre;
    public javax.swing.JButton gprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lcampus;
    public javax.swing.JLabel lgpa;
    public javax.swing.JLabel lname;
    public javax.swing.JLabel lnumber;
    private javax.swing.JLabel lres1;
    private javax.swing.JLabel lres10;
    private javax.swing.JLabel lres2;
    private javax.swing.JLabel lres3;
    private javax.swing.JLabel lres4;
    private javax.swing.JLabel lres5;
    private javax.swing.JLabel lres6;
    private javax.swing.JLabel lres7;
    private javax.swing.JLabel lres8;
    private javax.swing.JLabel lres9;
    public javax.swing.JLabel lsub1;
    public javax.swing.JLabel lsub10;
    public javax.swing.JLabel lsub2;
    public javax.swing.JLabel lsub3;
    public javax.swing.JLabel lsub4;
    public javax.swing.JLabel lsub5;
    public javax.swing.JLabel lsub6;
    public javax.swing.JLabel lsub7;
    public javax.swing.JLabel lsub8;
    public javax.swing.JLabel lsub9;
    public javax.swing.JLabel lyear;
    private javax.swing.JLabel net;
    private javax.swing.JLabel nnnn;
    // End of variables declaration//GEN-END:variables
}