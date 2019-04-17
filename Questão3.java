package questao3;

/**

 * PROVA I - 3° TRIMESTRE
 * Professora: Liliane dos Reis Gade
 * Aluno: Thiago Cassiano Campos Abreu
 * Turma: 203B
 * 10 pts.
 */
import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int i, j, k;
        int aux_soma;
        int aux_sub;
        int maior = 0;
        int aux;
        int A[][] = new int[4][4];
        int B[][] = new int[4][4];
        int C[][] = new int[4][4]; 
        int result1[][] = new int[4][4];
        int result2[][] = new int[4][4];


    System.out.printf("____________MATRIZ A_____________\n");
        for (i = 0; i < A.length; i++) {
      //System.out.printf("Informe os elementos da %daº linha:\n", (i+1));
        for (j = 0; j < A.length; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        A[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }

    System.out.printf("\n__________MATRIZ B_______________\n");
    for (i = 0; i < B.length; i++) {
      //System.out.printf("Informe os elementos da %da° linha:\n", (i+1));
      for (j = 0; j < B.length; j++) {
        System.out.printf("B[%d][%d] = ", i, j);
        B[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }
    
    System.out.printf("\n__________MATRIZ C_______________\n");
    for (i = 0; i < C.length; i++) {
      //System.out.printf("Informe os elementos da %da° linha:\n", (i+1));
      for (j = 0; j < C.length; j++) {
        System.out.printf("C[%d][%d] = ", i, j);
        C[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }
    
        
// adição das matrizes A e B
    for (i = 0; i < 4; i++) {
      for (j=0; j < 4; j++) {
        aux_soma = 0;
        for (k = 0; k < 4; k++) {
          aux_soma = (A[i][j] + B[i][j]);
        }
        result1[i][j] = aux_soma;
      }
    }

// subtração das matrizes result1 e C    
    
    for (i = 0; i < 4; i++) {
      for (j=0; j < 4; j++) {
        aux_sub = 0;
        for (k = 0; k < 4; k++) {
          aux_sub = (result1[i][j] - C[i][j]);
        }
        result2[i][j] = aux_sub;
            if(aux_sub > maior){
                aux = maior;
                maior = aux_sub;
            }
      }
    }         //System.out.println(maior);
            
    
    
// impressão das matrizes 
    // Matriz A
    System.out.printf("\n_______MATRIZ A________\n");
    for (i = 0; i < A.length; i++) {
      //System.out.printf("%da.  (i+1));
      for (j = 0; j < A.length; j++) {
        System.out.printf("%d ", A[i][j]);
      }
      System.out.printf("\n");
    }
    
    // Matriz B
    System.out.printf("\n______MATRIZ B________\n");
    for (i = 0; i < B.length; i++) {
      //System.out.printf("%da. linha: ", (i+1));
      for (j = 0; j < B.length; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }
    
    // Matriz C
     System.out.printf("\n______MATRIZ C________\n");
    for (i = 0; i < C.length; i++) {
      //System.out.printf("%da. linha: ", (i+1));
      for (j = 0; j < C.length; j++) {
        System.out.printf("%d ", C[i][j]);
      }
      System.out.printf("\n");
    }
    
    // impressão da matriz resultante
    System.out.printf("\n__________MATRIZ RESULTANTE___________\n");
    for (i = 0; i < 4; i++) {
      //System.out.printf("%da. linha: ", (i+1));
      for (j = 0; j < 4; j++) {
        System.out.printf("%d ", result2[i][j]);
      }
      System.out.printf("\n");
    }
     System.out.println("\n");
     System.out.println("O maior elemento da matriz resultante é: " +maior);
  }

    }


