/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PremierLeague;

import java.util.List;

/**
 *
 * @author Maty
 */
public class ClienteRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartidosAdmin prueba = new PartidosAdmin();
        String n;
        n= "C:\\Users\\marta\\Desktop\\tp3ED\\PremierLeague.csv" ;//ruta de acceso del archivo CSV
        prueba.leerCSV(n);
        prueba.listapartido();
        
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
     
        Equipo e = new Equipo();
        e.setNombre("Leeds");
        List<Partido> a = prueba.filtrarPorEquipo(e);
        prueba.Mostrar(a);
        prueba.fuerteDeLocal();    }
    
}
