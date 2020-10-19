/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class MetróSzerelvény extends Szerelvény {
    public MetróSzerelvény(int kocsikSzáma) {
        super(kocsikSzáma, true);
        System.out.println("Új metrószerelvény: " + this);
    }

    @Override
    public String toString() {
        return "metró (" + kocsikSzáma + " kocsi, " + (földAlatti ? "földalatti" : "felszíni") + ")";
    }

    @Override
    public Szerelvény összefűz(Szerelvény sz) {
        System.out.println("M + Sz: " + this + " + " + sz);
        return new Szerelvény(kocsikSzáma + sz.kocsikSzáma, sz.földAlatti);
    }

    public MetróSzerelvény összefűz(MetróSzerelvény m) {
        System.out.println("M + M: " + this + " + " + m);
        return new MetróSzerelvény(kocsikSzáma + m.kocsikSzáma);
    }
}
