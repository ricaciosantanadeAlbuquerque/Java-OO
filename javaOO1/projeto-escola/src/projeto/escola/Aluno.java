/*
 * neste caso haverá uma herança pré diferença
  Aluno passa a ser uma especialização  da classe pessoa
 */
package projeto.escola;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
   public void pagarMensalidade(){
       System.out.println("Mensalidade de "+this.getNome()+"está paga no valor total.");
   }
   public int getMatricula(){
       return this.matricula;
   }
   public void setMatricula(int matricula1){
       this.matricula = matricula1;
   }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
}
