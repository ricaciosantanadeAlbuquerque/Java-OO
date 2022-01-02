
package contabancoexe06;

public class ContaBanco {
// ATRIBUTOS====================================================================    
 public int numeroConta;
 protected String tipo;
 private String dono;
 private double saldo;
 private boolean status;
//======CONSTRUTOR============================================================== 
 public ContaBanco(){ // toda a vez que uma conta for criadada ela terá saldo 0 e estará fechada
     this.setStatus(false);
     this.setSaldo(0.0);
 }
// ===MÉTODOS ACESSORES========================================================= 
 public int getNumeroConta(){
     return this.numeroConta;
 }
 public void setNumeroConta(int num1){
     this.numeroConta = num1;
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
  public void  setStatus(boolean v){
      this.status = v;
  }
// MÉTODOS COMUNS===============================================================  
  public void abrirConta(String t){ // ao abrir a conta ele terá que informar o tipo da conta
      this.setTipo(t); // o parâmetro t que contem o tipo será dado como argumento para o método setTipo()
      // O método setTipo() irá modificar  o valor do atributo
      this.setStatus(true); // conta ativada
      if(this.getTipo().equals("cc")){ // se for conta corrente
          this.setSaldo(50); // ganha 50 no saldo
      }else if(this.getTipo().equals("cp")){ // s for  conta poupança 
          this.setSaldo(150);
      }
  }
  public void fecharConta(){
      if(this.getSaldo()>0){
          System.out.println("A conta  contem dinheiro");
      }else if(this.getSaldo() < 0){
          System.out.println("A conta possui débito");
      }else{ // se o saldo  não é maior que zero e nem é  menor pode fechar 
          this.setStatus(false);// conta fechada
      }
  }
  public void sacar(double valor){
      if(this.getStatus() == true ){
          if(this.getSaldo() > valor ){
              this.setSaldo(this.getSaldo()- valor);
          }else{
              System.out.println("Saldo insuficiente ! ");
          }
      }else{
         System.out.println("Impossível sacar !");
      }
  }
  public void depositar(double valor){
      if(this.getStatus() == true){ // se a conta está a aberta 
          this.setSaldo(this.getSaldo()+ valor); // valor depositado
      }else{
          System.out.println("impossível depositar !");
      }
  }
  public void pagarMensalidade(){
      double v =0;
      if(this.getTipo().equals("cc")){
          v = 12;
      }else if (this.getTipo().equals("cp")){
          v = 20;
      }
      if(this.getStatus() == true ){
          if(this.getSaldo() > v){
              this.setSaldo(this.getSaldo() - v);
          }
      }
  }
  public void estadoAtual(){
      System.out.println("=====================================================");
      System.out.println("Numero da Conta "+this.getNumeroConta());
      System.out.println("Tipo da conta "+this.getTipo());
      System.out.println("Dono da conta "+this.getDono());
      System.out.println("Saldo "+this.getSaldo());
      System.out.println("status "+ this.getStatus());
      
  }
}
