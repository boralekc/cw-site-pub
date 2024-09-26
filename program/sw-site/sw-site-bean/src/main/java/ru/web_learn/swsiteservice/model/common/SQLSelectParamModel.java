package ru.web_learn.swsiteservice.model.common;

/**
 * Параметры Where
 */
public class SQLSelectParamModel {
    /**
     * С какой строки начинать получение данных (если нужно пропустить 4 строки: то начинаем с 5-й)
     */
    private String startRecNum;

    /**
     * Количество возвращаемых строк
     */
    private String pageSize;

    /**
     * Критерии выборки данных
     */
    private String where;

    /**
     * Параметры сортировки
     */
    private String orderBy;

    public SQLSelectParamModel(String startRecNum, String pageSize, String where, String orderBy) {
        this.startRecNum = startRecNum;
        this.pageSize = pageSize;
        this.where = where;
        this.orderBy = orderBy;
    }

    public String getStartRecNum() {
        return startRecNum;
    }

    public void setStartRecNum(String startRecNum) {
        this.startRecNum = startRecNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) { this.where = where; }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
