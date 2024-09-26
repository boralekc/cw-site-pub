package ru.web_learn.swsiteservice.beans.element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.web_learn.swsiteservice.dao.element.ElementDao;
import ru.web_learn.swsiteservice.model.element.ElementModel;

@Service("elementBean")
public class ElementBeanImpl implements ElementBean {


    @Autowired
    ElementDao elementDao;

    @Override
    public ElementModel getElement(int e_id) throws Exception {
        return elementDao.getElement(e_id);
    }
}
