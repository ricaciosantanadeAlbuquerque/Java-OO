package polimorfismo.sobreposicao;


public abstract class Animal { // classe abstrata 
    protected float peso;
    protected int idade;
    protected int membros;
    // métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    // get e set
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso1){
        this.peso = peso1;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade1){
        this.idade = idade1;
    }
    public int getMembro(){
        return this.membros;
   
    }
   public void setMembro(int membros1){
       this.membros = membros1;
   }
   
}
