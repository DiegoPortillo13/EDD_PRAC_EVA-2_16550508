
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Stc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Double> sMipila = new Stack();
        sMipila.push(20.0);
        sMipila.push(25.0);
        sMipila.push(30.0);
        sMipila.push(35.0);
        sMipila.push(40.0);
        sMipila.push(45.0);
        System.out.println(sMipila.pop());
        System.out.println(sMipila.pop());
        System.out.println(sMipila.peek());
    }
    
}
