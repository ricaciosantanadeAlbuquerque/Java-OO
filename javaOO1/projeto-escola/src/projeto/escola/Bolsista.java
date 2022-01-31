
package projeto.escola;

public class Bolsista  extends Aluno {
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada !");
    }
    @Override // sobreposição ou sobre escrita  do método!!
    public void pagarMensalidade(){
         System.out.println("O valor da bolsa de "+this.getNome()+" está paga "
                + " com o desconto de 50% ");
    }
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
