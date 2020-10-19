
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Test4 {
    public static int hegyekSzáma(String kép)
    {
        int count=0;
        String findString="/\\";
        int firstIndex=0;
        
        while(firstIndex!=-1)
        {
         
             firstIndex=kép.indexOf(findString, firstIndex);
             if(firstIndex!=-1 )
             {
                count++;
                firstIndex=firstIndex+findString.length();
             }
        
        
        }
        
        
      return count;
        
    
    }
    
    private static void rendez(FényképezőGép t[]) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getFelvétel().length() == t[j].getFelvétel().length()) {
                     if(hegyekSzáma(t[i].getFelvétel())==hegyekSzáma(t[j].getFelvétel())) {
                        if(t[i].getTípus().compareTo(t[j].getTípus())>0)                
                        {
                        FényképezőGép tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                        }
                    } else if(hegyekSzáma(t[i].getFelvétel())<hegyekSzáma(t[j].getFelvétel()))
                    {
                    FényképezőGép tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    
                    }
                    

                } else if (t[i].getFelvétel().length() <t[j].getFelvétel().length()) {
                        FényképezőGép tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }

                
            }
        }

    }

    private static void kiir(FényképezőGép t[]) {

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        FényképezőGép[] t = new FényképezőGép[n];
        int i = 0;

        String sor = null;

        while (i < n) {

            sor = sc.nextLine();

            String[] tokens = sor.split(":");

            FényképezőGép h = new FényképezőGép(tokens[0], tokens[1]);
            t[i] = h;
            i++;
        }

        rendez(t);
        System.out.println("--------Kimenet--------------");
        kiir(t); 
    }
}
