
package exe04;

public class Caneta {  
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;
    public Caneta(){// Toda fez que um objeto for criado ou instanciado o contruto será executado
        this.setCor("Azul");
        this.setTampada(true);
        this.modelo = "BIC"; // acesso direto  ao a tributo não recomendado
    }
    public String getModelo(){ // {get == e pegar} pege o valor do atributo e retorne para quem o chamou
        return this.modelo;
    }
    public void setModelo(String moda){
        this.modelo = moda;
    }
    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){// todo método set possui parâmetros
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean v){
        this.tampada = v;
    }
    public void rabiscar(){
        if(this.getTampada() == false){ // se o valor do atributo tampada for falso ou seja não está tampada
            System.out.println(" PODE ESCREVER !!!");
        }else{
            System.out.println("NÃO PODE ESCREVER !!! ");
        }
    }
    public void status(){
        System.out.println("Cor "+this.getCor());
        System.out.println("Modelo "+this.getModelo());
        System.out.println("Ponta "+this.getPonta());
        if(this.getTampada() == true){
            System.out.println("A caneta está tampada ");
        }else{
            System.out.println("A caneta está destampada ! ");
        }
    }
}
