package gui;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ForcaPanel extends javax.swing.JPanel {

    //declarando os atributos do painel
    private FramePrincipal framePai;
    private String[] divPal;
    private String[] misto;
    private int erros = 0;

    public ForcaPanel(FramePrincipal pai, String nome, String tema) {
        initComponents();

        //instanciando o FramePrincipal como "pai"
        this.framePai = pai;

        //definindo uma string que vai ser preenchida com asteriscos
        String ast = "";

        //dividindo a palavra informada, letra a letra, em um vetor de Strings
        divPal = nome.split("");

        //definindo a imagem da forca sozinha, em situação de "0 erros"
        labelImage.setIcon(new ImageIcon(getClass().getResource("/imagens/0erros.png")));

        for (int i = 0; i < divPal.length; i++) {
            //definindo a String ast com asteriscos, de acordo com a quantidade de letras da palavra
            ast += "*";
        }

        //definindo outro vetor de Strings que juntará as letras descobertas com os asteriscos
        misto = ast.split("");

        //definindo o texto do label que apresenta o tema ao jogador 2
        labelTema.setText("Tema: " + tema);

        //definindo, inicialmente, a palavra misteriosa com asteriscos
        labelPalavra.setText(ast);
    }

    public boolean verificaPalavra() {

        String palavra = "";
        
        for(String a : divPal){
            palavra += a;
        }
        return palavra.equals(chutetext.getText());
    }

    public void exibePalavra() {
        //revelando a palavra
        String revelacao = "";
        for (String a : divPal) {
            revelacao += a;
        }
        labelPalavra.setText(revelacao);
    }

    //metodo executado a cada vez que o jogador 2 segere uma letra
    private void escolheLetra(String letra, JButton btn) {

        //fazendo com que o botão em questão não seja mais visível
        btn.setVisible(false);

        //variável que avalia, a cada vez que uma letra é selecionada, se ela existe ou não na palavra
        boolean deuErro = true;

        //laço que passa por todas as posições do vetor da palavra dividida
        for (int i = 0; i < divPal.length; i++) {

            //se alguma das letras é a selecionada pelo usuário, não há erro
            if (divPal[i].equalsIgnoreCase(letra)) {
                deuErro = false;
                misto[i] = divPal[i];
            }
        }

        //se, ao final da verificação, a letra não existe na palavra... 
        if (deuErro == true) {

            //a contagem de erros se altera
            erros++;

            //alterar imagem para a quantidade de erros correspondente
            labelImage.setIcon(new ImageIcon(getClass().getResource("/imagens/" + erros + "erros.png")));

            //verificando se o jogador 2 errou 6 vezes
            if (erros == 6) {

                exibePalavra();

                //exibida mensagem informando a vitória do jogador 1
                JOptionPane.showMessageDialog(this, "Jogador 1, você venceu!!!");

                //voltando para o Painel de definição da palavra
                framePai.trocarPainel(new DefinePalavraPanel(framePai));
            }

        //se não houve erro e a letra está presente na palavra
        } else {

            //é criada a string que o jogador 2 verá como palavra misteriosa
            String palavraMista = "";

            //o vetor 'misto é copiado para a String
            for (String misto1 : misto) {
                palavraMista += misto1;
            }

            //definindo o label da palavra com a 'palavraMista'
            labelPalavra.setText(palavraMista);

            //variável que vai verificar se a palavra que está sendo exibida é igual à palavra definida
            boolean igual = true;

            //passando por todas as posições de ambos os vetores e comparando a letra em questão
            for (int p = 0; p < divPal.length; p++) {
                //se a letra de ambos os vetores for igual
                if (!misto[p].equals(divPal[p])) {
                    igual = false;
                    break;
                }
            }

            //se todas as letras são iguais em ambos os vetores...
            if (igual == true) {
                //é exibida a mensagem de vitória
                JOptionPane.showMessageDialog(this, "Jogador 2, você venceu!!!");

                //voltamos à tela de definição da palavra e do tema
                framePai.trocarPainel(new DefinePalavraPanel(framePai));
            }
        }
    }

    private void enterChute(JTextField chutetext) {
        if (chutetext.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a palavra para chutar", "Inserção da palavra", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (verificaPalavra() == true) {
            //é exibida a mensagem de vitória
            JOptionPane.showMessageDialog(this, "Palavra certa!!! Jogador 2, você venceu!!!");

        } else {

            //é revelada a palavra
            exibePalavra();
            
            //é exibida a mensagem de vitória
            JOptionPane.showMessageDialog(this, "Palavra errada!!! Jogador 1, você venceu!!!");

        }
        //voltamos à tela de definição da palavra e do tema
        framePai.trocarPainel(new DefinePalavraPanel(framePai));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTema = new javax.swing.JLabel();
        qBTN = new javax.swing.JButton();
        wBTN = new javax.swing.JButton();
        eBTN = new javax.swing.JButton();
        rBTN = new javax.swing.JButton();
        tBTN = new javax.swing.JButton();
        yBTN = new javax.swing.JButton();
        iBTN = new javax.swing.JButton();
        uBTN = new javax.swing.JButton();
        oBTN = new javax.swing.JButton();
        pBTN = new javax.swing.JButton();
        jBTN = new javax.swing.JButton();
        lBTN = new javax.swing.JButton();
        aBTN = new javax.swing.JButton();
        sBTN = new javax.swing.JButton();
        dBTN = new javax.swing.JButton();
        fBTN = new javax.swing.JButton();
        gBTN = new javax.swing.JButton();
        hBTN = new javax.swing.JButton();
        kBTN = new javax.swing.JButton();
        nBTN = new javax.swing.JButton();
        mBTN = new javax.swing.JButton();
        zBTN = new javax.swing.JButton();
        xBTN = new javax.swing.JButton();
        cBTN = new javax.swing.JButton();
        vBTN = new javax.swing.JButton();
        bBTN = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        labelPalavra = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chutetext = new javax.swing.JTextField();
        chuteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        labelTema.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTema.setText("");

        qBTN.setText("Q");
        qBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qBTNActionPerformed(evt);
            }
        });

        wBTN.setText("W");
        wBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wBTNActionPerformed(evt);
            }
        });

        eBTN.setText("E");
        eBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBTNActionPerformed(evt);
            }
        });

        rBTN.setText("R");
        rBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBTNActionPerformed(evt);
            }
        });

        tBTN.setText("T");
        tBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBTNActionPerformed(evt);
            }
        });

        yBTN.setText("Y");
        yBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yBTNActionPerformed(evt);
            }
        });

        iBTN.setText("I");
        iBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iBTNActionPerformed(evt);
            }
        });

        uBTN.setText("U");
        uBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uBTNActionPerformed(evt);
            }
        });

        oBTN.setText("O");
        oBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oBTNActionPerformed(evt);
            }
        });

        pBTN.setText("P");
        pBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBTNActionPerformed(evt);
            }
        });

        jBTN.setText("J");
        jBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNActionPerformed(evt);
            }
        });

        lBTN.setText("L");
        lBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lBTNActionPerformed(evt);
            }
        });

        aBTN.setText("A");
        aBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBTNActionPerformed(evt);
            }
        });

        sBTN.setText("S");
        sBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBTNActionPerformed(evt);
            }
        });

        dBTN.setText("D");
        dBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBTNActionPerformed(evt);
            }
        });

        fBTN.setText("F");
        fBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBTNActionPerformed(evt);
            }
        });

        gBTN.setText("G");
        gBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBTNActionPerformed(evt);
            }
        });

        hBTN.setText("H");
        hBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBTNActionPerformed(evt);
            }
        });

        kBTN.setText("K");
        kBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBTNActionPerformed(evt);
            }
        });

        nBTN.setText("N");
        nBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nBTNActionPerformed(evt);
            }
        });

        mBTN.setText("M");
        mBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBTNActionPerformed(evt);
            }
        });

        zBTN.setText("Z");
        zBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zBTNActionPerformed(evt);
            }
        });

        xBTN.setText("X");
        xBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xBTNActionPerformed(evt);
            }
        });

        cBTN.setText("C");
        cBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTNActionPerformed(evt);
            }
        });

        vBTN.setText("V");
        vBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBTNActionPerformed(evt);
            }
        });

        bBTN.setText("B");
        bBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBTNActionPerformed(evt);
            }
        });

        labelImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelPalavra.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPalavra.setText(" ");

        voltarBtn.setText("VOLTAR");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Se quiser chutar (se errar perde):");

        chutetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chutetextActionPerformed(evt);
            }
        });
        chutetext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chutetextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chutetextKeyTyped(evt);
            }
        });

        chuteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chuteBtn.setText("Chutar");
        chuteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(zBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBTN)
                                .addGap(18, 18, 18)
                                .addComponent(vBTN)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(voltarBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bBTN)
                                        .addGap(18, 18, 18)
                                        .addComponent(nBTN)
                                        .addGap(20, 20, 20)
                                        .addComponent(mBTN))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(aBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dBTN)
                                .addGap(18, 18, 18)
                                .addComponent(fBTN)
                                .addGap(14, 14, 14)
                                .addComponent(gBTN)
                                .addGap(18, 18, 18)
                                .addComponent(hBTN)
                                .addGap(18, 18, 18)
                                .addComponent(jBTN)
                                .addGap(18, 18, 18)
                                .addComponent(kBTN)
                                .addGap(18, 18, 18)
                                .addComponent(lBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(qBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rBTN)
                        .addGap(18, 18, 18)
                        .addComponent(tBTN)
                        .addGap(18, 18, 18)
                        .addComponent(yBTN)
                        .addGap(18, 18, 18)
                        .addComponent(uBTN)
                        .addGap(18, 18, 18)
                        .addComponent(iBTN)
                        .addGap(18, 18, 18)
                        .addComponent(oBTN)
                        .addGap(18, 18, 18)
                        .addComponent(pBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(labelPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labelTema))))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(chutetext, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(chuteBtn)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTema)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(labelPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chutetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chuteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qBTN)
                            .addComponent(wBTN)
                            .addComponent(eBTN)
                            .addComponent(rBTN)
                            .addComponent(tBTN)
                            .addComponent(yBTN)
                            .addComponent(uBTN)
                            .addComponent(iBTN)
                            .addComponent(oBTN)
                            .addComponent(pBTN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aBTN)
                            .addComponent(sBTN)
                            .addComponent(dBTN)
                            .addComponent(fBTN)
                            .addComponent(gBTN)
                            .addComponent(hBTN)
                            .addComponent(jBTN)
                            .addComponent(kBTN)
                            .addComponent(lBTN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zBTN)
                            .addComponent(xBTN)
                            .addComponent(cBTN)
                            .addComponent(vBTN)
                            .addComponent(bBTN)
                            .addComponent(mBTN)
                            .addComponent(nBTN))))
                .addGap(38, 38, 38)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //executando o método escolheLetra em cada botão
    private void wBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wBTNActionPerformed
        escolheLetra("w", wBTN);
    }//GEN-LAST:event_wBTNActionPerformed

    private void sBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBTNActionPerformed
        escolheLetra("s", sBTN);
    }//GEN-LAST:event_sBTNActionPerformed

    private void aBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBTNActionPerformed
        escolheLetra("a", aBTN);
    }//GEN-LAST:event_aBTNActionPerformed

    private void qBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qBTNActionPerformed
        escolheLetra("q", qBTN);
    }//GEN-LAST:event_qBTNActionPerformed

    private void eBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBTNActionPerformed
        escolheLetra("e", eBTN);
    }//GEN-LAST:event_eBTNActionPerformed

    private void fBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBTNActionPerformed
        escolheLetra("f", fBTN);
    }//GEN-LAST:event_fBTNActionPerformed

    private void rBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBTNActionPerformed
        escolheLetra("r", rBTN);
    }//GEN-LAST:event_rBTNActionPerformed

    private void tBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBTNActionPerformed
        escolheLetra("t", tBTN);
    }//GEN-LAST:event_tBTNActionPerformed

    private void yBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yBTNActionPerformed
        escolheLetra("y", yBTN);
    }//GEN-LAST:event_yBTNActionPerformed

    private void uBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uBTNActionPerformed
        escolheLetra("u", uBTN);
    }//GEN-LAST:event_uBTNActionPerformed

    private void iBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iBTNActionPerformed
        escolheLetra("i", iBTN);
    }//GEN-LAST:event_iBTNActionPerformed

    private void oBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oBTNActionPerformed
        escolheLetra("o", oBTN);
    }//GEN-LAST:event_oBTNActionPerformed

    private void pBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBTNActionPerformed
        escolheLetra("p", pBTN);
    }//GEN-LAST:event_pBTNActionPerformed

    private void dBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBTNActionPerformed
        escolheLetra("d", dBTN);
    }//GEN-LAST:event_dBTNActionPerformed

    private void gBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBTNActionPerformed
        escolheLetra("g", gBTN);
    }//GEN-LAST:event_gBTNActionPerformed

    private void hBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBTNActionPerformed
        escolheLetra("h", hBTN);
    }//GEN-LAST:event_hBTNActionPerformed

    private void jBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNActionPerformed
        escolheLetra("j", jBTN);
    }//GEN-LAST:event_jBTNActionPerformed

    private void kBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBTNActionPerformed
        escolheLetra("k", kBTN);
    }//GEN-LAST:event_kBTNActionPerformed

    private void lBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lBTNActionPerformed
        escolheLetra("l", lBTN);
    }//GEN-LAST:event_lBTNActionPerformed

    private void zBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zBTNActionPerformed
        escolheLetra("z", zBTN);
    }//GEN-LAST:event_zBTNActionPerformed

    private void xBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBTNActionPerformed
        escolheLetra("x", xBTN);
    }//GEN-LAST:event_xBTNActionPerformed

    private void cBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTNActionPerformed
        escolheLetra("c", cBTN);
    }//GEN-LAST:event_cBTNActionPerformed

    private void vBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBTNActionPerformed
        escolheLetra("v", vBTN);
    }//GEN-LAST:event_vBTNActionPerformed

    private void bBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBTNActionPerformed
        escolheLetra("b", bBTN);
    }//GEN-LAST:event_bBTNActionPerformed

    private void nBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBTNActionPerformed
        escolheLetra("n", nBTN);
    }//GEN-LAST:event_nBTNActionPerformed

    private void mBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBTNActionPerformed
        escolheLetra("m", mBTN);
    }//GEN-LAST:event_mBTNActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        //voltamos à tela de definição da palavra e do tema
        framePai.trocarPainel(new DefinePalavraPanel(framePai));
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void chutetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chutetextActionPerformed

    }//GEN-LAST:event_chutetextActionPerformed

    private void chuteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuteBtnActionPerformed
        enterChute(chutetext);
    }//GEN-LAST:event_chuteBtnActionPerformed

    private void chutetextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chutetextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enterChute(chutetext);
        }
    }//GEN-LAST:event_chutetextKeyPressed

    private void chutetextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chutetextKeyTyped

    }//GEN-LAST:event_chutetextKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBTN;
    private javax.swing.JButton bBTN;
    private javax.swing.JButton cBTN;
    private javax.swing.JButton chuteBtn;
    private javax.swing.JTextField chutetext;
    private javax.swing.JButton dBTN;
    private javax.swing.JButton eBTN;
    private javax.swing.JButton fBTN;
    private javax.swing.JButton gBTN;
    private javax.swing.JButton hBTN;
    private javax.swing.JButton iBTN;
    private javax.swing.JButton jBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kBTN;
    private javax.swing.JButton lBTN;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelPalavra;
    private javax.swing.JLabel labelTema;
    private javax.swing.JButton mBTN;
    private javax.swing.JButton nBTN;
    private javax.swing.JButton oBTN;
    private javax.swing.JButton pBTN;
    private javax.swing.JButton qBTN;
    private javax.swing.JButton rBTN;
    private javax.swing.JButton sBTN;
    private javax.swing.JButton tBTN;
    private javax.swing.JButton uBTN;
    private javax.swing.JButton vBTN;
    private javax.swing.JButton voltarBtn;
    private javax.swing.JButton wBTN;
    private javax.swing.JButton xBTN;
    private javax.swing.JButton yBTN;
    private javax.swing.JButton zBTN;
    // End of variables declaration//GEN-END:variables
}
