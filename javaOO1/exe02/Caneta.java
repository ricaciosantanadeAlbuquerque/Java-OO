
package exe02;

public class Caneta {
    // introduzindo o conceito de visibilidade
    public String modelo; 
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;
    //Métodos
       public void status(){
          System.out.println("Caneta de cor "+ this.cor);
          System.out.println("Modelo "+this.modelo);
          System.out.println("carga "+this.carga+"%");
          System.out.println("Tampada "+this.tampada);
      }
        public void rabiscar(){
           if(this.tampada == true){// o parâmetro this, faz uma alto referêcia dentro da classe  a quem chamou  o método.
               System.out.println(" A caneta está tampada não pode rabiscar ");
           }else{
               
               System.out.println("\n\nPode rabiscar !");
           }
       }
        protected void tampar(){
           this.tampada = true;
       }
     private void destampar (){
           this.tampada = false; // this  faz uma altoreferência a quem evoca o método, como o objeto caneta  não pode ser 
           // escrito dentro desta classe então utilizamos a palavra this.   
       }
}

    

