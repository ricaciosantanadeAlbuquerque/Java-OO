
package exe010luta_ufc;
import java.util.Random;
public class Luta {//AGREGAÇÃO DE CLASSES
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private  boolean aprovado;

public void marcaLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) // se estiverem na mesma categoria
            && l1 != l2){// e não foremo mesmo lutador então
        this.aprovado = true; 
        this.desafiado = l1;
        this.desafiante = l2;

        
    }else{ 
        this.aprovado = false;
        this.desafiado = null;
        this.desafiante = null;
    }
}
public void lutar(){
    if(this.getAprovado()){ // se foi aprovado
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar(); // desafiante com o objeto l2 da classe lutador por isso pode utilizar seus atributos e métodos
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(3);
        
        switch(aleatorio){
            case 0:
                System.out.println("EMPATOU!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
               break;
            case 1:
                System.out.println("Vitória "+this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2: 
                System.out.println("Vitória "+this.getDesafiante().getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
        System.out.println("==================================================");
        
        
        
    }else{
        System.out.println("Não pode lutar!");
    }
}
public Lutador getDesafiado(){
    return this.desafiado;
}
public void setDesafiado(Lutador desafiado1){
    this.desafiado =  desafiado1;
}
public Lutador getDesafiante(){
    return this.desafiante;
}
public void setDesafiante(Lutador desafiante1){
    this.desafiante = desafiante1;
}
public int getRoud(){
    return this.rounds;
}
public void setRoud(int Roud1){
    this.rounds = Roud1;
}
public boolean getAprovado(){
    return this.aprovado;
}
public void setAprovado(boolean app){
    this.aprovado = app;
}
        

}
