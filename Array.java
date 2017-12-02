/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiData[] = new int[3];
        aiData[0]=10;
        aiData[1]=20;
        aiData[2]=30;
        for (int i : aiData) {
            System.out.print(i);
        }
        
        System.out.println("");
        int aiCopy[] = new int[3];
        for (int i = 0; i < aiData.length; i++) {
            aiCopy[i]=aiData[i];
        }
        aiData = new int[4];
        for (int i = 0; i < aiCopy.length; i++) {
            aiData[i]=aiCopy[i];
        }
        for (int i : aiCopy) {
            System.out.print(i);
        }
    }
    
}
