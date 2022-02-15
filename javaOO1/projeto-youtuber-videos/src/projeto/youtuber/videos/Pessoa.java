/*Classes abstratas não podem gerar objetos */
package projeto.youtuber.videos;

public abstract class Pessoa {
protected String nome;
protected int idade;
protected String sexo;
protected float experiencia;

public Pessoa(String nome1,int idade1,String sexo1){
    this.setNome(nome1);
    this.setIdade(idade1);
    this.setSexo(sexo1);
    this.experiencia = 0;
    
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
    this.idade= idade1;    
}

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo1) {
        this.sexo = sexo1;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia1) {
        this.experiencia = experiencia1;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade +
                ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }

}
