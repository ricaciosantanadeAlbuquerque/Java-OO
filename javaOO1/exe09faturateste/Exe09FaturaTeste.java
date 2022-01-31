/*
 * 1. Crie uma classe em Java chamada fatura para uma loja de 
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a 
descrição (String), a quantidade comprada de um item (int) e o preço por item 
(double). A classe deve ter um construtor e um método get e set para cada variável de 
instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor 
da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser 
configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. 
Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra 
as capacidades da classe Fatura. 
 */
package exe09faturateste;


public class Exe09FaturaTeste {

    
    public static void main(String[] args) {
        Fatura compra = new Fatura();
        compra.setNumero("777");
        compra.setDescricao("bola");
        compra.setQuantidadeCompra(3);
        compra.setPreçoPorItem(30);
        
        System.out.println("numero de identificação do item "+compra.getNumero());
        System.out.println("Descrição "+compra.getDescricao());
        System.out.println("Quantidade comprada de um item "+compra.getQuantidadeCompra());
        System.out.println("Valor por item "+compra.getPreçoPorItem());
        System.out.println("O total da fatura é "+compra.getTotalFatura());
        System.out.println("==================================================================");
        
        Fatura compra1 = new Fatura();
        compra1.setNumero("0998");
        compra1.setDescricao("sapo");
        compra1.setQuantidadeCompra(4);
        compra1.setPreçoPorItem(50);
        System.out.println("numero de identificação do item "+compra1.getNumero());
        System.out.println("Descrição "+compra.getDescricao());
        System.out.println("Quantidade comprada de um item "+compra1.getQuantidadeCompra());
        System.out.println("Valor por item "+compra1.getPreçoPorItem());
        System.out.println("O total da fatura é "+compra1.getTotalFatura());
        System.out.println("==================================================================");
       
        
    }
    
}
