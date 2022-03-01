
package pessoa1;

public class PessoaJuridica extends Pessoa { // especializaçao da classe pessoa 
private String cnpj;

public String getCNPJ(){
    return this.cnpj;
}
public void setCNPJ(String cnpj1){
    this.cnpj = cnpj1;
}

}
