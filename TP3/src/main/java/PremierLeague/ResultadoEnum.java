/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PremierLeague;

/**
 *
 * @author Maty
 */
public enum ResultadoEnum {
    D("Empate"),
    A("VictoriaVisitante"),
    H("VictoriaLocal");
    
    private final String descripción;
    
    private ResultadoEnum(String descripción){
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "ResultadoEnum{" + "descripción=" + descripción + '}';
    }
}
