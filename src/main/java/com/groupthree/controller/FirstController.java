package com.groupthree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/imdb")
    public ModelAndView firstPage() {
        return new ModelAndView("welcome");
    }

    @RequestMapping("/watchlist")
    public ModelAndView secondPage() {
        return new ModelAndView("watchlist");
    }
}
