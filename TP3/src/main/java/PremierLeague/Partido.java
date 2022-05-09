/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PremierLeague;


import java.time.LocalDate;

/**
 *
 * @author Maty
 */
public class Partido{
    
    private LocalDate fecha;
    private Equipo equipolocal;
    private Equipo equipoVisitante;
    private int golesdelLocal;
    private int golesdelVisitante;
    private ResultadoEnum resultado;
    
    public Partido(){
      
    }

    public Partido(LocalDate fecha, Equipo equipolocal, Equipo equipoVisitante, int golesdelLocal, int golesdelVisitante, ResultadoEnum resultado) {
        this.fecha = fecha;
        this.equipolocal = equipolocal;
        this.equipoVisitante = equipoVisitante;
        this.golesdelLocal = golesdelLocal;
        this.golesdelVisitante = golesdelVisitante;
        this.resultado = resultado;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(Equipo equipolocal) {
        this.equipolocal = equipolocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesdelLocal() {
        return golesdelLocal;
    }

    public void setGolesdelLocal(int golesdelLocal) {
        this.golesdelLocal = golesdelLocal;
    }

    public int getGolesdelVisitante() {
        return golesdelVisitante;
    }

    public void setGolesdelVisitante(int golesdelVisitante) {
        this.golesdelVisitante = golesdelVisitante;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", equipolocal=" + equipolocal + ", equipoVisitante=" + equipoVisitante + ", golesdelLocal=" + golesdelLocal + ", golesdelVisitante=" + golesdelVisitante + ", resultado=" + resultado + '}';
    }
}
