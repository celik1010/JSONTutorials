package com.selimcelik.basicjson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileWriterAndReader {

    public static void main(String[] args) {
        JsonFileWriterAndReader wr = new JsonFileWriterAndReader();
//        wr.writeJsonFile();
        wr.readJsonFile();
    }

    public void writeJsonFile() {
        FileWriter fw = null;
        try {
            JSONObject jsono = new JSONObject();
            jsono.put("adi", "selim");
            jsono.put("soyadi", "Celik");
            JSONArray jSONArray = new JSONArray();
            jSONArray.add("Java");
            jSONArray.add("C++");
            jSONArray.add("C#");
            jsono.put("programlamadilleri", jSONArray);
            File file = new File("E:\\jsondeneme.json");
            fw = new FileWriter(file);
            fw.write(jsono.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonFileWriterAndReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonFileWriterAndReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void readJsonFile() {
        JSONParser jSONParser = null;
        try {

            jSONParser = new JSONParser();
            JSONObject jSONObject = (JSONObject) jSONParser.parse(new FileReader("E:\\jsondeneme.json"));
            System.out.println(jSONObject.get("adi"));

            JSONArray array = (JSONArray) jSONObject.get("programlamadilleri");
            Iterator<String> iterator = array.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonFileWriterAndReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

            Logger.getLogger(JsonFileWriterAndReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {

            System.out.println("olmadııııııııııı");
            Logger.getLogger(JsonFileWriterAndReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
