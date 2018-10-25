package com.brandongo.giggles.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GiglistController {

    @RequestMapping("/gig_display")
    public String giglist() { return "GigDisplay";}

}
