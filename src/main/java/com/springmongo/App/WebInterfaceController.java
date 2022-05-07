package com.springmongo.App;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebInterfaceController {

    @RequestMapping("/render")
    public String renderHomeHtml(
            @RequestParam String userName,
            Model page){
        page.addAttribute("User",userName);
        return "home.html";
    }
    @RequestMapping("/render/{id}")
    public String renderHomeHtmlWithPathValue(
            @PathVariable String id,
            Model page
    ){
        page.addAttribute("User",id);
        return "home.html";
    }
}
