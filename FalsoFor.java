/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class FalsoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsofor(5);
        falsofori(5, 1);
    }
    public static void falsofor(int valor){
        System.out.print(valor+" - ");
        if(valor > 0)
            falsofor(valor-1);
    }
    public static void falsofori(int f, int s){
        System.out.print(s+" - ");
        if (s < f) 
            falsofori(f, s);
        
    }
    
}
