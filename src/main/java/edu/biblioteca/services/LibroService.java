package edu.biblioteca.services;

import edu.biblioteca.model.Libro;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service  // ← Marca esta clase como servicio Spring
public class LibroService {

    // Por ahora usamos una lista en memoria (luego será base de datos)
    private List<Libro> libros = new ArrayList<>();

    public LibroService() {
        // Datos iniciales de prueba
        libros.add(new Libro(1L, "Clean Code", "Robert C. Martin", "978-0132350884", true));
        libros.add(new Libro(2L, "Effective Java", "Joshua Bloch", "978-0134685991", true));
        libros.add(new Libro(3L, "Spring in Action", "Craig Walls", "978-1617294945", false));
    }

    // Obtener todos los libros
    public List<Libro> obtenerTodos() {
        return new ArrayList<>(libros);
    }

    // Buscar libro por ID
    public Libro buscarPorId(Long id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Agregar nuevo libro
    public Libro agregarLibro(Libro libro) {
        libro.setId((long) (libros.size() + 1));
        libros.add(libro);
        return libro;
    }
}