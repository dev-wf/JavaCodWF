package com.dev.dev.Frames;

/**
 * @author Welington Fernandes
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        run();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pg = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelLogo.setBackground(new java.awt.Color(218, 218, 218));
        PainelLogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)), "CodWF", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Monospaced", 1, 20), new java.awt.Color(255, 0, 0))); // NOI18N
        PainelLogo.setForeground(new java.awt.Color(0, 204, 102));
        PainelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("@2020");
        PainelLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 580, 70));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESENVOLVIDO POR:  WELINGTON ALVES FERNANDES.");
        PainelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 580, 70));

        pg.setBackground(new java.awt.Color(204, 204, 204));
        pg.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        pg.setForeground(new java.awt.Color(102, 102, 102));
        pg.setToolTipText("");
        pg.setStringPainted(true);
        PainelLogo.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 530, 70));

        getContentPane().add(PainelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        setSize(new java.awt.Dimension(600, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    protected void run() {
        initComponents();
        this.setTitle("MENU");
        this.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JProgressBar pg;
    // End of variables declaration//GEN-END:variables
}
