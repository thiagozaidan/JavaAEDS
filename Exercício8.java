/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício8;

/**
 *
 * @author Thiago Cassiano Campos Abreu
 * @turma 203B
 */
import java.util.Scanner;
public class Exercício8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] A = new int[5];
        int[] B = new int[6];
        int count = 0;
       // int i = 0;
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Digite 5 elementos do Vetor A:");
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            A[2] = sc.nextInt();
            A[3] = sc.nextInt();
            A[4] = sc.nextInt();
            
            System.out.println("Digite 6 elementos do Vetor B:");
            B[0] = sc.nextInt();
            B[1] = sc.nextInt();
            B[2] = sc.nextInt();
            B[3] = sc.nextInt();
            B[4] = sc.nextInt();
            B[5] = sc.nextInt();
       
        System.out.print("Vetor A = ");
        
        for(int j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
    }
        System.out.println();
        
        System.out.print("Vetor B = ");
        
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.print("Os números repetidos são = ");
        for(int j = 0; j < A.length; j++){
            for(int i = 0; i < B.length; i++){
                if(A[j] == B[i]){
                    System.out.print(B[i] + " ");
                    count++;
                }
            }
        }
        if(count == 0){
        System.out.print("Nenhum!");
    }
}
}