
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
public class Test2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TörténelmiSzemély [] t = new TörténelmiSzemély[20];
        
        String n=null;
        int e = 0;
        int i=0;
        while ((e=sc.nextInt())!=0)
        {
           n= sc.next();
           
           TörténelmiSzemély sz = new TörténelmiSzemély(n, e);
           t[i]=sz;
           i++;
        }
        
        TörténelmiSzemély min=t[0];
        
        for(int j=0;j<i;j++)
            if(t[j].getSzülÉv()<min.getSzülÉv())
                    min=t[j];
        
        System.out.println(min);
        
        
        
       
        
    }
    
}
