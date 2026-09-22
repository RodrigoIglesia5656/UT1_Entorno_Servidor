package edu.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

}