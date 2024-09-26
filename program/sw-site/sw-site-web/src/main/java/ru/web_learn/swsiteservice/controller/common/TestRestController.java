package ru.web_learn.swsiteservice.controller.common;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.web_learn.swsiteservice.beans.site.SiteBean;
import ru.web_learn.swsiteservice.controller.common.json.SimpleMMJSON;
import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;

@RestController
public class TestRestController {

    @Autowired
    SiteBean siteBean;

    //TODO Удалить тестовый REST
    @RequestMapping(value = "/common/test/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleMMJSON getTest(HttpServletRequest request) throws Exception {
        SimpleMMJSON simpleMMJSON = new SimpleMMJSON();
        simpleMMJSON.addMessage(200, "OK");
        siteBean.getSiteList(new SQLSelectParamModel(
                request.getParameter("startRecNum"), request.getParameter("pageSize"),
                request.getParameter("where"), request.getParameter("orderBy")));
        return simpleMMJSON;
    }
}
