package ru.web_learn.swsiteservice.model.element;

import ru.web_learn.swsiteservice.validation.valAnnotation.NotNullField;

import java.sql.Timestamp;

public class ElementModel {


    @NotNullField
    private Integer e_id;

    @NotNullField
    private String e_content;

    @NotNullField
    private Integer e_order;

    @NotNullField
    private Timestamp e_createdate;

    @NotNullField
    private Timestamp e_editdate;

    @NotNullField
    private boolean e_active;

    @NotNullField
    private Integer e_a_id;

    @NotNullField
    private Integer e_et_type;

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_content() {
        return e_content;
    }

    public void setE_content(String e_content) {
        this.e_content = e_content;
    }

    public Integer getE_order() {
        return e_order;
    }

    public void setE_order(Integer e_order) {
        this.e_order = e_order;
    }

    public Timestamp getE_createdate() {
        return e_createdate;
    }

    public void setE_createdate(Timestamp e_createdate) {
        this.e_createdate = e_createdate;
    }

    public Timestamp getE_editdate() {
        return e_editdate;
    }

    public void setE_editdate(Timestamp e_editdate) {
        this.e_editdate = e_editdate;
    }

    public boolean isE_active() {
        return e_active;
    }

    public void setE_active(boolean e_active) {
        this.e_active = e_active;
    }

    public Integer getE_a_id() {
        return e_a_id;
    }

    public void setE_a_id(Integer e_a_id) {
        this.e_a_id = e_a_id;
    }

    public Integer getE_et_type() {
        return e_et_type;
    }

    public void setE_et_type(Integer e_et_type) {
        this.e_et_type = e_et_type;
    }
}
