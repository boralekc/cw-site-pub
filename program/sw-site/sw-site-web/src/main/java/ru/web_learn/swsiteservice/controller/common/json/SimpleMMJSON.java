package ru.web_learn.swsiteservice.controller.common.json;

import java.util.ArrayList;
import java.util.List;

public class SimpleMMJSON {
    private List<SimpleJSON> system_messages = new ArrayList<>();

    public List<SimpleJSON> getSystem_messages() {
        return system_messages;
    }

    public void setSystem_messages(List<SimpleJSON> system_messages) {
        this.system_messages = system_messages;
    }

    public void addMessage(int code, String message) {
        SimpleJSON simpleJSON = new SimpleJSON();
        simpleJSON.setCode(code);
        simpleJSON.setMessage(message);
        system_messages.add(simpleJSON);
    }
}
