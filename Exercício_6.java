/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício_6;

/**
 *
 * @author a2017953649
 */
import java.util.Scanner;
public class Exercício_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

    int n = 5;
    int n1 = 4;
    int n2 = 4;
    int n3 = 6;
    int i, j, k, sm;
    int A[][] = new int[6][6];
    int B[][] = new int[6][6];
    int result[][] = new int[6][6];


    System.out.printf("____________MATRIZ A_____________\n");
    for (i = 0; i < n; i++) {
      //System.out.printf("Informe os elementos da %daº linha:\n", (i+1));
      for (j = 0; j < n1; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        A[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }

    System.out.printf("\n__________MATRIZ B_______________\n");
    for (i = 0; i < n2; i++) {
      //System.out.printf("Informe os elementos da %da° linha:\n", (i+1));
      for (j = 0; j < n3; j++) {
        System.out.printf("B[%d][%d] = ", i, j);
        B[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }


    for (i = 0; i < n; i++) {
      for (j=0; j < n3; j++) {
        sm = 0;
        for (k = 0; k < n3; k++) {
          sm = sm + (A[i][k] * B[k][j]);
        }
        result[i][j] = sm;
      }
    }


    System.out.printf("\n_______MATRIZ A________\n");
    for (i = 0; i < n; i++) {
      //System.out.printf("%da.  (i+1));
      for (j = 0; j< n1; j++) {
        System.out.printf("%d ", A[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n______MATRIZ B________\n");
    for (i = 0; i < n2; i++) {
      //System.out.printf("%da. linha: ", (i+1));
      for (j = 0; j < n3; j++) {
        System.out.printf("%d ", B[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n__________PRODUTO DAS MATRIZES___________\n");
    for (i=0; i<n; i++) {
      //System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", result[i][j]);
      }
      System.out.printf("\n");
    }
  }
}