package com.example.doanthietbididong;

public class Model {
    String id;
    String title;
    String desc;

    public Model(String id, String title, String desc) {
        this.id = id;
        this.desc = desc;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
