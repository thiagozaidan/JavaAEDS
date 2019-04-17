/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício__5;

/**
 *
 * @author a2017953649
 */
public class DigitoPortugues {
    static final String zero = "Zero";
    static final String um = "Um";
    static final String dois = "Dois";
    static final String tres = "Três";
    static final String quatro = "Quatro";
    static final String cinco = "Cinco";
    static final String seis = "Seis";
    static final String sete = "Sete";
    static final String oito = "Oito";
    static final String nove = "Nove";
    static final String dez = "Dez";
        
    public void escreveExt(char[] x){
        if (x[0] == '0')
            System.out.println(DigitoPortugues.zero + " ");
        else if (x[0] == '1')
            System.out.println(DigitoPortugues.um + " ");
        else if (x[0] == '2')
            System.out.println(DigitoPortugues.dois + " ");
        else if (x[0] == '3')
            System.out.println(DigitoPortugues.tres + " ");
        else if (x[0] == '4')
            System.out.println(DigitoPortugues.quatro + " ");
        else if (x[0] == '5')
            System.out.println(DigitoPortugues.cinco + " ");
        else if (x[0] == '6')
            System.out.println(DigitoPortugues.seis + " ");
        else if (x[0] == '7')
            System.out.println(DigitoPortugues.sete + " ");
        else if (x[0] == '8')
            System.out.println(DigitoPortugues.oito + " ");
        else if (x[0] == '9')
            System.out.println(DigitoPortugues.nove + " ");
            
    }
    
}
