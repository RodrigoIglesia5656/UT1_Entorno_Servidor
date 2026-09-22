package edu.biblioteca;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ← ¡MAGIA! Activa autoconfiguración
public class BibliotecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotecaApplication.class, args);
        // ↑ Inicia el servidor Tomcat embebido
        // ↑ Escanea componentes (@Controller, @Service, @Repository)
        // ↑ Configura Spring automáticamente
    }
}
