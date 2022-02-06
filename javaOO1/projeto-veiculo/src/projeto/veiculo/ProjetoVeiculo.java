
package projeto.veiculo;

public class ProjetoVeiculo {

    public static void main(String[] args) {
       Automovel automovel1= new Automovel();
       automovel1.ligar();
       automovel1.acelerar();
       System.out.println(automovel1.velocidade);
       automovel1.desligar();
//============================================================================= 

             Aviao aviao1 = new Aviao();
             aviao1.ligar();
             aviao1.acelerar();
             System.out.println(aviao1.velocidade);
             aviao1.desligar();
       
       
    }
    
}
