
package projetoaifood;
import java.util.Scanner;
public class PagamentoBoleto implements Pagamento {
   
    @Override
    public void quitarPedido(int numero) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Por favor confirme seu cpf");
        num1 = in.nextInt();
        if(num1 == numero){
            System.out.println("Conta paga com sucesso! ");
        }else{
            System.out.println("Erro !");
            System.exit(0);
        }
    }

  
}
