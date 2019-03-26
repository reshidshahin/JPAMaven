package jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JPAFactory {

    EntityManager getEntityManager(); // govdesiz metodlar, sonra biz impl olan class'da bunlari override edirik
    EntityTransaction getEntityTransaction();

}
