package com.slmcelik.gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.stream.JsonWriter;

public class WriteJsonWithGson {
    public static void main(String[] args) {
        try {
            JsonWriter jsonWriter=new JsonWriter(new FileWriter("E:\\gsondeneme.json"));
            jsonWriter.beginObject();
            jsonWriter.name("Kullanici");
            jsonWriter.beginObject();
            jsonWriter.name("ad").value("Selim");
            jsonWriter.name("soyad").value("CElik");
            jsonWriter.name("Diller");
            jsonWriter.beginArray();
            jsonWriter.value("C");
            jsonWriter.value("C++");
            jsonWriter.value("Perl");
            jsonWriter.value("Delphi");
            
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WriteJsonWithGson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
