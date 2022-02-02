
package projeto.escola;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario()+aumento);
}
public String getEspecialidade(){
    return this.especialidade;
}
public void setEspecialidade(String especialidade1){
    this.especialidade = especialidade1;
}
public double getSalario(){
    return this.salario;
}
public void setSalario(double sala1){
    this.salario = sala1;
}

}