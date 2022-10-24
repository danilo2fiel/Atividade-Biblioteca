package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	private String titulo;
	private String autor;
	
	public Livro() {
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
	
}
