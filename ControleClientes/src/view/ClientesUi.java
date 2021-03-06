/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class ClientesUi extends javax.swing.JFrame {

    /**
     * Creates new form telaTeste
     */
    AdicionarClienteUi adicionarCliente = new AdicionarClienteUi(null, true);
    public ClientesUi() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        painelClientesAtivos.setVisible(false);
        painelClientesNovos.setVisible(false);


//
//        ArrayList<String> listaCidades = new ArrayList<>();
//        listaCidades.add("Todas as cidades");
//        listaCidades.add("cidade 1");
//        listaCidades.add("3");
//        listaCidades.add("4");
//        listaCidades.add("5");
//        listaCidades.add("6");
//        listaCidades.add("7");
//        listaCidades.add("8");
//        listaCidades.add("9");
//        listaCidades.add("10");
//        listaCidades.add("11");
//        listaCidades.add("12");
//        listaCidades.add("13");
//        listaCidades.add("14");
//        listaCidades.add("15");
//        
//
//        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(listaCidades.toArray(new String[0])));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        painelLateral = new javax.swing.JPanel();
        botaoTodos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoNovos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botaoAdicionarCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoClienteAtivo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoRemoverCliente = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tipoPainel = new javax.swing.JLayeredPane();
        painelTodosClientes = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        tfBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelClientesAtivos = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        painelClientesNovos = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLateral.setBackground(new java.awt.Color(23, 35, 51));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoTodos.setBackground(new java.awt.Color(41, 57, 80));
        botaoTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoTodosMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Todos os Clientes");

        javax.swing.GroupLayout botaoTodosLayout = new javax.swing.GroupLayout(botaoTodos);
        botaoTodos.setLayout(botaoTodosLayout);
        botaoTodosLayout.setHorizontalGroup(
            botaoTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoTodosLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );
        botaoTodosLayout.setVerticalGroup(
            botaoTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoTodosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelLateral.add(botaoTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 60));

        botaoNovos.setBackground(new java.awt.Color(23, 35, 51));
        botaoNovos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoNovosMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clientes Novos");

        javax.swing.GroupLayout botaoNovosLayout = new javax.swing.GroupLayout(botaoNovos);
        botaoNovos.setLayout(botaoNovosLayout);
        botaoNovosLayout.setHorizontalGroup(
            botaoNovosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoNovosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        botaoNovosLayout.setVerticalGroup(
            botaoNovosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoNovosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        painelLateral.add(botaoNovos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 190, 60));

        botaoAdicionarCliente.setBackground(new java.awt.Color(23, 35, 51));
        botaoAdicionarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarClienteMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar Cliente");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/plus_24px.png"))); // NOI18N

        javax.swing.GroupLayout botaoAdicionarClienteLayout = new javax.swing.GroupLayout(botaoAdicionarCliente);
        botaoAdicionarCliente.setLayout(botaoAdicionarClienteLayout);
        botaoAdicionarClienteLayout.setHorizontalGroup(
            botaoAdicionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoAdicionarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        botaoAdicionarClienteLayout.setVerticalGroup(
            botaoAdicionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoAdicionarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(botaoAdicionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        painelLateral.add(botaoAdicionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 190, 50));

        botaoClienteAtivo.setBackground(new java.awt.Color(23, 35, 51));
        botaoClienteAtivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoClienteAtivoMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clientes Ativos");

        javax.swing.GroupLayout botaoClienteAtivoLayout = new javax.swing.GroupLayout(botaoClienteAtivo);
        botaoClienteAtivo.setLayout(botaoClienteAtivoLayout);
        botaoClienteAtivoLayout.setHorizontalGroup(
            botaoClienteAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoClienteAtivoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        botaoClienteAtivoLayout.setVerticalGroup(
            botaoClienteAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoClienteAtivoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        painelLateral.add(botaoClienteAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 190, 60));

        botaoRemoverCliente.setBackground(new java.awt.Color(23, 35, 51));
        botaoRemoverCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverClienteMouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Remover Cliente");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/plus_24px.png"))); // NOI18N

        javax.swing.GroupLayout botaoRemoverClienteLayout = new javax.swing.GroupLayout(botaoRemoverCliente);
        botaoRemoverCliente.setLayout(botaoRemoverClienteLayout);
        botaoRemoverClienteLayout.setHorizontalGroup(
            botaoRemoverClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoRemoverClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        botaoRemoverClienteLayout.setVerticalGroup(
            botaoRemoverClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoRemoverClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(botaoRemoverClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        painelLateral.add(botaoRemoverCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 190, 50));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tipoPainel.setBackground(new java.awt.Color(255, 255, 0));
        tipoPainel.setMaximumSize(new java.awt.Dimension(1069, 757));
        tipoPainel.setMinimumSize(new java.awt.Dimension(1069, 757));
        tipoPainel.setName(""); // NOI18N

        painelTodosClientes.setBackground(new java.awt.Color(204, 204, 255));
        painelTodosClientes.setMaximumSize(new java.awt.Dimension(1069, 757));
        painelTodosClientes.setMinimumSize(new java.awt.Dimension(1069, 757));
        painelTodosClientes.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(50, 104, 112));
        jPanel1.setMaximumSize(new java.awt.Dimension(1069, 757));
        jPanel1.setMinimumSize(new java.awt.Dimension(1069, 757));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(tfBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 210, -1));

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

        painelTodosClientes.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelTodosClientes.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelTodosClientesLayout = new javax.swing.GroupLayout(painelTodosClientes);
        painelTodosClientes.setLayout(painelTodosClientesLayout);
        painelTodosClientesLayout.setHorizontalGroup(
            painelTodosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTodosClientesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTodosClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        painelTodosClientesLayout.setVerticalGroup(
            painelTodosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTodosClientesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );

        tipoPainel.add(painelTodosClientes);
        painelTodosClientes.setBounds(0, 0, 1190, 830);

        painelClientesAtivos.setBackground(new java.awt.Color(255, 51, 51));
        painelClientesAtivos.setMaximumSize(new java.awt.Dimension(1069, 757));
        painelClientesAtivos.setMinimumSize(new java.awt.Dimension(1069, 757));
        painelClientesAtivos.setName(""); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(1069, 757));
        jPanel3.setMinimumSize(new java.awt.Dimension(1069, 757));
        jPanel3.setName(""); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelClientesAtivos.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelClientesAtivosLayout = new javax.swing.GroupLayout(painelClientesAtivos);
        painelClientesAtivos.setLayout(painelClientesAtivosLayout);
        painelClientesAtivosLayout.setHorizontalGroup(
            painelClientesAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClientesAtivosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelClientesAtivosLayout.setVerticalGroup(
            painelClientesAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesAtivosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 730, Short.MAX_VALUE))
        );

        tipoPainel.add(painelClientesAtivos);
        painelClientesAtivos.setBounds(0, 0, 1170, 830);

        painelClientesNovos.setBackground(new java.awt.Color(255, 51, 51));
        painelClientesNovos.setMaximumSize(new java.awt.Dimension(1069, 757));
        painelClientesNovos.setMinimumSize(new java.awt.Dimension(1069, 757));
        painelClientesNovos.setName(""); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(1069, 757));
        jPanel4.setMinimumSize(new java.awt.Dimension(1069, 757));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelClientesNovos.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelClientesNovosLayout = new javax.swing.GroupLayout(painelClientesNovos);
        painelClientesNovos.setLayout(painelClientesNovosLayout);
        painelClientesNovosLayout.setHorizontalGroup(
            painelClientesNovosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        painelClientesNovosLayout.setVerticalGroup(
            painelClientesNovosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesNovosLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 730, Short.MAX_VALUE))
        );

        tipoPainel.add(painelClientesNovos);
        painelClientesNovos.setBounds(0, 0, 1170, 830);

        getContentPane().add(tipoPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 0, 1069, 757));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoTodosMouseClicked
        // TODO add your handling code here:

        botaoTodos.setBackground(new java.awt.Color(85, 65, 118));
        botaoAdicionarCliente.setBackground(new java.awt.Color(54, 33, 89));
        botaoClienteAtivo.setBackground(new java.awt.Color(54, 33, 89));
        botaoNovos.setBackground(new java.awt.Color(54, 33, 89));

        painelTodosClientes.setVisible(true);
        painelClientesAtivos.setVisible(false);
        painelClientesNovos.setVisible(false);


    }//GEN-LAST:event_botaoTodosMouseClicked

    private void botaoAdicionarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarClienteMouseClicked
        // TODO add your handling code here:
        botaoAdicionarCliente.setBackground(new java.awt.Color(85, 65, 118));
        botaoTodos.setBackground(new java.awt.Color(54, 33, 89));
        botaoClienteAtivo.setBackground(new java.awt.Color(54, 33, 89));
        botaoNovos.setBackground(new java.awt.Color(54, 33, 89));

        painelTodosClientes.setVisible(false);
        painelClientesAtivos.setVisible(false);
        painelClientesNovos.setVisible(false);
        adicionarCliente.setVisible(true);

    }//GEN-LAST:event_botaoAdicionarClienteMouseClicked

    private void botaoClienteAtivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoClienteAtivoMouseClicked
        // TODO add your handling code here:
        botaoClienteAtivo.setBackground(new java.awt.Color(85, 65, 118));
        botaoTodos.setBackground(new java.awt.Color(54, 33, 89));
        botaoAdicionarCliente.setBackground(new java.awt.Color(54, 33, 89));
        botaoNovos.setBackground(new java.awt.Color(54, 33, 89));

        painelTodosClientes.setVisible(false);
        painelClientesAtivos.setVisible(true);
        painelClientesNovos.setVisible(false);
    }//GEN-LAST:event_botaoClienteAtivoMouseClicked

    private void botaoNovosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNovosMouseClicked
        // TODO add your handling code here:
        botaoNovos.setBackground(new java.awt.Color(85, 65, 118));
        botaoTodos.setBackground(new java.awt.Color(54, 33, 89));
        botaoClienteAtivo.setBackground(new java.awt.Color(54, 33, 89));
        botaoAdicionarCliente.setBackground(new java.awt.Color(54, 33, 89));

        painelTodosClientes.setVisible(false);
        painelClientesAtivos.setVisible(false);
        painelClientesNovos.setVisible(true);
    }//GEN-LAST:event_botaoNovosMouseClicked

    private void botaoRemoverClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverClienteMouseClicked

    private void tfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel botaoAdicionarCliente;
    private javax.swing.JPanel botaoClienteAtivo;
    private javax.swing.JPanel botaoNovos;
    private javax.swing.JPanel botaoRemoverCliente;
    private javax.swing.JPanel botaoTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLayeredPane painelClientesAtivos;
    private javax.swing.JLayeredPane painelClientesNovos;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JLayeredPane painelTodosClientes;
    private javax.swing.JTextField tfBusca;
    private javax.swing.JLayeredPane tipoPainel;
    // End of variables declaration//GEN-END:variables
}
