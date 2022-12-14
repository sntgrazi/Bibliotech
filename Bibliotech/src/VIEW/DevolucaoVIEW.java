/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.DevolucaoDAO;
import MODEL.DevolucaoMODEL;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author PuddinAPX
 */
public class DevolucaoVIEW extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form DevolucaoVIEW
     */
   
    
    public DevolucaoVIEW() {
        initComponents();
        JButton [] btns = {btnHOME,btnLIVRO,btnCADASTRO,btnEMPRESTIMO, btnDEVOLUCAO};
        for (JButton btn : btns){
            btn.setBackground(new Color (0,0,0));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    }

                @Override
                public void mousePressed(MouseEvent me) {
                    }

                

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(28,28,28));
                    }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(0,0,0));
                    }

                @Override
                public void mouseReleased(MouseEvent me) {
                    }
            });
        }
        btnLIVRO.addActionListener((e)->{
            this.setVisible(false);
            new LivrosVIEW();
        });
        
        btnEMPRESTIMO.addActionListener((e)->{
            this.setVisible(false);
            new EmprestimoVIEW();
        });
        btnCADASTRO.addActionListener((e)->{
            this.setVisible(false);
            new CadastroVIEW();
        });
        btnHOME.addActionListener((e)->{
            this.setVisible(false);
            new HomeVIEW();
        });
        setVisible(true);
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
        btnHOME = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLIVRO = new javax.swing.JButton();
        btnCADASTRO = new javax.swing.JButton();
        btnEMPRESTIMO = new javax.swing.JButton();
        btnDEVOLUCAO = new javax.swing.JButton();
        txtNomeCod = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lista = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnHOME.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/pinguin.png (2).png"))); // NOI18N
        btnHOME.setBorder(null);
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIBLIOTECH");

        btnLIVRO.setBackground(new java.awt.Color(0, 0, 0));
        btnLIVRO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLIVRO.setForeground(new java.awt.Color(255, 255, 255));
        btnLIVRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/livro.png"))); // NOI18N
        btnLIVRO.setText("  Livros");
        btnLIVRO.setBorder(null);
        btnLIVRO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnLIVRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIVROActionPerformed(evt);
            }
        });

        btnCADASTRO.setBackground(new java.awt.Color(0, 0, 0));
        btnCADASTRO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCADASTRO.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/conecte-se (1) (1).png"))); // NOI18N
        btnCADASTRO.setText("Cadastrar");
        btnCADASTRO.setBorder(null);
        btnCADASTRO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnCADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTROActionPerformed(evt);
            }
        });

        btnEMPRESTIMO.setBackground(new java.awt.Color(0, 0, 0));
        btnEMPRESTIMO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEMPRESTIMO.setForeground(new java.awt.Color(255, 255, 255));
        btnEMPRESTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/emprestimo.png"))); // NOI18N
        btnEMPRESTIMO.setText("Emprestar");
        btnEMPRESTIMO.setBorder(null);
        btnEMPRESTIMO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnEMPRESTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMPRESTIMOActionPerformed(evt);
            }
        });

        btnDEVOLUCAO.setBackground(new java.awt.Color(0, 0, 0));
        btnDEVOLUCAO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDEVOLUCAO.setForeground(new java.awt.Color(255, 255, 255));
        btnDEVOLUCAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/devolucao.png"))); // NOI18N
        btnDEVOLUCAO.setText(" Devolver");
        btnDEVOLUCAO.setBorder(null);
        btnDEVOLUCAO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnDEVOLUCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEVOLUCAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHOME, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLIVRO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEMPRESTIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDEVOLUCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHOME))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addComponent(btnCADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEMPRESTIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDEVOLUCAO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLIVRO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 600));

        txtNomeCod.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Devolver livro");
        txtNomeCod.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 6, 200, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("Nome ou Cod. Livro");
        txtNomeCod.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 95, -1, 30));
        txtNomeCod.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 491, 20));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_icons/lupa-de-pesquisa (2).png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        txtNomeCod.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 125, 45, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNomeCod.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 491, 30));

        getContentPane().add(txtNomeCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHOMEActionPerformed

    private void btnLIVROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIVROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLIVROActionPerformed

    private void btnCADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTROActionPerformed

    private void btnEMPRESTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPRESTIMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEMPRESTIMOActionPerformed

    private void btnDEVOLUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEVOLUCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDEVOLUCAOActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolucaoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRO;
    private javax.swing.JButton btnDEVOLUCAO;
    private javax.swing.JButton btnEMPRESTIMO;
    private javax.swing.JButton btnHOME;
    private javax.swing.JButton btnLIVRO;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator lista;
    protected javax.swing.JTextField txtNome;
    private javax.swing.JPanel txtNomeCod;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       this.setVisible(false);
       new HomeVIEW();
    }
}
