package org.krynicki.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.krynicki.hibernate.dto.UserDetails;

/**
 * Created by K on 2016-08-27.
 */
public class main {

    public static void main(String[] args){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("Kamil");

        SessionFactory sf = (new Configuration()).configure().buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
    }


}
