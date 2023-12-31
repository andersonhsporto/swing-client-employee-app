/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dev.anderson.clientes.sistema.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ahigo
 */
public class FRMMenu extends javax.swing.JFrame {

    /**
     * Creates new form FRMMenu
     */
    
    public String user;
    
    public FRMMenu() {
        initComponents();
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/background.jpg"));
        Image image = icon.getImage();
        panelDesktop = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }

        }
        ;
        labelUser = new javax.swing.JLabel();
        labelUserLogg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientMenu = new javax.swing.JMenu();
        clientControl = new javax.swing.JMenuItem();
        employeMenu = new javax.swing.JMenu();
        employeeControl = new javax.swing.JMenuItem();
        vendorMenu = new javax.swing.JMenu();
        vendorControl = new javax.swing.JMenuItem();
        productMenu = new javax.swing.JMenu();
        stockControl = new javax.swing.JMenuItem();
        productsControl = new javax.swing.JMenuItem();
        salesMenu = new javax.swing.JMenu();
        sallesControl = new javax.swing.JMenuItem();
        configurationMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout panelDesktopLayout = new javax.swing.GroupLayout(panelDesktop);
        panelDesktop.setLayout(panelDesktopLayout);
        panelDesktopLayout.setHorizontalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDesktopLayout.setVerticalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        labelUser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUser.setText("Usuário Logado: ");

        labelUserLogg.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        labelUserLogg.setText("default");

        clientMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        clientMenu.setText("Clientes");

        clientControl.setText("Controle de Cliente");
        clientControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientControlActionPerformed(evt);
            }
        });
        clientMenu.add(clientControl);

        jMenuBar1.add(clientMenu);

        employeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        employeMenu.setText("Funcionários");

        employeeControl.setText("Controle de Funcionários");
        employeMenu.add(employeeControl);

        jMenuBar1.add(employeMenu);

        vendorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedores.png"))); // NOI18N
        vendorMenu.setText("Fornecedores");

        vendorControl.setText("Controle de Fornecedores");
        vendorMenu.add(vendorControl);

        jMenuBar1.add(vendorMenu);

        productMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N
        productMenu.setText("Produtos");

        stockControl.setText("Controle de Estoque");
        productMenu.add(stockControl);

        productsControl.setText("Controle de Produtos");
        productMenu.add(productsControl);

        jMenuBar1.add(productMenu);

        salesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.png"))); // NOI18N
        salesMenu.setText("Vendas");

        sallesControl.setText("Controle de Vendas");
        salesMenu.add(sallesControl);

        jMenuBar1.add(salesMenu);

        configurationMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        configurationMenu.setText("Configurações");
        jMenuBar1.add(configurationMenu);

        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        logoutMenu.setText("Sair");
        jMenuBar1.add(logoutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDesktop)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUser)
                .addGap(18, 18, 18)
                .addComponent(labelUserLogg)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(labelUserLogg)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientControlActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.labelUserLogg.setText(user);
    }//GEN-LAST:event_formWindowActivated

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clientControl;
    private javax.swing.JMenu clientMenu;
    private javax.swing.JMenu configurationMenu;
    private javax.swing.JMenu employeMenu;
    private javax.swing.JMenuItem employeeControl;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelUserLogg;
    private javax.swing.JMenu logoutMenu;
    private javax.swing.JDesktopPane panelDesktop;
    private javax.swing.JMenu productMenu;
    private javax.swing.JMenuItem productsControl;
    private javax.swing.JMenu salesMenu;
    private javax.swing.JMenuItem sallesControl;
    private javax.swing.JMenuItem stockControl;
    private javax.swing.JMenuItem vendorControl;
    private javax.swing.JMenu vendorMenu;
    // End of variables declaration//GEN-END:variables
}
