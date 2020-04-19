package com.test.json.ex_03_jackson_2;

import com.test.json.ex_03_jackson_2.parser.JacksonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJsonByJackson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
