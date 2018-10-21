/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silabario;

import controllers.Controller;

/**
 *
 * @author Kyozuke
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Hiragana unaSilaba = new Hiragana();
        //System.out.println("una silaba al asar: "+unaSilaba.DameSilaba(44));
        
        Controller unControl = new Controller();
        unControl.Run();
    }
    
}
