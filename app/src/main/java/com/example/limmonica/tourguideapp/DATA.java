package com.example.limmonica.tourguideapp;

import java.util.ArrayList;

/**
 * {@link DATA} is a Singleton class with getInstance() methods as source of data for the
 * Tour Guide app
 */
public class DATA {

    /**
     * Static variable of the single instance of type Singleton
     */
    private static DATA INSTANCE = null;

    /**
     * Initializations of the ArrayList of Parks
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
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        restaurants.add(new Element(R.string.tears_name, R.string.tears_desc, R.drawable.tears_angels));
        // PLACES
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        places.add(new Element(R.string.old_town_name, R.string.old_town_desc, R.drawable.tears_angels));
        // EVENTS
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));
        events.add(new Element(R.string.picnic_name, R.string.picnic_desc, R.drawable.tears_angels));

        // PARKS
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
        parks.add(new Element(R.string.ior_name, R.string.ior_desc, R.drawable.tears_angels));
    }

    public static DATA getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DATA();
        }
        return (INSTANCE);
    }

    public ArrayList<Element> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Element> getPlaces() {
        return places;
    }

    public ArrayList<Element> getEvents() {
        return events;
    }

    public ArrayList<Element> getParks() {
        return parks;
    }
}
