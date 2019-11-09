package hi.hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarra.francesco
 */
public class Say extends  Thread{
    String cosaDire;
    
    public Say ( String parola){
        this.cosaDire=parola;
    }
   public void run(){
       System.out.println(cosaDire);
   }
}
