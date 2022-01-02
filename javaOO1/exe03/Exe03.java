
package exe03;


public class Exe03 {

   
    public static void main(String[] args) {
   
        Notebook pc = new Notebook(); // foi criado um novo notebook chamado pc
        pc.cor = "Preto";
       // pc.status();
        pc.modelo = "ASUS";
        pc.tamanho = 14;
        pc.carregado =  false;
        
        pc.quantUsb = 4;
       // pc.quantHdmi = 2; não é possível acessar um atributo privado diretamente
        //pc.status();
         pc.carregado =  false; //  está descarrehado 
        pc.carregadorTomada = true; // o carregador está na tomada
        pc.carregar(); // mandei carregar a bateria 
        pc.abrir(); // mandei abrir
        pc.ligado(); // mandei ligar
        pc.status(); // mostrar o estado do notebook pc
      System.out.println("\n=============================================");
        pc.carregar(); // como está carregado  vai avisar que a bateria está cheia 
        pc.desligado(); // mandei desligar
        pc.fechar(); // mandei fechar 
        pc.status(); // mostrar o estado do notebook pc
    }
    
}
