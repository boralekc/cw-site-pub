package ru.web_learn.swsiteservice.dao.element;

import ru.web_learn.swsiteservice.model.element.ElementModel;

public interface ElementDao {
    ElementModel getElement(int e_id) throws Exception;
}
