/*
 * Modele essa classe.
        CONTA DE BANCO 
 */
package conta_banco;
import javax.swing.JOptionPane;
public class Conta {
//=================ATRIBUTOS DA CLASSA==========================================  
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
//==================MÉTODOS=====================================================  
    public void abrirConta(String t){
        this.setTipo(t); // ao Abrir uma conta deve ser passado o tipo de conta 
        this.setStatus(true); // o status da conta ficarar  como conta  aberta true   
        if(this.getTipo().equalsIgnoreCase("cc")){ // se a conta  for  conta corrente ganhará 50 de bonus 
            this.setSaldo(this.getSaldo()+50);
        }else if(this.getTipo().equalsIgnoreCase("cp")){ // se a conta for poupança  ganhará 150
            this.setSaldo(this.getSaldo()+150);
        }
    }
    public int fecharConta(){
      if(this.getSaldo()> 0){ // não pode  fechar está  conta porque o saldo é positivo 
          return 1;  
      }else if(this.getSaldo() <0 ){ //  não pode fechar a conta se tiver debitto
          return 2;
      }else{ // oks pode fechar a conta 
          this.setStatus(false);
          return 3;
      }
        
    }
    public int depositar(double valor){
        if(this.getStatus() == true){ // se a conta estiver a berta então 
            this.setSaldo(this.getSaldo()+valor);// pode depositar
            return 0;
        }else{
            return 1;
        }
    }
    public void sacar(double saca){
        if(this.getStatus() == true){ // se a conta estiver a berta  então
            if(this.getSaldo()>= saca){ // se o saldo for maior ou  o saldo for igual ao valor que se deseja sacar então pode sacar
                this.setSaldo(this.getSaldo() - saca );
               
            }
        }
    }
    public void pagarMensalidade(){
        double valor = 0;
        if(this.getTipo().equalsIgnoreCase("cc")){
             valor = 12;
            if(this.getStatus() == true){
                if(this.getSaldo() > 12){
                    this.setSaldo(this.getSaldo() - valor );
                }
            }
        }else if(this.getTipo().equalsIgnoreCase("cp")){
            valor = 20;
          if(this.getStatus() == true){
                if(this.getSaldo() > 20){
                    this.setSaldo(this.getSaldo() - valor );
                }
            }
    }else{
            JOptionPane.showMessageDialog(null,"ERRO! conta indefinida ");
        }
        
    }
  // ======MÉTODO CONSTRUTOR====================================================  
    public Conta(){
     this.numeroConta = 0;
     this.tipo = "Indefinido";
     this.dono = "Indefinido";
     this.saldo = 0.0;
     this.status = false;
        
    }
  //======MÉTODOS ACESSORES E MODIFICADORES=====================================
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int conta){
        this.numeroConta = conta;
        
    }
    public String getTipo(){
       return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d; 
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double sal){
        this.saldo = sal;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean b){
        this.status = b;
    }
    public void dadosConta(){
        JOptionPane.showMessageDialog(null,"O seu numero da conta é "+this.getNumeroConta());
        JOptionPane.showMessageDialog(null,"O saldo da sua conta é "+this.getSaldo());
        JOptionPane.showMessageDialog(null,"O dono da conta é "+this.getDono());
         if(this.getTipo().equalsIgnoreCase("cc")){
             JOptionPane.showMessageDialog(null,"O tipo da conta e conta correnta !");
         }else if(this.getTipo().equalsIgnoreCase("cp")){
             JOptionPane.showMessageDialog(null,"O tipo da conta é conta poupança !");
         }   
          if(this.getStatus() == true){
                   JOptionPane.showMessageDialog(null," Sua conta está aberta!");
          }else if(this.getStatus()== false){
                   JOptionPane.showMessageDialog(null," Sua conta está fechada!");
          }
        
    }
}
