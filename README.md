# Descripción

Este repositorio contiene un proyecto Java que interactúa con la API de Star Wars (SWAPI) para obtener información sobre las películas de la saga. El proyecto utiliza la biblioteca Gson de Google para manejar datos JSON y realizar operaciones de escritura en archivos.

## Archivos del Proyecto

- **Principal.java**: Contiene la clase principal del proyecto, que solicita al usuario un número de película y obtiene información sobre ella desde la API de Star Wars. Luego guarda los datos en una lista y los escribe en un archivo de texto.
- **EscribirArchivo.java**: Define una clase para escribir objetos en archivos de texto.
- **HTTPPeticion.java**: Define una clase para realizar solicitudes HTTP utilizando la API HttpClient de Java.
- **PeliculaStarWars.java**: Define una clase que representa una película de Star Wars.
- **ResponseMovieSW.java**: Define un registro (record) para mapear la respuesta JSON de la API de Star Wars a objetos Java.

## Uso

Para ejecutar el proyecto:

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java preferido.
3. Ejecuta el archivo `Principal.java`.
4. Sigue las instrucciones en la consola para interactuar con la aplicación.

## Requisitos

- Java Development Kit (JDK) instalado en tu sistema.
- Conexión a Internet para acceder a la API de Star Wars.

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor, envía un pull request.
