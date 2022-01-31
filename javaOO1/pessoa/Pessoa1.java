
package pessoa;

public class Pessoa1 {
//========Atributos=============================================================    
    private String nome;
    private int idade;
    private String sexo;
//===========Métodos============================================================
    public void fazerAniver(){
   this.idade++; //this.idade + 1
    }  
// construtor===================================================================

  public Pessoa1(String nome1,int idade1,String sexo1){
        this.nome = nome1;
        this.idade = idade1;
        this.sexo = sexo1;
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
}
