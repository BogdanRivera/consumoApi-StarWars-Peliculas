package com.bogdan.alura.modelos;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirArchivo {
    private FileWriter escritura;

    public EscribirArchivo(String archivo) throws IOException {
        this.escritura = new FileWriter(archivo);
    }

    public void escribe(Gson gson, List<PeliculaStarWars> peliculaStarWarsList){
        try{
            escritura.write(gson.toJson(peliculaStarWarsList));
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

