
package pessoa;

public class Pessoa {

    public static void main(String[] args) {
     Pessoa1[] p = new Pessoa1[2];
     Livro[] l = new Livro[3];
     p[0] = new Pessoa1("Pedro",22,"M");
     p[1] = new Pessoa1("Ricardo",21,"M");
     l[0] = new Livro("Aprendendo Java","José da silva ",300,p[0]);
     l[1] = new Livro("POO para Iniciantes ","pedro Paulo",500,p[1]);
     l[2] = new Livro("Java Avançado ","Maria candida ",800,p[0]);
     
     
     l[0].abrir();
        System.out.println(l[0].detalhes());
        System.out.println("===================================================");
        l[1].abrir();
        l[1].folhear(60);
        System.out.println(l[1].detalhes());
    }
    
}
