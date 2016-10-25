package com.selimcelik.jackson;

import com.slmcelik.gson.JSonPojo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonWrite {

    public static void main(String[] args) {
        try {
            JSonPojo pojo = new JSonPojo();
            ObjectMapper mapper = new ObjectMapper();
            List<String> list = new ArrayList<>();
            pojo.setId(12);
            pojo.setAd("selim");
            list.add("Java");
            list.add("C++");
            list.add("C#");
            pojo.setDiller(list);
//            mapper.writeValue(new File("E:\\denemejackson.json"), pojo);
            
            mapper.defaultPrettyPrintingWriter().writeValue(new File("E:\\denemejackson.json"), pojo);//**Dzenli yazmak 
        } catch (IOException ex) {
            Logger.getLogger(JacksonWrite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
