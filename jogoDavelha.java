package jogo1;

import javax.swing.JOptionPane;
    /*Ricacio Santana de Albuquerque
     *Caio césar da Silva Melo
     *Lucas Limeira Barbosa
    */

public class jogoDavelha extends javax.swing.JFrame {
      
    boolean jogador1 = true;  // variáves de troca de caractere
    boolean jogador2 = false;
    int numeroVitoria1 = 0;
    int numeroVitoria2 = 0;
    int numeroEmpate = 0;
    
    public jogoDavelha() {
        initComponents();
         B1.setText("1");
       B2.setText("2");
       B3.setText("3");
       B4.setText("4");
       B5.setText("5");
       B6.setText("6");
       B7.setText("7");
       B8.setText("8");
       B9.setText("9");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeroDevitoriasDoJogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        NumeroDevitoriasDoJogador2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NumeroDeEmpate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SobreJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        B1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B5)
                    .addComponent(B8)
                    .addComponent(B2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(B3)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B9)
                            .addComponent(B6))
                        .addGap(29, 29, 29))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogador 1    Simbolo: X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NumeroDevitoriasDoJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDevitoriasDoJogador1.setText("Número de vitórias: 0");
        NumeroDevitoriasDoJogador1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogador 2    Simbolo: O");

        NumeroDevitoriasDoJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDevitoriasDoJogador2.setText("Número de vitórias: 0");
        NumeroDevitoriasDoJogador2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NumeroDeEmpate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeEmpate.setText("Número de Empates: 0");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de jogo"));

        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SobreJogo.setText("Sobre o Jogo");
        SobreJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreJogoActionPerformed(evt);
            }
        });

        SairDoJogo.setText("Sair do jogo");
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SobreJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
            .addComponent(SairDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(NovoJogo)
                .addGap(18, 18, 18)
                .addComponent(SobreJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(SairDoJogo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(NumeroDevitoriasDoJogador1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(NumeroDevitoriasDoJogador2)
                            .addComponent(NumeroDeEmpate))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDevitoriasDoJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NumeroDevitoriasDoJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeEmpate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("1");

        jLabel4.setText("2");

        jLabel5.setText("3");

        jLabel6.setText("1");

        jLabel7.setText("2");

        jLabel8.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    
//========================================================================================================================
    // MÉTODO DE TROCA !
    public void inverSao(){
        
        if( jogador1 == true){
            jogador1 = false;
            jogador2 = true;
        }else if(jogador1 == false){ // se não e porque o jogador 1 já é falso precisando fazer a troca para verdadeiro
            jogador1 = true;
            jogador2 = false;
        }
        jogador("X");
        jogador("O");
    }
    //====================================================================================================================
    //o medoto jogador vai testar se os objetos do tipo botão estão iguais se x e x e x  vencedor x  se O e O e O vencedor e 
    public void jogador(String jogada){ // jogada é um parâmetro que vai receber x ou O da chamda ao metdodo
    //****   VERIFICANDO LINHAS **********    
        if(B1.getText().equals(jogada)&& B2.getText().equals(jogada)&&
                B3.getText().equals(jogada)){
            // se ele entrar nesta condição e porque b1 b2 b3 são iguais
            if(B1.getText().equals("X")){// se b1 é igual a X então b2 e b3 também são X então 
                vencedor("jogador 1");// ARGUMENTO
            }else if(B1.getText().equals("O")){
                vencedor("jogador 2");//ARGUMENTO
            }
        } 
        if(B4.getText().equals(jogada)&& B5.getText().equals(jogada)&& 
                B6.getText().equals(jogada)){
            if(B4.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B4.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
         if(B7.getText().equals(jogada)&& B8.getText().equals(jogada)&& 
                B9.getText().equals(jogada)){
            if(B7.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B7.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
//*****verificando as colunas****************************
          if(B1.getText().equals(jogada)&& B4.getText().equals(jogada)&& 
                B7.getText().equals(jogada)){
            if(B1.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B1.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
           if(B2.getText().equals(jogada)&& B5.getText().equals(jogada)&& 
                B8.getText().equals(jogada)){
            if(B2.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B2.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
            if(B4.getText().equals(jogada)&& B5.getText().equals(jogada)&& 
                B6.getText().equals(jogada)){
            if(B4.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B4.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
             if(B3.getText().equals(jogada)&& B6.getText().equals(jogada)&& 
                B9.getText().equals(jogada)){
            if(B3.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B3.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
//+++++++++++++VERIFICANDO DIAGONAL PRINCIAL ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 if(B1.getText().equals(jogada)&& B5.getText().equals(jogada)&& 
                B9.getText().equals(jogada)){
            if(B1.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B1.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
 //+++++++++++++VERIFICANDO DIAGONAL INVERSA++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

         if(B3.getText().equals(jogada)&& B5.getText().equals(jogada)&& 
                B7.getText().equals(jogada)){
            if(B3.getText().equals("X")){
                vencedor("jogador 1");
            }else if(B3.getText().equals("O")){
                    vencedor("jogador 2");//ARGUMENTO
                }
        }
//==============EMPATE====================================================================================================
           if(!B1.getText().equals("1")&&
              !B2.getText().equals("2")&&
              !B3.getText().equals("3")&&
              !B4.getText().equals("4")&&
              !B5.getText().equals("5")&&  
              !B6.getText().equals("6")&&  
              !B7.getText().equals("7")&&
              !B8.getText().equals("8")&&
              !B9.getText().equals("9")){
              vencedor("Empate");
              
           }
    }
    //====================================================================================================================
    // O MÉTODO VENCEDOR VAI MOSTRAR A MENSSAGEM DE QUEM GANHO O JOGO !
    public void vencedor(String jogadorVencendo){// parâmetro recebe o  valor do argumento da chamada acima .
        if(jogadorVencendo.equals("jogador 1")){ // se o valor do parâmetro for igual a palavra jogador  1 então mostre x vencedor 
            JOptionPane.showMessageDialog(jogoDavelha.this,"Parabéns jogador 1 você venceu !");
            numeroVitoria1++; // contador 
            NumeroDevitoriasDoJogador1.setText("Número de vitórias: "+ numeroVitoria1);
            Resetar();//CHAMADA AO MÉTODO Resetar ! SE NÃO FOR REALIZADA A LIMPEZA O JOGO IRÁ CONTAR VITORIA 2 OU MIAS VEZES
            // PARA ESTE OU OUTRO JOGADOR 
        }else if(jogadorVencendo.equals("jogador 2")){
            JOptionPane.showMessageDialog(jogoDavelha.this,"Parabéns jogador 2 você venceu !");
            numeroVitoria2++; // contador
            NumeroDevitoriasDoJogador2.setText("Número de vitórias: "+ numeroVitoria2);
            Resetar();
        }else if(jogadorVencendo.equals("Empate")){
            JOptionPane.showMessageDialog(null,"Empate !");
             numeroEmpate++;
             NumeroDeEmpate.setText("Número de Empates: "+numeroEmpate);
             Resetar();
             /* o método resetar não possui argumnetos pois sua finalidade e só
             trazer o jogo para sua configuração padrão.
             */
        }
    }
    //========================LIMPAR CAMPO!===============================================================================
    public void Resetar(){
        /*
        neste método todo o jogo é zerado  inclusive as variáveis jogador 1 e jogador 2 que
        passam a ter seus valores originais de volta*/
       B1.setText("1");
       B2.setText("2");
       B3.setText("3");
       B4.setText("4");
       B5.setText("5");
       B6.setText("6");
       B7.setText("7");
       B8.setText("8");
       B9.setText("9");
       jogador1 = true;  // variáves de troca 
       jogador2 = false;
    }
    //====================================================================================================================
    //--------------------------------------------------------------------------------------------------------------------
    //MÉTODOS DE EVENTOS  AO CLICAR  SERÁ ATIVADO O CÓDIGO QUE ESTÁ SUJEITO AO MESMO !!/
    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        if(jogador1 == true){
            if(B3.getText().equals("3")){
                B3.setText("X");
               inverSao();
               /*
               SE O JOGADOR 1 FOR VERDADEIRO E SE O TEXTO DE B3 FOR 3 ENTÃO
               TROCA POR X. 
               AO CHAMAR O METODO DE INVERSÃO SERÁ REALIZADA UMA TROCA AONDE O JOGADOR 1 PASSA A SER FALSO SE FOR VERDADEIRO
               EEE O JOGADOR 2 QUE ERA FALSO PASSA A SER VERDADEIRO E O CONTRAIO TAMBÉM É VÁLIDO SE O JOGADOR 1 FOR FALSO PASSA
               A SER VERDADEIRO E O JOGADOR 2
             
               */
            }
        }else{
            if(B3.getText().equals("3")){
                B3.setText("O"); 
                inverSao();; //CHAMADA AO MÉTODO INVERSAO

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B1!!
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if(jogador1 == true){
            if(B1.getText().equals("1")){
                B1.setText("X");
               inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B1.getText().equals("1")){
                B1.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B2!!
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if(jogador1 == true){
            if(B2.getText().equals("2")){
                B2.setText("X");
                  inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B2.getText().equals("2")){
                B2.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B4!!
    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         if(jogador1 == true){
            if(B4.getText().equals("4")){
                B4.setText("X");
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B4.getText().equals("4")){
                B4.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B5!!
    // AO CLICAR NO BOTAL 5  E SE O JOGADOR 1 FOR VERDADEIRO EE O TEXTO DO BOTÃO 5 B5 FOR 5
    //ENTÃO SERÁ TROCADO POR X
    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
              if(jogador1 == true){
            if(B5.getText().equals("5")){
                B5.setText("X");
               inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B5.getText().equals("5")){
                B5.setText("O"); 
                  inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B6!!
    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
              if(jogador1 == true){
            if(B6.getText().equals("6")){
                B6.setText("X");
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B6.getText().equals("6")){
                B6.setText("O"); 
                inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B7!!
    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
             if(jogador1 == true){
            if(B7.getText().equals("7")){
                B7.setText("X");
                inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B7.getText().equals("7")){
                B7.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B8!!
    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if(jogador1 == true){
            if(B8.getText().equals("8")){
                B8.setText("X");
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B8.getText().equals("8")){
                B8.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
//------------------------------------------------------------------------------------------------------------------------
    //EVENTO B9!!
    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
              if(jogador1 == true){
            if(B9.getText().equals("9")){
                B9.setText("X");
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;
            }
        }else{
            if(B9.getText().equals("9")){
                B9.setText("O"); 
                 inverSao(); // CHAMADA AO MÉTODO DE INVERSAO;

            }
        }
    }                                  
 //==========EVENTOS DE RESETAR O JOGO
    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {                                         
         numeroEmpate=0;
             NumeroDeEmpate.setText("Número de Empates: "+numeroEmpate);  
             numeroVitoria1 =0;
            NumeroDevitoriasDoJogador1.setText("Número de vitórias: "+ numeroVitoria1);
            numeroVitoria2 =0;
            NumeroDevitoriasDoJogador2.setText("Número de vitórias: "+ numeroVitoria2);
             
        Resetar();
    }                                        
//===========  EVENTO DE SAIR
    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          
//=========== evento de status+
    private void SobreJogoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JOptionPane.showMessageDialog(null,"O jogo foi criado em 14/11/2021");
       JOptionPane.showMessageDialog(null,"Criadores");
       JOptionPane.showMessageDialog(null,"Ricacio Santana de albuquerque");
       JOptionPane.showMessageDialog(null,"Caio cesar da silva melo");
       JOptionPane.showMessageDialog(null,"Lucas Limeira Barbosa");
    }                                         

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
            java.util.logging.Logger.getLogger(jogoDavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogoDavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogoDavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogoDavelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogoDavelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeEmpate;
    private javax.swing.JLabel NumeroDevitoriasDoJogador1;
    private javax.swing.JLabel NumeroDevitoriasDoJogador2;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JButton SobreJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration                   
}