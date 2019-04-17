/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_1;

/**
 *
 * @author a2017953649
 */
public class Datas {
    int dia;
    int mes;
    int ano;
    
    public int getDia(){
        return dia;
}
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String toString(){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
    
    public String maisUmDia(){
        String data;
        data = dia + 1 + "/" + mes + "/" + ano;
        return data;
    } 
    
    public int AnoBissexto(){
       int leap = 0;
       if(ano % 400 == 0){
            //System.out.println(ano + " is a leap year.");
            leap++;
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            //System.out.println(ano + " is a leap year.");
            leap++;
        } else{
            //System.out.println(ano + " isn't a leap year");
            leap = 0;
}
       return leap;
        }
    }
    
   
