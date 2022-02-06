
package projetoaifood;
import java.util.Scanner;
public class Projetoaifood {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=========MENU=========");
        System.out.println(" Seja bem vindo !");
        System.out.println("Para sair digite [0] para o valor ");
        Pedido pedido1 = new Pedido();
        pedido1.caixa();
        System.out.println(" O total da fatura é "+ pedido1.getValorTotal()+"\n");
        System.out.println("===================================================");
        System.out.println("Digite [1] para prosseguir e efetuar o pagamento ou "+
                " Digite [0] para cancelar o pedido e sair do sistema.");
        int op = in.nextInt();
        if(op == 1){
            System.out.println("Digite [1] para pagar com o boleto !");
            System.out.println("Digite [2] para pagar com o cartão de crédito. ");
            System.out.println("Digite [3] para pagar com o cartão de Débito. ");
          int opcao = in.nextInt();  
             switch(opcao){
                 case 1:
                     PagamentoBoleto paga1 = new PagamentoBoleto();
                     System.out.println("Por favor digite seu CPF !");
                     paga1.quitarPedido(in.nextInt());
                     break;
                 case 2:
                     PagamentoCartaoCredito paga2 = new PagamentoCartaoCredito();
                     System.out.println(" Por favor digite o número do cartão de crédito ! ");
                     paga2.quitarPedido(in.nextInt());
                     
                     break;
                 case 3:
                     PagamentoCartaoDebito paga3 = new PagamentoCartaoDebito();
                     System.out.println("Por favor digite o número do seu cartão de debito");
                     paga3.quitarPedido(in.nextInt());
                     break;
                     
             }
        }else{
            System.exit(0);
        }
}
}