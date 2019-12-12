package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public ModelAndView getForm() {
        return new ModelAndView();
    }

    @PostMapping("/dictionary")
    public ModelAndView dictionary(@RequestParam(name = "search") String search) {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(search);

        ModelAndView modelAndView = new ModelAndView("dictionary");
        if (result == null) {
            modelAndView.addObject("result", "Not found.");
        } else {
            modelAndView.addObject("result", result);
        }
        System.out.println("dO POSST");
        return modelAndView;
    }

}
