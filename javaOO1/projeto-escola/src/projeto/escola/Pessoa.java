
package projeto.escola;
/*Uma  classe abistrata não pode gerar objetos, 
porém pode ser progenitóra de outras classes*/
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
public final void fazerAniversario(){
    this.setIdade(this.getIdade()+1);
    System.out.println("Parabéns !");
}
public String getNome(){
    return this.nome;
}
public void setNome(String nome1){
    this.nome = nome1;
}
public int getIdade(){
    return this.idade;
}
public void setIdade(int idade1){
    this.idade = idade1;
}
public String getSexo(){
    return this.sexo;
    
}
public void setSexo(String sexo1){
 this.sexo = sexo1;    
}

    @Override // sobreposto
    public String toString() {
        return "Dados{" + "nome=" + nome + 
                ", idade=" + idade 
                + ", sexo=" + sexo 
                + '}';
    }


}
