package pe.edu.i201823902.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201823902.dominio.pais;

public class JPAFind {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mundo");
        EntityManager em = emf.createEntityManager();

        pais pais = em.find(pais.class,"PER");
        System.out.println(pais);

    }
}
