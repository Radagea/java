/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Kör  extends Síkidom implements Rendezhető,Hasonlítható<Kör>,Comparable<Kör> {
    private double radius;

    public Kör(double radius, boolean tükörszimetrikus) {
        super(tükörszimetrikus);
        this.radius = radius;
    }

    @Override
    public double kerület() {
      return 2*Math.PI*this.radius;
    }

    @Override
    public double terület() {
      return Rendezhető.PI*this.radius*this.radius;
    }

    @Override
    public boolean Egyenlő(Object o) {
        if (o== null  || !(o instanceof Kör ))
            return false;
        Kör tmp =(Kör) o;
        return this.radius== tmp.getRadius();
             
    }

    @Override
    public boolean Kisebb(Object o) {
    if (o== null  || !(o instanceof Kör ))
            return false;
        Kör tmp =(Kör) o;
        return this.radius < tmp.getRadius();
        
    }

    @Override
    public boolean Nagyobb(Object o) {
    if (o== null  || !(o instanceof Kör ))
            return false;
        Kör tmp =(Kör) o;
        return this.radius < tmp.getRadius();
    }

    @Override
    public int compareTo(Kör o) {
       
       if (this.radius==o.getRadius())
           return 0;
       else if(this.radius>o.getRadius())
           return 10;
       else 
           return -100;
        
    }

    public double getRadius() {
        return radius;
    }
    
    
    
}