package com.bogdan.alura.principal;

import com.bogdan.alura.modelos.EscribirArchivo;
import com.bogdan.alura.modelos.HTTPPeticion;
import com.bogdan.alura.modelos.PeliculaStarWars;
import com.bogdan.alura.modelos.ResponseMovieSW;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.desktop.PreferencesEvent;
import java.io.IOException;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Scanner scanner = new Scanner(System.in);
        List <PeliculaStarWars> peliculas = new ArrayList<>();
        EscribirArchivo escribeObjeto = new EscribirArchivo("peliculasSW.txt");
        menu(false);
    while(true) {
        try {
            System.out.println("Ingresa un número de película (1 a 6) o un número diferente para salir: ");
            var nPelicula = scanner.nextInt();
            if (nPelicula < 1 || nPelicula > 6) {
                break;
            }
            String direccion = "https://swapi.dev/api/films/" + nPelicula + "/";
            HTTPPeticion httpPeticion = new HTTPPeticion(direccion);
            var json = httpPeticion.getResponse().body();
            ResponseMovieSW responseMovieSW = gson.fromJson(json, ResponseMovieSW.class);
            PeliculaStarWars pelicula = new PeliculaStarWars(responseMovieSW);
            peliculas.add(pelicula);
        }catch (InputMismatchException e){
            System.out.println("No se ingresó un número entero");
            System.out.println(e.getMessage());
            scanner.nextLine(); //Limpia buffer
        } catch (NoSuchElementException e){
            System.out.println("No hay tokens disponibles");
            System.out.println(e.getMessage());
            scanner.nextLine(); //Limpia buffer
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
            scanner.nextLine(); //Limpia buffer
        }catch (NumberFormatException e){
            System.out.println("Ingresa una opción válida");
            System.out.println(e.getMessage());
            scanner.nextLine(); //Limpia buffer
        }catch (IOException e){
            System.out.println("Ocurrió un error al ingresar los datos");
            System.out.println(e.getMessage());
            scanner.nextLine(); //Limpia buffer
        }
        }
    escribeObjeto.escribe(gson,peliculas);
    System.out.println(peliculas);
    menu(true);
    }

    public static void menu(boolean finalMenu){
        if(finalMenu){
            System.out.println("***************************" +
                    "\nGracias por usar la aplicación\n" +
                    "***************************");
        }else {
            System.out.println("***************************" +
                    "\nBienvenido a la API de películas de StarWars\n" +
                    "***************************");
        }
    }
}
