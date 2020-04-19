package com.test.json.ex_02_gson.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.test.json.ex_02_gson.entity.CurrencyRate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {

    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] exchangeRate = gson.fromJson(jsonReader, CurrencyRate[].class);
        for (CurrencyRate currencyRate : exchangeRate) {
            System.out.println(currencyRate);
        }

        String gsonString = gson.toJson(exchangeRate);

        Files.write(Paths.get("src/main/resources/gsoncurrency.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
