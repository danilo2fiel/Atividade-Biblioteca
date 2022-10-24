package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.BibliotecaDAO;
import model.Biblioteca;
import model.Livro;
import model.util.JpaUtil;

public class BibliotecaDAOImpl implements BibliotecaDAO {
	
	private EntityManager em;
	private EntityTransaction et;
	

	@Override
	public void salvar(Biblioteca biblioteca) {
		
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(biblioteca);
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
	public void remover(String nome) {
		// TODO Auto-generated method stub
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Biblioteca.class, nome));
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
	public Biblioteca pesquisar(String nome) {

		Biblioteca biblioteca = new Biblioteca(); //criando uma conta vazia
		try {
			this.em = JpaUtil.getEntityManager();
			biblioteca = em.find(Biblioteca.class,nome);
		
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
		return biblioteca;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Biblioteca> ListarTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Biblioteca b");
		
		List<Biblioteca> listaBiblioteca = query.getResultList();
		em.close();
		
		return listaBiblioteca;
			
		}
	
	

}
