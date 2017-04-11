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
    public EmprestimoView(int tipoView) {
        initComponents();
        switch(tipoView){
            case 0: //adiciona
                jPanelAddEmprestimo.setVisible(true);
                jPanelRmvEmprestimo.setVisible(false);
                jPanelConsultaEmprestimo.setVisible(false);
            break;
            
            case 1: //remove
                 jPanelAddEmprestimo.setVisible(false);
                jPanelRmvEmprestimo.setVisible(true);
                jPanelConsultaEmprestimo.setVisible(false);
            break;
            
            case 2: //consulta
                jPanelAddEmprestimo.setVisible(false);
                jPanelRmvEmprestimo.setVisible(false);
                jPanelConsultaEmprestimo.setVisible(true);
            break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddEmprestimo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLivroEmprestimo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDtEmprestimo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUsuarioEmprestimo = new javax.swing.JTextField();
        jButtonAddEmprestimo = new javax.swing.JButton();
        jButtonCancelarAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDtDevolucao = new javax.swing.JTextField();
        jPanelRmvEmprestimo = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldDevolução = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonDevolução = new javax.swing.JButton();
        jButtonRmvCancelar = new javax.swing.JButton();
        jPanelConsultaEmprestimo = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldConsultaEmprestimo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonConsultarEmprestimo = new javax.swing.JButton();
        jButtonConsultarCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar Empréstimo");

        jTextFieldLivroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLivroEmprestimoActionPerformed(evt);
            }
        });

        jLabel2.setText("Livro");

        jLabel4.setText("Data Empréstimo");

        jLabel7.setText("Usuario");

        jTextFieldUsuarioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioEmprestimoActionPerformed(evt);
            }
        });

        jButtonAddEmprestimo.setText("Adicionar");
        jButtonAddEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmprestimoActionPerformed(evt);
            }
        });

        jButtonCancelarAdd.setText("Cancelar");
        jButtonCancelarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAddActionPerformed(evt);
            }
        });

        jLabel8.setText("Data Devolução");

        javax.swing.GroupLayout jPanelAddEmprestimoLayout = new javax.swing.GroupLayout(jPanelAddEmprestimo);
        jPanelAddEmprestimo.setLayout(jPanelAddEmprestimoLayout);
        jPanelAddEmprestimoLayout.setHorizontalGroup(
            jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddEmprestimoLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldDtDevolucao))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddEmprestimoLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDtEmprestimo)))))
                    .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButtonCancelarAdd)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAddEmprestimo))
                    .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addGap(67, 67, 67))
        );
        jPanelAddEmprestimoLayout.setVerticalGroup(
            jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmprestimoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDtEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelAddEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel17.setText("Devolver Livro");

        jTextFieldDevolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDevoluçãoActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite o nome do livro:");

        jButtonDevolução.setText("Devolver");
        jButtonDevolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevoluçãoActionPerformed(evt);
            }
        });

        jButtonRmvCancelar.setText("Cancelar");
        jButtonRmvCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmvCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRmvEmprestimoLayout = new javax.swing.GroupLayout(jPanelRmvEmprestimo);
        jPanelRmvEmprestimo.setLayout(jPanelRmvEmprestimoLayout);
        jPanelRmvEmprestimoLayout.setHorizontalGroup(
            jPanelRmvEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvEmprestimoLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanelRmvEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldDevolução, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17)
                    .addGroup(jPanelRmvEmprestimoLayout.createSequentialGroup()
                        .addComponent(jButtonRmvCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDevolução)))
                .addGap(97, 97, 97))
        );
        jPanelRmvEmprestimoLayout.setVerticalGroup(
            jPanelRmvEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvEmprestimoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(67, 67, 67)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDevolução, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelRmvEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDevolução, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRmvCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel18.setText("Consultar Emprestimo");

        jTextFieldConsultaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaEmprestimoActionPerformed(evt);
            }
        });

        jLabel10.setText("Digite o nome do livro:");

        jButtonConsultarEmprestimo.setText("Consultar");
        jButtonConsultarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarEmprestimoActionPerformed(evt);
            }
        });

        jButtonConsultarCancelar.setText("Cancelar");
        jButtonConsultarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaEmprestimoLayout = new javax.swing.GroupLayout(jPanelConsultaEmprestimo);
        jPanelConsultaEmprestimo.setLayout(jPanelConsultaEmprestimoLayout);
        jPanelConsultaEmprestimoLayout.setHorizontalGroup(
            jPanelConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaEmprestimoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldConsultaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultaEmprestimoLayout.createSequentialGroup()
                        .addComponent(jButtonConsultarCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarEmprestimo)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanelConsultaEmprestimoLayout.setVerticalGroup(
            jPanelConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaEmprestimoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel18)
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldConsultaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanelConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelAddEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRmvEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelConsultaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelAddEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRmvEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelConsultaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLivroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLivroEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLivroEmprestimoActionPerformed

    private void jTextFieldUsuarioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioEmprestimoActionPerformed

    private void jButtonAddEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmprestimoActionPerformed

        JOptionPane.showMessageDialog(null, "Emprestimo Adicionado!");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAddEmprestimoActionPerformed

    private void jButtonCancelarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAddActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAddActionPerformed

    private void jTextFieldDevoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDevoluçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDevoluçãoActionPerformed

    private void jButtonRmvCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRmvCancelarActionPerformed

    private void jTextFieldConsultaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaEmprestimoActionPerformed

    private void jButtonConsultarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarEmprestimoActionPerformed

    private void jButtonConsultarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonConsultarCancelarActionPerformed

    private void jButtonDevoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevoluçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDevoluçãoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddEmprestimo;
    private javax.swing.JButton jButtonCancelarAdd;
    private javax.swing.JButton jButtonConsultarCancelar;
    private javax.swing.JButton jButtonConsultarEmprestimo;
    private javax.swing.JButton jButtonDevolução;
    private javax.swing.JButton jButtonRmvCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAddEmprestimo;
    private javax.swing.JPanel jPanelConsultaEmprestimo;
    private javax.swing.JPanel jPanelRmvEmprestimo;
    private javax.swing.JTextField jTextFieldConsultaEmprestimo;
    private javax.swing.JTextField jTextFieldDevolução;
    private javax.swing.JTextField jTextFieldDtDevolucao;
    private javax.swing.JTextField jTextFieldDtEmprestimo;
    private javax.swing.JTextField jTextFieldLivroEmprestimo;
    private javax.swing.JTextField jTextFieldUsuarioEmprestimo;
    // End of variables declaration//GEN-END:variables
}
