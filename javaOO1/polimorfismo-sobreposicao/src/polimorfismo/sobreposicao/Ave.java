package polimorfismo.sobreposicao;

public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){    
        System.out.println("Fazendo ninho !");
    }
    
    public String getCorPena(){
        return this.corPena;
    }
    public void setCorPena(String cor1){
        this.corPena = cor1;
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    @Override
    public void locomover(){
        System.out.println("Voando! ");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave! ");
    }
    
}