/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PremierLeague;

import java.util.Objects;

/**
 *
 * @author Maty
 */
class Equipo {
   private String Nombre;
   private int cantidaddeVictorias;
   private int cantidaddeEmpates;
   private int cantidaddeDerrotas;

    public int getCantidaddeVictorias() {
        return cantidaddeVictorias;
    }

    public void setCantidaddeVictorias(int cantidaddeVictorias) {
        this.cantidaddeVictorias = cantidaddeVictorias;
    }

    public int getCantidaddeEmpates() {
        return cantidaddeEmpates;
    }

    public void setCantidaddeEmpates(int cantidaddeEmpates) {
        this.cantidaddeEmpates = cantidaddeEmpates;
    }

    public int getCantidaddeDerrotas() {
        return cantidaddeDerrotas;
    }

    public void setCantidaddeDerrotas(int cantidaddeDerrotas) {
        this.cantidaddeDerrotas = cantidaddeDerrotas;
    }
   

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
    }

   public Equipo(){
       
   }
   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        return Objects.equals(this.Nombre, other.Nombre);
    }

    @Override
    public String toString() {
        return "Equipo{" + "Nombre=" + Nombre + '}';
    }
   
   
}
