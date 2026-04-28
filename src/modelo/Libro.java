package modelo;

import java.io.Serializable;

/**
 * Representa un libro en la biblioteca.
 * 
 * @Author RaulSanchez
 */
public class Libro implements Serializable {

	private String isbn;
	private String titulo;
	private String autor;
	private boolean prestado;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = false;
	}

	public void prestar() {
		this.prestado = true;
	}

	public void devolver() {
		this.prestado = false;
	}

	@Override
	public String toString() {
		return String.format("%-13s | %-30s | %-20s | %s", isbn, titulo, autor, prestado ? "Prestado" : "Disponible");
	}
}