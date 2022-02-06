
package projeto.veiculo;

public class Aviao extends Veiculo {
    @Override
    public void acelerar(){ // sobreposição do metodo abstrato acelerar
        velocidade = velocidade +10;
    }
}
