package polimorfismo.sobreposicao;


import polimorfismo.sobreposicao.Animal;


public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover(){ // sobreposiçao 
        System.out.println("Correndo. ");
    }
    @Override
    public void alimentar(){
        System.out.println("mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero ! ");
    }
    
    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String corPelo1){
        this.corPelo = corPelo1;
    }
}
