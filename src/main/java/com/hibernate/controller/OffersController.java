package com.hibernate.controller;

import com.hibernate.entity.Offer;
import com.hibernate.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class OffersController {

    @Autowired
    private OfferService offerService;

    @RequestMapping("/offers")
    public String showOffers(Model model) {

        List<Offer> offers = offerService.getOffers();

        model.addAttribute("offers", offers);
        System.out.println(offers);

        return "offers";
    }

    @RequestMapping(value = "/docreate", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("offer") Offer offer) {

        offerService.create(offer);

        return "offercreated";
    }

    @RequestMapping("/createoffer")
    public String createOffer(Model model) {

        model.addAttribute("offer", new Offer());

        return "createoffer";
    }


}
