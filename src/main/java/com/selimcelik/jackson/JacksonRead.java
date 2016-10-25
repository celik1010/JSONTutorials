package com.selimcelik.jackson;

import com.slmcelik.gson.JSonPojo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonRead {
    public static void main(String[] args) {
        try {
            JSonPojo pojo=new JSonPojo();
            ObjectMapper mapper=new ObjectMapper();
            
            pojo=mapper.readValue(new File("E:\\denemejackson.json"), JSonPojo.class);
            System.out.println(pojo.getAd());
            System.out.println(pojo.getId());
            System.out.println(pojo.getDiller());
        } catch (IOException ex) {
            Logger.getLogger(JacksonRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
