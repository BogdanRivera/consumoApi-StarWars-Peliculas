package com.bogdan.alura.modelos;

public class PeliculaStarWars {
    private String titulo;
    private int idTitulo;
    private String descripcion;
    private String director;
    private String productor;
    private String fechaDeLanzamiento;


    public PeliculaStarWars(ResponseMovieSW responseMovieSW) {
        this.titulo = responseMovieSW.title();
        this.idTitulo = responseMovieSW.episode_id();
        this.descripcion = responseMovieSW.opening_crawl();
        this.director = responseMovieSW.director();
        this.productor = responseMovieSW.producer();
        this.fechaDeLanzamiento = responseMovieSW.release_date();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDirector() {
        return director;
    }

    public String getProductor() {
        return productor;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    @Override
    public String toString() {
        return "Pelicula (" +
                "titulo= " + titulo + "\n"+
                ", idTitulo= " + idTitulo + "\n" +
                ", descripcion= " + descripcion + "\n"+
                ", director= " + director + "\n" +
                ", productor= " + productor + "\n" +
                ", fechaDeLanzamiento='" + fechaDeLanzamiento + "\n"+
                ')';
    }
}
