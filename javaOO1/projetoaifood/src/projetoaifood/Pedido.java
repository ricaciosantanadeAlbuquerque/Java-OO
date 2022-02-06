
package projetoaifood;
import java.util.Scanner;
public class Pedido  {

private double valorTotalPedido;
public void caixa(){
    Scanner in = new Scanner(System.in);
    double valor1 = 1;
    int x =0;
    String[]  nomeProduto = new String[100];
    int[] quantidade = new int [100];
    double[] valor = new double[100];
    double[] acumulador= new double[100];
    System.out.println("Para começar aperte enter !");
    while(valor1 != 0){
        in.nextLine();
        System.out.println("Por favor digite o nome do produto !");
        nomeProduto[x] = in.nextLine();
        System.out.println("Digite a quantidade !");
        quantidade[x]= in.nextInt();
        System.out.println("por favor digite o valor ");
        valor1 = in.nextDouble();
        valor[x] = valor1;
        acumulador[x] = quantidade[x]*valor[x];
        
        x++;
}
    for(int i = 0; i<100;i++){
        if((quantidade[i] !=0)||(valor[i] != 0)){
            System.out.println("Produto: "+nomeProduto[i]);
            System.out.println("Quantidade: "+quantidade[i]);
            System.out.println("Valor do produto por unidade: "+valor[i]);
            System.out.println("VALOR: "+acumulador[i]);
            
            this.setValorTotal(this.getValorTotal()+ acumulador[i]);
        }else{
            break;
        }
        
    }
    
}
public double getValorTotal(){
    return this.valorTotalPedido;
    
}
public void setValorTotal(double valor1){
     this.valorTotalPedido = valor1;
}

}