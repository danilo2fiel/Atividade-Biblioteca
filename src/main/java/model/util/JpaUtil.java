package model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory; //gerenciador de entidades
	
	static {
		factory = Persistence.
				createEntityManagerFactory("jpaProject"); //colocar o nome do persistence
	}
	
	public static EntityManager getEntityManager() { //tem a classe conexao dentro dele
		return factory.createEntityManager();
	}
	
	public static void closeEntityManager() {
		factory.close();
	}
	
	
}
