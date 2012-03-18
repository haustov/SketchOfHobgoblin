/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.haustov.hobgoblin.hobservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import net.haustov.hobgoblin.data.HibernateUtil;
import net.haustov.hobgoblin.data.Product;
import org.hibernate.Query;

/**
 *
 * @author khaustov
 */
@WebService
public class HomeStore
{
    @WebMethod
    public long test()
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Query query = session.createQuery("select count(*) from Product");
        List resList = query.list();
        long res = 0;
        if (!resList.isEmpty())
        {
            res = (Long)resList.get(0);
        }
        
        return res;
    }

    @WebMethod
    public List<Product> testArray()
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Query query = session.createQuery("from Product");
        List<Product> result = query.list();
        session.close();
        
        /*
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(123);
        result.add(456);
        result.add(789);
        * 
        */
        return result;
    }

}
