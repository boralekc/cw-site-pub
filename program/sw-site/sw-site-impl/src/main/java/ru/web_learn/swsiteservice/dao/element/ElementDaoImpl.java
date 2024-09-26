package ru.web_learn.swsiteservice.dao.element;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import ru.web_learn.swsiteservice.dao.common.CommonDaoImpl;
import ru.web_learn.swsiteservice.model.element.ElementModel;

import java.util.List;

@Repository("elementDao")
public class ElementDaoImpl extends CommonDaoImpl implements ElementDao {


    @Override
    public ElementModel getElement(int e_id) throws Exception {
        String sql = "SELECT e_id, e_content, e_order, e_createdate, e_editdate, e_active, e_a_id, e_et_type FROM swsite.Element; ";

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("e_id", e_id);

        List<ElementModel> listModels = jdbcTemplate.query(sql, namedParameters, (rs, rowNum) -> {
            ElementModel varModel = new ElementModel();
            varModel.setE_id(rs.getInt("e_id"));
            varModel.setE_content(rs.getString("e_content"));
            varModel.setE_order(rs.getInt("e_order"));
            varModel.setE_createdate(rs.getTimestamp("e_createdate"));
            varModel.setE_editdate(rs.getTimestamp("e_editdate"));
            varModel.setE_active(rs.getBoolean("e_active"));
            varModel.setE_a_id(rs.getInt("e_a_id"));
            varModel.setE_et_type(rs.getInt("e_et_type"));

            return varModel;
        });

        return (listModels.size() > 0) ? listModels.get(0) : null;


    }
}
