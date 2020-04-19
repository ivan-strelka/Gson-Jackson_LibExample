package com.test.json.ex_03_jackson_2.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.json.ex_03_jackson_2.entity.CurrencyRate;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJsonByJackson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();


        CurrencyRate[] exchangeRate = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        for (CurrencyRate currencyRate : exchangeRate) {
            System.out.println(currencyRate);
        }

        String jsonString = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(exchangeRate);

        Files.write(Paths.get("src/main/resources/jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }

}
