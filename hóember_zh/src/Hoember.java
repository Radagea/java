/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Hoember implements Comparable<Hoember> {
    double alsó_cm;
    double közép_cm;
    double felső_cm;
    int össze_széndb;
    int széngombok;
    double répah;

    public Hoember(double alsó_cm, double közép_cm, double felső_cm, int össze_széndb, int széngombok, double répah) {
        this.alsó_cm = alsó_cm;
        this.közép_cm = közép_cm;
        this.felső_cm = felső_cm;
        this.össze_széndb = össze_széndb;
        this.széngombok = széngombok;
        this.répah = répah;
    }

    public double getRépah() {
        return répah;
    }
    
    public double getMagasság()
    {
    return this.alsó_cm+this.közép_cm+this.felső_cm;
    }
    
    public int getSzájhossz()
    {
    
    return this.össze_széndb-this.széngombok;
    }

    @Override
    public String toString() {
        return (int)this.getMagasság()+" "+(int)(this.getSzájhossz()-2)+" "+(int)this.répah;
    }

    @Override
    public int compareTo(Hoember t) {
        if(this.getMagasság()==t.getMagasság())
        {
           if(this.getSzájhossz()==t.getSzájhossz())
               return Double.compare(this.getRépah(), t.getRépah());
           else
               return (-1)*(this.getSzájhossz()-t.getSzájhossz());
           
        
        
        }else 
            return (-1)*Double.compare(this.getMagasság(), t.getMagasság());
    }
    
    
    
}