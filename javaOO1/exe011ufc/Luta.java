
package exe011ufc;
import java.util.Random;

public class Luta {
private Lutador desafiado; // tipo abstratro de dado desafiado é um objeto da classe lutador
private Lutador desafiante;
private int rounds;
private boolean aprovado;
/*Ao utilizamos  objetos da classe lutador  criamos uma relação de agregação
 entre a classe Lutador e luta 
*/
// metodos======================================================================
public void marcarLuta(Lutador l1,Lutador l2){// l1 e l2 podem acessar os métodos da classe Lutador Lutador
    //porque l1 e l2 são objetos da classe lutador
    if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && (l1 != l2)){
       this.desafiado = l1;
       this.desafiante = l2;
       this.aprovado = true;
    }else{
        this.desafiado = null; 
        this.desafiante =null;
        this.aprovado = false;
        
    }
}
public void lutar(){
    if(this.aprovado == true){
        this.desafiante.apresentar(); // desafiante é um objeto da classe lutador port tabo pode utilizar seus métodos e atribultos
        this.desafiado.apresentar();
        Random luta = new Random();
        int batalha = luta.nextInt(3);
       System.out.println("===================================================\n");
        switch(batalha){
            case 0:
                System.out.println("Empate ! ");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1:
                 
                System.out.println(" Vencedor "+this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                 
                System.out.println("Vencedor "+this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
             }
            System.out.println("===================================================\n");
    }else{
        System.out.println("===================================================\n");
        System.out.println("Não pode haver luta ");
        System.out.println("\n====================================================");
    }
}
}
