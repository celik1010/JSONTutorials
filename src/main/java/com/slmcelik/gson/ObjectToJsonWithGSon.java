package com.slmcelik.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectToJsonWithGSon {

    public static void main(String[] args) {        
         List<String> diller = new ArrayList<>();
        diller.add("Java");
        diller.add("Phyton");
        diller.add("Perl");
        diller.add(".NET");
        
        List<JSonPojo> list=new ArrayList<>();
        list.add(new JSonPojo(15, "selim", diller));
        list.add(new JSonPojo(12, "Mehmet", diller));
        
       
//        JSonPojo pojo = new JSonPojo();
//        pojo.setAd("Mehmet");
//        pojo.setId(15);
//        pojo.setDiller(diller);
       
        Gson gson = new Gson();
        System.out.println(gson.toJson(list));
        
        
        ///////JSON Pretty Print using GSON/////////////
        Gson gson1=new GsonBuilder().setPrettyPrinting().create();        
         System.out.println(gson1.toJson(list));
        
    }
    
}
