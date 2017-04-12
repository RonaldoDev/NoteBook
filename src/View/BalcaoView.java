/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entidades.Livro;
import Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author jackdaniels
 */
public class BalcaoView extends javax.swing.JFrame {

    /**
     * Creates new form BalcaoView
     */
    public BalcaoView() {
        initComponents();
        jPanelEmprestimo.setVisible(true);
        jPanelUsuario.setVisible(false);
        jPanelLivro.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmprestimo = new javax.swing.JPanel();
        jLabelEmprestimos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimos = new javax.swing.JTable();
        jPanelLivro = new javax.swing.JPanel();
        jLabelEmprestimos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableLivro = new javax.swing.JTable();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableUsuario = new javax.swing.JTable();
        jMenuBarBalcao = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemListUsuario = new javax.swing.JMenuItem();
        jMenuItemManUsuario = new javax.swing.JMenuItem();
        jMenuLivro = new javax.swing.JMenu();
        jMenuItemListLivro = new javax.swing.JMenuItem();
        jMenuItemManLivro = new javax.swing.JMenuItem();
        jMenuEmprestimo = new javax.swing.JMenu();
        jMenuItemListEmprestimo = new javax.swing.JMenuItem();
        jMenuItemManEmprestimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelEmprestimos.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelEmprestimos.setText("Manipular Empréstimos");

        JTableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Livro", "Usuario", "Data Empréstimo", "Data Devolução"
            }
        ));
        jScrollPane1.setViewportView(JTableEmprestimos);
        if (JTableEmprestimos.getColumnModel().getColumnCount() > 0) {
            JTableEmprestimos.getColumnModel().getColumn(3).setHeaderValue("Exemplares Disponíveis");
        }

        javax.swing.GroupLayout jPanelEmprestimoLayout = new javax.swing.GroupLayout(jPanelEmprestimo);
        jPanelEmprestimo.setLayout(jPanelEmprestimoLayout);
        jPanelEmprestimoLayout.setHorizontalGroup(
            jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabelEmprestimos)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelEmprestimoLayout.setVerticalGroup(
            jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabelEmprestimos1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelEmprestimos1.setText("Manipular Livros");

        JTableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título do Livro", "Autor", "Total De Exemplares", "Exemplares Disponíveis"
            }
        ));
        jScrollPane2.setViewportView(JTableLivro);
        if (JTableLivro.getColumnModel().getColumnCount() > 0) {
            JTableLivro.getColumnModel().getColumn(3).setHeaderValue("Exemplares Disponíveis");
        }

        javax.swing.GroupLayout jPanelLivroLayout = new javax.swing.GroupLayout(jPanelLivro);
        jPanelLivro.setLayout(jPanelLivroLayout);
        jPanelLivroLayout.setHorizontalGroup(
            jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLivroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmprestimos1)
                .addGap(387, 387, 387))
        );
        jPanelLivroLayout.setVerticalGroup(
            jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelEmprestimos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabelUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabelUsuario.setText("Manipular Usuários");

        JTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Completo", "Tipo", "Data de Cadastro"
            }
        ));
        jScrollPane3.setViewportView(JTableUsuario);

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabelUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jMenuUsuario.setText("Usuário");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });

        jMenuItemListUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        jMenuItemListUsuario.setText("Listar Usuário");
        jMenuItemListUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemListUsuario);

        jMenuItemManUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItemManUsuario.setText("Manipular Usuário");
        jMenuItemManUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemManUsuario);

        jMenuBarBalcao.add(jMenuUsuario);

        jMenuLivro.setText("Livro");

        jMenuItemListLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        jMenuItemListLivro.setText("Listar Livros");
        jMenuItemListLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListLivroActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemListLivro);

        jMenuItemManLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItemManLivro.setText("Manipular Livros");
        jMenuItemManLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManLivroActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemManLivro);

        jMenuBarBalcao.add(jMenuLivro);

        jMenuEmprestimo.setText("Empréstimo");

        jMenuItemListEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        jMenuItemListEmprestimo.setText("Listar Empréstimos");
        jMenuItemListEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListEmprestimoActionPerformed(evt);
            }
        });
        jMenuEmprestimo.add(jMenuItemListEmprestimo);

        jMenuItemManEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItemManEmprestimo.setText("Manipular Empréstimos");
        jMenuItemManEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManEmprestimoActionPerformed(evt);
            }
        });
        jMenuEmprestimo.add(jMenuItemManEmprestimo);

        jMenuBarBalcao.add(jMenuEmprestimo);

        setJMenuBar(jMenuBarBalcao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jPanelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuUsuarioActionPerformed

    private void jMenuItemListUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListUsuarioActionPerformed
        // TODO add your handling code here:
        jPanelEmprestimo.setVisible(false);
        jPanelUsuario.setVisible(true);
        jPanelLivro.setVisible(false);
    }//GEN-LAST:event_jMenuItemListUsuarioActionPerformed

    private void jMenuItemManLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManLivroActionPerformed
        // TODO add your handling code here:
        jPanelEmprestimo.setVisible(false);
        jPanelUsuario.setVisible(false);
        jPanelLivro.setVisible(true);
        new LivroView().setVisible(true);
    }//GEN-LAST:event_jMenuItemManLivroActionPerformed

    private void jMenuItemManUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManUsuarioActionPerformed
        // TODO add your handling code here:
        jPanelEmprestimo.setVisible(false);
        jPanelUsuario.setVisible(true);
        jPanelLivro.setVisible(false);
         new UsuarioView().setVisible(true);
    }//GEN-LAST:event_jMenuItemManUsuarioActionPerformed

    private void jMenuItemListLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListLivroActionPerformed
        // TODO add your handling code here:
        jPanelEmprestimo.setVisible(false);
        jPanelUsuario.setVisible(false);
        jPanelLivro.setVisible(true);
    }//GEN-LAST:event_jMenuItemListLivroActionPerformed

    private void jMenuItemListEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListEmprestimoActionPerformed
        // TODO add your handling code here:
        jPanelEmprestimo.setVisible(true);
        jPanelUsuario.setVisible(false);
        jPanelLivro.setVisible(false);
        
    }//GEN-LAST:event_jMenuItemListEmprestimoActionPerformed

    private void jMenuItemManEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManEmprestimoActionPerformed
        jPanelEmprestimo.setVisible(true);
        jPanelUsuario.setVisible(false);
        jPanelLivro.setVisible(false);
        new EmprestimoView().setVisible(true);
    }//GEN-LAST:event_jMenuItemManEmprestimoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableEmprestimos;
    private javax.swing.JTable JTableLivro;
    private javax.swing.JTable JTableUsuario;
    private javax.swing.JLabel jLabelEmprestimos;
    private javax.swing.JLabel jLabelEmprestimos1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBarBalcao;
    private javax.swing.JMenu jMenuEmprestimo;
    private javax.swing.JMenuItem jMenuItemListEmprestimo;
    private javax.swing.JMenuItem jMenuItemListLivro;
    private javax.swing.JMenuItem jMenuItemListUsuario;
    private javax.swing.JMenuItem jMenuItemManEmprestimo;
    private javax.swing.JMenuItem jMenuItemManLivro;
    private javax.swing.JMenuItem jMenuItemManUsuario;
    private javax.swing.JMenu jMenuLivro;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPanel jPanelEmprestimo;
    private javax.swing.JPanel jPanelLivro;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
