package polimorfismo.sobreposicao;
/*Neste caso a classe cangurur  herda todos os atribultos e métodos da classe Mamifero e da classe Animal, 
 * já que  a classe Mamifero estende a classe Animal.*/

public class Canguru extends Mamifero { // herança para diferença
    public void usarBolsa(){
        System.out.println(" Usando a bolsa.");
    }
    @Override
    public void locomover(){ // polimorfismo de sobreposição
        System.out.println("Pulando");
    }
    
}
