/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

/**
 *
 * @author Maty
 */
public class ClienteListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble<Integer> a;
        a = new ListaDoble<>();
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(5);
        
        System.out.println("lista"+a);
        
        System.out.print(a.get(2));
        
        
        
    }
    
}
