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
public class NemzetiDohányBolt extends  KereskedelmiE{
    private String [] sigaterettak ;

    public NemzetiDohányBolt(String[] sigaterettak, String név, String cím, Date menyitás) {
        super(név, cím, menyitás);
        this.sigaterettak = sigaterettak;
    }

    public String[] getSigaterettak() {
        return sigaterettak;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.sigaterettak)+ "\n"+ super.getNév();
    }
    
    
    
}