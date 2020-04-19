package com.test.gsonAndJackson.ex_01_jackson;

import com.test.gsonAndJackson.ex_01_jackson.parse.JacksonDataBind;

public class Main {

    public static void main(String[] args) {
        JacksonDataBind.parseJson("src/main/resources/person.json");
    }
}
