/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WaitQueueGUI.java
 *
 * Created on Sep 2, 2011, 10:25:08 PM
 */

package entities;

/**
 *
 * @author christos
 */
public class WaitQueueGUI extends java.awt.Panel {

    /** Creates new form WaitQueueGUI */
    public WaitQueueGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(238, 238, 238));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Στοιχεία Μαθήματος", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.gray)); // NOI18N

        jLabel1.setText("Όνομα μαθήματος:");

        jLabel2.setText("Εξάμηνο:");

        jTextField1.setBackground(java.awt.Color.white);
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jTextField1.setText("Ουρές Αναμονής");

        jTextField2.setBackground(java.awt.Color.white);
        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jTextField2.setText("Πέμπτο (5ο)");

        jLabel3.setText("Διδάσκων:");

        jTextField3.setFont(new java.awt.Font("DialogInput", 1, 12));
        jTextField3.setText("Φώτης Γεωργιακώδης");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16));
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Εισαγωγικά Στοιχεία");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Στοιχεία Ομάδας Εργασίας", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.gray)); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(215, 215, 215));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1ο μέλος", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.darkGray)); // NOI18N

        jLabel5.setText("Επώνυμο:");
        jLabel5.setBounds(140, 20, 70, 20);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("e-mail:");
        jLabel7.setBounds(220, 60, 50, -1);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("Όνομα:");
        jLabel8.setBounds(20, 20, -1, 20);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField4.setEditable(false);
        jTextField4.setText("Αντώνης");
        jTextField4.setBounds(70, 20, -1, -1);
        jDesktopPane1.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField5.setEditable(false);
        jTextField5.setText("Κουζούπης");
        jTextField5.setBounds(210, 20, -1, 20);
        jDesktopPane1.add(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField6.setEditable(false);
        jTextField6.setText("Π06ΧΧΧ");
        jTextField6.setBounds(150, 60, 50, -1);
        jDesktopPane1.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Courier New", 1, 12));
        jTextField7.setText("kouzoupis.ant@gmail.com");
        jTextField7.setBounds(270, 60, 170, -1);
        jDesktopPane1.add(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("Αριθμός Μητρώου:");
        jLabel9.setBounds(10, 60, 140, -1);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(new java.awt.Color(215, 215, 215));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2ο μέλος", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.darkGray)); // NOI18N

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Courier New", 1, 12));
        jTextField8.setText("christos@tsopokis.gr");
        jTextField8.setBounds(270, 60, 150, -1);
        jDesktopPane2.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("e-mail:");
        jLabel10.setBounds(220, 60, 50, -1);
        jDesktopPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField9.setEditable(false);
        jTextField9.setText("Π06150");
        jTextField9.setBounds(150, 60, 60, -1);
        jDesktopPane2.add(jTextField9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("Αριθμός Μητρώου:");
        jLabel11.setBounds(10, 60, 140, -1);
        jDesktopPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField10.setEditable(false);
        jTextField10.setText("Χρήστος");
        jTextField10.setBounds(70, 19, -1, 20);
        jDesktopPane2.add(jTextField10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("Όνομα:");
        jLabel12.setBounds(20, 20, -1, -1);
        jDesktopPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Επώνυμο:");
        jLabel6.setBounds(140, 20, 70, 20);
        jDesktopPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField11.setEditable(false);
        jTextField11.setText("Τσοπόκης");
        jTextField11.setBounds(210, 20, -1, 20);
        jDesktopPane2.add(jTextField11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Περιγραφή Προγράμματος", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.gray)); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setText("Το παρόν πρόγραμμα προσομοιώνει ένα σύστημα κράτησης αεροπορικών εισητηρίων και υπολογίζει τα μεγέθη που αφορούν τις ουρές αναμονής των πελατών για κάθε πτήση. \nΣυγκεκριμένα υπολογίζεται:\n\t- ο μέσος ρυθμός αφίξεων (λ) για κάθε ουρά και στο σύστημα συνολικά, \n\t- ο μέσος ρυθμός στη φάση εξυπηρέτησης (μ), \n\t- ο βαθμός ενεργοποίηση (ρ) του συστήματος, \n\t- ο μέσος αριθμός ατόμων στην ουρά (Νq) και \n\t- ο μέσος χρόνος αναμονής στο σύστημα (W).");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Έναρξη Προσομοίωσης");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimulation(evt);
            }
        });
        jSplitPane1.setLeftComponent(jButton1);

        jButton2.setText("Κλείσιμο Εφαρμογής");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProgram(evt);
            }
        });
        jSplitPane1.setRightComponent(jButton2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startSimulation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulation
        // jButton1 handler:
        //Create and store flights' details
        new utilities.InitFlights();
        jTextPane1.setText("skata");
    }//GEN-LAST:event_startSimulation

    private void closeProgram(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProgram
        // jButton2 handler:
    }//GEN-LAST:event_closeProgram


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

}
