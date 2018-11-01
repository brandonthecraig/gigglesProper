package com.brandongo.giggles.controller;


import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.data.entity.GigList;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Controller
@RequestMapping("/gig_display")
public class GiglistController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(path = "/json_display")

    public String giglist(Model model) {
        int result = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM GigData", Integer.class
        );

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

        //@GetMapping(path = "/jdbc_display")


}



