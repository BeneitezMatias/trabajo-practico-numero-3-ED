/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PremierLeague;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Maty
 */
public class PartidosAdmin extends CSV{
 
//: Devuelve todos lospartidos de un equipo.
    /**
     *
     * @param equipo
     * @return
     */
public List<Partido> filtrarPorEquipo(Equipo equipo){
List<Partido> resultado= new ArrayList();

for (Partido partido : this.ListaPartidos) {
        if(equipo.getNombre().equals(partido.getEquipolocal().getNombre())){
            resultado.add(partido);
        }
        if(equipo.getNombre().equals(partido.getEquipoVisitante().getNombre())){
            resultado.add(partido);
        }
    }
return resultado; 
}       

//: Devuelve el equipo que más ganó de local.
public Equipo fuerteDeLocal(){
Equipo masganador = new Equipo();    
return masganador;
}
// Devuelve el equipo que más goles recibió.
public Equipo problemasDefensivos(){
Equipo e = new Equipo(); 
return e;  
}

//: Devuelve el equipo que más empató.
public Equipo deportivoEmpate(){
Equipo e = new Equipo();    
return e;
}

//Devuelve en orden descendente los equipos junto con su puntaje.   
public List<EquipoPuntaje> tablaDePosiciones(){
List<EquipoPuntaje> resultado=new ArrayList();
return resultado;
}

}
