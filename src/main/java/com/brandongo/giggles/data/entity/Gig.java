package com.brandongo.giggles.data.entity;


public class Gig {
    // change this use entity mapping when you go to sql
    // for now just make the app display data from object lists created on application page?



    private String showName;
    private String contactName;
    private int quality;

    public Gig(String showName, String contactName, int quality) {
        this.showName = showName;
        this.contactName = contactName;
        this.quality = quality;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
