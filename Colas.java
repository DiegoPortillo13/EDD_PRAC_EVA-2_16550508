/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue qMilistaDeSuper = new Queue();
        for (int i = 0; i < 10; i++) {
            int iNum = (int) (Math.random() * 100) + 1;
            System.out.print(iNum + " - ");
            qMilistaDeSuper.agregarNodo(new Nodo(iNum));
        }
        System.out.println("");
        System.out.println(qMilistaDeSuper.leerPrimerNodo());
        System.out.println(qMilistaDeSuper.removerPrimerNodo());
        System.out.println(qMilistaDeSuper.removerPrimerNodo());
        System.out.println(qMilistaDeSuper.removerPrimerNodo());
    }
}

class Nodo {

    private int iVal;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo(int iNum) {
        iVal = iNum;
        nSig = null;
        nPrev = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

}

class Queue {

    private Nodo nIni;
    private Nodo nFini;

    public Queue() {
        nIni = null;
        nFini = null;
    }

    public Queue(Nodo nNodo) {
        nIni = nNodo;
        nFini = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) { //CUANDO LA LISTA ESTE VACIA
            nIni = nNodo;   //NUESTRO NUEVO ES EL PRIMERO
            nFini = nNodo;  //Y EL ULTIMO
        } else {
            nFini.setnSig(nNodo);    //AGRAGAMOS EL NUEVO NODO AL FINAL DE LA LISTA
            nNodo.setnPrev(nFini);   //NODO PREVIO
            nFini = nNodo;
            //nFini.getnSig(); // ESTO TAMBIEN ES VALIDO
        }
    }

    public int leerPrimerNodo() {
        if (nIni == null) {  //LISTA VACIA
            //LANZAR UNA EXCEPTION
            return 0;  //ALAMACENAMOS ENTEROS, EL CERO ES UN ENTERO VALIDO
        } else {
            return nIni.getiVal();
        }
    }

    public int removerPrimerNodo() {
        if (nIni == null) {  //LISTA VACIA
            //LANZAR UNA EXCEPTION
            return 0;  //ALAMACENAMOS ENTEROS, EL CERO ES UN ENTERO VALIDO
        } else {
            int iVal = nIni.getiVal();
            //LEER Y BORRAR
            //DOS CASOS ---> CUANDO HAY UN NODO
            if (nIni.getnSig() == null) {
                nIni = null;
                nFini = null;
            } else {
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            }
            return iVal;
        }
    }
}
