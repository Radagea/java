
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tibaa
 */
public class Test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double c=0;
        double [] d = new double[100];
        int i=0;
        while ((c=sc.nextDouble())!=0)
        {
        
        double f=(9.0/5)*c+32;
            d[i]=f;
            i++;      
        
        }
        for(int j=0; j<i;j++)
            System.out.println(d[j]);   
        
    }
    
    
}
