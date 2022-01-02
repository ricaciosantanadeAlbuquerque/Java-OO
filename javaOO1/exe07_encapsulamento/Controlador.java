
package exe07_encapsulamento;
// as interfaces  não possuem atributos, só métodos abistratos
// a grande maioria desses métodos serão publicos
//PS! os métodos não são implementados  na interface
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
