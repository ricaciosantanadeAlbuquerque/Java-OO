/*
 * 1. Crie uma classe em Java chamada fatura para uma loja 
 foi criado um algoritmo que simula um caixa de loja 
 */
package exe08java_00;

 import java.util.Scanner;
public class Exe08java_00 {

 
    public static void main(String[] args) {
        Fatura compra = new Fatura();
        Scanner in =new Scanner(System.in);
        double calcular = 0;
        double acumuladorValor=0;
        
        int tot = 1000;
        String[] numero1 = new String[tot];
         String[] descrito = new String[tot];
         int[] quanti = new int[tot];
         double[] valor = new double[tot];
        double[] totalValor = new double[tot];
        for(int i=0;i<numero1.length;i++){
            System.out.println("Aperte [s]para continuar e [n] para sair");
            String n = in.next();
            if(n.equalsIgnoreCase("s")){
            System.out.println("Por favor digite o número do  produto");
            compra.setNumero(in.next());
            numero1[i] = compra.getNumero();
            in.nextLine();
            System.out.println("Por favor digite a descrição do produto");
            compra.setDescricao(in.nextLine());
              in.nextLine();
            descrito[i] = compra.getDescricao();
            System.out.println(" Por favor digite a quantidade ! ");
            compra.setQuantidadeCompra(in.nextInt());
            quanti[i] = compra.getQuantidadeCompra();
            System.out.println("Por favor digite o valor do item !");
            compra.setPreçoPOrItem(in.nextDouble());
            if(compra.getPreçoPorItem()<0){
                compra.setPreçoPOrItem(0.0);
                valor[i] = compra.getPreçoPorItem();
            }else{
                  valor[i] = compra.getPreçoPorItem();
            }
          
             calcular =  valor[i]*quanti[i]; // o valor será sobre escrito
             totalValor[i] = calcular;
             System.out.println(totalValor[i]);
             acumuladorValor+= totalValor[i];
                    compra.setTotalFatura(acumuladorValor);
        }else{
                break;
            }            
        }
        for(int j = 0; j<numero1.length;j++){
            if((( (quanti[j] == 0) && (numero1[j] == null)||numero1[j]!="")&&
                    (descrito[j] == null)||descrito[j]=="")){
              break;
            }else{
                
            System.out.println(" número do produto: "+numero1[j]);
            System.out.println(" Descrição do produto: "+descrito[j]);
            System.out.println(" Quantidade do produto: "+quanti[j]);
            System.out.printf("O valo por item: %.2f$$ \n",valor[j]);
            System.out.printf("Total: %.2f$$ \n",totalValor[j]);
            }
           
        }
        System.out.printf("\nO total da faturá é  %.2f$$\n",compra.getTotalFatura());
        
        
        
        
        
        
      
    }
    
}
