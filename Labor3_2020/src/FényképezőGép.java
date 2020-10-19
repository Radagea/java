/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tibaa
 */
public class FényképezőGép {
    
    private String típus;
    private String felvétel;

    public FényképezőGép(String típus, String felvétel) {
        this.típus = típus;
        this.felvétel = felvétel;
    }

    public String getTípus() {
        return típus;
    }

    public String getFelvétel() {
        return felvétel;
    }

    @Override
    public String toString() {
        return     this.típus;
    }
    
    
    
    
}
