/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entidades.Usuario;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author jackdaniels
 */
public class UsuarioView extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioView
     */
    public UsuarioView(int tipoView) {
        initComponents();
        
        switch(tipoView){
            case 0: //adiciona
                jPanelAddUsuario.setVisible(true);
                jPanelRmvUsuario.setVisible(false);
                jPanelConsultaUsuario.setVisible(false);
            break;
            
            case 1: //remove
                jPanelAddUsuario.setVisible(false);
                jPanelRmvUsuario.setVisible(true);
                jPanelConsultaUsuario.setVisible(false);
            break;
            
            case 2: //consulta
                jPanelAddUsuario.setVisible(false);
                jPanelRmvUsuario.setVisible(false);
                jPanelConsultaUsuario.setVisible(true);
            break;
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldusernmUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDtNascUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldpassUsuario = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCPFUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEndUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonAddUsuario = new javax.swing.JButton();
        jButtonCancelarAdd = new javax.swing.JButton();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jPanelRmvUsuario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldRmvUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonRmvUsuario = new javax.swing.JButton();
        jButtonRmvCancelar = new javax.swing.JButton();
        jPanelConsultaUsuario = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldConsultaUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonConsultarUsuario = new javax.swing.JButton();
        jButtonConsultarCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar Usuário");

        jTextFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Usuario:");

        jTextFieldusernmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldusernmUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Dt. Nasc.");

        jLabel5.setText("Senha:");

        jLabel6.setText("CPF");

        jLabel7.setText("Endereço:");

        jTextFieldEndUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEndUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Usuário:");

        jButtonAddUsuario.setText("Adicionar");
        jButtonAddUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUsuarioActionPerformed(evt);
            }
        });

        jButtonCancelarAdd.setText("Cancelar");
        jButtonCancelarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAddActionPerformed(evt);
            }
        });

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelAddUsuarioLayout = new javax.swing.GroupLayout(jPanelAddUsuario);
        jPanelAddUsuario.setLayout(jPanelAddUsuarioLayout);
        jPanelAddUsuarioLayout.setHorizontalGroup(
            jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(jLabel1))
                        .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEndUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAddUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldDtNascUsuario))))
                        .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldpassUsuario)
                                .addComponent(jTextFieldusernmUsuario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddUsuarioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxTipoUsuario, 0, 235, Short.MAX_VALUE)))
                    .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButtonCancelarAdd)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAddUsuario)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelAddUsuarioLayout.setVerticalGroup(
            jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDtNascUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldusernmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldpassUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel17.setText("Remover Usuário");

        jTextFieldRmvUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRmvUsuarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite o nome do usuário:");

        jButtonRmvUsuario.setText("Remover");

        jButtonRmvCancelar.setText("Cancelar");
        jButtonRmvCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRmvCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRmvUsuarioLayout = new javax.swing.GroupLayout(jPanelRmvUsuario);
        jPanelRmvUsuario.setLayout(jPanelRmvUsuarioLayout);
        jPanelRmvUsuarioLayout.setHorizontalGroup(
            jPanelRmvUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvUsuarioLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanelRmvUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldRmvUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17)
                    .addGroup(jPanelRmvUsuarioLayout.createSequentialGroup()
                        .addComponent(jButtonRmvCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRmvUsuario)))
                .addGap(97, 97, 97))
        );
        jPanelRmvUsuarioLayout.setVerticalGroup(
            jPanelRmvUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRmvUsuarioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(67, 67, 67)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldRmvUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelRmvUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRmvUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRmvCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel18.setText("Consultar Usuário");

        jTextFieldConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaUsuarioActionPerformed(evt);
            }
        });

        jLabel10.setText("Digite o nome do usuário:");

        jButtonConsultarUsuario.setText("Consultar");
        jButtonConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarUsuarioActionPerformed(evt);
            }
        });

        jButtonConsultarCancelar.setText("Cancelar");
        jButtonConsultarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaUsuarioLayout = new javax.swing.GroupLayout(jPanelConsultaUsuario);
        jPanelConsultaUsuario.setLayout(jPanelConsultaUsuarioLayout);
        jPanelConsultaUsuarioLayout.setHorizontalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaUsuarioLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addGroup(jPanelConsultaUsuarioLayout.createSequentialGroup()
                        .addComponent(jButtonConsultarCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultarUsuario)))
                .addGap(97, 97, 97))
        );
        jPanelConsultaUsuarioLayout.setVerticalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaUsuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel18)
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAddUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jPanelRmvUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jPanelConsultaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelAddUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanelRmvUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jPanelConsultaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jTextFieldusernmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldusernmUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldusernmUsuarioActionPerformed

    private void jTextFieldEndUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEndUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEndUsuarioActionPerformed

    private void jButtonAddUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUsuarioActionPerformed
        Usuario user;
        user = new Usuario(
                jTextFieldNomeUsuario.getText(),
                jTextFieldEndUsuario.getText(),
                jTextFieldCPFUsuario.getText(),
                jTextFieldDtNascUsuario.getText(),
                jTextFieldusernmUsuario.getText(),
                jPasswordFieldpassUsuario.getPassword(),
                1
        );
        UsuarioModel model = new UsuarioModel();
        if(model.Incluir(user)){
            JOptionPane.showMessageDialog(null, "Usuário Criado com Sucesso!"); 
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuario, verifique os campos!"); 
        }
                
    }//GEN-LAST:event_jButtonAddUsuarioActionPerformed

    private void jButtonCancelarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAddActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAddActionPerformed

    private void jTextFieldRmvUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRmvUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRmvUsuarioActionPerformed

    private void jButtonRmvCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRmvCancelarActionPerformed

    private void jTextFieldConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaUsuarioActionPerformed

    private void jButtonConsultarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonConsultarCancelarActionPerformed

    private void jButtonConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUsuario;
    private javax.swing.JButton jButtonCancelarAdd;
    private javax.swing.JButton jButtonConsultarCancelar;
    private javax.swing.JButton jButtonConsultarUsuario;
    private javax.swing.JButton jButtonRmvCancelar;
    private javax.swing.JButton jButtonRmvUsuario;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAddUsuario;
    private javax.swing.JPanel jPanelConsultaUsuario;
    private javax.swing.JPanel jPanelRmvUsuario;
    private javax.swing.JPasswordField jPasswordFieldpassUsuario;
    private javax.swing.JTextField jTextFieldCPFUsuario;
    private javax.swing.JTextField jTextFieldConsultaUsuario;
    private javax.swing.JTextField jTextFieldDtNascUsuario;
    private javax.swing.JTextField jTextFieldEndUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    private javax.swing.JTextField jTextFieldRmvUsuario;
    private javax.swing.JTextField jTextFieldusernmUsuario;
    // End of variables declaration//GEN-END:variables
}
