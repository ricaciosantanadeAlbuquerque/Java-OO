
package metodo_lista_objetos;
import java.util.Scanner;

public class Metodo_Lista_objetos {
    
  EstruturaDados dados;

    public static void main(String[] args) {
         EstruturaDados dados = new EstruturaDados();
          String resposta = "sim";
         String nomePessoa;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("para cadastrar digite 1");
        System.out.println("Para excluir digite 2 ");
        System.out.println("Para listar digite 3");
        System.out.println("Para sair digite 4");
        int op1  = in.nextInt();
        
        switch(op1){
            
            case 1:        
         in.nextLine();       
        System.out.println("Digite seu nome");
        String nome = in.nextLine();
        System.out.println("Digite seua idade ");
        int idade = in.nextInt();
        System.out.println("Digite seu peso ?");
        double peso = in. nextDouble();
        System.out.println("Digite sua altura !");
        double altura = in.nextDouble();
        System.out.println("Digite seu sexo !");
        in.nextLine();
        String sexo = in.nextLine();
        System.out.println("Voce trabalha ?");
        String trabalha = in.nextLine();
        Pessoa novaPessoa = new Pessoa(nome,idade,peso,altura,sexo,trabalha);
                dados.cadastra(novaPessoa);
                break;
            case 2:
                
                nomePessoa = in.nextLine();
                System.out.println("Digite o nome da pessoa ");
                nomePessoa = in.nextLine();
                dados.excluir(nomePessoa);
                break;
            case 3:
                    dados.listar();
                break;
            case 4:
                System.exit(0);
                break; 
        }
     
       
          resposta = in.nextLine();
            System.out.println("Deseja continuar ? digite sim ou nao");
            resposta = in.nextLine();
        
        }while(resposta.equals("sim"));
       
    }
    
    
}
