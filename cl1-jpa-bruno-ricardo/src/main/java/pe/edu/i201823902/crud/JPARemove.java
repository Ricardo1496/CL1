package pe.edu.i201823902.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201823902.dominio.pais;

public class JPARemove {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mundo");
        EntityManager em = emf.createEntityManager();

        pais pais = em.find(pais.class, "WAK");

        em.getTransaction().begin();
        em.remove(pais);
        em.getTransaction().commit();

    }

}
