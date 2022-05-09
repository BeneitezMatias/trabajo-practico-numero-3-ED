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
public class ListaDoble<T> implements ListaDobleInterfaz<T> {
    protected NodoListaDoble<T> header;

    public ListaDoble(NodoListaDoble<T> header) {
        this.header = new NodoListaDoble(null);
    }

    ListaDoble() {
        
    }

    @Override
    public boolean isEmpty() {
    return this.header.siguiente == null;    
    }

    @Override
    public int size() {
   int tamaño = 0;
        NodoListaDoble<T> nodoActual = header.siguiente;
        while (nodoActual != null) {
            tamaño++;
            nodoActual = nodoActual.siguiente;
        }
        return tamaño;    
    }

    @Override
    public T get(int index) {
     if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Parámetro position es inválido. ");
        }
        NodoListaDoble<T> nodoActual = header.siguiente;
        for (int i = 0; i < index; i++) {
            nodoActual = nodoActual.siguiente;
        }
        return nodoActual.elemento;   
    }
    

    @Override
    public void add(T element) {
         NodoListaDoble<T> nuevoNodo = new NodoListaDoble(element);

        if (isEmpty()) {
            this.header.siguiente = nuevoNodo;
        } else {
           NodoListaDoble<T> nodoActual = header.siguiente;
        while (nodoActual.siguiente != null) {
            nodoActual.anterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }
        nuevoNodo.anterior=nodoActual;
        nodoActual.siguiente=nuevoNodo;  
    }
    }
    
    @Override
    public void remove(T element){
        NodoListaDoble<T> nodoActual=header.siguiente;
        while (nodoActual != null) {
        if (nodoActual.elemento.equals(element)) {
             nodoActual.anterior=nodoActual.siguiente;  
        }else{
              nodoActual.anterior = nodoActual;
              nodoActual = nodoActual.siguiente;   
            }
    }
    }
    
    @Override
    public IteradorListaDoble iterador() {
      IteradorListaDoble iterador= new IteradorListaDoble(this.header);
      return iterador;
    }
   
    @Override
   public String toString(){
        String resultado = "";
        if (isEmpty()) {
            return resultado;
        }
        NodoListaDoble<T> nodoActual = this.header.siguiente;
        while (nodoActual != null) {
            resultado += ", " + nodoActual.toString();
            nodoActual = nodoActual.siguiente;
        }
        return resultado.substring(2);
    }
}
