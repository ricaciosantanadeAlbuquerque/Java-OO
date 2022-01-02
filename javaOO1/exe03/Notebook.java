
package exe03;

public class Notebook {
    /* o que está sendo posto em prática é o conceito de visibilidade
    *  publico privado protegido 
    */
//==============ATRIBUTOS=======================================================
    public  String cor;
    protected String modelo;
    protected int tamanho;
    public int quantUsb;
    private int quantHdmi;
    public boolean carregadorTomada;
    public boolean carregado;
    public boolean aberto;
    public boolean ligado;
    public int quantLeitorCartao;
//=============METODOS==========================================================
    public void carregar(){
      if(this.carregado == false){ // se estiver descarregado 
            if(this.carregadorTomada == true){ // se o carregador  estiver na tomada  então pode carregar
            System.out.println(" Está carregando !");
            this.carregado = true;
        }else{
            System.out.println("Não está carregando !,");
            System.out.println("Por favor coloque o carregador na tomada");
        }
      }else{// está carregado 
          System.out.println("A bateria está  cheia !");
      }
    }
    public void  abrir(){
        this.aberto = true;
    }
    public void fechar(){
        this.aberto = false;
    }
    public void ligado(){
        if(this.aberto == true){ // se estiver a berto então
            if(this.carregado == true){ // se estiver carregado então
                this.ligado = true; // está ligado 
        
            }
        }
    }
    public void desligado(){
        if(this.aberto == true){ //se estiver aberto então
            if(this.ligado == true){//se estiver ligado então
                this.ligado = false; // desligado
                  
            }
        }
    }
    public void status(){
        System.out.println("cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Tamanho é "+this.tamanho+" Polegadas");
        System.out.println("Quantidade de portas USB: "+this.quantUsb);
        System.out.println("Quantidade de portas HDMI: "+this.quantHdmi);
        System.out.println("Quantidade de leitor de cartão: "+this.quantLeitorCartao);
         if(this.aberto == true){
               System.out.println("O pc está a berto ");
      }else{
          System.out.println("O pc está fechado ");
           }
        if(this.ligado == true){
            System.out.println("O pc está ligado :");
        }else{
            System.out.println("O pc está desligado : ");
        }
          
 
    
}
}
