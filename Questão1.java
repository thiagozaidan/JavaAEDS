

package questão1;

/**

 * PROVA I - 3° TRIMESTRE
 * Professora: Liliane dos Reis Gade
 * Aluno: Thiago Cassiano Campos Abreu
 * Turma: 203B
 * 10 pts.
 */
import java.util.Scanner;

public class Questão1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de funcionários: ");
        int qtd = sc.nextInt();
        
       
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Insira o código do seu funcionário: ");
        int codigo = sc.nextInt();
        Cliente c1 = new Cliente(codigo);
            c1.main();
        }
        
    }

}
