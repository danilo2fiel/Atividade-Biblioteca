package dao;

import java.util.List;

import model.Biblioteca;
import model.Livro;

public interface BibliotecaDAO {

	public void salvar (Biblioteca biblioteca);
	public void remover (String nome);
	public Biblioteca pesquisar (String nome);
	public List<Biblioteca> ListarTodos ();
}
