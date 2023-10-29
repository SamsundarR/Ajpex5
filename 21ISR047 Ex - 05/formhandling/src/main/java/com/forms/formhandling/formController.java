package com.forms.formhandling;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class formController {
    @RequestMapping("/registerform")
    public String show(Model model)
    {
        User car=new User();
         model.addAttribute("car",car);
       List<String> loclist=Arrays.asList("Erode","Tiruppur","Chennai");
        model.addAttribute("loclist",loclist);
        return "registerform";
    }
    @RequestMapping("/register")
    public String submission(@ModelAttribute("car")User car)
    {
        return "display";
    }
}

    

