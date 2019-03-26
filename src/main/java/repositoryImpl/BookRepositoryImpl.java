package repositoryImpl;

import jpaFactory.JPAFactory;
import jpaFactoryImpl.JPAFactoryImpl;
import model.Book;
import repository.BookRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class BookRepositoryImpl implements BookRepository {

    private JPAFactory jpaFactory = new JPAFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager(); // JPAFactoryImpl class'in icindeki override edilmis metodu isletdim burda :)
    private EntityTransaction entityTransaction = entityManager.getTransaction();


    @Override
    public void save(Book book) {
        this.entityTransaction.begin();
        this.entityManager.persist(book);
        this.entityTransaction.commit();
    }

    @Override
    public void delete(Book book) {
        this.entityTransaction.begin();
        this.entityManager.remove(book);
        this.entityTransaction.commit();
    }

    @Override
    public Book find(int id) {
        Book book = this.entityManager.find(Book.class, id);
        if (book != null) {
            return book;
        }
        return null;
    }

    @Override
    public Book update(Book book) {

        this.entityTransaction.begin();
        Book updatedBook = this.entityManager.merge(book);
        this.entityTransaction.commit();
        return updatedBook;
    }
}
