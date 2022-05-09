/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PremierLeague;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Maty
 */
public class CSV{
    private String[] dato;
    private String linea;
    protected ArrayList<String> Lineas;
    protected ArrayList<Partido> ListaPartidos;
 
    public CSV(){
    this.Lineas= new ArrayList<>();
    this.ListaPartidos=new ArrayList();
    }

    public void leerCSV(String Nombre){
      FileReader fr;
       try {
           fr= new FileReader(Nombre);
           BufferedReader br= new BufferedReader(fr);
           while((linea=br.readLine())!=null){
             dato=linea.split(";");
             for(String d:dato) {
                Lineas.add(d);
             }
           }    
         } catch (FileNotFoundException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
     // Mostrar();
    }
    
    public void Mostrar(ArrayList a){
       for(int i=0;i<a.size() ;i++){
           System.out.println(a.get(i));
       } 
    }
    public void Mostrar(List a){
       for(int i=0;i<a.size() ;i++){
           System.out.println(a.get(i));
       } 
    }
   public ArrayList<Partido> listapartido(){
         
       for(int i=1;i<this.Lineas.size() ;i++){
         Partido p= new Partido();  
         String regex = ".*(\\d{2})[-/](\\d\\d)[-/](\\d\\d\\d\\d).*";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(this.Lineas.get(i));
         if(matcher.matches()){
           int año= Integer.valueOf(matcher.group(3));
           int mes=Integer.valueOf(matcher.group(2));
           int dia=Integer.valueOf(matcher.group(1));
           p.setFecha(LocalDate.of(año,mes,dia));
        }
         String regex2 =".{20}(([A-Z]{1}[a-z]+[ ]?){1,2}).*";
         Pattern pattern2 = Pattern.compile(regex2);
         Matcher matcher2 = pattern2.matcher(this.Lineas.get(i));
         if(matcher2.matches()){
             p.setEquipolocal(new Equipo(matcher2.group(1)));  
       }
         String regex3 =".*[([A-Z]{1}[a-z]+[ ]?){1,2}][,](([A-Z]{1}[a-z]+[ ]?){1,2}).*";
         Pattern pattern3 = Pattern.compile(regex3);
         Matcher matcher3 = pattern3.matcher(this.Lineas.get(i));
         if(matcher3.matches()){
            p.setEquipoVisitante(new Equipo(matcher3.group(1)));
         }
         String regex4 =".*[([A-Z]{1}[a-z]+[ ]?){1,2}][,](\\d{1,2})[,](\\d{1,2})[,](D|H|A)[,][\\d{1,2}][,][\\d{1,2}][,][D|H|A].*";
         Pattern pattern4 = Pattern.compile(regex4);
         Matcher matcher4 = pattern4.matcher(this.Lineas.get(i));
         if(matcher4.matches()){
           int gol=Integer.valueOf(matcher4.group(1));
           int gol2=Integer.valueOf(matcher4.group(2));
           p.setGolesdelLocal(gol);
           p.setGolesdelVisitante(gol2);
           p.setResultado(ResultadoEnum.valueOf(matcher4.group(3)));
         }
          ListaPartidos.add(p);
       }
       
     Mostrar(this.ListaPartidos);
     return ListaPartidos;
   }
}

