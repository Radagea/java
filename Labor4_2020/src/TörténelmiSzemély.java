/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class TörténelmiSzemély {
    private String név;
    private int szülÉv;

    public TörténelmiSzemély(String név, int szülÉv) {
        this.név = név;
        this.szülÉv = szülÉv;
    }

    public String getNév() {
        return név;
    }

    public int getSzülÉv() {
        return szülÉv;
    }

    @Override
    public String toString() {
        return this.név+" ("+this.szülÉv+")";
    }
}
