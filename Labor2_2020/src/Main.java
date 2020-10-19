/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Main {
    public static void main(String[] args) {
         System.out.println();

         Account szamla1 = new Account(12, 10000);
         System.out.println(szamla1);
         szamla1.deposit(2000);
         System.out.println(szamla1);
         szamla1.withdraw(1500);
         System.out.println(szamla1);
         
         Fan fan1 = new Fan(Fan.MEDIUM,2,"red",true);
         Fan fan2 = new Fan(Fan.MEDIUM,2,"red",true);
         System.out.println(fan1);
         System.out.println(fan1.equals(fan2));
         
         //QuadraticEquation qe1 = new  QuadraticEquation(1,-2,1);
         // QuadraticEquation qe2 = new  QuadraticEquation(-1,9,2);
         // QuadraticEquation qe3= new QuadraticEquation(1,1,1);
         // System.out.println(qe1);
         // System.out.println(qe2.getA());
         // System.out.println(qe1.getRoot1());
         // System.out.println(qe2.getRoot1());
         // System.out.println(qe3.getRoot1());
    }
}
