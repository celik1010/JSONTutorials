package com.slmcelik.gson;

import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.x509.FreshestCRLExtension;

public class ReadJsonWithGson {

    public static void main(String[] args) {
        try {
            JsonReader jsonReader = new JsonReader(new FileReader("E:\\gsondeneme.json"));
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String name = jsonReader.nextName();
                if (name.equals("ad")) {
                    System.out.println(jsonReader.nextString());
                } else if (name.equals("soyad")) {
                    System.out.println(jsonReader.nextString());
                } else if (name.equals("Diller")) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        System.out.println(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                } else {
                    jsonReader.skipValue();
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadJsonWithGson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadJsonWithGson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
