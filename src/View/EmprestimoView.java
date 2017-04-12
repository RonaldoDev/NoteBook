/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entidades.Livro;
import javax.swing.JOptionPane;

/**
 *
 * @author jackdaniels
 */
public class EmprestimoView extends javax.swing.JFrame {

    /**
     * Creates new form EmprestimoView
     */
    public EmprestimoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCrud = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonRmv = new javax.swing.JButton();
        jButtonCons = new javax.swing.JButton();
        jButtonEdt = new javax.swing.JButton();
        jPanelAdd = new javax.swing.JPanel();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldLivroEmprestimo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsuarioEmprestimo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDtEmprestimo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDtDevolucao = new javax.swing.JTextField();
        jTextFieldIdEmprestimo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonConfirmEmprestimo = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelEmprestimo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCrud.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButtonAdd.setText("Adicionar");
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

        jButtonCons.setText("Consultar");
        jButtonCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsActionPerformed(evt);
            }
        });

        jButtonEdt.setText("Editar");
        jButtonEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrudLayout = new javax.swing.GroupLayout(jPanelCrud);
        jPanelCrud.setLayout(jPanelCrudLayout);
        jPanelCrudLayout.setHorizontalGroup(
            jPanelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrudLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCons, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelCrudLayout.setVerticalGroup(
            jPanelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButtonCons, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButtonRmv, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButtonEdt, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelCampos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldLivroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLivroEmprestimoActionPerformed(evt);
            }
        });

        jLabel2.setText("Livro:");

        jLabel3.setText("Usuario:");

        jTextFieldUsuarioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioEmprestimoActionPerformed(evt);
            }
        });

        jLabel4.setText("Dt. Emprestimo");

        jTextFieldDtEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtEmprestimoActionPerformed(evt);
            }
        });

        jLabel5.setText("Dt. Devolução:");

        jTextFieldDtDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtDevolucaoActionPerformed(evt);
            }
        });

        jTextFieldIdEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdEmprestimoActionPerformed(evt);
            }
        });

        jLabel8.setText("Id:");

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDtDevolucao))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDtEmprestimo))
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDtEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55))
        );

        jButtonConfirmEmprestimo.setText("Adicionar");

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelEmprestimo.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelEmprestimo.setText("Adicionar Emprestimo");

        javax.swing.GroupLayout jPanelAddLayout = new javax.swing.GroupLayout(jPanelAdd);
        jPanelAdd.setLayout(jPanelAddLayout);
        jPanelAddLayout.setHorizontalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLayout.createSequentialGroup()
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmprestimo)
                    .addGroup(jPanelAddLayout.createSequentialGroup()
                        .addComponent(jButtonConfirmEmprestimo)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCancel)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanelAddLayout.setVerticalGroup(
            jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvActionPerformed


    }//GEN-LAST:event_jButtonRmvActionPerformed

    private void jButtonConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsActionPerformed


    }//GEN-LAST:event_jButtonConsActionPerformed

    private void jButtonEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdtActionPerformed


    }//GEN-LAST:event_jButtonEdtActionPerformed

    private void jTextFieldLivroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLivroEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLivroEmprestimoActionPerformed

    private void jTextFieldUsuarioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioEmprestimoActionPerformed

    private void jTextFieldDtEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtEmprestimoActionPerformed

    private void jTextFieldDtDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtDevolucaoActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldIdEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdEmprestimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonConfirmEmprestimo;
    private javax.swing.JButton jButtonCons;
    private javax.swing.JButton jButtonEdt;
    private javax.swing.JButton jButtonRmv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEmprestimo;
    private javax.swing.JPanel jPanelAdd;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelCrud;
    private javax.swing.JTextField jTextFieldDtDevolucao;
    private javax.swing.JTextField jTextFieldDtEmprestimo;
    private javax.swing.JTextField jTextFieldIdEmprestimo;
    private javax.swing.JTextField jTextFieldLivroEmprestimo;
    private javax.swing.JTextField jTextFieldUsuarioEmprestimo;
    // End of variables declaration//GEN-END:variables
}
