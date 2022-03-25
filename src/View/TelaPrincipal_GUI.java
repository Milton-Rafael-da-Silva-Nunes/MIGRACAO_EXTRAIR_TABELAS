package View;

import Controler.GerarArquivos;
import Controler.TabelasTelaPrincipal;
import java.io.File;

import javax.swing.JOptionPane;

public class TelaPrincipal_GUI extends javax.swing.JFrame {

    public TelaPrincipal_GUI() {
        initComponents();
        // METODO MARCAS TODAS AS TABELAS.
        TabelasTelaPrincipal.MarcarTabelas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PRODUTO = new javax.swing.JCheckBox();
        UNIDADE = new javax.swing.JCheckBox();
        CATEGORIA = new javax.swing.JCheckBox();
        SUBCATEG = new javax.swing.JCheckBox();
        FABRICANTE = new javax.swing.JCheckBox();
        NCM = new javax.swing.JCheckBox();
        CEST = new javax.swing.JCheckBox();
        GRUPOTRIB = new javax.swing.JCheckBox();
        FORNECEDOR = new javax.swing.JCheckBox();
        CLIENTE = new javax.swing.JCheckBox();
        ESTOQUE = new javax.swing.JCheckBox();
        RECEBER = new javax.swing.JCheckBox();
        PAGAR = new javax.swing.JCheckBox();
        btnGerar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDesmarcarTabelas = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione as Tabelas ");
        jLabel1.setOpaque(true);
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        PRODUTO.setText("PRODUTO");

        UNIDADE.setText("UNIDADE");

        CATEGORIA.setText("CATEGORIA");

        SUBCATEG.setText("SUB CATEG.");

        FABRICANTE.setText("FABRIANTE");

        NCM.setText("NCM");

        CEST.setText("CEST");

        GRUPOTRIB.setText("GRUPO TRIB.");

        FORNECEDOR.setText("FORNECEDOR");

        CLIENTE.setText("CLIENTE");

        ESTOQUE.setText("ESTOQUE");

        RECEBER.setText("RECEBER");

        PAGAR.setText("PAGAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PRODUTO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UNIDADE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CATEGORIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SUBCATEG)
                        .addGap(18, 18, 18)
                        .addComponent(FABRICANTE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NCM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CEST)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GRUPOTRIB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FORNECEDOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CLIENTE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ESTOQUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RECEBER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PAGAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRODUTO)
                    .addComponent(UNIDADE)
                    .addComponent(CATEGORIA)
                    .addComponent(SUBCATEG)
                    .addComponent(FABRICANTE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NCM)
                    .addComponent(CEST)
                    .addComponent(GRUPOTRIB)
                    .addComponent(FORNECEDOR)
                    .addComponent(CLIENTE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ESTOQUE)
                    .addComponent(RECEBER)
                    .addComponent(PAGAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2);
        jPanel2.setBounds(10, 60, 514, 124);

        btnGerar.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        btnGerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-selecionado-18.png"))); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.setToolTipText("Gerar arquivo");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGerar);
        btnGerar.setBounds(320, 200, 94, 35);

        btnSair.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-fechar-janela-18.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Sair do Sistemas");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel4.add(btnSair);
        btnSair.setBounds(430, 200, 94, 35);

        btnDesmarcarTabelas.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        btnDesmarcarTabelas.setForeground(new java.awt.Color(0, 0, 0));
        btnDesmarcarTabelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-vassoura-18.png"))); // NOI18N
        btnDesmarcarTabelas.setText("Limpar");
        btnDesmarcarTabelas.setToolTipText("Limpar Seleção de Tabelas");
        btnDesmarcarTabelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesmarcarTabelasActionPerformed(evt);
            }
        });
        jPanel4.add(btnDesmarcarTabelas);
        btnDesmarcarTabelas.setBounds(10, 200, 100, 35);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 540, 250);

        setSize(new java.awt.Dimension(537, 248));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed

        //       CLASSE.                    METODO();
        if (TabelasTelaPrincipal.ValidarTabelasSelecionadas()) {
        /**
         * @Pego o diretorio para fazer validação se existe ou não.
         */ 
            File file = new File("C:\\1-TABELAS");
            
            if (file.exists()) {
                GerarArquivos.ExtrairTabelas();
                JOptionPane.showMessageDialog(null, "<html><b>ARQUIVOS GERADOS COM SUCESSO</b>.\n", "Menssagem Informativa", JOptionPane.WARNING_MESSAGE);
    
            } else {
                JOptionPane.showMessageDialog(null, "Diretorio "+file+" não encontrado" , "Erro Menssagem", JOptionPane.ERROR_MESSAGE);
                
            }

        } else {
            System.out.println("Erro nas tabelas selecionadas");

        }

    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnDesmarcarTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesmarcarTabelasActionPerformed
        TabelasTelaPrincipal.DesmarcarTabelas();

    }//GEN-LAST:event_btnDesmarcarTabelasActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal_GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox CATEGORIA;
    public static javax.swing.JCheckBox CEST;
    public static javax.swing.JCheckBox CLIENTE;
    public static javax.swing.JCheckBox ESTOQUE;
    public static javax.swing.JCheckBox FABRICANTE;
    public static javax.swing.JCheckBox FORNECEDOR;
    public static javax.swing.JCheckBox GRUPOTRIB;
    public static javax.swing.JCheckBox NCM;
    public static javax.swing.JCheckBox PAGAR;
    public static javax.swing.JCheckBox PRODUTO;
    public static javax.swing.JCheckBox RECEBER;
    public static javax.swing.JCheckBox SUBCATEG;
    public static javax.swing.JCheckBox UNIDADE;
    private javax.swing.JButton btnDesmarcarTabelas;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
