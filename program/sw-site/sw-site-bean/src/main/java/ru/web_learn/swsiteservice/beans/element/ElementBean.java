package ru.web_learn.swsiteservice.beans.element;

import ru.web_learn.swsiteservice.model.element.ElementModel;

public interface ElementBean {
    ElementModel getElement(int e_id) throws Exception;
}
