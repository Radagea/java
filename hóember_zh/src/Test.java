/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Radagea
 */
public class Test {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    Hoember [] h= new Hoember[n];
    int i=0;
    while(i<n)
    {
        String [] sor =sc.nextLine().split(";");
        h[i]= new Hoember(Double.parseDouble(sor[0]), Double.parseDouble(sor[1]), Double.parseDouble(sor[2]), Integer.parseInt(sor[3]), Integer.parseInt(sor[4]), Double.parseDouble(sor[5]));
        
        i++;
    }
        Arrays.sort(h);
        
        for (Hoember j :h)
            System.out.println(j);
        
        
        
        
    
    }
   
    
}