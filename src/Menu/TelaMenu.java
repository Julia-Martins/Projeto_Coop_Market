package Menu;

import Categorias.CategoriaUtilidadesDomesticas;
import Categorias.CategoriaProdutosDeLimpeza;
import Categorias.CategoriaPadaria;
import Categorias.CategoriaMatinais;
import Categorias.CategoriaHortifruti;
import Categorias.CategoriaHigienePessoal;
import Categorias.CategoriaFrioseLaticinios;
import Categorias.CategoriaCarnes;
import Categorias.CategoriaBebidas;
import Usuario.Carrinho;
import Usuario.MeusFavoritos;
import Usuario.MeusPedidos;
import Usuario.MinhaConta;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MeusPedidos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MinhaConta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MeusFavoritos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Carrinho = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        SairDaConta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MercadoDoisIrmãos = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        MercadoBomLugar = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        MercadoTauste = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        MercadoCarrefour = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        MercadoConfiança = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        CategoriaBebidas = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        CategoriaCarnes = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        CategoriaFrioseLaticinios = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        CategoriaHigienePessoal = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        CategoriaHortifruti = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        CategoriaMatinais = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        CategoriaPadaria = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        CategoriaProdutosDeLimpeza = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        CategoriaUtilidadesDomésticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 102));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Início");
        jMenu1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MeusPedidos.setText("Meus Pedidos");
        MeusPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeusPedidosActionPerformed(evt);
            }
        });
        jMenu1.add(MeusPedidos);
        jMenu1.add(jSeparator1);

        MinhaConta.setText("Minha Conta");
        MinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinhaContaActionPerformed(evt);
            }
        });
        jMenu1.add(MinhaConta);
        jMenu1.add(jSeparator2);

        MeusFavoritos.setText("Meus Favoritos");
        MeusFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeusFavoritosActionPerformed(evt);
            }
        });
        jMenu1.add(MeusFavoritos);
        jMenu1.add(jSeparator3);

        Carrinho.setText("Carrinho");
        Carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrinhoActionPerformed(evt);
            }
        });
        jMenu1.add(Carrinho);
        jMenu1.add(jSeparator4);

        SairDaConta.setText("Sair");
        SairDaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDaContaActionPerformed(evt);
            }
        });
        jMenu1.add(SairDaConta);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Mercados");
        jMenu2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem1.setText("Pegue&Pague");
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator5);

        MercadoDoisIrmãos.setText("Dois Irmãos");
        MercadoDoisIrmãos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadoDoisIrmãosActionPerformed(evt);
            }
        });
        jMenu2.add(MercadoDoisIrmãos);
        jMenu2.add(jSeparator6);

        MercadoBomLugar.setText("Bom Lugar");
        MercadoBomLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadoBomLugarActionPerformed(evt);
            }
        });
        jMenu2.add(MercadoBomLugar);
        jMenu2.add(jSeparator7);

        MercadoTauste.setText("Tauste");
        MercadoTauste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadoTausteActionPerformed(evt);
            }
        });
        jMenu2.add(MercadoTauste);
        jMenu2.add(jSeparator8);

        MercadoCarrefour.setText("Carrefour");
        MercadoCarrefour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadoCarrefourActionPerformed(evt);
            }
        });
        jMenu2.add(MercadoCarrefour);
        jMenu2.add(jSeparator9);

        MercadoConfiança.setText("Confiança");
        MercadoConfiança.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadoConfiançaActionPerformed(evt);
            }
        });
        jMenu2.add(MercadoConfiança);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Categorias");
        jMenu3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        CategoriaBebidas.setText("Bebidas");
        CategoriaBebidas.setToolTipText("");
        CategoriaBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaBebidasActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaBebidas);
        jMenu3.add(jSeparator10);

        CategoriaCarnes.setText("Carnes");
        CategoriaCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCarnesActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaCarnes);
        jMenu3.add(jSeparator11);

        CategoriaFrioseLaticinios.setText("Frios e Laticínios");
        CategoriaFrioseLaticinios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaFrioseLaticiniosActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaFrioseLaticinios);
        jMenu3.add(jSeparator12);

        CategoriaHigienePessoal.setText("Higiene Pessoal");
        CategoriaHigienePessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaHigienePessoalActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaHigienePessoal);
        jMenu3.add(jSeparator13);

        CategoriaHortifruti.setText("Hortifruti");
        CategoriaHortifruti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaHortifrutiActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaHortifruti);
        jMenu3.add(jSeparator14);

        CategoriaMatinais.setText("Matinais");
        CategoriaMatinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaMatinaisActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaMatinais);
        jMenu3.add(jSeparator15);

        CategoriaPadaria.setText("Padaria");
        CategoriaPadaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaPadariaActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaPadaria);
        jMenu3.add(jSeparator16);

        CategoriaProdutosDeLimpeza.setText("Produtos de Limpeza");
        CategoriaProdutosDeLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaProdutosDeLimpezaActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaProdutosDeLimpeza);
        jMenu3.add(jSeparator17);

        CategoriaUtilidadesDomésticas.setText("Utilidades Domésticas");
        CategoriaUtilidadesDomésticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaUtilidadesDomésticasActionPerformed(evt);
            }
        });
        jMenu3.add(CategoriaUtilidadesDomésticas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaUtilidadesDomésticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaUtilidadesDomésticasActionPerformed
        CategoriaUtilidadesDomesticas utilidadesdomesticas = new CategoriaUtilidadesDomesticas();
        utilidadesdomesticas.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaUtilidadesDomésticasActionPerformed

    private void CategoriaProdutosDeLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaProdutosDeLimpezaActionPerformed
        CategoriaProdutosDeLimpeza produtosdelimpeza = new CategoriaProdutosDeLimpeza();
        produtosdelimpeza.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaProdutosDeLimpezaActionPerformed

    private void CategoriaPadariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaPadariaActionPerformed
        CategoriaPadaria padaria = new CategoriaPadaria();
        padaria.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaPadariaActionPerformed

    private void CategoriaMatinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaMatinaisActionPerformed
        CategoriaMatinais matinais = new CategoriaMatinais();
        matinais.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaMatinaisActionPerformed

    private void CategoriaHortifrutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaHortifrutiActionPerformed
        CategoriaHortifruti hortifruti = new CategoriaHortifruti();
        hortifruti.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaHortifrutiActionPerformed

    private void CategoriaHigienePessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaHigienePessoalActionPerformed
        CategoriaHigienePessoal higiene = new CategoriaHigienePessoal();
        higiene.setVisible(true);
        dispose();

    }//GEN-LAST:event_CategoriaHigienePessoalActionPerformed

    private void CategoriaFrioseLaticiniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaFrioseLaticiniosActionPerformed
        CategoriaFrioseLaticinios frioselaticinios = new CategoriaFrioseLaticinios();
        frioselaticinios.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaFrioseLaticiniosActionPerformed

    private void CategoriaCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCarnesActionPerformed
        CategoriaCarnes carnes = new CategoriaCarnes();
        carnes.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaCarnesActionPerformed

    private void CategoriaBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaBebidasActionPerformed
        CategoriaBebidas bebidas = new CategoriaBebidas();
        bebidas.setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriaBebidasActionPerformed

    private void MercadoConfiançaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadoConfiançaActionPerformed
        
    }//GEN-LAST:event_MercadoConfiançaActionPerformed

    private void MercadoCarrefourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadoCarrefourActionPerformed
        
    }//GEN-LAST:event_MercadoCarrefourActionPerformed

    private void MercadoTausteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadoTausteActionPerformed
        
    }//GEN-LAST:event_MercadoTausteActionPerformed

    private void MercadoBomLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadoBomLugarActionPerformed
        
    }//GEN-LAST:event_MercadoBomLugarActionPerformed

    private void MercadoDoisIrmãosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadoDoisIrmãosActionPerformed
       
    }//GEN-LAST:event_MercadoDoisIrmãosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        TelaMenu telamenu = new TelaMenu();
        telamenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void SairDaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDaContaActionPerformed

    }//GEN-LAST:event_SairDaContaActionPerformed

    private void CarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrinhoActionPerformed
        Carrinho carrinho = new Carrinho();
        carrinho.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarrinhoActionPerformed

    private void MeusFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeusFavoritosActionPerformed
        MeusFavoritos meusfavoritos = new MeusFavoritos();
        meusfavoritos.setVisible(true);
        dispose();
    }//GEN-LAST:event_MeusFavoritosActionPerformed

    private void MinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinhaContaActionPerformed
        MinhaConta minhaconta = new MinhaConta();
        minhaconta.setVisible(true);
        dispose();
    }//GEN-LAST:event_MinhaContaActionPerformed

    private void MeusPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeusPedidosActionPerformed
        MeusPedidos meuspedidos = new MeusPedidos();
        meuspedidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_MeusPedidosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Carrinho;
    private javax.swing.JMenuItem CategoriaBebidas;
    private javax.swing.JMenuItem CategoriaCarnes;
    private javax.swing.JMenuItem CategoriaFrioseLaticinios;
    private javax.swing.JMenuItem CategoriaHigienePessoal;
    private javax.swing.JMenuItem CategoriaHortifruti;
    private javax.swing.JMenuItem CategoriaMatinais;
    private javax.swing.JMenuItem CategoriaPadaria;
    private javax.swing.JMenuItem CategoriaProdutosDeLimpeza;
    private javax.swing.JMenuItem CategoriaUtilidadesDomésticas;
    private javax.swing.JMenuItem MercadoBomLugar;
    private javax.swing.JMenuItem MercadoCarrefour;
    private javax.swing.JMenuItem MercadoConfiança;
    private javax.swing.JMenuItem MercadoDoisIrmãos;
    private javax.swing.JMenuItem MercadoTauste;
    private javax.swing.JMenuItem MeusFavoritos;
    private javax.swing.JMenuItem MeusPedidos;
    private javax.swing.JMenuItem MinhaConta;
    private javax.swing.JMenuItem SairDaConta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
