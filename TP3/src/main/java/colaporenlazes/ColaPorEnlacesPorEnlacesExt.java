/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaporenlazes;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;

/**
 *
 * @author Maty
 * @param <T>
 */
public class ColaPorEnlacesPorEnlacesExt<T> extends ColaPorEnlaces<T> 
implements ColaPorEnlacesExtInterfaz<T>{
  
    @Override
    public ListaEnlazadaNoOrdenada<T> multiDequeue(int num) {
        ListaEnlazadaNoOrdenada<T> lista = new ListaEnlazadaNoOrdenada<> ();
        for(int i=0;i<num;i++){
           lista.removeFirst();
        }
        return lista;
    }

    @Override
    public void reemplazarTodos(T param1, T param2) {
        
    }

    @Override
    public int size() {
        int cantidad = 0;
        while(this.back.getSiguiente()!=null){
            cantidad=cantidad+1;
            this.back=this.back.getSiguiente();
        }
        return cantidad;
    }

    @Override
    public void exchange() {
      NodoLista<T> cambio = new NodoLista(null);
      NodoLista<T> cambio2 = new NodoLista(null);
      if(this.front.getSiguiente()== null){
         cambio.setElemento(this.front.getElemento()); 
      }else{
          while(this.front.getSiguiente()!=null){    
          this.front=this.front.getSiguiente();
          }
         cambio.setElemento(this.front.getElemento()); 
      }
     // NodoLista<T> ultimo = new NodoLista(null);
      //this.back.setSiguiente(ultimo);
      //this.back = back.getSiguiente();
     // cambio2=ultimo.getSiguiente();
      this.back.setSiguiente(cambio2);
      this.back = back.getSiguiente();
      
      while(this.front.getSiguiente()!=null){
       this.front=this.front.getSiguiente();   
      }
      this.front=cambio2;
      
    }
    
}
