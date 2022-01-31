package exe08java_00;


public class Fatura{
    private String numero;
    private String descricao;
    private int quantidadeCompra;
    private double preçoPorItem;
    private double totalFatura;

    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }
  
    public Fatura(){ // todo o método construtor leva o nome de sua classe 
        this.setNumero("");
        this.setDescricao("");
        this.setQuantidadeCompra(0);
        this.setPreçoPOrItem(0);
        
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String num){
        this.numero = num;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descrito){
        this.descricao = descrito;
    }
    public int getQuantidadeCompra(){
       return this.quantidadeCompra;
    }
    public void setQuantidadeCompra(int item){
        this.quantidadeCompra = item;
    }
    public double getPreçoPorItem(){
        return this.preçoPorItem;
    }
    public void setPreçoPOrItem(double preço){
        this.preçoPorItem = preço; 
    }
    public  double getTotalFatura(){
        
        return this.totalFatura;
    }
   
    
}
