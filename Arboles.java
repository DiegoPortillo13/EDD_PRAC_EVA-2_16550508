
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
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trees myTree = new Trees(new Nodo(100));
        
        try {
            myTree.agregarNodo(myTree.getRoot(),new Nodo(90));
            myTree.agregarNodo(myTree.getRoot(),new Nodo(110));
            myTree.agregarNodo(myTree.getRoot(),new Nodo(120));
            myTree.agregarNodo(myTree.getRoot(),new Nodo(150));
            myTree.preOrder();
            System.out.println(" ");
            myTree.postOrder();
            System.out.println(" ");
            myTree.inOrder();
        } catch (Exception ex) {
            Logger.getLogger(Arboles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}


class Nodo{
    private int Val;
    private Nodo izq;
    private Nodo der;

    public Nodo(int Val) {
        this.Val = Val;
        this.izq = null;
        this.der = null;
    }

    public Nodo() {
        this.Val = 0;
        this.izq = null;
        this.der = null;
    }

    public int getVal() {
        return Val;
    }

    public void setVal(int Val) {
        this.Val = Val;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}
class Trees{
    private Nodo Root;
    public Trees(){
        Root = null;
    }
    public Trees(Nodo nodo){
        Root = nodo;
    }

    public Nodo getRoot() {
        return Root;
    }
    public void agregarNodo(Nodo act, Nodo nodo) throws Exception{
        if (Root == null) {//Esta vacia
            Root = nodo;
        }
        else {//No esta vacia
            if (nodo.getVal()<act.getVal()) {//Menores
                if (act.getIzq()==null) {//Aqui va
                    act.setIzq(nodo);
                }else{
                    agregarNodo(act.getIzq(),nodo);//Llamada recursiva
                }
            }
            else if (nodo.getVal()>act.getVal()) {//Mayores
                if (act.getDer()==null) {//Aqui va
                    act.setDer(nodo);
                }else{
                    agregarNodo(act.getDer(),nodo);//Llamada recursiva
                }                
            }
            else{//Iguales
                throw new Exception("No puede haber valores repetidos");
            }
        }
    }
       public void preOrder(){
        pOT(Root);
    }
    
    private void pOT(Nodo act){
        if(act != null){
            System.out.print(act.getVal() + " - ");  //LEEMOS EL NODO ACTUAL
            pOT(act.getIzq());         //RECORREMOS EL LADO IZQUIERDO
            pOT(act.getDer());        //RECORREMOS EL LADO DERECHO
        }
    }
    
    public void postOrder (){
        pOR(Root);
    }
    
    private void pOR(Nodo act){
        if(act != null){
            pOT(act.getIzq());
            System.out.print(act.getVal() + " - ");
            pOT(act.getDer());
        }
    }
    public void inOrder (){
        iOR(Root);
    }
    
    private void iOR(Nodo nActual){
        if(nActual != null){
            pOT(nActual.getIzq());
            pOT(nActual.getDer());
            System.out.print(nActual.getVal() + " - ");
        }
    }
}