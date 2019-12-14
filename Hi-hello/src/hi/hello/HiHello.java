/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hi.hello;

/**
 *
 * @author guest-kcyu2w
 */
public class HiHello {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Say a = new Say("Hello");
        Say b = new Say("Hi");
        Say c = new Say("ciao");       
        a.start();
        b.start();
        c.start();
    }
    
}