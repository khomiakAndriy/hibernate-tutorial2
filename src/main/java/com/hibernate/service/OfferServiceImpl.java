package com.hibernate.service;

import com.hibernate.dao.OfferDao;
import com.hibernate.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class OfferServiceImpl implements OfferService{

    @Autowired
    private OfferDao offerDao;

    @Transactional
    public List<Offer> getOffers() {
        return offerDao.getOffers();
    }

    @Transactional
    public void create(Offer offer) {
        offerDao.create(offer);
    }
}
