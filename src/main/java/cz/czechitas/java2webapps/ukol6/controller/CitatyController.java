package cz.czechitas.java2webapps.ukol6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CitatyService;

import java.util.List;
import java.util.Random;

/**
 *
 */

@Controller
public class CitatyController {

    @GetMapping("/")
    public ModelAndView nahodnyCitat() {
        return new ModelAndView("citat")
                .addObject("citat", CitatyService.nahodnyCitat());
    }
}

