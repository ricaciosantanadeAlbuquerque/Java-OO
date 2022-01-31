
package exe09faturateste;


public class Fatura {
     private String numero;
    private String descricao;
    private int quantidadeCompra;
    private double preçoPorItem;
    private double totalFatura;

    public Fatura() {
        this.setDescricao("");
        this.setNumero("");
        this.setPreçoPorItem(0.0);
        this.setQuantidadeCompra(0);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public double getPreçoPorItem() {
        return preçoPorItem;
    }

    public void setPreçoPorItem(double preçoPorItem) {
       if(preçoPorItem < 0){
          this.preçoPorItem = 0;
       }else{
           this.preçoPorItem = preçoPorItem;
       }
    }

    public double getTotalFatura() {
        double valor = 0;
        valor = this.getQuantidadeCompra()*this.getPreçoPorItem();
        if(valor < 0){
           return 0; 
        }else{
            return valor;
        }
        
    }

    
}
