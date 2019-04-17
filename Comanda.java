

package prova_questao1;
import java.util.Scanner;

/**
 * PROVA II - 3° TRIMESTRE
 * Professora: Liliane dos Reis Gade
 * Aluno: Thiago Cassiano Campos Abreu
 * Turma: 203B
 * 10 pts.
 */
public class Comanda {
    protected String consumo;
    protected double valor;
    
    Scanner sc = new Scanner(System.in);

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String listaConsumo(){
        String produtos;
        
        System.out.println("Quais são os produtos consumidos: ");
        produtos = sc.nextLine();
        
        return produtos;     
    }
    
    public double dezPorCento(){
        
        return 0.10 * this.valor;
        
    }
    
    public double dividirConta(){
        int quantidade;
        
        System.out.println("---------DIVISÃO DA CONTA----------");
        System.out.println("Quantas pessoas irão pagar a conta: ");
        quantidade = sc.nextInt();
        
        return this.valor/quantidade;
    }
}
