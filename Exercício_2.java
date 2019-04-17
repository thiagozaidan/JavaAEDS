/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercício_2;

/**
 *
 * @author Thiago Cassiano Campos Abreu
 * @turma 203B
 */
import java.util.Scanner;
public class Exercício_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Please, insert the number of employees in your company:");
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        
        for(int i = 1; i <= qtd; i++){
        System.out.println("Please, insert a name and surname to your employee " + i + ":");
        String employee;
        employee = sc.nextLine();
        
        //System.out.println("Please, insert a surname to your employee:");
        String s_employee;
        s_employee = sc.nextLine();
        
        System.out.println("Please, insert a salary to your employee" + employee + ":");
        double sal;
        sal = sc.nextDouble();
        
        Empregado e = new Empregado();
        e.setNome(employee);
        e.setSobrenome(s_employee);
        e.setSalario(sal);
        String name = e.getNome();
        String surname = e.getSobrenome();
        double salary = e.getSalario();
        //double ifsalary = e.ifSalario();
        System.out.println(name + " " + surname);
        System.out.println("Monthly salary = " + salary);
        
        Empregado sal_anual = new Empregado();
        sal_anual.setSalario(salary);
        double s_anual = sal_anual.getSalario() * 12;
        System.out.println("Annual salary = " + s_anual);
        
        Empregado aumento = new Empregado();
        aumento.setSalario(salary);
        double aumento10 = aumento.getSalario() * 10/100;
        double new_salary = salary + aumento10;
        System.out.println("New monthly salary = " + new_salary);
        System.out.println("New annual salary = " + new_salary * 12);
    }
    }
}
