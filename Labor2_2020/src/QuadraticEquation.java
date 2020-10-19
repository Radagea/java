/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Ezaz osztály a valós világbeli másodfokú egyenleteket kívánja modellezni
 * Megadja az egyenlet diszkriminánsát, gyökeit és sztring reprezentációját
 * @author Radagea
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }
    
    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /** 
     * Ide jön a metódus leírása, hogy mit is csinál:
     * A metódus vissza adja a másodfokú egyenlet diszkriminánsát, azaz b^-4ac
     * Ezt még lehet tovább folytatni, egy két mondat azért elé'g
     * @return - A másodfoku egyenlet diszkriminánsa (b)
     */
    
    public double getDiscriminant() {
        
        return this.b*this.b - 4 * this.a*this.c;
    }
    /**
     * Leírás:
     * Vissza adja a másodfokú egyenlet egyik gyökét, ha a diszkrimináns nem negatív
     * Ha a diszkrimináns negatív egy üzenetet ír ki és visszaad egy 0 értéket is
     * @return - A másodfokú egyenlet első gyöke -b + sqrt(diszkrimináns)/2a
     */
    public double getRoot1(){
        if(this.getDiscriminant()<0) {
            System.out.println("Negatív diszkrimináns, nincs valós gyöke");
            return 0;
        } else {
            return (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
        }
    }
    
    public double getRoot2(){
         return (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }

    @Override
    public String toString() {
        return "QuadraticEquation = " + this.a+"x^2+"+this.b+"x+"+this.c;
    }
    
    
    
}
