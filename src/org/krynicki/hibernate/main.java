package org.krynicki.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.krynicki.hibernate.dto.Address;
import org.krynicki.hibernate.dto.UserDetails;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by K on 2016-08-27.
 */
public class main {

    public static void main(String[] args){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(3);
        userDetails.setUserName("Kamil2");
        userDetails.getAddresses().add(new Address("Street1", "City1", "zipcode1"));
        userDetails.getAddresses().add(new Address("Street2", "City2", "zipcode2"));
        userDetails.setDescription("Fun fun fun2");
        userDetails.setJoiningDate(new Date(0));
//
        SessionFactory sf = (new Configuration()).configure().buildSessionFactory();
        Session session = sf.openSession();
//
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();

//        session = sf.openSession();

//        session.beginTransaction();
//        UserDetails userDetails2 = session.get(UserDetails.class, 3);
//        session.getTransaction().commit();
//        session.close();



    }


}
