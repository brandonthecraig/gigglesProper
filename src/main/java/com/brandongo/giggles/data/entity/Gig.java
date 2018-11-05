package com.brandongo.giggles.data.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Gig {

    @SerializedName("showName:")
    @Expose
    private String Gig_showName;
    @SerializedName("contactName:")
    @Expose
    private String Gig_contactName;
    @SerializedName("quality")
    @Expose
    private Integer Gig_quality;

    public String getShowName() {
        return Gig_showName;
    }

    public void setShowName(String showName) {
        this.Gig_showName = showName;
    }

    public String getContactName() {
        return Gig_contactName;
    }

    public void setContactName(String contactName) {
        this.Gig_contactName = contactName;
    }

    public Integer getQuality() {
        return Gig_quality;
    }

    public void setQuality(Integer quality) {
        this.Gig_quality = quality;
    }

}