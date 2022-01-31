package exe011ufc;
/*As interfaces não possuem atribultos, só métodos abistratos
  por padrão  todo método abistrator possui visibilidade púlblica e não
 * desenvolvemos os métodos na interface. Só a  Assinatura do método ou uma  lista dos métodos
 publicos e abistratos que é comum a todo objeto lutador
*/
public interface Interface {
    
public abstract void apresentar();    
public abstract void status();
public abstract void ganharLuta();
public abstract void perderLuta();
public abstract void empatarLuta();
}
