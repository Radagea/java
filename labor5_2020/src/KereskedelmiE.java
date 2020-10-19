/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author Radagea
 */
public class KereskedelmiE {
    
    private String név;
    private String cím;
    private Date menyitás;

    public KereskedelmiE(String név, String cím, Date menyitás) {
        this.név = név;
        this.cím = cím;
        this.menyitás = menyitás;
    }

    public String getNév() {
        return név;
    }

    public String getCím() {
        return cím;
    }

    public Date getMenyitás() {
        return menyitás;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    @Override
    public String toString() {
        return this.név+": "+this.cím;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null  || !(obj instanceof KereskedelmiE))
        {
       return false;
        }
        
        return this.név.equals(((KereskedelmiE)obj).név);
    }
    
    
      
    
    
}