package ru.web_learn.swsiteservice.dao.site;

import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;
import ru.web_learn.swsiteservice.model.site.SiteModel;

import java.util.List;

public interface SiteDao {
    /**
     * Получение списка сайтов
     * @param sqlSelectParamModel параметры запроса
     * @return список сайтов
     * @throws Exception
     */
    List<SiteModel> getSiteList(SQLSelectParamModel sqlSelectParamModel) throws Exception;
}
