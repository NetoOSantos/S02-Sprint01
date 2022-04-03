
package com.mycompany.projetotelaswing;


public class KeepSwimming extends javax.swing.JFrame {

    public KeepSwimming() {
       initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelFundo = new javax.swing.JPanel();
        LogoBarquinho = new javax.swing.JLabel();
        PainelLogin = new javax.swing.JPanel();
        TituloLogin = new javax.swing.JLabel();
        TextoNomeUsuario = new javax.swing.JLabel();
        TextoSenha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        CampoNomeUsuario = new javax.swing.JTextField();
        BotaoLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        OndaNoFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 16, 77));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 615, -1, -1));

        PainelFundo.setBackground(new java.awt.Color(52, 16, 77));

        LogoBarquinho.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\atividades bandtec\\2 Semestre\\Sprint\\Keep-Swimming\\ProjetoTelaSwing\\src\\main\\java\\com\\mycompany\\projetotelaswing\\newpackage\\logoBarquinho.png")); // NOI18N
        LogoBarquinho.setLabelFor(LogoBarquinho);
        LogoBarquinho.setIconTextGap(0);

        PainelLogin.setBackground(new java.awt.Color(83, 63, 153));
        PainelLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloLogin.setBackground(new java.awt.Color(52, 63, 65));
        TituloLogin.setForeground(new java.awt.Color(52, 174, 223));
        TituloLogin.setText("Keep Login");
        TituloLogin.setMaximumSize(new java.awt.Dimension(16, 16));
        TituloLogin.setMinimumSize(new java.awt.Dimension(59, 20));
        TituloLogin.setName(""); // NOI18N

        TextoNomeUsuario.setText("Nome usuário");

        TextoSenha.setText("Senha");

        CampoSenha.setText("jPasswordField1");
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });

        CampoNomeUsuario.setText("Email ou CPF");
        CampoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeUsuarioActionPerformed(evt);
            }
        });

        BotaoLogin.setBackground(new java.awt.Color(255, 255, 255));
        BotaoLogin.setForeground(new java.awt.Color(1, 1, 1));
        BotaoLogin.setText("Navegar");

        javax.swing.GroupLayout PainelLoginLayout = new javax.swing.GroupLayout(PainelLogin);
        PainelLogin.setLayout(PainelLoginLayout);
        PainelLoginLayout.setHorizontalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                        .addComponent(TextoSenha)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                        .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoNomeUsuario)
                            .addGroup(PainelLoginLayout.createSequentialGroup()
                                .addComponent(TituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(120, 120, 120))))
        );
        PainelLoginLayout.setVerticalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TextoNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(TextoSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoSenha)
                .addGap(38, 38, 38)
                .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        OndaNoFinal.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\atividades bandtec\\2 Semestre\\Sprint\\Keep-Swimming\\ProjetoTelaSwing\\src\\main\\java\\com\\mycompany\\projetotelaswing\\newpackage\\OndaRoxaParaCima.png")); // NOI18N
        OndaNoFinal.setLabelFor(OndaNoFinal);

        javax.swing.GroupLayout PainelFundoLayout = new javax.swing.GroupLayout(PainelFundo);
        PainelFundo.setLayout(PainelFundoLayout);
        PainelFundoLayout.setHorizontalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LogoBarquinho, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(PainelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OndaNoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelFundoLayout.setVerticalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoBarquinho, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(OndaNoFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );

        getContentPane().add(PainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 484));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeUsuarioActionPerformed
        
    }//GEN-LAST:event_CampoNomeUsuarioActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        
    }//GEN-LAST:event_CampoSenhaActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeepSwimming().setVisible(true);
                
               
            }
        });
    }
    
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JTextField CampoNomeUsuario;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel LogoBarquinho;
    private javax.swing.JLabel OndaNoFinal;
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JPanel PainelLogin;
    private javax.swing.JLabel TextoNomeUsuario;
    private javax.swing.JLabel TextoSenha;
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


