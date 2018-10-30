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
    public String giglist(Model model) {

        Gson gson = new Gson();
        try {

            // make this thing into a list and then for each loop through the list
            GigList gigList = gson.fromJson(new FileReader("/Users/craigb/BGLP/Giggles/gigglesProper/src/main/resources/gigData.json"), GigList.class);

            model.addAttribute("gigs", gigList.getGig());
            return "GigDisplay";


        } catch (Exception e) {
            System.out.println("screwed up didn't read");
        }

          return "GigDisplay";
    }

}

