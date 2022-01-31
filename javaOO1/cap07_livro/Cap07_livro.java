
package cap07_livro;


public class Cap07_livro {

   
    public static void main(String[] args) {
         Celular celular1 = new Celular();
         Celular celular2 = new Celular();
         Celular celular3  = new Celular();
  //============================================================================
   celular1.numero = "83 987874721 ";
   celular2.numero = "11 54312342";
   celular3.numero = "81 999977555";
   Celular.empresa = " casa bahia"; // nome da classe. atributo
   //esse atributo possui a palavra reservada static
   // portanto o valor do atributo pertence a Classe celular.
   celular1.status();
        System.out.println("===================================================");
   celular2.status();
        System.out.println("===================================================");
        celular3.status();
      /*
        * Assim utilizando   um atributo statico seu valor passa a ser do escopo da classe
        * e será o mesmo para todos os objetos criados aparti dessa classe.
        * 
        */   
        
    }
    
}
