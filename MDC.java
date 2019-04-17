

package questão2;
import java.util.Scanner;

/**
 * PROVA I - 3° TRIMESTRE
 * Professora: Liliane dos Reis Gade
 * Aluno: Thiago Cassiano Campos Abreu
 * Turma: 203B
 * 10 pts.
 */
public class MDC {
    
public static int mdc(int num1, int num2){

        if((num1 % num2 == 0 )){
               return num2;
            } else {
                return mdc(num2,(num1 % num2));
              } 
        }

}