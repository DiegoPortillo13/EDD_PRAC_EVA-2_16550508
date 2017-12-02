
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class LE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //System.out.println("Escriba la posicion del Nodo que desea");
        //Scanner sCap = new Scanner(System.in);
        //int posi = sCap.nextInt();
        Lista lstMiLista = new Lista();
        lstMiLista.imprimirLista();
        lstMiLista.agregarNodo(new Nodo(100));
        System.out.println("");
        lstMiLista.imprimirLista();
        lstMiLista.agregarNodo(new Nodo(200));
        System.out.println("");
        lstMiLista.imprimirLista();
        lstMiLista.agregarNodo(new Nodo(300));
        System.out.println("");
        lstMiLista.imprimirLista();

        System.out.println(""); //VACIAR LA LISTA
        lstMiLista.vaciarLista();
        System.out.println("");
        lstMiLista.imprimirLista();

        for (int i = 0; i < 10; i++) {
            lstMiLista.agregarNodo(new Nodo((int) (Math.random() * 1000) + 1));
        }
        System.out.println("");
        System.out.println("La lista tiene " + lstMiLista.contarNodos() + " NODOS"); //IMPRIME EL NUMERO DE NODOS

        //System.out.println("");
        //lstMiLista.valorN(posi);
        //lstMiLista.imprimirLista();
        System.out.println("");

        try {
            System.out.println("El valor en la posicion 5 es " + lstMiLista.valorN(5));
        } catch (Exception ex) {
            Logger.getLogger(LE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        lstMiLista.insertarEn(0, new Nodo(666));
        System.out.println("Inicio de la lista");
        lstMiLista.imprimirLista();
        System.out.println("");

        System.out.println("");
        lstMiLista.insertarEn(lstMiLista.contarNodos(), new Nodo(999));
        System.out.println("Fin de la lista");
        lstMiLista.imprimirLista();
        System.out.println("");
        
        System.out.println("");
        lstMiLista.insertarEn(7, new Nodo (400000));
        System.out.println("En cierta posicion de la lista...");
        lstMiLista.imprimirLista();
    }

}
//CLASE NODO

class Nodo {

    private int iVal;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nSig = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nSig = null;
    }

    public Nodo(int iNum, Nodo nNodo) {
        iVal = iNum;
        nSig = nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }                                       //ESTE GET Y SET NO SON NECESARIOS

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}
//CLASE LISTA

class Lista {

    private Nodo nIni;
    private Nodo nFini;

    public Lista() {
        nIni = null;
        nFini = null;
    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFini = nNodo;
    }

    /*public void agregarNodo(Nodo nNodo) {    //AGREGAR AL FINAL - EVITARLO A TODA COSTA 
     if (nIni == null) {
     nIni = nNodo; //LISTA VACIA
     } else {
     Nodo nTemp = nIni;
     while (nTemp.getnSig() != null) {
     nTemp = nTemp.getnSig();
     }
     nTemp.setnSig(nNodo);
     }
     }*/
    public void agregarNodo(Nodo nNodo) {     //INSERTAN TODO AL FINAL - EL BUENO
        if (nIni == null) { //CUANDO LA LISTA ESTE VACIA
            nIni = nNodo;   //NUESTRO NUEVO ES EL PRIMERO
            nFini = nNodo;  //Y EL ULTIMO
        } else {
            nFini.setnSig(nNodo); //AGRAGAMOS EL NUEVO NODO AL FINAL DE LA LISTA
            nFini = nNodo;
            //nFini.getnSig(); // ESTO TAMBIEN ES VALIDO
        }
    }

    public void imprimirLista() {
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

    public void vaciarLista() {
        nIni = null;
    }

    public int contarNodos() {   //FUERZA BRUTA PARA UN CONTEO
        int cont;               //CADA VEZ QUE SE AGREGUE O ELIMINEN NODOS
        if (nIni == null) {
            cont = 0;
        } else {
            cont = 0;
            Nodo nTemp = nIni;
            while (nTemp != null) {
                cont++;
                nTemp = nTemp.getnSig();
            }
        }
        return cont;
    }

    public int valorN(int iPos) throws Exception {    //DE LA POSICION 0 (PRIMER NODO) HASTA N - 1
        //N --> TAMAÑO DEL  ARREGLO
        if ((iPos < 0) || (iPos >= contarNodos())) {
            throw new Exception("Valores erroneos, la posiciontiene que ser mayor a 0 "
                    + "y menor al tamaño de la lista");
        }
        int iCont = 0;
        int iVal = 0;

        Nodo nTemp = nIni;
        while (iCont < iPos) {  //MOVERNOS ENTRE LA LISTA
            nTemp = nTemp.getnSig();
            iCont++;
        }
        iVal = nTemp.getiVal();     //nTemp ES EL NODO EN LA POSICION SOLICITADA
        return iVal;
    }

    public void insertarEn(int iPos, Nodo nNodo) {
        //FALTA VALIDAR
        if (iPos == 0) //INSERTAR AL INICIO DE LA LISTA
        {
            nNodo.setnSig(nIni);    //CONECTAMOS AL PRIMER NODO DE LA LISTA
            nIni = nNodo;
        } else if (iPos == contarNodos()) {   //AGREGAR AL FINAL DE LA LISTA
            agregarNodo(nNodo);
        } else {
            int iCont = 0;
            Nodo nTemp = nIni;
            while (iCont < (iPos - 1)) {  //MOVERNOS ENTRE LA LISTA
                nTemp = nTemp.getnSig();
                iCont++;
            }
            nNodo.setnSig(nTemp.getnSig()); //CONECTAMOS CON EL SEGUNDO NODO
            nTemp.setnSig(nNodo);
        }
    }
}
