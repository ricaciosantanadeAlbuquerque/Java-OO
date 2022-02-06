
package projeto.pessoa.dados;
/*Funcionário pode utilizar todos os atribultos e métodos das classe pessoaFisica e
da classe pessoa, já que PessoaFisica herda tudo  da sua super classe a classe Pessoa
*/
public class Funcionario extends PessoaFisica {
 private String cartao;
 
 public String getCartao(){
     return this.cartao;
 }
 public void setCartao(String cartao1){
     this.cartao = cartao1;
}
}
