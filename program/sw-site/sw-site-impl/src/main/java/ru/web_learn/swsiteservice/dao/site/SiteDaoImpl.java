package ru.web_learn.swsiteservice.dao.site;

import org.springframework.stereotype.Repository;
import ru.web_learn.swsiteservice.dao.common.CommonDaoImpl;
import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;
import ru.web_learn.swsiteservice.model.site.SiteModel;

import java.util.List;

@Repository("siteDao")
public class SiteDaoImpl extends CommonDaoImpl implements SiteDao {

    @Override
    public List<SiteModel> getSiteList(SQLSelectParamModel sqlSelectParamModel) throws Exception {
        String sql = "SELECT st_id, st_name, st_url, st_description, st_createdate, st_editdate, st_active FROM swsite.Site ";
        sql = addWhereAndOrder(sql, sqlSelectParamModel);

        List<SiteModel> listModels = jdbcTemplate.query(sql, (rs, rowNum) -> {
            SiteModel varModel = new SiteModel();
            varModel.setSt_id(rs.getInt("st_id"));
            varModel.setSt_name(rs.getString("st_name"));
            varModel.setSt_url(rs.getString("st_url"));
            varModel.setSt_description(rs.getString("st_description"));
            varModel.setSt_createdate(rs.getTimestamp("st_createdate"));
            varModel.setSt_editdate(rs.getTimestamp("st_editdate"));
            varModel.setSt_active(rs.getBoolean("st_active FROM Site"));
            return varModel;
        });

        return listModels;

    }
}
