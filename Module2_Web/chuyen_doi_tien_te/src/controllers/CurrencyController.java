package controllers;

import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @GetMapping("/converter")
    public ModelAndView getFromConverter() {
        return new ModelAndView();
    }
    @PostMapping("/converter")
    public ModelAndView convert (@RequestParam(name="search") String rate,@RequestParam(name="usd") String usd){
        ModelAndView modelAndView = new ModelAndView("converter");
        try{
            double rateEX= Double.parseDouble(rate);
            double money= Double.parseDouble(usd);
            modelAndView.addObject("result",money*rateEX);
        }catch(Exception ex) {
            modelAndView.addObject("result","Error");
        }
        System.out.println("dO POSST");
        return modelAndView;
    }
}
