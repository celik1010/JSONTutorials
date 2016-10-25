package com.selimcelik.basicjson;

import org.json.JSONArray;
import org.json.JSONObject;

public class BasicJsonObjects {

    public static void main(String[] args) {
        JSONObject jsono = new JSONObject();
        jsono.put("adi", "selim");
        jsono.put("soyadi", "Celik");

        JSONArray jSONArray = new JSONArray();
        jSONArray.put("Java");
        jSONArray.put("C++");
        jSONArray.put("C#");

        jsono.put("programlamadilleri", jSONArray);

        System.out.println(jsono.toString());
    }

}
