package ru.web_learn.swsiteservice.beans.site;

import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;
import ru.web_learn.swsiteservice.model.site.SiteModel;

import java.util.List;

public interface SiteBean {
    List<SiteModel> getSiteList(SQLSelectParamModel sqlSelectParamModel) throws Exception;
}
