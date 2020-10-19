/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Date;
/**
 *
 * @author Radagea
 */
public class Test {
    
    private static Pékség[]  adottPéksüti(String süti,KereskedelmiE [ ] k)
    {
       int db=0;
       
       for (int i=0;i<k.length;i++)
       {
            if(k[i] instanceof Pékség)
            {
               Pékség tmp=(Pékség)k[i];
               for (int j=0; j<tmp.getPéksütik().length;j++)
                   if(tmp.getPéksütik()[j].equals(süti))
                    {    db++;
                         break;
                           
                     }
            
            }
      }
    
       Pékség [ ] p=  new Pékség[db];
       int index=0;
       
       for (int i=0;i<k.length;i++)
       {
            if(k[i] instanceof Pékség)
            {
               Pékség tmp=(Pékség)k[i];
               for (int j=0; j<tmp.getPéksütik().length;j++)
                   if(tmp.getPéksütik()[j].equals(süti))
                    {    p[index++]=tmp;
                         break;
                           
                     }
            
            }
      }
    
     return p;
    
    }
    
    
    
    
    public static void main(String[] args) {
        
        KereskedelmiE []  k = new KereskedelmiE[] {
         new KereskedelmiE("Elso", "1-es",  new Date()),
         new NemzetiDohányBolt( new String [] {"Mallboro","Kent","Ronson"}, "Cig1", "2-es",  new Date()),
         new Pékség(new String[] {"Fánk", "Zsemle","Csiga-Kókuszos"}, "Aranycipó1","4-as", new Date()),
         new Pékség(new String[] {"Kenyér", "Pizza","Csiga-Kókuszos"}, "Aranycipó2","3-as", new Date()),
         new NemzetiDohányBolt( new String [] {"PallMall","Kent","Ronson","West"}, "Cig1", "6-es",  new Date()),
         new Pékség(new String[] {"Kifli", "Zsemle","Csiga-Kókuszos","Fánk"}, "Aranycipó3","5-as", new Date()),
        };
        
        System.out.println(Arrays.toString(adottPéksüti("Zsemle", k)));
        
        
    }
    
}