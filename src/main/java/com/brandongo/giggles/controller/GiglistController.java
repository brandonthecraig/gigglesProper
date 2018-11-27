package com.brandongo.giggles.controller;



import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.data.entity.GigList;
import com.brandongo.giggles.service.GigListService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.io.FileReader;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/gig_display")
public class GiglistController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(path = "/json_display")

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

    @GetMapping(path = "/jdbc_display")
    public String jdbcGigList(Model model) {

        List<Gig> gigs = GigListService.getAllGigs(jdbcTemplate);

        // Plugs in list to html page to be used
        model.addAttribute("gigs", gigs);
        return "GigDisplay";

    }

    @PostMapping(path = "/jdbc_display")
    public String jdbcPost(@ModelAttribute("gig") Gig gig, Model model) {

        // Adds the new gig from the form into the database
        GigListService.insertSingleGig(jdbcTemplate, gig);

        // returns a list of gigs from the database
        List<Gig> gigs = GigListService.getAllGigs(jdbcTemplate);

        // Plugs in list to html page to be used
        model.addAttribute("gigs", gigs);
        return "GigDisplay";
    }

    @DeleteMapping(path = "/jdbc_display")
    public String jdbcDelete(@ModelAttribute("gig") Gig gig, Model model) {

        // returns a list of gigs from the database
        List<Gig> gigs = GigListService.getAllGigs(jdbcTemplate);

        // Plugs in list to html page to be used
        model.addAttribute("gigs", gigs);
        return "GigDisplay";
    }

    @GetMapping(path= "/gig_edit/{id}")
    public String jdbcEditDisplay(@PathVariable("id") int id, Model model) {
        Gig editGig = GigListService.getSingleGig(id, jdbcTemplate);
        model.addAttribute("gig", editGig);
        return "GigEdit";
    }

    // Going offline on this, next step is to make your post mapping for the form
    @PostMapping(path= "/update")
    public String jdbcEditUpdate(@ModelAttribute("updatedGigToDB") Gig gig) {
        // does the update
        GigListService.updateSingleGig(jdbcTemplate, gig);
        return "redirect:/gig_display/jdbc_display";
    }

    @GetMapping(path = "/confirmEdit")
    public String jdbcEditConfirm(@ModelAttribute("updatedGig") Gig gig, Model model) {
        Gig oldGig = GigListService.getSingleGig(gig.getGig_id(), jdbcTemplate);

        model.addAttribute("oldGig", oldGig);
        model.addAttribute("updatedGig", gig);
        return "EditConfirmation";
    }

}




