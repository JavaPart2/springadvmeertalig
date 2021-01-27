package be.vdab.meertalig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("index", "volgnummer", LocalDate.now().getDayOfYear());
    }
}
