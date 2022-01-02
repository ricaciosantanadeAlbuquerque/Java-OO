
package exe02;


public class Exe02 {

   
    public static void main(String[] args) {
       Caneta caneta = new Caneta();
       caneta.cor = "Azul";
       caneta.modelo = "compac";
     //  caneta.ponta = 0.5; NÃO É POSSÍVEL ACESSAR UM ATRIBUTO  PRIVADO  DIRETAMENTE 
     caneta.carga = 90;
     caneta.tampada = true; // como a classe exe02 está  fazendo uso da classe caneta  ela pode utilizar os atributos e métodos protegidos 
     caneta.rabiscar();
     caneta.status();
     
    // caneta.destampar(); o método destampar é privado portanto não pode ser acessado pelo objeto caneta !
    caneta.tampada = false;
    caneta.rabiscar();
    caneta.status();
    }
    
}
