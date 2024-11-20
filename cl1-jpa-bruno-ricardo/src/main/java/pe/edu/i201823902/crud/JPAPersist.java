package pe.edu.i201823902.crud;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201823902.dominio.ciudad;
import pe.edu.i201823902.dominio.pais;

public class JPAPersist {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mundo");
        EntityManager em = emf.createEntityManager();

        pais pais = new pais("WAK", "Wakanda", "Africa", "Central Africa", 800.5, 2001, 3600000, 55.3, 330.3, 115.8,"","" ,"",1,"");
        ciudad ciudad = new ciudad(4080,"AAb","","Hadi", "5500");
        ciudad ciudad1 = new ciudad(4081,"Bahin","","Hall", "3500");
        ciudad ciudad2 = new ciudad(4082,"Ager","","Tody", "8610");

        em.getTransaction().begin();
       em.persist(pais);
       em.getTransaction().commit();

    }
}
