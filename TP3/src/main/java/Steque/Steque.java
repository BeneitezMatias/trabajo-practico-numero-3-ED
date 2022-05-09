/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Steque;

import listadoble.NodoListaDoble;

/**
 *
 * @author Maty
 * @param <T>
 */
public class Steque<T> implements StequeInterfaz<T>{

    protected NodoListaDoble<T> tope;

    @Override
    public boolean isEmpty() {
      return tope == null;    
    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return tope.getElemento();   
    }

    @Override
    public void enqueue(T elemento) {
        if (isEmpty()) {
            this.tope = new NodoListaDoble(elemento);   
        }while(this.tope.getSiguiente()!=null){
           this.tope=this.tope.getSiguiente();
        }
         NodoListaDoble<T> nuevoNodo = new NodoListaDoble(elemento);
         nuevoNodo.setSiguiente(tope);
         this.tope=nuevoNodo;
    }

    @Override
    public void pop() {
        this.tope = this.tope.getSiguiente();
    }

    @Override
    public void push(T elemento) {
        if (isEmpty()) {
            this.tope = new NodoListaDoble(elemento);
        } else {
            NodoListaDoble<T> nuevoNodo = new NodoListaDoble(elemento);
            nuevoNodo.setSiguiente(tope);
            this.tope = nuevoNodo;
        }    
    }

    @Override
    public void makeEmpty() {
       this.tope = null;
    }

    @Override
    public String toString(){
        String resultado = "";
        
        NodoListaDoble<T> nodoActual = tope;
        while(nodoActual != null){
            resultado += ", " + nodoActual.toString();
            nodoActual = nodoActual.getSiguiente();
        }
        if(resultado.length() > 0){
            resultado = resultado.substring(2);
        }
        
        return resultado;
    }
    
}
