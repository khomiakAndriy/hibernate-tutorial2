package com.hibernate.dao;

import com.hibernate.entity.Offer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class OffersDaoImpl implements OfferDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Offer> getOffers() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create query
        Query<Offer> theQuery =
                currentSession.createQuery("from Offer order by name", Offer.class);

        // execute query and get result list
        List<Offer> offers = theQuery.getResultList();

        return offers;

    }

    public void create(Offer offer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(offer);
    }

}
