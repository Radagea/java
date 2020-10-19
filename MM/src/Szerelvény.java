/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Szerelvény {
    protected int kocsikSzáma;
    protected boolean földAlatti;

    public Szerelvény(int kocsikSzáma) {
        this(kocsikSzáma, false);
    }

    public Szerelvény(int kocsikSzáma, boolean földAlatti) {
        this.kocsikSzáma = kocsikSzáma;
        this.földAlatti = földAlatti;
        System.out.println("Új szerelvény: " + this);
    }

    @Override
    public String toString() {
        return "szerelvény (" + kocsikSzáma + " kocsi, " + (földAlatti ? "földalatti" : "felszíni") + ")";
    }

    public Szerelvény összefűz(Szerelvény sz) {
        boolean b = földAlatti && sz.földAlatti;
        System.out.println("Sz + Sz: " + this + " + " + sz);
        return new Szerelvény(kocsikSzáma + sz.kocsikSzáma, b);
    }
}
