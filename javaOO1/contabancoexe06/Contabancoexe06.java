
package contabancoexe06;


public class Contabancoexe06 {

    public static void main(String[] args) {
     ContaBanco p = new ContaBanco(); // p é uma nova  conta de banco
     p.setNumeroConta(777); // foi passado um número pelo método set para o atrinuto numeroConta 
     p.setDono("João"); // o nome joão foi passado como argumento pelo setDono 
     p.abrirConta("cc");
     p.depositar(3000);
     
     
     ContaBanco p2 = new ContaBanco(); // p2 é uma nova instância um novo objeto conta de banco,
     // por tanto é diferente p que é outro objeto que também é uma conta de banco
     p2.estadoAtual();
     p2.setNumeroConta(222);
     p2.setDono("Maria");
     p2.setTipo("cp");
     p2.estadoAtual();
     p2.abrirConta("cp");
     p2.depositar(1500);
      p2.estadoAtual();
     p2.sacar(500);
     p2.sacar(2000);
     p2.estadoAtual();
    }
    
}
