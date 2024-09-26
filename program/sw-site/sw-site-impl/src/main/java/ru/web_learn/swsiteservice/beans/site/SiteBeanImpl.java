package ru.web_learn.swsiteservice.beans.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.web_learn.swsiteservice.dao.site.SiteDao;
import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;
import ru.web_learn.swsiteservice.model.site.SiteModel;

import java.util.List;

@Service("siteBean")
public class SiteBeanImpl implements SiteBean {
    @Autowired
    SiteDao siteDao;

    @Override
    public List<SiteModel> getSiteList(SQLSelectParamModel sqlSelectParamModel) throws Exception {
        return siteDao.getSiteList(sqlSelectParamModel);
    }
}
