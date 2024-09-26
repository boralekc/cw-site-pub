package ru.web_learn.swsiteservice.model.site;

import ru.web_learn.swsiteservice.validation.valAnnotation.MaxSizeField;
import ru.web_learn.swsiteservice.validation.valAnnotation.NotNullField;

import java.sql.Timestamp;

public class SiteModel {

    @NotNullField
    private Integer st_id;

    @NotNullField
    @MaxSizeField(maxSize = 100)
    private String st_name;

    @NotNullField
    @MaxSizeField(maxSize = 100)
    private String st_url;

    @MaxSizeField(maxSize = 1000)
    private String st_description;

    @NotNullField
    private Timestamp st_createdate;

    @NotNullField
    private Timestamp st_editdate;

    @NotNullField
    private boolean st_active;

    public Integer getSt_id() {
        return st_id;
    }

    public void setSt_id(Integer st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_url() {
        return st_url;
    }

    public void setSt_url(String st_url) {
        this.st_url = st_url;
    }

    public String getSt_description() {
        return st_description;
    }

    public void setSt_description(String st_description) {
        this.st_description = st_description;
    }

    public Timestamp getSt_createdate() {
        return st_createdate;
    }

    public void setSt_createdate(Timestamp st_createdate) {
        this.st_createdate = st_createdate;
    }

    public Timestamp getSt_editdate() {
        return st_editdate;
    }

    public void setSt_editdate(Timestamp st_editdate) {
        this.st_editdate = st_editdate;
    }

    public boolean isSt_active() {
        return st_active;
    }

    public void setSt_active(boolean st_active) {
        this.st_active = st_active;
    }
}
