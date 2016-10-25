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

public class JacksonMapToJSon {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = new HashMap<String, Object>();

            List<Object> diller = new ArrayList<>();
            diller.add("JAVA");
            diller.add("PERL");
            diller.add("C#");
            diller.add("PHYTON");

            map.put("Diller", diller);
            map.put("Name", "Mehmet");
            map.put("ID", 12);
        mapper.writeValue(new File("E:\\mapjson.json"), map);
        } catch (IOException ex) {
            Logger.getLogger(JacksonMapToJSon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
