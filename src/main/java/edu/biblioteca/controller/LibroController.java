package edu.biblioteca.controller;

import edu.biblioteca.model.Libro;
import edu.biblioteca.services.LibroService;
import edu.biblioteca.model.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller  // ← Controlador MVC (retorna vistas HTML)
public class LibroController {

    // ✅ Inyección por constructor (recomendada, ver sección Spring Boot)
    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // Página principal: lista de libros
    @GetMapping("/libros")
    public String listarLibros(Model model) {
        model.addAttribute("libros", libroService.obtenerTodos());
        return "libros";  // → templates/libros.html
    }

    // Detalle de un libro
    @GetMapping("/libros/{id}")
    public String verLibro(@PathVariable Long id, Model model) {
        Libro libro = libroService.buscarPorId(id);
        model.addAttribute("libro", libro);
        return "libro-detalle";  // → templates/libro-detalle.html
    }
}