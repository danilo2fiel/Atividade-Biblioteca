package dao;

import java.util.List;

import model.Livro;

public interface LivroDAO {

	public void salvar (Livro livro);
	public void remover (String autor);
	public Livro pesquisar (String autor);
	public List<Livro> ListarTodos ();
}
