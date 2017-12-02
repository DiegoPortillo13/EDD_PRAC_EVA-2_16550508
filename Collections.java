
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> alMirragloLista = new ArrayList();
        alMirragloLista.add((int) (Math.random() * 100 + 1));
        alMirragloLista.add((int) (Math.random() * 100 + 1));
        alMirragloLista.add((int) (Math.random() * 100 + 1));
        alMirragloLista.add((int) (Math.random() * 100 + 1));
        alMirragloLista.add((int) (Math.random() * 100 + 1));
        //alMirragloLista.add(4, 995);
        for (Integer alMirragloLista1 : alMirragloLista) {
            System.out.print(alMirragloLista1 + " - ");
        }
        alMirragloLista.add(2, 666);
        System.out.println("");
        System.out.println("");
        for (Integer alMirragloLista1 : alMirragloLista) {
            System.out.print(alMirragloLista1 + " - ");
        }
            //FUNCION MAMALONA PARA RECORRER EL ARREGLO
        System.out.println("Reccorrido usando el Iterador");
        Iterator itRecorreArray;
        itRecorreArray = alMirragloLista.iterator();
        while(itRecorreArray.hasNext()){
            System.out.print(itRecorreArray.next() + " - ");
            
        }
        
        /*Nodo <Double> nNodo = new Nodo(100);
        System.out.println(nNodo.getValor());      //FALTA UN GET
        nNodo.setValor(Double.NaN);                        //FALTA UN SET*/
    }
    
}

class Nodo <T>{
    private T valor;
    public Nodo(T nuevoValor){
        valor = nuevoValor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}