/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Test {
        public static void main(String[] args) {
        Szerelvény szsz = new Szerelvény(3);
        Szerelvény szm = new MetróSzerelvény(4);
        MetróSzerelvény mm = new MetróSzerelvény(5);
        System.out.println("---------------------------------");
        System.out.println(szsz.összefűz(szm));
        System.out.println("---------------------------------");
        System.out.println(szm.összefűz(szm));
        System.out.println("---------------------------------");
        System.out.println(szm.összefűz(mm));
        System.out.println("---------------------------------");
        System.out.println(mm.összefűz(szm).összefűz(szsz));
        System.out.println("---------------------------------");

        szsz = mm;

        System.out.println(szsz.összefűz(new MetróSzerelvény(2)));
        
    }

}
