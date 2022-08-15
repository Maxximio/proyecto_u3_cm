package com.example.demo.libroAutor.repository;

import java.util.List;

import com.example.demo.libroAutor.repository.modelo.Libro;

public interface ILibroRepository {
	public Libro insertar(Libro libro);
	public List<Libro> contarCantidadPaginas(Integer cant);

}
