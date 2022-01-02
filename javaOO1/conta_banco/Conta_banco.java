/*
 * Modele essa classe.
        CONTA DE BANCO 
 */
package conta_banco;

import javax.swing.JOptionPane;
public class Conta_banco {
    public static void main(String[] args) {
      Conta c1 = new Conta(); // c1 é uma nova conta 
      int valor;
      String continua ="";
      JOptionPane.showMessageDialog(null,"Olá Seja bem vindo ao nosso sistema");
      do{
      
      int op = Integer.parseInt(JOptionPane.showInputDialog("Digite [1] para abrir uma conta.\n"
              + "Digite [2] para visualizar os dados da sua conta.\n"
              + " Digite [3] para sacar. \n"
              + "Digite [4] para depositar.\n"
              + "Digite [5] para fechar a conta.\n"
              + "ou Digite [6] para sair.\n"));
      switch(op){
        case 1:
            String tipo =JOptionPane.showInputDialog("Para começar digite o tipo"
                     + "da conta,\n [cc] para conta corrente e ganha 50$ de bonus,\n"
                     + "[cp] para conta poupança e ganha 150$ de bonus. ");
             c1.abrirConta(tipo);
            int num1= Integer.parseInt(JOptionPane.showInputDialog(" Por favor digite "
                    + "um número para sua conta ")); // o ideal é que o número fossengerado mas nessa conta banco 0.1 não será o caso
            c1.setNumeroConta(num1);
            String nome = JOptionPane.showInputDialog("Agora para terminar digite seu nome ! ");
            c1.setDono(nome);
             JOptionPane.showMessageDialog(null,"Parabéns sua Conta está aberta");
             c1.dadosConta();
              
        break;
        case 2:
            if(c1.getStatus()== true){ // se a conta estiver aberta 
                int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor Digite o numero da sunha conta "));
                if(num2 == c1.getNumeroConta()){ //  checabdo o numero da conta 
                 // mostrar dados da conta 
                 JOptionPane.showMessageDialog(null,"O numero da conta :"+ c1.getNumeroConta());
                  JOptionPane.showMessageDialog(null,"O dono da conta :"+ c1.getDono());
                   JOptionPane.showMessageDialog(null,"O saldo da conta :"+ c1.getSaldo());
                     if(c1.getTipo().equalsIgnoreCase("cc")){ // se for conta corrente
             JOptionPane.showMessageDialog(null,"O tipo da conta e conta correnta !");
         }else if(c1.getTipo().equalsIgnoreCase("cp")){ // se for conta poupança
             JOptionPane.showMessageDialog(null,"O tipo da conta é conta poupança !");
         }   
          if(c1.getStatus() == true){
                   JOptionPane.showMessageDialog(null," Sua conta está aberta!");
          }else if(c1.getStatus()== false){
                   JOptionPane.showMessageDialog(null," Sua conta está fechada!");
          }
                }
            }else{
              JOptionPane.showMessageDialog(null,"Erro! não existe nem uma conta aberta ");  
            }
         break;
        case 3:
                int y = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o numero da sua conta. "));
                                 if(c1.getNumeroConta() == y){//  checabdo o numero da conta 
                                      valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o valor do saque ! "));
                                     c1.sacar(valor);
                                     JOptionPane.showMessageDialog(null,"Após o saque seu saldo atual é de "+c1.getSaldo());
                                 }else{
                                     JOptionPane.showMessageDialog(null,"Erro número da conta Inválido");
                                 }
         break;
        case 4:
              int j = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o numero da sua conta. "));
                                  if(c1.getNumeroConta()== j){ //  checabdo o numero da conta 
                                       valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o valor que deseja depositar ! "));
                                       c1.depositar(valor);
                                       JOptionPane.showMessageDialog(null,"Após o valor ser depositado,\n o seu saldo atual é de "+ c1.getSaldo());
                                      
                                  }else{
                                      JOptionPane.showMessageDialog(null,"Erro número da conta Inválido");
                                  }
            break;
        case 5:
            int f = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o numero da sua conta. "));
                                  if(c1.getNumeroConta()== f){ //  checabdo o numero da conta 
                                      int resultado = c1.fecharConta(); // resultado guarda o valor de retorn
                                      if(resultado == 1){
                                           JOptionPane.showMessageDialog(null,"Saldo positivo, a conta não pode ser fechada."
                                                   + "Saque o dinheiro antes de fechar a conta");
                                      }else if(resultado == 2){
                                           JOptionPane.showMessageDialog(null,"Saldo negativo, Você possui uma dívida"
                                                   + "será necessário quitar a dívida para fechar a conta");
                                      }else if(resultado == 3){
                                           JOptionPane.showMessageDialog(null,"Conta fechada com sucesso!");
                                      }
                                  }else{
                                      JOptionPane.showMessageDialog(null,"Erro número da conta Inválido");
                                  }
            break;
        case 6:
            System.exit(0);
            break;
            
                   
    }
    continua =  JOptionPane.showInputDialog("Deseja realizar mais alguma operção ? \n"
              + " Se sim, digite [s]! Se não, digite [n] para  sair. ");
    }while(continua.equalsIgnoreCase("s"));
      }
}



