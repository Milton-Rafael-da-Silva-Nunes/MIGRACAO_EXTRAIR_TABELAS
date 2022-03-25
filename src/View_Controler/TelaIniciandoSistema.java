package View_Controler;

import View.TelaLogin_GUI;
import java.awt.Color;
import javax.swing.ImageIcon;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaIniciandoSistema extends javax.swing.JFrame {

    public TelaIniciandoSistema() {
        initComponents();

        Icone();
        Cores();

        //--------------- Iniciando
        new Thread() {

            public void run() {

                for (int i = 0; i <= 100; i++) {
                    try {

                        sleep(15); // time da barra toda.

                        ProgressoBarra.setValue(i);

                        if (ProgressoBarra.getValue() <= 50) {
                            lblTexto.setText("Iniciando Sistema...");
                            sleep(0);

                        } else if (ProgressoBarra.getValue() <= 70) {
                            lblTexto.setText("Carregando Tela");
                            sleep(0);

                        } else if (ProgressoBarra.getValue() <= 99) {
                            lblTexto.setText("Iniciando tela de Login.");
                            sleep(0);

                        } else {
                            sleep(1);
                            new TelaLogin_GUI().setVisible(true);
                            dispose();

                        }

                    } catch (Exception erro) {
                        Logger.getLogger(TelaIniciandoSistema.class.getName()).log(Level.SEVERE, null, erro);

                    }

                }

            }

        }.start();

        //--------------- Termino
    }

    private void Icone() {
        
        ImageIcon icon = new ImageIcon("C:\\LC sistemas - Softhouse\\lib\\lc_logoSofthouse.gif");
        icon.setImage(icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), 1));
        lblIcon.setIcon(icon);
    }

    private void Cores() {

        ProgressoBarra.setBackground(Color.DARK_GRAY);
        ProgressoBarra.setForeground(Color.GREEN);
        lblTexto.setBackground(Color.DARK_GRAY);
        lblTexto.setForeground(Color.WHITE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        ProgressoBarra = new javax.swing.JProgressBar();
        lblTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jPanel1.add(lblIcon);
        lblIcon.setBounds(30, 20, 250, 150);

        ProgressoBarra.setToolTipText("Barra de Progresso");
        ProgressoBarra.setBorder(null);
        jPanel1.add(ProgressoBarra);
        ProgressoBarra.setBounds(20, 190, 270, 20);

        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setOpaque(true);
        jPanel1.add(lblTexto);
        lblTexto.setBounds(20, 210, 270, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(306, 250));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaIniciandoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIniciandoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIniciandoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIniciandoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIniciandoSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressoBarra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
