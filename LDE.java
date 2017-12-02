/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class LDE {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        ListaDE lsdMilista = new ListaDE();
        lsdMilista.imprimirLista();
        lsdMilista.imprimirListaInversa();
        for (int i = 0; i < 10; i++) {
            lsdMilista.agregarNodo(new Nodo ((int)(Math.random() * 100 +1)));
        }
        lsdMilista.imprimirLista();
        System.out.println("");
        lsdMilista.imprimirListaInversa();
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

class ListaDE {

    private Nodo nIni;
    private Nodo nFini;

    public ListaDE() {
        nIni = null;
        nFini = null;
    }

    public ListaDE(Nodo nNodo) {
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
    public void imprimirLista(){
        if (nIni == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }
    public void imprimirListaInversa(){ //ARROJA LOS VALORES DE MANERA INVERSA
        Nodo nTemp = nFini;
        if (nIni == null) {
            System.out.println("Lista Vacia");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }
}
