/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Maty
 */
public class NodoListaDoble<T> {
    protected T elemento;
    protected NodoListaDoble<T> siguiente;
    protected NodoListaDoble<T> anterior;

    public NodoListaDoble(T elemento) {
        this.elemento = elemento;
    }

    public NodoListaDoble(T elemento, NodoListaDoble<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoListaDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NodoListaDoble{" + "elemento=" + elemento + ", siguiente=" + siguiente + ", anterior=" + anterior + '}';
    }
    
    
}
