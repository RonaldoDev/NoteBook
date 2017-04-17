/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LivroController;
import Entidades.Livro;
import Entidades.Sessao;
import Entidades.Usuario;
import Enumeradores.EventoBotao;
import Framework.Persistencia;
import javax.swing.JOptionPane;

/**
 *
 * @author jackdaniels
 */
public class LivroView extends javax.swing.JFrame {

    LivroController ctrlLivro;

    /**
     * Creates new form LivroView
     *
     */
    public LivroView(Sessao p_sessao) {
        this.setLocation(300, 100);
        initComponents();
        ctrlLivro = new LivroController(p_sessao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancel = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldTituloLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAutorLivro = new javax.swing.JTextField();
        jTextFieldIdLivro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonLimpaTela = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRmv = new javax.swing.JButton();
        jButtonEdt = new javax.swing.JButton();
        jButtonCons = new javax.swing.JButton();
        jLabelLivro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelCampos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloLivroActionPerformed(evt);
            }
        });

        jLabel2.setText("Título");

        jLabel3.setText("Autor");

        jTextFieldAutorLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorLivroActionPerformed(evt);
            }
        });

        jTextFieldIdLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdLivroActionPerformed(evt);
            }
        });

        jLabel8.setText("Id:");

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jButtonLimpaTela.setLabel("Limpar Tela");
        jButtonLimpaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaTelaActionPerformed(evt);
            }
        });

        jButtonAdd.setLabel("Incluir");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRmv.setText("Remover");
        jButtonRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmvActionPerformed(evt);
            }
        });

        jButtonEdt.setLabel("Alterar");
        jButtonEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdtActionPerformed(evt);
            }
        });

        jButtonCons.setText("Consultar");
        jButtonCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsActionPerformed(evt);
            }
        });

        jLabelLivro.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelLivro.setText("Adicionar Livro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCons)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCancel)
                            .addGap(4, 4, 4))
                        .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabelLivro))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCons, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloLivroActionPerformed

    private void jTextFieldAutorLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorLivroActionPerformed

    private void jTextFieldIdLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdLivroActionPerformed

    private void jButtonLimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTelaActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButtonLimpaTelaActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvActionPerformed
        jLabelLivro.setText("Remover Livro");

    }//GEN-LAST:event_jButtonRmvActionPerformed

    private void jButtonEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdtActionPerformed
        jLabelLivro.setText("Editar Livro");
    }//GEN-LAST:event_jButtonEdtActionPerformed

    private void jButtonConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsActionPerformed
        jLabelLivro.setText("Consultar Livro");

    }//GEN-LAST:event_jButtonConsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCons;
    private javax.swing.JButton jButtonEdt;
    private javax.swing.JButton jButtonLimpaTela;
    private javax.swing.JButton jButtonRmv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JTextField jTextFieldAutorLivro;
    private javax.swing.JTextField jTextFieldIdLivro;
    private javax.swing.JTextField jTextFieldTituloLivro;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        jTextFieldAutorLivro.setText("");
        jTextFieldIdLivro.setText("");
        jTextFieldTituloLivro.setText("");
    }

}
