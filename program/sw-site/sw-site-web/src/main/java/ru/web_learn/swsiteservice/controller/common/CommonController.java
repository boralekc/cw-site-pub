package ru.web_learn.swsiteservice.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.web_learn.swsiteservice.beans.element.ElementBean;

@Controller
public class CommonController {

    @Autowired
    ElementBean elementBean;

    @RequestMapping(value = "/")
    public String test() {
        return "common/main";
    }

    @RequestMapping(value = "/regex")
    public String regex() {


        return "common/site";
    }

    @RequestMapping(value = "/regex/article/{articlename}")
    public String article(@PathVariable String articlename, Model model) {
        System.out.println(articlename);

        try {
            model.addAttribute("testData", elementBean.getElement(1).getE_content());
        } catch (Exception ex) {
            return "common/article";
        }

        model.addAttribute("testData", "Ошибка");
        return "common/article";
    }

    @RequestMapping(value = "/regex/example/{examplename}")
    public String example(@PathVariable String examplename) {
        System.out.println(examplename);

        return "common/article";
    }

    /*
    @RequestMapping(value = "/article/{articlename}")
    public String article() {
        return "common/article";
    }

     */


    @RequestMapping(value = "/version")
    public String version() {
        return "common/version";
    }
}
