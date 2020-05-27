package gui;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import persistencias.FormularioSenha;

/**
 *
 * @author edivan
 */
public class TelaLogin extends javax.swing.JFrame {
    
    FormularioSenha wordlisSenha;
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        // Tamanho das telas padrão [1061, 663]
        initComponents();
//        wordlisSenha = new FormularioSenha("wordlist.txt");
            
    }
    // Limpa Tela
//    public void limparTelaLogin(){
//        jTextField_LoginUsuario.setText("");
//        jPasswordField_LoginSenha.setText("");
//    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_LoginUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField_LoginSenha = new javax.swing.JPasswordField();
        jButton_LoginEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_SairLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Biblioteca");

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        jButton_LoginEntrar.setText("Entrar");
        jButton_LoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginEntrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Para suporte (62) xxxxx-xxxx");

        jButton_SairLogin.setText("Sair");
        jButton_SairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_SairLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_LoginEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_LoginUsuario)
                            .addComponent(jPasswordField_LoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_LoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_LoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LoginEntrar)
                    .addComponent(jButton_SairLogin))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginEntrarActionPerformed
        // TODO add your handling code here:
        FormularioSenha objeto = new FormularioSenha(jTextField_LoginUsuario.getText(), jPasswordField_LoginSenha.getPassword().toString());
        //FormularioSenha objeto1 = new FormularioSenha();
        //objeto1.setUsuario(jTextField_LoginUsuario.getText());
        //objeto1.setSenhas(jPasswordField_LoginSenha.getPassword().toString());
        
        if (objeto.validaSenha(objeto)){
            //JOptionPane.showMessageDialog(null, "senha correta");
            TelaMenuPrincipal abrirTela = new TelaMenuPrincipal();
            abrirTela.setVisible(true);
            dispose();
            //TelaMenuPrincipal.abrir();
            // GuiaMenuPrincipal
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretas!");
        }

            
            //        String senha = String.valueOf(jPasswordField_LoginSenha.getPassword());
//        if (jTextField_LoginUsuario.getText().equals("admin") && senha.equals("admin")){
//            //JOptionPane.showMessageDialog(null, "senha correta");
//            TelaMenuPrincipal abrirTela = new TelaMenuPrincipal();
//            abrirTela.setVisible(true);
//            dispose();
//            //TelaMenuPrincipal.abrir();
//            // GuiaMenuPrincipal
//        }else{
//            JOptionPane.showMessageDialog(null, "Login ou senha incorretas!");
//        }

    }//GEN-LAST:event_jButton_LoginEntrarActionPerformed

    private void jButton_SairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_SairLoginActionPerformed

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
                //Nimbus
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LoginEntrar;
    private javax.swing.JButton jButton_SairLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField_LoginSenha;
    private javax.swing.JTextField jTextField_LoginUsuario;
    // End of variables declaration//GEN-END:variables
}
