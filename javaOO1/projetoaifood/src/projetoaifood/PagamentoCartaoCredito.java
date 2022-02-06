
package projetoaifood;
import java.util.Scanner;
public class PagamentoCartaoCredito implements Pagamento{

    @Override
    public void quitarPedido(int numero) {
        Scanner in =new Scanner(System.in);
       int num1 =0;
       System.out.println(" Por favor digite novamento o número do cartão");
       num1 = Integer.parseInt(in.nextLine());
       
       if(numero == num1){ 
           System.out.println("Por favor digite a senha do cartão de crédito !");
           int senha = Integer.parseInt(in.nextLine());
           System.out.println("Por favor digite novamente a senha do cartão ");
           int senha1 = Integer.parseInt(in.nextLine());
           if(senha == senha1){
               System.out.println("Por favor  insira o código de segurança do cartão ");
               int codigo = Integer.parseInt(in.nextLine());
               if(codigo > 0 ){
                   System.out.println(" Valor aprovado com sucesso ! ");
               }else{
                   System.out.println("ERRO codigo inválido ");
                   System.exit(0);
               }
               
           }else{
               System.out.println("ERRO! Senha Inválida !");
               System.exit(0);
           }
       }else{
           System.out.println("Erro ! número do cartão inválido, por favor tente novamente ");
       }
        in.close();
    }
   
}
