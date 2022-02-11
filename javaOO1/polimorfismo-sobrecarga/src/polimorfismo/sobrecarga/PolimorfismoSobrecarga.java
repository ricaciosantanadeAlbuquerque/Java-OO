
package polimorfismo.sobrecarga;

public class PolimorfismoSobrecarga {
  
    public static void main(String[] args) {
       Lobo lobo1 = new Lobo();
       Mamifero mamifero1  = new Mamifero();
       Cachorro cachorro1 = new Cachorro();
       mamifero1.emitirSom();
       lobo1.emitirSom();
       cachorro1.emitirSom();
   //===========================================================================
   cachorro1.reagir("Ola");
   cachorro1.reagir("Vai panhar");
   cachorro1.reagir(true);
   cachorro1.reagir(false);
   cachorro1.reagir(11,45);
   cachorro1.reagir(20,44);
   cachorro1.reagir(2, 12.5f);
   cachorro1.reagir(17,4.5f);
   
   /* Polimorfismo de sobrecarga,  os métodos possuem o mesmo nome porém com assinaturas diferentes
    * e todos são declarados dentro  da mesma classe.
    * é o mesmo método, com  o mesmo nome, porém sua implementação é diferente
    * A mesma ação executada de várias formas diferentes.
    * */
    }
    
}
