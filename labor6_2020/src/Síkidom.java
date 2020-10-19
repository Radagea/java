/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public abstract class Síkidom {    
    
    private boolean tükörszimetrikus;

    public Síkidom(boolean tükörszimetrikus) {
        this.tükörszimetrikus = tükörszimetrikus;
    }

    public boolean isTükörszimetrikus() {
        return tükörszimetrikus;
    }
    
    public abstract double kerület();
    public abstract double terület();
            
    
    
}
