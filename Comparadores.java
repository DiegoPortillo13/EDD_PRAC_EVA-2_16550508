
import java.util.Comparator;
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
public class Comparadores {

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
        Comparator Comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String sCade1,sCade2;
                sCade1 = (String)o1;
                sCade2 = (String)o2;
                char c1, c2;
                c1=sCade1.charAt(0);
                c2=sCade2.charAt(0);
                return c1-c2;
            }
        };
        for (String string : llMilista) {
            System.out.println(string);
        }
    }
    
}
