/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício_4;

/**
 *
 * @author a2017953649
 */
import java.util.Arrays;
public class Exercício_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] days = new String[8];
        int i = 0;
        int x = 0; 
        
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";
        
        System.out.println("Com o while:");
        while(i < 7){
            System.out.println(days[i]);
            i++;
        }   
        
        System.out.println();
        
        System.out.println("Com do-while");
        do{
           System.out.println(days[i]);
            i++; 
        } while(i < 8);
        
        System.out.println();
        
         System.out.println("Com for");
        for(i = 0; i < 7; i++){
            System.out.println(days[i]); 
        }
    }
    }
