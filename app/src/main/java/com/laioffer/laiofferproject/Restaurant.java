package com.laioffer.laiofferproject;

import android.graphics.Bitmap;

/**
 * Created by zhou on 6/7/2016.
 */
public class Restaurant {

    /**
     * All data for a restaurant.
     */
    private String name;
    private String address;
    private String type;
    private double lat;
    private double lng;
    private Bitmap thumbnail;
    private Bitmap rating;


    /**
     * Constructor
     *
     * @param name name of the restaurant
     */
    public Restaurant(String name,
                      String address,
                      String type,
                      double lat,
                      double lng,
                      Bitmap thumbnail,
                      Bitmap rating) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.thumbnail = thumbnail;
        this.rating = rating;
    }

    /**
     * Getters for private attributes of Restaurant class.
     */
    public String getName() { return this.name; }

    public String getAddress() { return this.address; }

    public String getType() { return this.type; }

    public double getLat() { return lat; }

    public double getLng() { return lng; }

    public Bitmap getThumbnail() { return thumbnail; }

    public Bitmap getRating() { return rating;}
}

