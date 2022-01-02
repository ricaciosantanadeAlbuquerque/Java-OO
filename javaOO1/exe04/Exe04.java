package exe04;

public class Exe04 {
   
    public static void main(String[] args) {
     Caneta n1 = new Caneta(); // n1 é uma caneta  ou uma nova caneta
      n1.status();
      System.out.println("===================================================");
      n1.setPonta(1.5); // n1 terá a ponta 1.5 
      n1.setCor("Vermelho"); // n1 será da cor  vermelha
      n1.setTampada(false); // n1 estará destampada
      n1.rabiscar(); // n1 pode rabiscar 
      n1.status(); 
      System.out.println("===================================================");
      Caneta caneta2 = new Caneta(); // foi criado uma nova caneta de nome caneta2
      caneta2.status();
      System.out.println("===================================================");
      caneta2.setPonta(0.5); // configurando o atributo ponta de caneta2 para 0.5 através do método set
      caneta2.status();
     // caneta2.tampada = false;
     caneta2.setTampada(false); // caneta2 está destampada
      System.out.println("===================================================");
      caneta2.status();
      System.out.println("===================================================");
      caneta2.setTampada(true); // caneta2 está  tampada 
      caneta2.rabiscar(); // por está  tampada não pode escrever
      caneta2.status();
      
      
    }
    
}
