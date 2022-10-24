package controler;

import java.util.List;
import java.util.Scanner;

import dao.BibliotecaDAO;
import dao.LivroDAO;
import dao.impl.BibliotecaDAOImpl;
import dao.impl.LivroDAOImpl;
import model.Biblioteca;

public class Principal {

	public static void main(String[] args) {

		
		
//		EntityManager em = JpaUtil.getEntityManager();
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.close();
		
	
		
		Scanner entrada = new Scanner(System.in);
		LivroDAO livroDAO = new LivroDAOImpl();
		BibliotecaDAO bibliotecaDAO = new BibliotecaDAOImpl();
		
//		======================================Adicionar livro==========================================
		
//		System.out.println("ADICIONAR LIVRO NA BIBLIOTECA");
//		System.out.println("Qual autor do livro?:");
//		String autor = entrada.nextLine();
//		System.out.println("Qual Título do livro?:");
//		String titulo = entrada.nextLine();
//		
//		Livro livro = new Livro();
//		livro.setAutor(autor);
//		livro.setTitulo(titulo);
//		livroDAO.salvar(livro);
//		
//		System.out.println("=======livro adicionado com sucesso");
//		System.out.println("=======lista de livros atualizada:");
//		
//		List<Livro> listaLivro = livroDAO.ListarTodos();
//		for(Livro p: listaLivro) {
//			System.out.println(p.toString());
//		}
		
//		======================================Remover livro==========================================		
		
//		System.out.println("REMOVER LIVRO NA BIBLIOTECA");
//		System.out.println("Qual Título do livro?:");
//		String titulo2 = entrada.nextLine();
//		
//		livroDAO.remover(titulo2);
//		System.out.println("=======livro removido com sucesso");
//		System.out.println("=======lista de livros atualizada:");
//		
//		List<Livro> listaLivro2 = livroDAO.ListarTodos();
//		for(Livro p: listaLivro2) {
//			System.out.println(p.toString());
//		}
		
//		======================================Adicionar bilbioteca==========================================
				
//		System.out.println("ADICIONAR BIBLIOTECA");
//		System.out.println("Qual npme da biblioteca?:");
//		String nome = entrada.nextLine();
//		
//		Biblioteca biblioteca = new Biblioteca();
//		biblioteca.setNome(nome);
//		bibliotecaDAO.salvar(biblioteca);
//		
//		System.out.println("=======biblioteca adicionada com sucesso");
//		System.out.println("=======lista de bibliotecas atualizada:");
//		
//		List<Biblioteca> listaBiblioteca = bibliotecaDAO.ListarTodos();
//		for(Biblioteca p: listaBiblioteca) {
//			System.out.println(p.toString());
//		}
		
//		======================================Remover biblioteca==========================================		
		
//		System.out.println("REMOVER BIBLIOTECA");
//		System.out.println("Qual nome da biblioteca?:");
//		String nome2 = entrada.nextLine();
//		
//		bibliotecaDAO.remover(nome2);
//		System.out.println("=======biblioteca removida com sucesso");
//		System.out.println("=======lista de bibliotecas atualizada:");
//		
//		List<Biblioteca> listaBiblioteca2 = bibliotecaDAO.ListarTodos();
//		for(Biblioteca p: listaBiblioteca2) {
//			System.out.println(p.toString());
//		}		
				
	}
}
