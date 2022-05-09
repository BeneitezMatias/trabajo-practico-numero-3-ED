/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listadoble;

import listadoble.IteradorListaDobleInterfaz;

/**
 *
 * @author Maty
 * @param <T>
 */
public interface ListaDobleInterfaz<T> {
  
 public boolean isEmpty();

 /** Devuelve la cantidad de elementos de la estructura.*/
public int size();

/** Devuelve el elemento ubicado en la posición indicada por index. */
public T get(int index);

/** Agrega un elemento al final de la lista. */
public void add(T element);

/** Quita un elemento de la lista. */
public void remove(T element);

/** Devuelve un iterador por sobre la estructura. */
public IteradorListaDobleInterfaz iterador();

/** Concatena todos los elementos de la estructura en un String. */
public String toString();  
    
}
