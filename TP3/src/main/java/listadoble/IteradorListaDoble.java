/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Maty
 * @param <T>
 */
public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T>{
    private NodoListaDoble<T> nodoActual;

    public IteradorListaDoble(NodoListaDoble<T> header) {
        this.nodoActual = header;
    }

    @Override
    public boolean existeSiguiente() {
      return nodoActual.getSiguiente() != null;  
    }

    @Override
    public T siguiente() {
        T resultado = null;
        
        if(existeSiguiente()){
            nodoActual = nodoActual.getSiguiente();
            resultado = nodoActual.getElemento();
        }
        return resultado;
    }

    @Override
    public T primero() {
        T resultado= null;
        
        while(nodoActual.getAnterior()!=null){
          nodoActual= nodoActual.getAnterior();
        }
        resultado=nodoActual.getElemento();
        return resultado;
    }

    @Override
    public boolean existeAnterior() {
        return nodoActual.getAnterior()!= null;
    }

    @Override
    public T anterior() {
        T resultado = null;
        
        if(existeSiguiente()){
            nodoActual = nodoActual.getAnterior();
            resultado = nodoActual.getElemento();
        }
        return resultado;    
    }

    @Override
    public T ultimo() {
        T resultado= null;
        
        while(nodoActual.getSiguiente()!=null){
          nodoActual= nodoActual.getSiguiente();
        }
        resultado=nodoActual.getElemento();
        return resultado;
    }
    
}
