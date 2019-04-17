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
public class DigitoFrances {
    static final String zero = "Zéro";
    static final String um = "Un";
    static final String dois = "Deux";
    static final String tres = "Trois";
    static final String quatro = "Quatre";
    static final String cinco = "Cinq";
    static final String seis = "Six";
    static final String sete = "Sept";
    static final String oito = "Huit";
    static final String nove = "Neuf";
    static final String dez = "Dix";
        
    public void escreveExt(char[] x){
        if (x[0] == '0')
            System.out.println(DigitoFrances.zero + " ");
        else if (x[0] == '1')
            System.out.println(DigitoFrances.um + " ");
        else if (x[0] == '2')
            System.out.println(DigitoFrances.dois + " ");
        else if (x[0] == '3')
            System.out.println(DigitoFrances.tres + " ");
        else if (x[0] == '4')
            System.out.println(DigitoFrances.quatro + " ");
        else if (x[0] == '5')
            System.out.println(DigitoFrances.cinco + " ");
        else if (x[0] == '6')
            System.out.println(DigitoFrances.seis + " ");
        else if (x[0] == '7')
            System.out.println(DigitoFrances.sete + " ");
        else if (x[0] == '8')
            System.out.println(DigitoFrances.oito + " ");
        else if (x[0] == '9')
            System.out.println(DigitoFrances.nove + " ");
            
    }
}

