/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_1;

/**
 *
 * @author Thiago Cassiano Campos Abreu
 * @turma 203B
 */
import java.util.Scanner;
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Please, insert a day:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
            if(day > 31 || day < 0){
                System.out.println("ERROR");
                System.exit(0);
        }
        
        System.out.println("Please, insert a month:");
        int month = sc.nextInt();
            if((month > 12 || day < 0) || (day > 29 && month == 2) || (day > 30 && month == 4) || (day > 30 && month == 6) || (day > 30 && month == 9) || (day > 30 && month == 11)){
                System.out.println("ERROR");
                System.exit(0);
        }
            
        System.out.println("Please, insert a year:");
        int year = sc.nextInt();
          if(year < 0){
            System.out.println("ERROR");
            System.exit(0);
        }
            
        Datas d = new Datas();
        d.dia = day;
        d.mes = month;
        d.ano = year;
        
      
        System.out.println("Date:" );
        String date = d.toString();
            System.out.println(date);
        System.out.println("Tomorrow's:");
       // String t = d.maisUmDia();
         // System.out.println(t);
        int ano_bissexto = d.AnoBissexto();
            if(day == 31 && month == 1){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 28 && month == 2 && ano_bissexto == 0){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 28 && month == 2 && ano_bissexto != 0){
                day = 29;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 29 && month == 2 && ano_bissexto != 0){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 29 && month == 2 && ano_bissexto == 0){
                System.out.println("ERROR");
                System.exit(0);
            }
            if(day == 31 && month == 3){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 30 && month == 4){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 31 && month == 5){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 30 && month == 6){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 31 && month == 7){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 31 && month == 8){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 30 && month == 9){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 30 && month == 10){
                System.out.println("🎃 Trick or Treat?? Happy Halloween! 🎃");
            }
            if(day == 31 && month == 10){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 30 && month == 11){
                day = 1;
                month = month + 1;
                System.out.println(day + "/" + month + "/" + year);
            } else
            if(day == 24 && month == 12){
                System.out.println("🎄 Merry Xmas! 🎄");
            } else
            if(day == 31 && month == 12){
                day = 1;
                month = 1;
                year = year + 1;
                System.out.println(day + "/" + month + "/" + year);
                System.out.println("✯ Happy New Year! ✯");
            } else {
                String t = d.maisUmDia();
                System.out.println(t);
            }
        int today = d.getDia();
          //  System.out.println(today);
        int m = d.getMes();
          //  System.out.println(m);
        int y = d.getAno();
          //  System.out.println(y);
    }
    
}
