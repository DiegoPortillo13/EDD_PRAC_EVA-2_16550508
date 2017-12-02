/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        System.out.println("valor factorial de  5 "  + fac(-3));
    }
    public static int fac(int facto) {
       /* if(facto < 0)
            throw new Exception("No es valido");*/
        if(facto == 0)
            return 1;
        else
            return facto * fac( facto - 1);}
    }

