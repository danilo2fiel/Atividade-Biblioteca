package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biblioteca {

	@Id
	private String nome;
	

	public Biblioteca() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + "]";
	}

	
	
	
}
