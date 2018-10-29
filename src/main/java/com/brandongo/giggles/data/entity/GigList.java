package com.brandongo.giggles.data.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GigList {

    @SerializedName("Gig")
    @Expose
    private List<Gig> gig = null;

    public List<Gig> getGig() {
        return gig;
    }

    public void setGig(List<Gig> gig) {
        this.gig = gig;
    }

    public Gig pullGig(int index){
        if (index > this.gig.size() - 1 || index < 0) {
            return null;
        }
        else {
            return this.gig.get(index);
        }
    }
}


