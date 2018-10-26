package com.brandongo.giggles.controller;


import com.brandongo.giggles.data.entity.Gig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GiglistController {

    @RequestMapping("/gig_display")
    // added the model thing, use that to enter your list of objects. Allows you to access backend from frontend
    // HaltCampaign.html is model for this along with HaltController.java
    public String giglist(Model model)
    {
        Gig gigTest = new Gig("XS Malarkey", "Ross", 5);
        model.addAttribute(gigTest);
        return "GigDisplay";}

}
