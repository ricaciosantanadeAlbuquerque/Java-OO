
package exercicios01;
 // Início da orientação a objeto

public class Caneta {
     // atributos ou variáveis de instância  
    String modelo; 
    String cor;
    double ponta;
      int carga;
      boolean tampada;
    //Métodos
      void status(){
          System.out.println("Caneta de cor "+ this.cor);
          System.out.println("Modelo "+this.modelo);
          System.out.println("carga "+this.carga+"%");
          System.out.println("Tampada "+this.tampada);
      }
       void rabiscar(){
           if(this.tampada == true){// o parâmetro this, faz uma alto referêcia dentro da classe  a quem chamou  o método.
               System.out.println(" A caneta está tampada não pode rabiscar ");
           }else{
               System.out.println("Pode rabiscar !");
           }
       }
       void tampar(){
           this.tampada = true;
       }
       void destampar (){
           this.tampada = false;
       }
}
