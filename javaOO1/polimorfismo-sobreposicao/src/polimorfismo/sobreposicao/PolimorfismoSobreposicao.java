
package polimorfismo.sobreposicao;
/* NESTE EXERCÍCIO FORAM PRATICADOS A HERANÇA EM ARVORE, COM DOIS TIPOS DE HERANÇA,
 * A HERANÇA DE IMPLEMENTAÇÃO OU HERANÇA POBRE E A HERANÇA PARA DIFERENÇA.
 * E TAMBÉM FOI PRATICADO O POLIMORFISMO DE SOBREPOSIÇÃO.
 *
*/

public class PolimorfismoSobreposicao {

    public static void main(String[] args) {
   //Animal n= new Animal();
   Mamifero mamifero1 = new Mamifero();
   Reptil reptil1 = new Reptil();
   Peixes peixe1 = new Peixes();
   Ave ave1 = new Ave();
   Canguru canguru1 = new Canguru();
   Cachorro cachorro1 = new Cachorro();
   Cobra cobra1 = new Cobra();
   Tartaruga tartaruga1 = new Tartaruga();
   PeixeDourado peixe2 = new PeixeDourado();
   Arara ave2 = new Arara();
    //==========================================================================
    mamifero1.locomover();
    reptil1.locomover();
    //==========================================================================
   peixe1.idade = 2;
   peixe1.membros = 6;
   peixe1.peso = 0.035f;
   peixe1.locomover();
   canguru1.locomover();
   tartaruga1.locomover();
   ave2.locomover();
   //===========================================================================
   cachorro1.emitirSom();
   canguru1.emitirSom();
   
   /* são os mesmos métodos, porém sua implementação é diferente.
    * É nisto que consiste opolimorfismo,  fazer uma mesma ação porém de varias formas diferentes
    * ou de muitas maneiras diferentes.
   */
     
    }
    
}
