package com.brandongo.giggles.controller;



import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.data.entity.GigList;
import com.brandongo.giggles.repository.mapper.GigMapper;
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

        // function that I need is in the gigmapper class
        GigMapper gigMapper = new GigMapper();

        // returns a list of gigs from the database
        List<Gig> gigs = gigMapper.findAll(jdbcTemplate);

        // Plugs in list to html page to be used
        model.addAttribute("gigs", gigs);
        return "GigDisplay";

    }

    @PostMapping(path = "/jdbc_display")
    public String jdbcPost(@ModelAttribute("gig") Gig gig, Model model) {

        // Adds the new gig from the form into the database
        jdbcTemplate.update("INSERT INTO GIGDATA VALUES(?, ?, ?, ?)",gig.getGigId(), gig.getGig_showName(), gig.getGig_contactName(),
                gig.getGig_quality());

        // returns a list of gigs from the database
        GigMapper gigMapper = new GigMapper();
        List<Gig> gigs = gigMapper.findAll(jdbcTemplate);

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
    @PostMapping(path= "/update_test")
    public String jdbcEditUpdate(@ModelAttribute("updatedGig") Gig gig, Model model) {
        // update the specific thing you're updating
        // return a model for GigDisplay to use
        // add a seperate step for an update page
        // returns a list of gigs from the database
        // something is really off, it's telling me that these responses aren't allowed. Might be a good time to do backend,
        // try it in postman and then figure out what's up from there
        GigMapper gigMapper = new GigMapper();
        List<Gig> gigs = gigMapper.findAll(jdbcTemplate);

        // Plugs in list to html page to be used
        model.addAttribute("gigs", gigs);
        return "GigDisplay";
    }

}




