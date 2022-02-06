
package projeto.veiculo;
//PS não está encapsulada  
public abstract class Veiculo {// classes abstratas não podem gerar objetos
    // geralmente são utilizadas como super classes
    public int velocidade; // estou deixando os atributos visivéis para as subclasses
    public boolean status;
    
    public void ligar(){
        status = true;
}
    public void desligar(){
        status = false;
    }
    public void mostrarStatus(){
        System.out.println(status);
}
    public abstract void acelerar();
    /*Um método abstrato é previsto na progenitora, porém SÓ será implementado pela 
    * classe que extender  a classe abstrata.
    PS! métodos abstratos geralmente são encontrados  em  interfaces  e classes abstratas
    */
}