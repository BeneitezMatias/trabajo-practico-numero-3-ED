/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package colaporenlazes;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

/**
 *
 * @author Maty
 * @param <T>
 */
public interface ColaPorEnlacesExtInterfaz<T> {
    
/** Elimina de la estructura el número de elementos especificado num*/
public ListaEnlazadaNoOrdenada<T> multiDequeue(int num);

/** Reemplaza todas las ocurrencias de param1 con param2 */
public void reemplazarTodos(T param1, T param2);

/** Devuelve la cantidad actual de elementos en la estructura. */
public int size();

/** Intercambia el elemento del frente con el último. */
public void exchange();
}
