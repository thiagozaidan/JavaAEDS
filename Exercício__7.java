/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício__7;

/**
 *
 * @author a2017953649
 */
import java.util.Scanner;
public class Exercício__7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int qtd;
        double nota;
        int count = 0;
        int count5 = 0;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please, insert a quantity of students:");
        qtd = sc.nextInt();
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Insert a note of student " + (i+1) + ":");
            nota = sc.nextDouble();
            sum = sum + nota;
                if(nota >= 7){
                    count++;
                }
                if(nota <= 5){
                    count5++;
                }
        }
        
        double medium = sum / qtd;
        System.out.println("Arithmetic mean: " +medium);
        System.out.println("The number of students who scored higher than 7: " +count);
        if(count5 == qtd){
            System.out.println("There are no students with a grade above 5.");
        }
    }
    
}
