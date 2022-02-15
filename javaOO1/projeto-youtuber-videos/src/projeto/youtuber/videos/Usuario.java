
package projeto.youtuber.videos;

public class Usuario extends Pessoa {
    private String login;
    private int totAssistido;

    public Usuario(String nome1, int idade1, String sexo1,String login1) {
        super(nome1, idade1, sexo1); // chamada ao super construtor da super classe Pessoa. Pois todo usuário é uma pessoa,  ao  ser criado um objeto usuário, ele deve possuir "nome idade sexo e login"
        this.login = login1;     
        this.totAssistido = 0;
    }
    
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login1){
        this.login = login1; 
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido1) {
        this.totAssistido = totAssistido1;
    }

    @Override
    public String toString() {
        return "Usuario{" +super.toString()+ "login=" + login + 
                ", totAssistido=" + totAssistido + '}';
        /*super.toString(), faz referência ao toString da super classe Pessoa 
        * por tanto  ele será incorporado ao toString da classe Ususário
        */
    }
    
}
