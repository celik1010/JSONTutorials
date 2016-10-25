package com.slmcelik.gson;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringToJsonWithGson {

    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("E:\\jsondeneme.json"));
            Gson gson = new Gson();
            JSonPojo pojo = gson.fromJson(br, JSonPojo.class);

            System.out.println(pojo.getAd());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringToJsonWithGson.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
