package DAO;

import entity.IbmEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.IbmEntity;
import java.util.List;

/**
 * Created by tend on 2017/9/7.
 */
public class UserDAO implements IUserDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(IbmEntity ibmEntity) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(ibmEntity);
            session.getTransaction().commit();
        }finally {
            session.close();
        }

    }
    @Override
    public List<IbmEntity> list(String club){
        Session session = sessionFactory.openSession();
        try {
            String hql = "from IbmEntity where club = '" + club + "'";
            Query query = session.createQuery(hql);
            return (List<IbmEntity>) query.list();
        }finally {
            session.close();
        }
    }
}
