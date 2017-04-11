/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author jackdaniels
 */
public class LivroView extends javax.swing.JFrame {

    /**
     * Creates new form LivroView
     */
    public LivroView(int tipoView) {
        initComponents();
         switch(tipoView){
            case 0: //adiciona
                jPanelAddLivro.setVisible(true);
                jPanelRmvLivro.setVisible(false);
                jPanelConsultaLivro.setVisible(false);
            break;
            
            case 1: //remove
                jPanelAddLivro.setVisible(false);
                jPanelRmvLivro.setVisible(true);
                jPanelConsultaLivro.setVisible(false);;
            break;
            
            case 2: //consulta
                jPanelAddLivro.setVisible(false);
                jPanelRmvLivro.setVisible(false);
                jPanelConsultaLivro.setVisible(true);
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddLivro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTituloLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDtQtdeLivro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAutorLivro = new javax.swing.JTextField();
        jButtonAddLivro = new javax.swing.JButton();
        jButtonCancelarAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDEdicaoLivro = new javax.swing.JTextField();
        jPanelRmvLivro = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldRmvLivro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonRmvLivro = new javax.swing.JButton();
        jButtonRmvCancelar = new javax.swing.JButton();
        jPanelConsultaLivro = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldConsultaLivro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonConsultarLivro = new javax.swing.JButton();
        jButtonConsultarCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar Livro");

        jTextFieldTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloLivroActionPerformed(evt);
            }
        });

        jLabel2.setText("Título");

        jLabel4.setText("Qtde Disponivel");

        jTextFieldDtQtdeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtQtdeLivroActionPerformed(evt);
            }
        });

        jLabel7.setText("Autor");

        jTextFieldAutorLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorLivroActionPerformed(evt);
            }
        });

        jButtonAddLivro.setText("Adicionar");
        jButtonAddLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLivroActionPerformed(evt);
            }
        });

        jButtonCancelarAdd.setText("Cancelar");
        jButtonCancelarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAddActionPerformed(evt);
            }
        });

        jLabel8.setText("Edição");

        javax.swing.GroupLayout jPanelAddLivroLayout = new javax.swing.GroupLayout(jPanelAddLivro);
        jPanelAddLivro.setLayout(jPanelAddLivroLayout);
        jPanelAddLivroLayout.setHorizontalGroup(
            jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButtonCancelarAdd)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAddLivro))
                    .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddLivroLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDtQtdeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDEdicaoLivro)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddLivroLayout.setVerticalGroup(
            jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddLivroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDtQtdeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelAddLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel17.setText("Remover Livro");

        jTextFieldRmvLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRmvLivroActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite o nome do livro:");

        jButtonRmvLivro.setText("Remover");

        jButtonRmvCancelar.setText("Cancelar");
        jButtonRmvCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmvCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRmvLivroLayout = new javax.swing.GroupLayout(jPanelRmvLivro);
        jPanelRmvLivro.setLayout(jPanelRmvLivroLayout);
        jPanelRmvLivroLayout.setHorizontalGroup(
            jPanelRmvLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvLivroLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanelRmvLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldRmvLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17)
                    .addGroup(jPanelRmvLivroLayout.createSequentialGroup()
                        .addComponent(jButtonRmvCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRmvLivro)))
                .addGap(97, 97, 97))
        );
        jPanelRmvLivroLayout.setVerticalGroup(
            jPanelRmvLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvLivroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(67, 67, 67)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldRmvLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelRmvLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRmvLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRmvCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel18.setText("Consultar Livro");

        jTextFieldConsultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaLivroActionPerformed(evt);
            }
        });

        jLabel10.setText("Digite o nome do livro:");

        jButtonConsultarLivro.setText("Consultar");
        jButtonConsultarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarLivroActionPerformed(evt);
            }
        });

        jButtonConsultarCancelar.setText("Cancelar");
        jButtonConsultarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaLivroLayout = new javax.swing.GroupLayout(jPanelConsultaLivro);
        jPanelConsultaLivro.setLayout(jPanelConsultaLivroLayout);
        jPanelConsultaLivroLayout.setHorizontalGroup(
            jPanelConsultaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLivroLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanelConsultaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldConsultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addGroup(jPanelConsultaLivroLayout.createSequentialGroup()
                        .addComponent(jButtonConsultarCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarLivro)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanelConsultaLivroLayout.setVerticalGroup(
            jPanelConsultaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLivroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18)
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldConsultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultaLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelAddLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRmvLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelConsultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelAddLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRmvLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelConsultaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloLivroActionPerformed

    private void jTextFieldAutorLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorLivroActionPerformed

    private void jButtonAddLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLivroActionPerformed
        
        JOptionPane.showMessageDialog(null, "Livro adicionado ao sistema!");
        this.dispose();

    }//GEN-LAST:event_jButtonAddLivroActionPerformed

    private void jButtonCancelarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAddActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAddActionPerformed

    private void jTextFieldRmvLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRmvLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRmvLivroActionPerformed

    private void jButtonRmvCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRmvCancelarActionPerformed

    private void jTextFieldConsultaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaLivroActionPerformed

    private void jButtonConsultarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarLivroActionPerformed

    private void jButtonConsultarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonConsultarCancelarActionPerformed

    private void jTextFieldDtQtdeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtQtdeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtQtdeLivroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddLivro;
    private javax.swing.JButton jButtonCancelarAdd;
    private javax.swing.JButton jButtonConsultarCancelar;
    private javax.swing.JButton jButtonConsultarLivro;
    private javax.swing.JButton jButtonRmvCancelar;
    private javax.swing.JButton jButtonRmvLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAddLivro;
    private javax.swing.JPanel jPanelConsultaLivro;
    private javax.swing.JPanel jPanelRmvLivro;
    private javax.swing.JTextField jTextFieldAutorLivro;
    private javax.swing.JTextField jTextFieldConsultaLivro;
    private javax.swing.JTextField jTextFieldDEdicaoLivro;
    private javax.swing.JTextField jTextFieldDtQtdeLivro;
    private javax.swing.JTextField jTextFieldRmvLivro;
    private javax.swing.JTextField jTextFieldTituloLivro;
    // End of variables declaration//GEN-END:variables
}
