package com.selimcelik.jackson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JacksonJSonToMap {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            Map<String,Object> map=new HashMap<>();
            List<Object> diller=new ArrayList<>();
            
            map=mapper.readValue(new File("E:\\mapjson.json"), new TypeReference<Map<String,Object>>(){});
            
            System.out.println(map.get("Name"));
            System.out.println(map.get("ID"));
            diller=(List<Object>) map.get("Diller");
            
            System.out.println(diller);
        } catch (IOException ex) {
            Logger.getLogger(JacksonJSonToMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
