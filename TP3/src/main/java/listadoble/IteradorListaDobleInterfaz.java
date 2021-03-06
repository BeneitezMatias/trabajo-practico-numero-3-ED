/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listadoble;

/**
 *
 * @author Maty
 * @param <T>
 */
public interface IteradorListaDobleInterfaz<T> {
  
    /** Indica si existe un nodo a continuación del actual. */
public boolean existeSiguiente();

/** Sigue el enlace al nodo siguiente y devuelve el elemento del mismo. */
public T siguiente();

/** Se mueve al nodo primer nodo y devuelve su valor. */
public T primero();

/** Indica si existe un nodo a previo al actual. */
public boolean existeAnterior();

/** Sigue el enlace al nodo anterior y devuelve el elemento del mismo. */
public T anterior();

/** Se mueve al nodo último nodo y devuelve su valor. */
public T ultimo();  
}
