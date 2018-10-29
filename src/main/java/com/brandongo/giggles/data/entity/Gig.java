package com.brandongo.giggles.data.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gig {

    @SerializedName("showName:")
    @Expose
    private String showName;
    @SerializedName("contactName:")
    @Expose
    private String contactName;
    @SerializedName("quality")
    @Expose
    private Integer quality;

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

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

}