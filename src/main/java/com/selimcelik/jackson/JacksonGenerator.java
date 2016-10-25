package com.selimcelik.jackson;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;

public class JacksonGenerator {

    public static void main(String[] args) {
        try {
            JsonFactory factory = new JsonFactory();
            JsonGenerator generator = factory.createJsonGenerator(new File("E:\\jsongenerator.json"), JsonEncoding.UTF8);
            generator.writeStartObject();
            generator.writeStringField("ad", "selim");
            generator.writeNumberField("id", 12);
            
            generator.writeFieldName("Diller");
            generator.writeStartArray();
            generator.writeString("JAVA");
            generator.writeString("C++");
            generator.writeString("C#");
            generator.writeEndArray();
            generator.writeEndObject();
            
            generator.close();
        } catch (IOException ex) {
            Logger.getLogger(JacksonGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
