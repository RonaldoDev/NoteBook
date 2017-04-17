/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EmprestimoController;
import Controller.LivroController;
import Controller.UsuarioController;
import Entidades.Emprestimo;
import Entidades.Livro;
import Entidades.Usuario;
import Enumeradores.SituacaoLivro;
import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author jackdaniels
 */
public class EmprestimoView extends javax.swing.JFrame {

    EmprestimoController ctrlEmprestimo = new EmprestimoController();
    LivroController ctrlLivro = new LivroController();
    UsuarioController ctrlUsuario = new UsuarioController();

    /**
     * Creates new form EmprestimoView
     */
    public EmprestimoView() {
        this.setLocation(300, 100);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jTextFieldUsuarioEmprestimo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLivroEmprestimo = new javax.swing.JTextField();
        jTextFieldIdEmprestimo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        lblMensagem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jButtonLimpaTela = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRmv = new javax.swing.JButton();
        jButtonEdt = new javax.swing.JButton();
        jButtonCons = new javax.swing.JButton();
        jLabelLivro = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelCampos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldUsuarioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioEmprestimoActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario");

        jLabel3.setText("Livro");

        jTextFieldLivroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLivroEmprestimoActionPerformed(evt);
            }
        });

        jTextFieldIdEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdEmprestimoActionPerformed(evt);
            }
        });

        jLabel8.setText("Código");

        button1.setLabel("?");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("?");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableLista);
        if (jTableLista.getColumnModel().getColumnCount() > 0) {
            jTableLista.getColumnModel().getColumn(0).setResizable(false);
            jTableLista.getColumnModel().getColumn(1).setResizable(false);
            jTableLista.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldIdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLivroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUsuarioEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(26, 26, 26))
        );

        button2.getAccessibleContext().setAccessibleName("?");

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
        jLabelLivro.setText("Adicionar Emprestimo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonAdd)
                .addGap(18, 18, 18)
                .addComponent(jButtonEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCons)
                            .addComponent(jLabelLivro))
                        .addGap(124, 124, 124)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonLimpaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTelaActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButtonLimpaTelaActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRmvActionPerformed
        jLabelLivro.setText("Remover Emprestimo");

    }//GEN-LAST:event_jButtonRmvActionPerformed

    private void jButtonEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdtActionPerformed
        jLabelLivro.setText("Editar Emprestimo");
    }//GEN-LAST:event_jButtonEdtActionPerformed

    private void jButtonConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsActionPerformed
        jLabelLivro.setText("Consultar Emprestimo");
        Emprestimo emp = new Emprestimo();

    }//GEN-LAST:event_jButtonConsActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        Usuario _user = new Usuario();

        ArrayList<Usuario> lstUsuario = new ArrayList<>(ctrlUsuario.Listar().stream().filter((Usuario u) -> !u.getDeLivro().equals(SituacaoLivro.Disponivel)).map(m -> m).collect(Collectors.toList()));
        System.out.println(lstUsuario.size());

        for (int i = 0; i < lstUsuario.size(); i++) {
            jTableLista.setValueAt(lstUsuario.get(i).getNome(), i, 0);
            jTableLista.setValueAt(lstUsuario.get(i).getCpf(), i, 1);
            jTableLista.setValueAt(lstUsuario.get(i).getUsuario(), i, 2);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        ArrayList<Livro> lstLivro = ctrlLivro.Listar();
        jTableLista.removeColumnSelectionInterval(0, 3);
        // lstLivro.add(new Livro("teste", "teste", "teste"));
        System.out.println(lstLivro.size());
        jTableLista.addColumnSelectionInterval(0, 3);
        for (int i = 0; i < lstLivro.size(); i++) {

            jTableLista.setValueAt(lstLivro.get(i).getNome(), i, 0);
            jTableLista.setValueAt(lstLivro.get(i).getAutor(), i, 1);
            jTableLista.setValueAt(lstLivro.get(i).getSituacao(), i, 2);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void jTextFieldIdEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdEmprestimoActionPerformed

    private void jTextFieldLivroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLivroEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLivroEmprestimoActionPerformed

    private void jTextFieldUsuarioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioEmprestimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldIdEmprestimo;
    private javax.swing.JTextField jTextFieldLivroEmprestimo;
    private javax.swing.JTextField jTextFieldUsuarioEmprestimo;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        jTextFieldIdEmprestimo.setText("");
        jTextFieldLivroEmprestimo.setText("");
        jTextFieldUsuarioEmprestimo.setText("");
    }

}
