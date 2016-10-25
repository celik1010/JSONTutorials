package com.slmcelik.gson;

import java.util.List;

public class JSonPojo {

    int id = 0;
    String ad;
    List<String> diller;

    public JSonPojo(int id, String ad, List<String> diller) {
        this.id = id;
        this.ad = ad;
        this.diller = diller;
    }

    public JSonPojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<String> getDiller() {
        return diller;
    }

    public void setDiller(List<String> diller) {
        this.diller = diller;
    }

}
