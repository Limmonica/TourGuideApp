package com.example.limmonica.tourguideapp;

import java.util.ArrayList;

/**
 * {@link DATA} is a Singleton class with getInstance() methods as source of data for the
 * Tour Guide app
 */
class DATA {

    /**
     * Static variable of the single instance of type Singleton
     */
    private static DATA INSTANCE = null;

    /**
     * Initializations of the ArrayList for each category
     */
    private ArrayList<Element> restaurants = new ArrayList<>();
    private ArrayList<Element> places = new ArrayList<>();
    private ArrayList<Element> events = new ArrayList<>();
    private ArrayList<Element> parks = new ArrayList<>();

    /**
     * {@link DATA} is a private constructor restricted to this class
     */

    private DATA() {
        // RESTAURANTS
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.lacrimi_logo, R.drawable.lacrimi_pic, R.string.tears_phone, R.string.tears_web, R.string.tears_address, R.string.tears_fb));
        restaurants.add(new Element(R.string.victoriei_name, R.string.victoriei_desc, R.drawable.victoriei18_logo, R.drawable.victoriei18_pic, R.string.victoriei_phone, R.string.victoriei_web, R.string.victoriei_address, R.string.victoriei_fb));
        restaurants.add(new Element(R.string.simbio_name, R.string.simbio_desc, R.drawable.simbio_logo, R.drawable.simbio_pic, R.string.simbio_phone, R.string.simbio_web, R.string.simbio_address, R.string.simbio_fb));
        restaurants.add(new Element(R.string.bocca_name, R.string.bocca_desc, R.drawable.bocca_logo, R.drawable.bocca_pic, R.string.bocca_phone, R.string.bocca_web, R.string.bocca_address, R.string.bocca_fb));
        restaurants.add(new Element(R.string.altshift_name, R.string.altshift_desc, R.drawable.altshift_logo, R.drawable.altshift_pic, R.string.altshift_phone, R.string.altshift_web, R.string.altshift_address, R.string.altshift_fb));
        restaurants.add(new Element(R.string.biutiful_name, R.string.biutiful_desc, R.drawable.biutiful_logo, R.drawable.biutiful_pic, R.string.biutiful_phone, R.string.biutiful_web, R.string.biutiful_address, R.string.biutiful_fb));
        restaurants.add(new Element(R.string.chefs_name, R.string.chefs_desc, R.drawable.chefs_logo, R.drawable.chefs_pic, R.string.chefs_phone, R.string.chefs_web, R.string.chefs_address, R.string.chefs_fb));
        restaurants.add(new Element(R.string.veranda_name, R.string.verandas_desc, R.drawable.veranda_logo, R.drawable.varanda_pic, R.string.veranda_phone, R.string.veranda_web, R.string.veranda_address, R.string.veranda_fb));
        // PLACES
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.oldtown_pic, R.string.old_town_address));
        places.add(new Element(R.string.parliament_name, R.string.parliament_desc, R.drawable.parliament_pic, R.string.parliament_address));
        places.add(new Element(R.string.therme_name, R.string.therme_desc, R.drawable.therme_pic, R.string.therme_address));
        // EVENTS
        events.add(new Element(R.string.enescu_name, R.string.enescu_desc, R.drawable.enescu_logo, R.drawable.enescu_pic, R.string.enescu_web, R.string.enescu_address, R.string.enescu_fb));
        events.add(new Element(R.string.summer_name, R.string.summer_desc, R.drawable.summer_logo, R.drawable.summer_pic, R.string.summer_web, R.string.summer_address, R.string.summer_fb));
        events.add(new Element(R.string.street_name, R.string.street_desc, R.drawable.street_logo, R.drawable.street_pic, R.string.street_web, R.string.street_address, R.string.street_fb));
        // PARKS
        parks.add(new Element(R.string.herastrau_name, R.string.herastrau_desc, R.drawable.herastrau_pic, R.string.herastrau_web, R.string.herastrau_address));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.ior_pic, R.string.ior_web, R.string.ior_address));
        parks.add(new Element(R.string.cismigiu_name, R.string.cismigiu_desc, R.drawable.cismigiu_pic, R.string.cismigiu_web, R.string.cismigiu_address));
    }

    static DATA getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DATA();
        }
        return (INSTANCE);
    }

    ArrayList<Element> getRestaurants() {
        return restaurants;
    }

    ArrayList<Element> getPlaces() {
        return places;
    }

    ArrayList<Element> getEvents() {
        return events;
    }

    ArrayList<Element> getParks() {
        return parks;
    }
}
