
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> llMilista = new LinkedList();
        llMilista.add("Hola");
        llMilista.add(" ");
        llMilista.add("Mundo");
        llMilista.add(" ");
        llMilista.add("Cruel");
        llMilista.add(" ");
        llMilista.add("COLLECTIONS!!");
        for (String llMilista1 : llMilista) {
            System.out.print(llMilista1);
        }
        System.out.println("");
        System.out.println("");
        
        Collections.sort(llMilista);
        for (String llMilista1 : llMilista) {
            System.out.print(llMilista1);
        }
    }
}
