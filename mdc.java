/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class mdc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application l
    int num1=180;
    int num2=48;
        System.out.println("El mcd de "+num1+", "+num2+" = "+ cMcd(num1, num2));
        String numeros = "123456";
        String[] numerosComoArray = numeros.split(",");
        for (int i = 0; i < numerosComoArray.length; i++) {
            System.out.print(numerosComoArray[i]+"-");
        }
    }
    public static int cMcd(int Dendo, int Dsor){
        if (Dsor == 0) {
            return Dendo;
        }else{
            int res=Dendo%Dsor;
            return cMcd(Dsor, res);
        }
    }
}
