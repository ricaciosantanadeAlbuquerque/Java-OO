
package projetoaifood;
import java.util.Scanner;

public class PagamentoCartaoDebito implements Pagamento {
    @Override
    public void quitarPedido(int numero){
    Scanner in = new Scanner(System.in);    
     int confirma = 0;
     
      System.out.println("Por favor digite novamento o número do cartão");
      confirma = Integer.parseInt(in.nextLine());
      
      if(numero == confirma ){
          System.out.println("Por favor digite a senha do cartão de crédito ");
          int senha = Integer.parseInt(in.nextLine());
          System.out.println("Por favor confime a senha !");
          int senha1 = Integer.parseInt(in.nextLine());
          if(senha == senha1){
              System.out.println(" Pagamento efetuado com sucesso,"
                      + " o valor foi descontado da sua conta. !");
          }else{
              System.out.println("ERRO! senha inválida");
              System.exit(0);
          }
      }else{
       System.out.println("Erro! número do cartão inválido! tente novamente ");
       System.exit(0);
      
    }
}
}