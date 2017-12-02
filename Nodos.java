/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nodo obj1 = new nodo(100);
        nodo obj2 = new nodo(200);
        nodo obj3 = new nodo(300);
        //enlazar objs
        obj1.sig = obj2;
        obj2.sig = obj3;
        //imprimir
        nodo temp=obj1;
        while(temp != null){
            System.out.print(temp.ival+ " ");
            temp = temp.sig;
        }
    }

}

class nodo {

    int ival;
    nodo sig;

    public nodo() {
        ival = 0;
        sig = null;
    }

    public nodo(int inum) {
        ival = inum;
        sig = null;
    }
}
