/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Cadenas_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 10; i++) {
            System.out.println(cadena(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(cadena(i));
        }
        int i=0;
        while(i != 10 ){
            if(i<1){
                System.out.println(cadena(i));
                i++;
            }
            else if(i==10) {
                System.out.println(cadena(i));
                i--;
            }  
        }

    }

    public static String cadena(int c) {
        if (c > 1) {
            
        } else {
           
        }
        return null;
    }

}
