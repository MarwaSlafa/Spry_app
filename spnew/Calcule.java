/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spnew;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Calcule extends javax.swing.JFrame {

    /**
     * Creates new form Calcule
     */
    public Calcule() {
      
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 260));
        setMinimumSize(new java.awt.Dimension(620, 260));

        jPanel1.setMaximumSize(new java.awt.Dimension(620, 260));
        jPanel1.setMinimumSize(new java.awt.Dimension(620, 260));
        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 50, 110, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 110, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 220, 120, 30);

        jLabel2.setText("Poids en kg");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 50, 80, 30);

        jLabel3.setText(" Taille en m");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 110, 90, 30);

        jLabel4.setText("Sexe");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 220, 90, 30);

        jButton4.setText("Calcule");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 320, 170, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wrap-minceur-perte-de-poids_1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static float imc;
//methode calcule IMC 
    float CalculImc(float poids, float taille) {
       return poids/(taille*taille); }
    // methode affiche la fenétre du régime selon l'Imc
     public  static void Regime(float imc){
            if(imc>40){ 
              ObesiteMassive prg1=new ObesiteMassive();
              prg1.setVisible(true); }
       else{ if(imc>=30){  Obesite prg2=new Obesite();
                           prg2.setVisible(true);      }
        else{ if(imc>=25){      Surpoids prg3=new Surpoids();
                              prg3.setVisible(true);       }
       else{ if(imc>=18) {   Poids_Normal prg4=new Poids_Normal();
                                  prg4.setVisible(true);         }
       else{ Maigreur pr5=new Maigreur();
                pr5.setVisible(true);  }
                  } } }  
        
  }
 //methode Afficher message selon Imc
     String message1,message2; 
     public void TypeImc(float imc){
       if(imc>40){ message1="Obésité morbide ou massive"; 
      message2="regime et activité sportives conseillés pendant 100 jours ";
       }  else{
                  if(imc>=30){message1="Obésité" ;
                  message2="regime et activité sportives conseillés pendant 70 jours";}
                  else{ if(imc>=25){ message1="Surpoids";
                  message2="regime et activité sportives conseillés pendant 50 jours";}
                  else{ if(imc>=18) { message1="Corpulence normal"; }
                     else{ message1="Maigreur";
                     message2="Aliments conseillé pour éviter la perte de poids exsessive";
                  }
                  } } }  }
 
  
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         float p=Float.valueOf(jTextField1.getText());
           float t=Float.valueOf(jTextField2.getText());
      
       imc =CalculImc(p,t);
  
        TypeImc(imc);
   
     if (jComboBox1.getModel().getSelectedItem().equals("Femme")){ //ouvrir fenétre Femme
                 Femme f1=new Femme();
                f1.jLabelf1.setText(message1);
                f1.jLabelf2.setText(message2);
                 f1.setVisible(true);
             } else {  Homme h1=new Homme(); // ouvrir fenétre Homme
             h1.jLabelh1.setText(message1);
              h1.jLabelh2.setText(message2);
             h1.setVisible(true);
     }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calcule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
