package com.selimcelik.jackson;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonTreeModel {
    public static void main(String[] args) {
        
        try {
            ObjectMapper mapper=new ObjectMapper();
            JsonNode root=mapper.readTree(new File("E:\\denemejackson.json"));
            JsonNode id=root.path("id");
            System.out.println("ID : "+id.getIntValue());
            JsonNode name=root.path("ad");
            System.out.println("ADI : "+name.getTextValue());
            JsonNode list=root.path("diller");
            Iterator<JsonNode> iterator=list.getElements();
            while (iterator.hasNext()) {                
                JsonNode format=iterator.next();
                System.out.println("DİL : " +format.getTextValue());
            }
        } catch (IOException ex) {
            Logger.getLogger(JacksonTreeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
