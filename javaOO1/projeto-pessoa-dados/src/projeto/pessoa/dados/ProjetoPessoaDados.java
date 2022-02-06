
package projeto.pessoa.dados;

public class ProjetoPessoaDados {

    public static void main(String[] args) {
       Funcionario funcionario1 = new Funcionario();
       funcionario1.setNome("ricacio");
       funcionario1.setRg("25.645.678-x");
       funcionario1.setCartao("RH845");
       
       System.out.println("Nome: "+funcionario1.getNome());
       System.out.println("RG: "+funcionario1.getRg());
       System.out.println("Número do cartão :"+funcionario1.getCartao());
    }
    
}
