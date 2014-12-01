package code.myphonebookpak;

import javax.ejb.Stateless;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import code.myphonebookpak.PhoneBook;

@Stateless
public class MyPhonebookBean implements MyPhonebookLocal {
 
    @PersistenceUnit(unitName="PhonePU")
    protected EntityManagerFactory emf;
 
    public MyPhonebookBean() {
 
    }
 
    public PhoneBook findByPrimaryKey(String name) {
        EntityManager em = emf.createEntityManager();
 
        PhoneBook phonebook = (PhoneBook)em.find(PhoneBook.class, name);
 
        em.close();
 
        return phonebook;
    }
}