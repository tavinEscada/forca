package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Palavra;

public class DefinePalavraPanel extends javax.swing.JPanel {

    private FramePrincipal framePai;

    public DefinePalavraPanel(FramePrincipal pai) {
        initComponents();

        //passando o FramePrincipal como atributo do Painel
        this.framePai = pai;

    }

    //definindo a imagem de fundo do Painel
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        try {
            //carregando a imagem de fundo
            Image imagemFundo = ImageIO.read(
                    new File(getClass().
                            getResource("/imagens/palavra.png").
                            getFile()));

            //redimen. uma imagem
            imagemFundo = imagemFundo.getScaledInstance(1042, 509,
                    Image.SCALE_DEFAULT);

            //"pintando" a imagem no painel
            g.drawImage(imagemFundo, 0, 0, this);

        } catch (IOException ex) {
            System.err.println("o arquivo esta corrompido");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palavraTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        temaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prontoBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        voltaBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        palavraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palavraTxtActionPerformed(evt);
            }
        });
        palavraTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                palavraTxtKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogador 1, informe os dados:");

        temaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaTxtActionPerformed(evt);
            }
        });
        temaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                temaTxtKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tema");

        prontoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        prontoBtn.setText("Pronto");
        prontoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prontoBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Palavra");

        voltaBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        voltaBtn.setText("Voltar");
        voltaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(temaTxt)
                                    .addComponent(palavraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(252, 252, 252)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(prontoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(voltaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(252, 252, 252))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel3)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(palavraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(prontoBtn)
                .addGap(18, 18, 18)
                .addComponent(voltaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void palavraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palavraTxtActionPerformed

    }//GEN-LAST:event_palavraTxtActionPerformed

    public void enterPalavraTema(JTextField palavra, JTextField tema) {

        if (palavra.getText().isEmpty() || tema.getText().isEmpty()) {
            //se sim, é exibida uma tela de erro
            JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos.",
                    "Preenchimento de dados", JOptionPane.WARNING_MESSAGE);
        } else {
            

            //se não, armazenamos o tema e a palavra em si ('nome') em um objeto da classe Palavra
            Palavra p = new Palavra(palavra.getText(), tema.getText());

            //trocando para o painel do jogo propriamente dito
            //passando como parâmetro o painel, o tema e a palavra
            framePai.trocarPainel(new ForcaPanel(framePai, p.getNome(), p.getTema()));
        }

    }

    //quando o botão "Pronto" for selecionado...
    private void prontoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prontoBtnActionPerformed

        enterPalavraTema(palavraTxt, temaTxt);

    }//GEN-LAST:event_prontoBtnActionPerformed

    private void voltaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaBtnActionPerformed
        framePai.trocarPainel(new ApresentaPanel(framePai));
    }//GEN-LAST:event_voltaBtnActionPerformed

    private void temaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temaTxtActionPerformed

    private void palavraTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palavraTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enterPalavraTema(palavraTxt, temaTxt);
        }
    }//GEN-LAST:event_palavraTxtKeyPressed

    private void temaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temaTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            enterPalavraTema(palavraTxt, temaTxt);
        }
    }//GEN-LAST:event_temaTxtKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField palavraTxt;
    private javax.swing.JButton prontoBtn;
    private javax.swing.JTextField temaTxt;
    private javax.swing.JButton voltaBtn;
    // End of variables declaration//GEN-END:variables

}
