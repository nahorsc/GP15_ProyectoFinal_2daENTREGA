/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


public class Pelicula {
   
    private int id_pelicula; 
    private String titulo;   
    private String director; 
    private String actores;  
    private String origen;   
    private String genero;   
    private Date estreno;    
    private boolean en_cartelera;

    public Pelicula() {
    }

    
    public Pelicula(int id_pelicula, String titulo, String director, String actores, String origen, String genero, Date estreno, boolean en_cartelera) {
        this.id_pelicula = id_pelicula;
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.origen = origen;
        this.genero = genero;
        this.estreno = estreno;
        this.en_cartelera = en_cartelera;
    }

    public int getIdPelicula() {
        return id_pelicula;
    }

    public void setIdPelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getEstreno() {
        return estreno;
    }

    public void setEstreno(Date estreno) {
        this.estreno = estreno;
    }

    public boolean isEnCartelera() {
        return en_cartelera;
    }

    public void setEnCartelera(boolean en_cartelera) {
        this.en_cartelera = en_cartelera;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id_pelicula=" + id_pelicula + ", titulo=" + titulo + ", director=" + director + ", actores=" + actores + ", origen=" + origen + ", genero=" + genero + ", estreno=" + estreno + ", en_cartelera=" + en_cartelera + '}';
    }
            
      
            
}