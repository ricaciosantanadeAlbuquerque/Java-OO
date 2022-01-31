
package projeto.escola;

public class Técnico extends Aluno {
    private int registroProfissional;
    public void praticar(){
        System.out.println("Praticando !");
    }
    public int getRegistroProfissional(){
        return this.registroProfissional;
    }
    public void setRegistroProfissional(int registro){
        this.registroProfissional = registro;
    }
    
}
