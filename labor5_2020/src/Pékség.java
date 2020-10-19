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
public class Pékség extends KereskedelmiE{
    
    private String [] péksütik;

    public Pékség(String[] péksütik, String név, String cím, Date menyitás) {
        super(név, cím, menyitás);
        this.péksütik = péksütik;
    }

    public String[] getPéksütik() {
        return péksütik;
    }

    @Override
    public String toString() {
       
        return super.toString()+"\n A péksütik:"+Arrays.toString(this.péksütik);
        
    }
}
    