package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.LivroDAO;
import model.Livro;
import model.util.JpaUtil;

public class LivroDAOImpl implements LivroDAO {
	
	private EntityManager em;
	private EntityTransaction et;

	@Override
	public void salvar(Livro livro) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(livro);
			et.commit();
			
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
			
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void remover(String autor) {

		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Livro.class, autor));
			et.commit();
			
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
			
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Livro pesquisar(String autor) {


		Livro livro = new Livro(); //criando uma conta vazia
		try {
			this.em = JpaUtil.getEntityManager();
			livro = em.find(Livro.class,autor);
		
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		return livro;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livro> ListarTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Livro l");
		
		List<Livro> listaLivro = query.getResultList();
		em.close();
		return listaLivro;
			
		}

}
