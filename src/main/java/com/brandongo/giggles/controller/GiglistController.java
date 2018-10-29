package com.brandongo.giggles.controller;


import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.data.entity.GigList;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileReader;

@Controller
public class GiglistController {

    @RequestMapping("/gig_display")
    // added the model thing, use that to enter your list of objects. Allows you to access backend from frontend
    // HaltCampaign.html is model for this along with HaltController.java
    // need a servlet request? check video if doesn't work
    public String giglist(Model model) {

        Gson gson = new Gson();
        try {

            GigList gigList = gson.fromJson(new FileReader("/Users/craigb/BGLP/Giggles/gigglesProper/src/main/resources/gigData.json"), GigList.class);

            model.addAttribute("showName", gigList.pullGig(0).getShowName());
            model.addAttribute("contactName", gigList.pullGig(0).getContactName());
            model.addAttribute("quality", gigList.pullGig(0).getQuality());
            return "GigDisplay";


        } catch (Exception e) {
            System.out.println("screwed up didn't read");
        }

          return "GigDisplay";
    }

}

