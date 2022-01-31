package empregadoteste;


public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int porcento;
    
    public Empregado(){
       this.setNome(""); 
       this.setSobrenome("");
       this.setSalarioMensal(0);
       this.setPorcento(0);
    }
    public int getPorcento(){
        return this.porcento;
    }
    public void setPorcento(int v){
        this.porcento = v;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome; 
    }
    public String getSobrenome(){
       return this.sobrenome;
    }
    public void setSobrenome(String sobre){
        this.sobrenome = sobre;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
   public void setSalarioMensal(double sala){
       this.salarioMensal = sala;
   }
   public double salarioAnual(){
       double salarioAnual =0;
       double porcet = 0;
       double novoSalarioAnual = 0;
       salarioAnual = this.getSalarioMensal()*12;
       porcet = (salarioAnual*this.getPorcento())/100;
       novoSalarioAnual = salarioAnual + porcet; 
       return novoSalarioAnual;
       
   }
}
