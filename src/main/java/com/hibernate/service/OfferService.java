package com.hibernate.service;

import com.hibernate.entity.Offer;

import java.util.List;

public interface OfferService {

    public List<Offer> getOffers();

    public void create(Offer offer);
}
