package com.hibernate.dao;

import com.hibernate.entity.Offer;

import java.util.List;

public interface OfferDao {

    public List<Offer> getOffers();

    public void create(Offer offer);
}
