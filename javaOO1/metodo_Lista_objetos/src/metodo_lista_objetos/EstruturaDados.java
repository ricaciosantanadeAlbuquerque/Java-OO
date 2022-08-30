
package metodo_lista_objetos;

import java.util.ArrayList;

public class EstruturaDados implements InterfaceMetodos {
     static ArrayList<Pessoa> dados = new ArrayList();

    

    @Override
    public void cadastra(Pessoa objeto) {
       dados.add(objeto); // adiciona o objeto pessoa que será passado como argumento
    }

    @Override
    public void excluir(String objeto) {
        for(Pessoa pessoa : dados){
            if(pessoa.getNome().equals(objeto)){  // se o atribulto nome do objeto pessoa  for igual ao parâmetro então remova o objeto pessoa 
                dados.remove(pessoa);
                break;
            }
        }
    }

    @Override
    public void listar() {
        if(dados.isEmpty()){
            System.out.println("preencha o vetor ");
    }else{
       for(Pessoa p : dados){
           System.out.println(p);
       }
           
        }
    
}
    
}