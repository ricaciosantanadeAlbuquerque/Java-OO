
package exe011ufc;


public class Exe011ufc {

   
    public static void main(String[] args) {
    //Será criado um vetor de objetos da classe Lutador
    Lutador[]lutador1 = new Lutador[6];
    // eu tenho um vetor do tipo Classe Lutador e nome lutador1 e esse vetor é
    // do tipo Lutador de 6 posições de uma dimensão
    lutador1[0] = new Lutador("Ricardo","Brasil",34,1.77,77.7,14,4,3);
    // lutador1 na posição ZERO foi inicialido chamando o contrutor Lutador() passando os dados
    // como argumento para os devidos parâmetros do contrutor. 
    lutador1[1] = new Lutador("Paulo","Russia",27,1.89,90.9,12,6,4);
    lutador1[2] = new Lutador("Tomas","EUA",30,1.73,67,11,3,6);
    lutador1[3] = new Lutador("bruno","Brasil",22,1.77,80.0,10,0,0);
    lutador1[4] = new Lutador("Pablo","Argentina",34,1.82,91.2,13,4,2);
    lutador1[5] = new Lutador("Abrão","palestina",30,1.70,65.5,15,4,7);
  //===========================================================================
  lutador1[0].status();
  lutador1[1].status();
  Luta luta1 = new Luta();// crinado uma nova instância de luta
  luta1.marcarLuta(lutador1[0], lutador1[1]); // passado lutador1[0] e lutador1[1] como argumentos
  luta1.lutar();
        System.out.println("===================================================");
  luta1.marcarLuta(lutador1[1], lutador1[4]); // marquei aluta 
  luta1.lutar(); // mandei lutar
   System.out.println("===================================================");
    lutador1[1].status();
    lutador1[4].status();
    
    }
    
}
