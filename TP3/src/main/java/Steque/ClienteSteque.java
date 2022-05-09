/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Steque;

/**
 *
 * @author Maty
 */
public class ClienteSteque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Steque<Integer> pila=new Steque<>();
        pila.push(2);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        
        System.out.println("pila"+pila);
        
        pila.enqueue(8);
        System.out.println("pila"+pila);
        
        pila.pop();
        System.out.println("pila"+pila);
        
        System.out.println(pila.toString());
        
        System.out.println(pila.top());
        
        pila.makeEmpty();
        
        System.out.println("pila"+pila);
        
        
    }
    
}
