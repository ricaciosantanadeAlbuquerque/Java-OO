public class exercicio {
    public static void main(String[] args) {
        /*
        c1 é uma instância  da classe CANETA, podendo tulizar  seus atributos e métodos */
      Caneta c1 = new Caneta(); // 
      c1.cor = "verde";
      c1.carga = 80;
      c1.ponta = 1.5; // chamada a tributo
      c1.modelo  = "bic Cristal";  
      c1.destampar(); // chamada a método
      c1.rabiscar();
        c1.status();
        // aparti  de uma classe podemos gerar N objetos. 
      Caneta c2 = new Caneta();
      c2.cor="Vermelho";
      c2.modelo = "BR";
      c2.ponta = 2.0;
      c2.carga = 100;
      c2.tampar();
      c2.rabiscar();
      c2.status();
     
    }
}
