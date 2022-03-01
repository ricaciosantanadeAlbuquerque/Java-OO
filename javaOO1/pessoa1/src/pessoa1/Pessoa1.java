
package pessoa1;

public class Pessoa1 {
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(); // declaração e inicialização do objeto
        funcionario1.setNome("Lucas"); // passando um nome 
        funcionario1.setRG("773.445.506-07");//passando um rg
        funcionario1.setCartao("000773.666.876");//passando um cartao 
        System.out.println("O funcionário "+funcionario1.getNome());
        System.out.println("RG: "+funcionario1.getRG());
        System.out.println("Número do Cartão "+funcionario1.getCartao());
        
        /* COMO A CLASSE FUNCIONÁRIO herda tudo da classe PessoaFisica e a classe PessoaFisica herda tudo
         * da classe Pessoa.
         * então a classe Funcionário possui tudo que a classe PessoaFisica possui e Tudo que classe Pessoa 
         * possui. POR TANTO É VÁLIDO DIZER QUE O OBJETO funcionario1 ENGLOBA OU POSSUI DENTRO DE SÍ TODOS OS 
         * ATRIBULTOS E MÉTODOS DAS SUAS CLASSES ANCESTRAIS.
         *
         **/
        /* Todo funcionário é uma pessoa fisica, e toda pessoa fisica é uma pessoa  */
    }
    
}
