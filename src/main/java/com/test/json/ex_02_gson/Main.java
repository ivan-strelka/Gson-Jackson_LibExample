package com.test.json.ex_02_gson;

import com.test.json.ex_02_gson.parser.GsonParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
