package ru.web_learn.swsiteservice.dao.common;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.web_learn.swsiteservice.model.common.SQLSelectParamModel;
import ru.web_learn.swsiteservice.staticutils.StringUtils;

import javax.sql.DataSource;

public class CommonDaoImpl implements InitializingBean {
    private DataSource dataSource;

    public NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("Must set dataSource on commonDao");
        }
        if (jdbcTemplate == null) {
            throw new BeanCreationException("Null NamedParameterJdbcTemplate on commonDao");
        }
    }

    public String addWhereAndOrder(String sql, SQLSelectParamModel sqlSelectParamModel) throws Exception {

        if (sqlSelectParamModel != null) {

            sql += StringUtils.isStrNotEmpty(sqlSelectParamModel.getWhere()) ? " WHERE " + sqlSelectParamModel.getWhere() : "";
            sql += StringUtils.isStrNotEmpty(sqlSelectParamModel.getOrderBy()) ? " ORDER BY " + sqlSelectParamModel.getOrderBy() : "";

            if (StringUtils.isStrNotEmpty(sqlSelectParamModel.getStartRecNum()) & StringUtils.isStrNotEmpty(sqlSelectParamModel.getPageSize())) {
                sql += " OFFSET " + (Integer.parseInt(sqlSelectParamModel.getStartRecNum()) - 1) + " LIMIT " + sqlSelectParamModel.getPageSize();
            }

        }

        return sql;
    }
}
